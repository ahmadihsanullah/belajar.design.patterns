package belajar.design.patterns.creational.singleton;

public class KoneksiDatabase {
    private static KoneksiDatabase objKoneksiDatabase;

    static KoneksiDatabase getKoneksiDatabase(){
        if(objKoneksiDatabase == null){
            objKoneksiDatabase = new KoneksiDatabase();
        }
        return objKoneksiDatabase;
    }
    
    private KoneksiDatabase(){}

}
