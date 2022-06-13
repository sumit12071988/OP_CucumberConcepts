package basics.stepDefinitions;

import basics.domainObjects.Customer;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;


public class DataTableStepDefs {
    @Given("I've single set of data to enter")
    public void myCredentials1(DataTable dataTable) {
//  1. Collect the Data from DataTable as a List
//        List<String> creds = dataTable.asList();        // Won't work since it will collect all the data in 1st column and create a list.
//        List<String> creds = dataTable.values();        // This will work as it will collect all the data in 1st row and create a list.
        List<String> creds = dataTable.row(0);          // This will collect all the data in the 0th Row index and create a list.
//  2. Fetch the data individually from the list
        System.out.println("USERNAME = " + creds.get(0));
        System.out.println("PASSWORD = " + creds.get(1));
    }

    @Given("I've multiple sets of data to validate")
    public void myCredentialsSample(DataTable dataTable) {    // Dynamically converting DataTable into List in runtime
//         1. Collect data in a List of List of Strings
        List<List<String>> creds = dataTable.asLists();
//         2. Fetch the data from the list
//              Since the data is a List of lists [[John, John123],[Bill, Bill123]], we'll need to consider the data as 2D matrix
//              creds1.get(0)           --> [John, John123]
//              creds1.get(0).get(0)    --> [John]
        System.out.println("ROW 0 Username: " + creds.get(0).get(0));   // John
        System.out.println("ROW 0 Password: " + creds.get(0).get(1));   // John123
        System.out.println("ROW 1 Username: " + creds.get(1).get(0));   // Bill
        System.out.println("ROW 1 Password: " + creds.get(1).get(1));   // Bill123
    }

    //----------------------------------------------------------------------------------------
    @DataTableType
    public Customer customerEntry(List<String> testDatalist) {                  // Ist Iteration(obj0 creation)     // 2nd Iteration (obj1 creation)
        System.out.println("testDatalist.get(0): " + testDatalist.get(0));       // John                            // Bill
        System.out.println("testDatalist.get(1): " + testDatalist.get(1));       // John123                         // Bill123
        return new Customer(testDatalist.get(0), testDatalist.get(1));
    }

    @Given("Single Row with No Header Data Table Type")
    public void mappingDataTableWithDomainObject(Customer customer) {
        // Creating Class reference "customer" of Customer class will internally :
        //  1. Send the Test data list from feature file to the method customerEntry
        //  2. Map the class reference "customer" to Customer object since return type of customerEntry method
        //          is an object of Customer class.
        //  By the end of this line "customer" becomes an object with TestData from feature file sent to SETTERS and GETTERS.
        System.out.println("Username from Domain Object: " + customer.getUserName());
        System.out.println("Password from Domain Object: " + customer.getPassword());
    }

    @Given("Multiple Rows with No Header Data Table Type")
    public void multipleRowsWithNoHeaderDataTableType(List<Customer> customersList) {
        // List<Customer> customersList will create list of Customer Objects for e.g: obj0 and obj1 at the same time
        //  obj0 when created, will take data [John, John123] and give to its SETTERS and GETTERS
        //  obj1 when created, will take data [Bill, Bill123] and give to its SETTERS and GETTERS
        //  customerList = [obj0, obj1]
        //  customerList.get(0) == obj0
        //  customerList.get(1) == obj1
        System.out.println("ROW 0 Username from Domain Object: " + customersList.get(0).getUserName());
        System.out.println("ROW 0 Password from Domain Object: " + customersList.get(0).getPassword());
        System.out.println("ROW 1 Username from Domain Object: " + customersList.get(1).getUserName());
        System.out.println("ROW 1 Password from Domain Object: " + customersList.get(1).getPassword());
    }

    //----------------------------------------------------------------------------------------
    @Given("Single Row with Header using | List of List of Strings")
    public void singleRowWithHeader(DataTable dataTable) {
        // Convert dataTable into List of List of Strings
        List<List<String>> customers = dataTable.asLists(); //[[username, password], [john, john123]]
        System.out.println("Username from List of List of Strings: "+customers.get(1).get(0));
        System.out.println("Password from List of List of Strings: "+customers.get(1).get(1));
    }

}
