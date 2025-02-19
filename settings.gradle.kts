pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://maven.lexo.video/repository/maven-releases/") }
        maven { url = uri("https://artifact.bytedance.com/repository/Volcengine/") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://maven.lexo.video/repository/maven-releases/") }
        maven { url = uri("https://artifact.bytedance.com/repository/Volcengine/") }
    }
}

rootProject.name = "ttplayer-decrypt"
include(":app")
 