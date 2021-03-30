package net.borlis.timerry.buildSrc
import org.gradle.api.Plugin
import org.gradle.api.Project

import org.gradle.kotlin.dsl.*

class DependenciesPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        // Do nothing, just load buildSrc to classpath
    }
}
