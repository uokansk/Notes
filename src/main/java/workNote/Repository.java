package workNote;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();
    String  CreateNote(Note note);
    void deleteNote(String noteId);
}
