package belajar.design.patterns.creational.factory;
import java.time.LocalDate;

public class Hanif implements ContentCreator {
    
    public Content createContent(LocalDate localDate) {
        if(localDate.getDayOfWeek() == localDate.getDayOfWeek().SATURDAY){
            return new Docker();
        }
        return new DesignPatters();
    }
}