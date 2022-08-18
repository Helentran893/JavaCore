public class Product {
    private String id;
    private String productName;
    private String description;
    private int amount;
    private int price;
    private String unit;

    public Product(String id, String productName, String description, int amount, int price, String unit) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.amount = amount;
        this.price = price;
        this.unit = unit;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }

    public boolean toFindName(String findName){
        boolean result= this.productName.equals(findName);
        return result;
        }

    public boolean toFindId(String findId){
        boolean result= this.id.equals(findId);
        return result;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }
}


