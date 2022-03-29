package cat.dcat.jbplug.mactabbing.actions

import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

/**
 * Created by DCat on 2022/3/22.
 */

class TabbingActionGroup : ActionGroup() {
    override fun getChildren(e: AnActionEvent?): Array<AnAction> {
        return arrayOf(
            NSWindowAction("Show Previous Window Tab", "selectPreviousTab:"),
            NSWindowAction("Show Next Window Tab", "selectNextTab:"),
            NSWindowAction("Move Window Tab to New Window", "moveTabToNewWindow:"),
            NSWindowAction("Merge All Windows", "mergeAllWindows:"),
            NSWindowAction("Toggle Window Tabs Bar", "toggleTabBar:"),
            NSWindowAction("Tabs Bar Overview", "toggleTabOverview:")
        )
    }

}