package s06.t04;

public class LowerCaseHandler implements Handler {
    @Override
    public String handleMessage(String message) {
        if (message == null) {
            return "null";
        } else {
            message = message.toLowerCase();
            message = message.trim();
            return message;
        }
    }
}
