package controllers;

import workNote.Note;
import workNote.Repository;
import workNote.ValidateNote;

import java.util.List;

public class NoteController {
    private final Repository repository;
//    private ValidateNote validator = new ValidateNote();
    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
//        validator.check(note);
        repository.CreateNote(note);
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }

        throw new Exception("note not found");
    }
    public List<Note> readNotes(){
        List<Note> notes = repository.getAllNotes();
        return notes;
    }
    public void deleteNote(String noteId){
        repository.deleteNote(noteId);
    }
}
