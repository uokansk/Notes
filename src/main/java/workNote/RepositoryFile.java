package workNote;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository{
    private Mapper mapper;
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation, Mapper mapper) {
        this.fileOperation = fileOperation;
        this.mapper = mapper;

    }
    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }
    @Override
    public String CreateNote(Note note) {

        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveRepository(notes);
        return id;
    }


    private void saveRepository(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
    public void deleteNote(String noteId) {
        List<Note> notes = getAllNotes();
        Note foundNote = null;
        for (Note item : notes) {
            if (item.getId().equals(noteId)) {
                foundNote = item;
            }
        }
        if (foundNote != null) {
            notes.remove(foundNote);
        }
        saveRepository(notes);
    }
}
