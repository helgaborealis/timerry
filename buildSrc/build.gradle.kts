plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("buildSrc") {
            id = "dependencies"
            implementationClass = "net.borlis.timerry.buildSrc.DependenciesPlugin"
        }
    }
}

repositories {
    google()
    mavenCentral()
}

