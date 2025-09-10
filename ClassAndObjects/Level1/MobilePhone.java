public class MobilePhone {
    // Fields (Attributes)
    private String brand;
    private String model;
    private double price;


    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

  
    public void displayMobile() {
        System.out.println("Brand of Mobile: " + brand);
        System.out.println("Model of Mobile: " + model);
        System.out.println("Price of Mobile: " + price);
        System.out.println();
    }


    public static void main(String[] args) {
        MobilePhone mobile1 = new MobilePhone("VIVO", "VIVO V29", 15999);
        MobilePhone mobile2 = new MobilePhone("ONEPLUS", "Nord 4", 39999);
        MobilePhone mobile3 = new MobilePhone("APPLE", "iPhone 16 Pro", 79999);

        mobile1.displayMobile();
        mobile2.displayMobile();
        mobile3.displayMobile();
    }
}
