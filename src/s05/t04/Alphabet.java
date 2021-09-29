package s05.t04;

import java.util.Arrays;

public enum Alphabet {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;

    public static int getIndex (String str) {
        Alphabet letter = Alphabet.valueOf(str);
        int index = letter.ordinal() + 1;
        return index;
    }

    public static boolean strCheck (String str) {
        String list = Arrays.toString(Alphabet.values());
        return list.contains(str);
    }

}
