package basics.domainObjects;

public class Customer {
    // Create two variables
    private String username;
    private String password;

    // Create Constructor
    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Create Getters and Setters
    public String getUserName() {
        return username;
    }

    public void setCustomer(String customer) {
        this.username = customer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
