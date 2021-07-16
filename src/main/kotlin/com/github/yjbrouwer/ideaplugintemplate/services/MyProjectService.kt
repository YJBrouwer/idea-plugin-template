package com.github.yjbrouwer.ideaplugintemplate.services

import com.github.yjbrouwer.ideaplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
