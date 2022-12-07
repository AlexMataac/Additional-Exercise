package project;

public class Phone extends Product {

    public void ring() {
        System.out.println("RING!");
    }
    public int calculateAmountOfVariants() {
        return super.listVariants().length;
    }
    public Product [] listVariants() {
        throw new UnsupportedOperationException();
    }
}
