package views;

import controllers.NoteController;
import workNote.Note;
import java.util.List;
import java.util.Scanner;

public class ViewNote {
    private NoteController noteController;
    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
    }
    public void run(){
        Commands com = Commands.NONE;
        while (true) {
            try {
                String command = prompt("Введите команду: CREATE, READ, LIST, DELETE, UPDATE, EXIT  \n");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        caseCreate();
                        break;
                    case READ:
                        caseRead();
                        break;
                    case LIST:
                        caseList();
                        break;
                    case DELETE:
                        caseDelete();
                        break;
                    case UPDATE:
                        caseUpdate();
                        break;
                }
            } catch (Exception e) {
                System.out.printf("Ошибка: %s \n", e.getMessage());
            }
        }
    }

    private void caseUpdate() throws Exception {
        String id = prompt("Выберете  id note ");
        try {
            Note note = noteController.readNote(id);
            System.out.println(note);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        noteController.deleteNote(id);
        caseCreate();
    }
    private void caseDelete() {
        String id = prompt("Идентификатор записи: ");
        try {
            noteController.deleteNote(id);
            System.out.println("note " + id + " delete");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private void caseRead() {
        String id = prompt("Идентификатор записи: ");
        try {
            Note note = noteController.readNote(id);
            System.out.println(note);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private void caseList() {
        List<Note> noteList = noteController.readNotes();
        for (Note item : noteList) {
            System.out.println(item);
        }
    }
    private void caseCreate() throws Exception{
        String header = prompt("Заголовок: ");
        String text = prompt("текст: ");
        noteController.saveNote(new Note(header, text));
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
