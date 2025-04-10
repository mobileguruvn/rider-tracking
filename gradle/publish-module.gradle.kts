import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication

plugins.withId("maven-publish") {
    afterEvaluate {
        val publishing = extensions.getByType<PublishingExtension>()

        publishing.publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.ridertracker"
                artifactId = project.name
                version =
                    System.getenv("GIT_TAG")?.removePrefix("tracking-v") ?: project.version.toString()
            }
        }

        publishing.repositories {
            maven {
                name = "GitHub"
                url = uri(
                    project.findProperty("GITHUB_MAVEN_URL")?.toString()
                        ?: System.getenv("GITHUB_MAVEN_URL")
                )
                credentials {
                    username = project.findProperty("GITHUB_USERNAME")?.toString() ?: System.getenv(
                        "GITHUB_USERNAME"
                    )
                    password = project.findProperty("GITHUB_TOKEN")?.toString()
                        ?: System.getenv("GITHUB_TOKEN")
                }
            }
        }
    }
}
