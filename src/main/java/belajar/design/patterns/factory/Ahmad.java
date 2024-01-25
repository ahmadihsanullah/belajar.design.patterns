package belajar.design.patterns.factory;

import java.sql.Time;
import java.time.LocalDate;

public class Ahmad implements ContentCreator {

    @Override
    public Content createContent(LocalDate localDate) {
        if(localDate.getDayOfWeek() == localDate.getDayOfWeek().TUESDAY){
                    return new DesignPatters();
                }
        return null;
    }

    // public Content createContent(LocalDate localDate) {
    //     if(localDate.getDayOfWeek() == localDate.getDayOfWeek().SATURDAY){
    //         return new DesignPatters();
    //     }
    //     return null;
    // }
}