package belajar.design.patterns.creational.factory;

import java.time.DayOfWeek;

public interface Content{
    void play();
}

class DesignPatters implements Content{
    @Override
    public void play() {
        System.out.println("Belajar design patterns untuk mengasah coding");
    }

   
}

class Docker implements Content{
    @Override
    public void play() {
        System.out.println("Belajar docker untuk mengasah coding");
    }

}

/**
 * ContentCreator
 */
interface ContentCreator {
    Content createContent(DayOfWeek dayOfWeek);
}