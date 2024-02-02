package belajar.design.patterns.creational.factory;
import java.time.DayOfWeek;

public class Hanif implements ContentCreator {
    
     @Override
    public Content createContent(DayOfWeek dayOfWeek) {
        if(dayOfWeek==DayOfWeek.FRIDAY){
            return new Docker();
        }
        return new DesignPatters();
    }
}