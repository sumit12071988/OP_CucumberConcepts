package basics.domainObjects;

public class Customer {


    // Create two variables
    private String customer;
    private String password;

    // Create Constructor
    public Customer(String customer, String password) {
        this.customer = customer;
        this.password = password;
    }

    // Create Getters and Setters
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
