package com.github.a623397674.myaction.services

import com.intellij.openapi.project.Project
import com.github.a623397674.myaction.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
