package s05.t01;

import s04.Hero;

public class T01 {
    public static void main(String[] args) {
        Hero nyx = new Hero(40);
        GodTimeHero rox = new GodTimeHero(20,0);
        System.out.println(rox);
        nyx.hit(rox);
        System.out.println(rox);
    }
}
