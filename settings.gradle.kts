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
    }
}
gradle.settingsEvaluated {
    val githubUsername =
        settings.extra["GITHUB_USERNAME"] as? String ?: System.getenv("GITHUB_USERNAME")
    val githubToken = settings.extra["GITHUB_TOKEN"] as? String ?: System.getenv("GITHUB_TOKEN")
    val githubMavenUrl: String? = providers.gradleProperty("GITHUB_MAVEN_URL").orNull

    enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
        repositories {
            google()
            mavenCentral()

            maven {
                name = "GitHub"
                url = uri(githubMavenUrl ?: System.getenv("GITHUB_MAVEN_URL"))
                credentials {
                    username = githubUsername
                    password = githubToken
                }
            }
        }
    }
}

rootProject.name = "RiderTracking"
include(":app")
include(":tracking-contract")
include(":tracking-impl")
