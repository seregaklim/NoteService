
class WallService {

    var noteId: Long = 0
    var noteServices = mutableListOf<NoteService<Long, String>>()
    var comments = mutableListOf<Comment<Long, String>>()
    var copyHistorys = mutableListOf<CopyHistory<Long, String>>()

    fun <Long, String> add(noteService: NoteService<String, Long>): NoteService<kotlin.Long, kotlin.String> {
        noteServices.add(
            NoteService(
                noteId = ++noteId,
                Comment(2, "", 7, CopyHistory(4, mutableListOf()), 33, 3),
                "", "", 2, 2,
                mutableListOf(), 22, 4
            )
        )
        return noteServices.last()
    }


    fun <Long, String> createComment(comment: Comment<Long, String>) {
        for ((index, noteService) in noteServices.withIndex()) {
            if (noteService.noteId == comment.commentId) {

                comments.add(
                    Comment(
                        44, "", commentId = noteId,
                        CopyHistory(historyId = noteId, mutableListOf()), 3, 2
                    )
                )
            }
        }
    }

    fun <Long, String> delete(delete: NoteService<Long, String>): Boolean {
        for ((index, noteService) in noteServices.withIndex()) {
            if (noteService.noteId == delete.noteId) {
                noteServices.removeAt(index)

                return true
            }
        }
        throw  PostNotFoundException(" не удалился!")
    }

    fun <Long, String> deleteComment(deleteComment: Comment<Long, String>): Boolean {
        for ((index, comment) in noteServices.withIndex()) {
            if (comment.noteId == deleteComment.commentId) {
                noteServices.removeAt(index)

                return true
            }
        }
        throw  PostNotFoundException(" не добавился!")
    }

    fun <Long, String> copyHistory(comment: Comment<Long, String>): Comment<Long, String> {
        val copyHistory = comment.copyHistory ?: comment
        return comment

    }

    fun <String, Long> edit(editNoteService: NoteService<String, Long>): Boolean {
        for ((index, noteService) in noteServices.withIndex()) {
            if (noteService.noteId == editNoteService.noteId) {
                noteServices.set(
                    index, NoteService(
                        44, Comment(
                            32, "", 32, CopyHistory(2, mutableListOf()),
                            4, 4
                        ), text = "Обновил заметку", title = "Обновил",
                        9, 4, mutableListOf(), 5, 4
                    )
                )

                return true
            }
        }
        throw  PostNotFoundException(" не добавился!")
    }

    fun <String, Long> editComment(editComment: Comment<String, Long>): Boolean {
        for ((index, comment) in comments.withIndex()) {
            if (comment.commentId == editComment.commentId) {
                comments.set(
                    index, Comment(
                        32, message = "Обновил коммент", 43,
                        CopyHistory(2, mutableListOf()), 3, 3
                    )
                )

                return true
            }
        }
        throw  PostNotFoundException(" не добавился!")
    }

    fun <Long, String> restoreComment(restoreComment: CopyHistory<String, Long>): Boolean {
        for ((index, copyHistory) in copyHistorys.withIndex()) {
            if (copyHistory.historyId == restoreComment.historyId) {
                comments.add(
                    index, (Comment(
                        2, "", 8,
                        CopyHistory(5, mutableListOf()), 3, 3
                    ))
                )

                return true
            }
        }
        throw  PostNotFoundException(" не добавился!")
    }


    fun <Long> addNoteIds(noteService: NoteService<Long, String>): kotlin.Long {

        val noteids = noteService.noteIds ?: noteId
        return noteId
    }


    fun <Long, String> get(get: NoteService<Long, String>) {

        for ((index, noteService) in noteServices.withIndex()) {
            if (noteService.noteId == noteService.noteId) {

                noteServices.forEach {
                    it

                }
            }
            throw PostNotFoundException(" не добавился!")
        }


        fun <Long, String> getComments(getComments: Comment<Long, String>): Boolean {
            for ((index, comment) in noteServices.withIndex()) {
                if (comment.noteId == getComments.commentId) {

                    comments.forEach {
                        it
                        return true
                    }
                }
            }
            throw PostNotFoundException("Комментарий не добавлен!")
        }

    }
}