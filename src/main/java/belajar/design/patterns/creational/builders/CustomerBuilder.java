package belajar.design.patterns.creational.builders;

public class CustomerBuilder {
    Customer c = new Customer();

    public Customer build(){
        if(c.getName() == null || c.getName().trim().length()<1){
            throw new IllegalStateException("Nama tidak boleh null");
        }
        return c;
    }

    public CustomerBuilder name(String nama){
        c.setName(nama);
        return this;
    }

    public CustomerBuilder email(String email){
        c.setEmail(email);
        return this;
    }

    public CustomerBuilder address(String address){
        c.setAddress(address);
        return this;
    }
}
