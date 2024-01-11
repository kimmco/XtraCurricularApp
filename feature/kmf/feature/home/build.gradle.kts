plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.android.kotlin)
    alias(libs.plugins.android.ksp)
}

android {
    namespace = "com.cokimutai.home"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":core:ui"))
    implementation(project(":common:utils"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material3.compose)


    implementation (libs.navigation.compose)
    implementation (libs.coroutines.core)
    implementation (libs.realm.sync)
    implementation (libs.hilt.android)
    ksp (libs.hilt.compiler)
    implementation (libs.hilt.navigation.compose)
    implementation (libs.compose.tooling.preview)

    implementation (libs.firebase.auth)
    implementation (libs.firebase.storage)


    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.ext)
    androidTestImplementation(libs.espresso.core)
}