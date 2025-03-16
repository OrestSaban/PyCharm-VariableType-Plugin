package org.example.pycharm_variabletype_plugin_v1


import com.intellij.openapi.editor.event.CaretEvent
import com.intellij.openapi.editor.event.CaretListener
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.StatusBarWidget
import com.intellij.openapi.wm.StatusBarWidget.Multiframe
import com.intellij.openapi.wm.StatusBarWidgetFactory
import com.intellij.psi.PsiDocumentManager
import com.intellij.util.Consumer
import java.awt.Component
import java.awt.event.MouseEvent

class MyStatusBarWidget(private val project: Project) : StatusBarWidget, StatusBarWidget.TextPresentation, StatusBarWidget.Multiframe {

    private var currentType: String = "N/A"

    override fun ID(): String = "MyStatusBarWidget"
    override fun copy(): StatusBarWidget = MyStatusBarWidget(project)
    override fun getPresentation(): StatusBarWidget.WidgetPresentation = this


    override fun getText(): String = "Type: $currentType"
    override fun getTooltipText(): String = "Shows the type of variable under the caret"
    override fun getAlignment(): Float = Component.CENTER_ALIGNMENT
    override fun getClickConsumer(): Consumer<MouseEvent>? = null
}