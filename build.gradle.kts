import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
}

group = "me.jayantkumar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // Koin for Kotlin
    implementation ("io.insert-koin:koin-core:2.2.3")
// Koin extended & experimental features
    implementation ("io.insert-koin:koin-core-ext:2.2.3")
// Koin for Unit tests
    testImplementation ("io.insert-koin:koin-test:2.2.3")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}