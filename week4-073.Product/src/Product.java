public class Product {
    private String name;
    private double priceStart;
    private int amount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.priceStart = priceAtStart;
        this.amount = amountAtStart;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + this.priceStart + " amount " + this.amount);
    }
}
