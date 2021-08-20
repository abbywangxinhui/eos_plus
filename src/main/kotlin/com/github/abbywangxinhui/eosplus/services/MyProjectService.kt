package com.github.abbywangxinhui.eosplus.services

import com.github.abbywangxinhui.eosplus.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
