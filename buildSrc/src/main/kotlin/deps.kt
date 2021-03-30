package net.borlis.timerry.buildSrc

object Versions {
    const val minSdk = 21
    const val targetSdk = 30
    const val compileSdk = 30
    const val kotlin = "1.4.20"
}

object Dependencies {

    object Google {
        const val coreKtx = "androidx.core:core-ktx:1.3.2"
        const val appCompat = "androidx.appcompat:appcompat:1.2.0"
        const val composeUI = "androidx.compose.ui:ui:1.0.0-beta03"
        const val composeMaterial = "androidx.compose.material:material:1.0.0-beta03"
        const val composeUITooling = "androidx.compose.ui:ui-tooling:1.0.0-beta03"
        const val activityCompose = "androidx.activity:activity-compose:1.3.0-alpha03"
        const val composeOptionKotlinExt = "1.0.0-beta03"
        const val material = "com.google.android.material:material:1.3.0"
        const val lifecycleKts = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0"
    }

    object Test {
        const val junit = "junit:junit:4.+"
        const val textExt = "androidx.test.ext:junit:1.1.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
    }
}