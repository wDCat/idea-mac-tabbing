package cat.dcat.jbplug.mactabbing.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.ui.mac.foundation.Foundation

/**
 * Created by DCat on 2022/3/22.
 */
abstract class NSWindowAction(val selector: String, val args: Any? = null) : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val app = Foundation.invoke("NSApplication", "sharedApplication")
        val mainWindow = Foundation.invoke(app, Foundation.createSelector("mainWindow"))
        Foundation.invoke(
            mainWindow,
            Foundation.createSelector("performSelectorOnMainThread:withObject:waitUntilDone:"),
            Foundation.createSelector(selector),
            args,
            false
        )
    }
    override fun isDumbAware(): Boolean {
        return true
    }
}
