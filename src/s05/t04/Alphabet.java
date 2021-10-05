package s05.t04;

import java.util.Arrays;

public enum Alphabet {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;

    public static int getPosition (String str) {
        Alphabet letter = Alphabet.valueOf(str);
        int position = letter.ordinal() + 1;
        return position;
    }

    public static boolean strCheck (String str) {
        String list = Arrays.toString(Alphabet.values());
        return list.contains(str);
    }

}
