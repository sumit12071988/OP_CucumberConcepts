package basics.customParameterTypes;

import basics.domainObjects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterTypes {
    @ParameterType("\"Blue Shoes\"|\"Yellow Shoes\"")
    public Product product(String name){
        return new Product(name);
    }
}
