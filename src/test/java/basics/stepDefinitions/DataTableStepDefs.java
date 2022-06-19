package basics.stepDefinitions;

import basics.domainObjects.Customer;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;


public class DataTableStepDefs {
    @Given("Single Row NO Header")
    public void singleRowNoHeader(List<List<String>> dataList) {
        System.out.println("dataList: " + dataList);      // [[John, John123]]
        System.out.println("USERNAME = " + dataList.get(0).get(0));
        System.out.println("PASSWORD = " + dataList.get(0).get(1));
    }

    @Given("Multiple Rows NO Headers")
    public void multipleRowsNoHeader(List<List<String>> dataList) {
        System.out.println("dataList: " + dataList);      // [[John, John123], [Bill, Bill123]]
        System.out.println("ROW 0 Username: " + dataList.get(0).get(0));   // John
        System.out.println("ROW 0 Password: " + dataList.get(0).get(1));   // John123
        System.out.println("ROW 1 Username: " + dataList.get(1).get(0));   // Bill
        System.out.println("ROW 1 Password: " + dataList.get(1).get(1));   // Bill123
    }

    @Given("Single Row WITH Header | List of List of Strings")
    public void singleRowWithHeader(List<List<String>> dataList) {
        System.out.println("dataList: " + dataList);      //   [[username, password], [john, john123]]
        System.out.println("Username from List of List of Strings: " + dataList.get(1).get(0));
        System.out.println("Password from List of List of Strings: " + dataList.get(1).get(1));
    }

    @Given("Single Row WITH Header | List of Maps")
    public void singleRowWithHeaderUsingListOfMaps(List<Map<String, String>> dataList) {
        System.out.println("dataList: " + dataList);    // [{username=john, password=john123}]
        // Fetch value from Map using Key
        System.out.println("Username from List of Map: " + dataList.get(0).get("username"));
        System.out.println("Password from List of Map: " + dataList.get(0).get("password"));
    }

    @Given("Multiple Rows WITH Headers")
    public void multipleRowsWithHeaderUsingListOfMaps(List<Map<String, String>> dataList) {
        System.out.println("dataList: " + dataList);   // [{username=john, password=john123}, {username=bill, password=bill123}]
        System.out.println("Row 0 Username from List of Map: " + dataList.get(0).get("username"));
        System.out.println("Row 0 Password from List of Map: " + dataList.get(0).get("password"));
        System.out.println("Row 1 Username from List of Map: " + dataList.get(1).get("username"));
        System.out.println("Row 1 Password from List of Map: " + dataList.get(1).get("password"));
    }

    // ------------------------------------------------------------------------------------------------------------------------------
//    // NOTE: There are two @DataTableType in the Step Definitions.
//    //      At a time only enable 1 since both are referring to same Domain Object customer
//    @DataTableType
//    public Customer customerEntry(List<String> testDatalist) {
//        // Specifying List<String> testDatalist as I/P parameter will
//        //  automatically transform datatable into List<String>                  // Ist Iteration(obj0 creation) | // 2nd Iteration (obj1 creation)
//        System.out.println("testDatalist.get(0): " + testDatalist.get(0));       // John                         | // Bill
//        System.out.println("testDatalist.get(1): " + testDatalist.get(1));       // John123                      | // Bill123
//        return new Customer(testDatalist.get(0), testDatalist.get(1));
//    }

    @Given("Data Table Type | Single Row NO Header")
    public void dataTableType_SingleRowNoHeader(Customer customer) {
        // Creating Class reference "customer" of Customer class will internally :
        //  1. Send the Test data list from feature file to the method customerEntry
        //  2. Map the class reference "customer" to Customer object since return type of customerEntry method
        //          is an object of Customer class.
        //  By the end of this line "customer" becomes an object with TestData from feature file sent to SETTERS and GETTERS.
        System.out.println("Username from Domain Object: " + customer.getUserName());
        System.out.println("Password from Domain Object: " + customer.getPassword());
    }

    @Given("Data Table Type | Multiple Rows NO Header")
    public void dataTableType_MultipleRowsNoHeader(List<Customer> customerList) {
        // List<Customer> customersList will create list of Customer Objects for e.g: obj0 and obj1 at the same time
        //  obj0 when created, will take data [John, John123] and give to its SETTERS and GETTERS
        //  obj1 when created, will take data [Bill, Bill123] and give to its SETTERS and GETTERS
        //  customerList = [obj0, obj1]
        //  customerList.get(0) == obj0
        //  customerList.get(1) == obj1
        System.out.println("ROW 0 Username from Domain Object: " + customerList.get(0).getUserName());
        System.out.println("ROW 0 Password from Domain Object: " + customerList.get(0).getPassword());
        System.out.println("ROW 1 Username from Domain Object: " + customerList.get(1).getUserName());
        System.out.println("ROW 1 Password from Domain Object: " + customerList.get(1).getPassword());
    }
    // -------------------------------------------------------------------------------------------------------------------------------

//    // NOTE: There are two @DataTableType in the Step Definitions.
//    //      At a time only enable 1 since both are referring to same Domain Object customer
//    @DataTableType
//    public Customer customerData(Map<String, String> data) {
//        System.out.println("@DataTableType data.get(\"username\"): " + data.get("username"));
//        System.out.println("@DataTableType data.get(\"password\"): " + data.get("password"));
//        return new Customer(data.get("username"), data.get("password"));
//    }

    @Given("Data Table Type | Single Row WITH Header")
    public void dataTableType_SingleRowWithHeader(Customer customer) {
        // By this line customer will be changed from Class reference to an Object
        System.out.println("Row 0 Username: " + customer.getUserName());
        System.out.println("Row 0 Password: " + customer.getPassword());
    }

    @Given("Data Table Type | Multiple Rows WITH Header")
    public void dataTableType_MultipleRowsWithHeader(List<Customer> customerList) {
        // List<Customer> customersList will create list of Customer Objects for e.g: obj0 and obj1 at the same time
        //  obj0 when created, will take data [John, John123] and give to its SETTERS and GETTERS
        //  obj1 when created, will take data [Bill, Bill123] and give to its SETTERS and GETTERS
        //  customerList = [obj0, obj1]
        //  customerList.get(0) == obj0
        //  customerList.get(1) == obj1
        System.out.println("ROW 0 Username from Domain Object: " + customerList.get(0).getUserName());
        System.out.println("ROW 0 Password from Domain Object: " + customerList.get(0).getPassword());
        System.out.println("ROW 1 Username from Domain Object: " + customerList.get(1).getUserName());
        System.out.println("ROW 1 Password from Domain Object: " + customerList.get(1).getPassword());
    }
    // -------------------------------------------------------------------------------------------------------------------------------

    @Given("Single Column with no Header")
    public void singleColumnNoHeader(List<String> data) {
        System.out.println("data: " + data);              // [john, john123]
        System.out.println("1st User: " + data.get(0));
        System.out.println("2nd User: " + data.get(1));
    }

    @Given("Single Column WITH Header")
    public void singleColumnWITHHeader(List<Map<String, String>> dataList) {
        System.out.println("dataList: " + dataList);      // [{username=john}, {username=john123}]
        System.out.println("Row 0 Username from List of Map: " + dataList.get(0).get("username"));
        System.out.println("Row 1 Username from List of Map: " + dataList.get(1).get("username"));
    }

    @Given("Single Column WITH SIDE Header")
    public void singleColumnWITHSIDEHeader(Map<String, String> dataMap) {
        System.out.println("dataMap: " + dataMap);        // {username=john, password=john123}
        System.out.println("Username: " + dataMap.get("username"));
        System.out.println("Password: " + dataMap.get("password"));
    }

    // -------------------------------------------------------------------------------------------------------------------------------
////     NOTE: There are two @DataTableType in the Step Definitions.
////          At a time only enable 1 since both are referring to same Domain Object customer
//    @DataTableType
//    public Customer customerEntry(List<String> dataList) {      // [john, john123]
//        return new Customer(dataList.get(0), dataList.get(1));
//    }

    @Given("Data Table Type | Single Column NO Header")
    public void dataTableTypeSingleColumnNOHeader(@Transpose Customer customer) {
        // @Transpose will convert Vertical data into Horizontal data before sending to @DataTableType i.e.
        //  | john    |
        //  | john123 |
        //  The above will be converted into | john | john123 |
        //  After this we can pass the data as a List<String> to DataTable Type
        System.out.println("Customer: " + customer);
        System.out.println("Username is: " + customer.getUserName());
        System.out.println("Password is: " + customer.getPassword());
    }

    // ---------------------------------------------------------------------------------------------------------------------
//     NOTE: There are two @DataTableType in the Step Definitions.
//          At a time only enable 1 since both are referring to same Domain Object customer
    @DataTableType
    public Customer customerEntry(Map<String,String> dataMap) {
        System.out.println("dataMap: "+dataMap);                // {username=john, password=john123}
        return new Customer(dataMap.get("username"), dataMap.get("password"));
    }
    @Given("Data Table Type | Single Column WITH SIDE Header")
    public void dataTableTypeSingleColumnWITHSIDEHeader(@Transpose List<Customer> customerList) {
        // Our Data Tale is:
        // | username | john    |
        // | password | john123 |

        // Using @Transpose will convert into:
        // | username | password |
        // | john     | john123 |
        System.out.println("customerList: "+customerList);
        System.out.println("ROW 0 Username from Domain Object: " + customerList.get(0).getUserName());
        System.out.println("ROW 0 Password from Domain Object: " + customerList.get(0).getPassword());
    }

}
