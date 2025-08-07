package LearnJava;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {
    }
    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Product nhapThongTin(String name, double  price, double tax) {
        Product pr = new  Product(name, price, tax);
        return pr;
    }
    public void xuatThongTin(Product pr) {
        System.out.println("TThong tin: " + pr.getName() + " " + pr.getPrice() + " " + pr.getTax());
    }
    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}
