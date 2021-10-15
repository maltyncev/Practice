package s06.t04;

public class AlphabetHandler implements Handler {

    private LowerCaseHandler lowerCaseHandler;

    public AlphabetHandler() {
        this.lowerCaseHandler = new LowerCaseHandler();
    }

    @Override
    public String handleMessage(String message) {
        if (message == null) {
            return "null";
        } else {
            for (int i = 0; i < message.length(); i++) {
                if (Character.isLetter(message.charAt(i)) || Character.isWhitespace(message.charAt(i))) {
                    message = lowerCaseHandler.handleMessage(message);
                } else {
                    message = null;
                    break;
                }
            }
        }
        return message;
    }
}
