// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlin) apply false
    alias(libs.plugins.daggerHilt) apply false
    alias(libs.plugins.googleServices) apply false
    alias(libs.plugins.devtoolsKsp) apply false
}