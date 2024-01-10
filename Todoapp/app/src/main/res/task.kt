data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val description: String,
    val dueDate: Long,
    val priority: String,
    val category: String,
    val status: String
)