pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

rootProject.name = "E-Extra Curricular App"
include(":app")
include(":core:ui")
include(":feature:kmf:feature:home")
include(":common:auth")
include(":feature:athletics:data")
include(":common:utils")
