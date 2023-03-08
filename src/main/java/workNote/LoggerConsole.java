package workNote;

public class LoggerConsole implements Logable{
    @Override
    public void writeLog(String log) {
        System.out.println(log);
    }
}
