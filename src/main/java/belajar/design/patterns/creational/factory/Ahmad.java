package belajar.design.patterns.creational.factory;

import java.time.DayOfWeek;

public class Ahmad implements ContentCreator {

    @Override
    public Content createContent(DayOfWeek dayOfWeek) {
        if(dayOfWeek==DayOfWeek.FRIDAY){
            return new DesignPatters();
        }
        return new Docker();
    }
}