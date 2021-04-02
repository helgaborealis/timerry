import net.borlis.timerry.buildSrc.Dependencies
import net.borlis.timerry.buildSrc.Versions

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    setCompileSdkVersion(Versions.compileSdk)
    defaultConfig {
        applicationId = "net.borlis.timerry"
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            debuggable(true)
            isMinifyEnabled = true
            applicationIdSuffix(".debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Google.composeOptionKotlinExt
    }
}

dependencies {
    implementation(Dependencies.Google.coreKtx)
    implementation(Dependencies.Google.appCompat)
    implementation(Dependencies.Google.material)
    implementation(Dependencies.Google.composeUI)
    implementation(Dependencies.Google.composeMaterial)
    implementation(Dependencies.Google.composeUITooling)
    implementation(Dependencies.Google.lifecycleKts)
    implementation(Dependencies.Google.activityCompose)

    // should be removed later (check)
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.4")

    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.textExt)
    androidTestImplementation(Dependencies.Test.espresso)
}