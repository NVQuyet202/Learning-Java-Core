package LearnJava;

public abstract class Student {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;

    public Student(String id, String name, double tax, double price) {
        this.id = id;
        this.name = name;
        this.tax = tax;
        this.price = price;
    }

    public double getPriceTax(double price, double tax) {
        return  this.price * this.tax;
    }

    public void infoStudent() {
        System.out.println("Student Information: " + this.id);
        System.out.println("Id: " + this.tax);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.tax);
        System.out.println("Tax: " + this.tax);
        System.out.println("PriceTax: " + this.getPriceTax(this.price, this.tax));

    }

    //Function không có body, 1 mdethod trừu tượng
    abstract void tinhDiem();

}

