package workNote;

public class NoteDecorator implements Mapper{
    private Mapper mapper;
    private Logable logAble;

    public NoteDecorator(Mapper mapper, Logable logAble) {
        this.mapper = mapper;
        this.logAble = logAble;
    }

    @Override
    public String map(Note note) {

        return null;
    }

    @Override
    public Note map(String line) {
        return null;
    }
}
