plugins {
    kotlin("jvm") version "2.2.0"
    application
}

group = "org.gonzalez.patricio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(24)
}

application {
    mainClass.set("org.gonzalez.patricio.MainKt")
}
