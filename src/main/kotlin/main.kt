import org.junit.Assert

class PostNotFoundException(message: String = "Комментарий не добавился!") : RuntimeException(message)

fun main () {
    var original =
        NoteService<Long, String>(
            2,
            Comment(545, "", 99, CopyHistory(76, mutableListOf()), 33, 22),
            "",
            "",
            1,
            4, mutableListOf(),
            6,
            4
        )


    var comments = Comment<Long, String>(
        32,
        "",
        3,
        CopyHistory(5, mutableListOf()),
        4,
        21
    )
}
