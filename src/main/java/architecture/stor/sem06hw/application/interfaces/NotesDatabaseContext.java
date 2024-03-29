package architecture.stor.sem06hw.application.interfaces;

import sem06hw.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();

    boolean addNote(Note note);

    boolean updateNote(Note note);

    boolean deleteNote(Note note);

    boolean saveChanges();


}
