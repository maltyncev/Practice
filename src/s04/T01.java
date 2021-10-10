package s04;

public class T01 {
    public static void main(String[] args) {
        Hero rox = new Hero(20);
        SuperHero nyx = new SuperHero(20, 2);

        System.out.println(rox);

        nyx.hit(rox);

        System.out.println(rox);

    }
}
