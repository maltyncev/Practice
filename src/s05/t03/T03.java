package s05.t03;

public class T03 {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(5.2,4.0);
        ComplexNumber cn2 = new ComplexNumber(5.2, 4.0);
        System.out.println(cn1.equals(cn2));
    }
}
