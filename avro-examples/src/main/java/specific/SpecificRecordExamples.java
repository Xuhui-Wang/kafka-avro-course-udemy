package specific;

import com.example.Customer;

public class SpecificRecordExamples {
    public static void main(String[] args) {
        // step 1: create specific records
        Customer.Builder customerBuilder = Customer.newBuilder();
        customerBuilder.setAge(25);
        customerBuilder.setFirstName("John");
        customerBuilder.setLastName("Doe");
        customerBuilder.setHeight(175f);
        customerBuilder.setWeight(85.0f);
        customerBuilder.setAutomatedEmail(false);
        Customer customer = customerBuilder.build();
        System.out.println(customer);

        // step 2: write to file

        // step 3: read from file

        // step 4: interpret
    }
}
