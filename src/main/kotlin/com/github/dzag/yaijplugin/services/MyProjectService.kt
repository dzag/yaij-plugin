package com.github.dzag.yaijplugin.services

import com.intellij.openapi.project.Project
import com.github.dzag.yaijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
