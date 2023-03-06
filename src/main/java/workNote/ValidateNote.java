package workNote;

import java.util.regex.Pattern;

public class ValidateNote {
    private Pattern patternNote = Pattern.compile("^\\S*$");
    public void check(Note note) throws Exception {
        if (!patternNote.matcher(note.getHeader()).find()) {
            throw new Exception("illegal first name");
        }
        if (!patternNote.matcher(note.getText()).find()) {
            throw new Exception("illegal last name");
        }
    }
}
