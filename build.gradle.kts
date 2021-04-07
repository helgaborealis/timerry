// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
    id("dependencies")
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0-alpha13")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
