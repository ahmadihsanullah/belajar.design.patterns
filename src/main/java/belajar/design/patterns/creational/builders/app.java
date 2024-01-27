package belajar.design.patterns.creational.builders;

public class app {
    public static void main(String[] args) {
        Customer ahmad = Customer.builder()
                                .name("ahmad")
                                .address("Kab.Bogor")
                                .build();
        
        Customer hanif = Customer.builder()
                            .name("hanif")
                            .email("hanif@gmaik.com")
                            .address("Parungpanjang")
                            .build();


        System.out.println(ahmad);
        System.out.println("-----------------\n");
        System.out.println(hanif);

    
    }
}
