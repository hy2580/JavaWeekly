package Shopping;

public class Product implements Promotion{
    public String name;
    public int price;
    public int weight;
    public int discount;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public int getDiscountAmount(){
        return discount;
    }
}
