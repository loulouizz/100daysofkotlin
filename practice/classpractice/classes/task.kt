package classes

enum class Priority {
    LOW,
    MEDIUM,
    HIGH,
    URGENT
}

enum class TaskStatus {
    TODO,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}

class Task(
        val id: Int,
        var title: String,
        var description: String,
        var priority: Priority,
        var status: TaskStatus = TaskStatus.TODO,
) {
    fun complete() {
        this.status = TaskStatus.COMPLETED
    }

    fun changePriority(priority: Priority) {
        this.priority = priority
    }

    fun displayInfo() {
        println("* TASK INFO *")
        println("ID: $id")
        println("TITLE: $title")
        println("DESCRIPTION: $description")
        println("PRIORITY: $priority")
        println("STATUS: $status")
    }
}
