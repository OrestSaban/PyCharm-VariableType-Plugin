package org.example.pycharm_variabletype_plugin_v1

import com.intellij.openapi.project.Project
//import com.intellij.openapi.wm.StatusBar
import com.intellij.openapi.wm.StatusBarWidget
import com.intellij.openapi.wm.StatusBarWidgetFactory

class MyStatusBarWidgetFactory : StatusBarWidgetFactory {
    override fun getId(): String = "MyVariableTypeWidgetFactory"
    override fun getDisplayName(): String = "Variable Type Widget"
    override fun isAvailable(project: Project): Boolean = true
    override fun createWidget(project: Project): StatusBarWidget = MyStatusBarWidget(project)
    override fun disposeWidget(widget: StatusBarWidget) {}


}
