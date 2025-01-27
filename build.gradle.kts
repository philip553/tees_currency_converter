buildscript {
    dependencies {
        classpath(libs.google.services)
        classpath(libs.hilt.android.gradle.plugin)
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

    // Firebase
    id("org.jetbrains.kotlin.kapt") version "1.8.10" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false

    id("com.google.devtools.ksp") version "1.9.23-1.0.20" apply false
//    alias(libs.plugins.google.gms.google.services) apply false
}