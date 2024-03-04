import org.gradle.internal.impldep.org.eclipse.jgit.lib.ObjectChecker.type

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.register<Test>("integrationTest") {
    group = "verification"
    description = "Runs the integration tests."

    useJUnitPlatform {
        includeTags("IntegrationTest")
        excludeTags("UnitTest")
    }
}