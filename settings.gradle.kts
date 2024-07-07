pluginManagement {
    repositories {
        maven {
            url=uri("https://artifactory.internal.cba/artifactory/android-dev")
        }
    }
}
dependencyResolutionManagement {
    repositories {
        maven {
            url=uri("https://artifactory.internal.cba/artifactory/android-dev")
        }
    }
}

rootProject.name = "TimerApp"
include(":app")
