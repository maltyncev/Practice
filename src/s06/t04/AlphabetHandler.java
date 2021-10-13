package s06.t04;

public class AlphabetHandler extends LowerCaseHandler implements Handler {
    @Override
    public String handleMessage(String message) {
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLetter(message.charAt(i)) || Character.isWhitespace(message.charAt(i))) {
                message = super.handleMessage(message);
            } else {
                message = null;
                break;
            }
        }
        return message;
    }
}
