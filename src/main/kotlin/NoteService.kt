data class NoteService<Long, String>(
    var noteId: Long,
    var comets: Comment<Long, String>,
    var text: String,
    var title: String,
    var count: Long,
    var userId: Long,
    var noteIds:  MutableList<Long,>? = mutableListOf(),
    var sort: Long,
    var data: Long,
)

data class Comment<Long, String>(
    val replyTo: Long,
    val message: String,
    val commentId: Long,
    val copyHistory: CopyHistory<Long, String>?,
    val data: Long,
   val count:Long,
    )

data class CopyHistory<Long, String>(
    var historyId: Long,
    var copyHistory: MutableList<CopyHistory<Long, String>> = mutableListOf<CopyHistory<Long, String>>(),
    )

