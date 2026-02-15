import com.vanniktech.maven.publish.MavenPublishBaseExtension

plugins {
    id("java-library")
    alias(libs.plugins.publish)
}

group = "org.allaymc"
version = "1.11.1"

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
        configureEach {
            options.isFork = true
        }
    }

    // We already have sources jar, so no need to build Javadoc, which would cause a lot of warnings
    withType<Javadoc> {
        enabled = false
    }

    withType<Test> {
        useJUnitPlatform()
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
    withSourcesJar()
}

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    api(libs.joml)
    compileOnly(libs.gwt)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)
}

configure<MavenPublishBaseExtension> {
    publishToMavenCentral()
    signAllPublications()

    coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set(project.name)
        description.set("Java OpenGL Math Library - Geometric Primitives")
        inceptionYear.set("2020")
        url.set("https://github.com/AllayMC/joml-primitives")

        scm {
            connection.set("scm:git:git://github.com/AllayMC/joml-primitives.git")
            developerConnection.set("scm:git:ssh:/github.com/AllayMC/joml-primitives.git")
            url.set("https://github.com/AllayMC/NBT")
        }

        licenses {
            license {
                name.set("MIT License")
                url.set("https://www.opensource.org/licenses/mit-license.php")
            }
        }

        developers {
            developer {
                name.set("Kai Burjack")
                email.set("kburjack@googlemail.com")
                organization.set("JOML")
                organizationUrl.set("http://joml.org")
            }
            developer {
                name.set("AllayMC Team")
                organization.set("AllayMC")
                organizationUrl.set("https://github.com/AllayMC")
            }
        }
    }
}