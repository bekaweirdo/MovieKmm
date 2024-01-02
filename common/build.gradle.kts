plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinCocoapods)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "16.0"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "common"
            isStatic = true
        }
    }

    sourceSets.androidMain.dependencies {
        implementation("app.cash.sqldelight:android-driver:2.0.0")
        implementation(libs.koin.android)
    }

    // or iosMain, windowsMain, etc.
    sourceSets.nativeMain.dependencies {
        implementation("app.cash.sqldelight:native-driver:2.0.0")
    }

    sourceSets.jvmMain.dependencies {
        implementation("app.cash.sqldelight:sqlite-driver:2.0.0")
    }
    
    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.bekka.moviekmm"
    compileSdk = 34
    defaultConfig {
        minSdk = 29
    }
}