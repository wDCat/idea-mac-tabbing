package com.github.wdcat.ideamacmergeallwindows.services

import com.intellij.openapi.project.Project
import com.github.wdcat.ideamacmergeallwindows.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
