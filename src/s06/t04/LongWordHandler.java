package s06.t04;

public class LongWordHandler extends AlphabetHandler implements Handler {
    int m; //эталонное количество слов в строке
    int n; //эталонная длина слова (количество символов в слове)

    LongWordHandler(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public String handleMessage(String message) {
        if (m > wordsCounting(message)) {
            return null;
        } else {
            return super.handleMessage(message);
        }
    }

    protected int wordsCounting(String message) {
        int lettersCount = 0;
        int wordsCount = 0;
        message = super.handleMessage(message);

        if (message.length() != 0) {
            wordsCount++;
            for (int i = 0; i < message.length(); i++)
                if (Character.isLetter(message.charAt(i))) {
                    lettersCount++;
                } else {
                    if ((lettersCount < n)) {
                        lettersCount = 0;
                    } else {
                        wordsCount++;
                        lettersCount = 0;
                    }
                }
        }
        return wordsCount;
    }
}
