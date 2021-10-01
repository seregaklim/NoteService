import org.junit.Assert
import org.junit.Assert.*

import org.junit.Test

class PostNotFoundException(message: String = "Комментарий не добавился!") : RuntimeException(message)
class WallServiceTest() {

    @Test
    fun add() {
        val service = WallService()
        //    заполняем несколькими постами
        service.add(
            NoteService(
                1,
                Comment(545, "", 99, CopyHistory(76, mutableListOf()), 33, 22),
                "",
                "",
                1,
                4, mutableListOf(),
                6,
                4
            )
        )

        var original =
            NoteService(
                1,
                Comment(545, "", 99, CopyHistory(76, mutableListOf()), 33, 22),
                "",
                "",
                1,
                4, mutableListOf(),
                6,
                4
            )

        service.add(original)
        Assert.assertEquals(1, original.noteId)

    }

    @Test
   fun createComment(){
        val service = WallService()
//    заполняем несколькими постами
        service.add(
            NoteService(
                1,
                Comment(545, "", 99, CopyHistory(76, mutableListOf()), 33, 22),
                "",
                "",
                1,
                4, mutableListOf(),
                6,
                4
            )
        )
            var original =
                NoteService(
                1,
            Comment(545, "", 99, CopyHistory(76, mutableListOf()), 33, 22),
            "",
            "",
            1,
            4, mutableListOf(),
            6,
            4
        )
        var originalComments = Comment<Long, String>(
            32,
            "",
            3,
            CopyHistory(5, mutableListOf()),
            4,
            21
        )
        Assert.assertEquals(3, originalComments.commentId)

    } }
