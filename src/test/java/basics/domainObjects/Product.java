package basics.domainObjects;

public class Product {
    private String name;

    // Create constructor
    public Product(String name) {
        this.name = name;
    }

    // Create GETTERS and SETTERS
    public String getProductName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
