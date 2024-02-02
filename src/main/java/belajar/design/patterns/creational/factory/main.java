package belajar.design.patterns.creational.factory;

import java.time.DayOfWeek;

public class main {
    public static void main(String[] args) {
        Ahmad ahmad = new Ahmad();
        ahmad.createContent(DayOfWeek.FRIDAY).play();
        System.out.println("\n-----------\n");
        Hanif hanif = new Hanif();
        hanif.createContent(DayOfWeek.FRIDAY).play();
    }
    
}
