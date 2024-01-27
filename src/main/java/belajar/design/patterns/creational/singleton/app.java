package belajar.design.patterns.creational.singleton;

public class app {
    public static void main(String[] args) {
        KoneksiDatabase koneksiDatabase1 = KoneksiDatabase.getKoneksiDatabase();
        KoneksiDatabase koneksiDatabase2 = KoneksiDatabase.getKoneksiDatabase();
        KoneksiDatabase koneksiDatabase3 = KoneksiDatabase.getKoneksiDatabase();
        KoneksiDatabase koneksiDatabase4 = KoneksiDatabase.getKoneksiDatabase();
        
        System.out.println(koneksiDatabase1 == koneksiDatabase2);
        System.out.println(koneksiDatabase1 == koneksiDatabase3);
        System.out.println(koneksiDatabase1 == koneksiDatabase4);
    }
}
