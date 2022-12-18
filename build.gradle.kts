plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("8.0.0-alpha09").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
