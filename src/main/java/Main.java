import controllers.NoteController;
import views.ViewNote;
import workNote.*;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("note.txt");
        Repository repository = new RepositoryFile(new NoteMapper(), fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
