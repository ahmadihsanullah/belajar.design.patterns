package belajar.design.patterns.factory;

import java.sql.Time;
import java.time.LocalDate;

public class Ahmad implements ContentCreator {

    public Content createContent(LocalDate localDate) {
        if(localDate.getDayOfWeek() == localDate.getDayOfWeek().SATURDAY){
            return new DesignPatters();
        }
        return null;
    }
}