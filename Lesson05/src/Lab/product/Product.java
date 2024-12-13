package Lab.product;

import java.util.Scanner;

public class Product {
    // field
    private String proId;
    private String proName;
    private String manufacturer;
    private float producerPrice;
    // Constructor

    /**
     *
     */
    public Product() {
    }

    /**
     *
     * @param proId
     * @param proName
     * @param manufacturer
     * @param producerPrice
     */
    public Product(String proId, String proName, String manufacturer, float producerPrice) {
        this.proId = proId;
        this.proName = proName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }
    // Attribute
    public String getProId() {
        return proId;
    }
    public void setProId(String proId) {
        this.proId = proId;
    }
    public String getProName() {
        return proName;
    }
    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    // Method
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        proId = sc.nextLine();
        System.out.print("Enter product name: ");
        proName = sc.nextLine();
        System.out.print("Enter product manufacturer: ");
        manufacturer = sc.nextLine();
        System.out.print("Enter product price: ");
        producerPrice = sc.nextFloat();
    }
    public void display(){
        System.out.println("Product ID: " + proId);
        System.out.println("Product Name: " + proName);
        System.out.println("Product Manufacturer: " + manufacturer);
        System.out.println("Product Price: " + producerPrice);
        System.out.println("Sale-price:"+clalculateSalePrice());
    }
    public float clalculateSalePrice(){
        return producerPrice + 5 * producerPrice/100;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", producerPrice=" + producerPrice +
                ", Sale-price=" + clalculateSalePrice() +
                '}';
    }

    // test
    public static void main(String[] args) {
        Product product = new Product();
        product.input();
        product.display();
        //

        product = new Product("P001","Nokia 3310","Nokia",120000);
//        product.display();
        System.out.println(product.toString());
    }
}
