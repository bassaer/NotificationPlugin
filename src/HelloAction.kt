import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class HelloAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        Notifications.Bus.notify(Notification(
                "hello", "Hello", "IntelliJ", NotificationType.INFORMATION
        ))
    }
}
