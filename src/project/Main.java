package project;


public class Main {
    public static void main(String[] args) {

        Phone product = new Phone();
        product.setName("IPHONE 13");
        System.out.println(" Product name: " + product.getName());
        System.out.println(" Remaining amount in stock: " + product.calculateRemainingAmount());

        Phone phone = new Phone();
        phone.ring();

        if (product instanceof Phone) {
            Phone phone1 = (Phone) product;
            phone1.ring();
        }
        System.out.println(phone.calculateAmountOfVariants());
    }
}

