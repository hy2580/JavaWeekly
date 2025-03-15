package Shopping;

public class Cart{
    Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalDeliveryCharge = 0;

        for (Product product : products) {
            int price = product.price - product.getDiscountAmount();
            int weight = product.weight;
            int deliveryCharge = 0;


            if (weight < 3) {
                deliveryCharge = 1000;
            } else if (weight < 10) {
                deliveryCharge = 5000;
            } else {
                deliveryCharge = 10000;
            }


            if (price >= 30000 && price < 100000) {
                deliveryCharge -= 1000;
            } else if (price >= 100000) {
                deliveryCharge = 0;
            }

            totalDeliveryCharge += deliveryCharge;
        }

        return totalDeliveryCharge;
    }

}