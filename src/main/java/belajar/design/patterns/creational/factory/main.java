package belajar.design.patterns.creational.factory;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Ahmad ahmad = new Ahmad();
        ahmad.createContent(LocalDate.now()).play();
        System.out.println("\n-----------\n");
        Hanif hanif = new Hanif();
        hanif.createContent(LocalDate.now()).play();
    }
    
}
