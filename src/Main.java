public class Main {
    public static void main(String[] args) {
        
        // tryCatch with the Customer class
        try {
            // 1. Create a new Customer object
            System.out.println("--- Creating a Customer object ---");
            Customer customer1 = new Customer("John Doe", "123-456-7890");
            System.out.println(customer1);
            
            // change name and phone number
            customer1.setName("Jane Smith");
            customer1.setPhoneNumber("098-765-4321");
            System.out.println(customer1);
            
            // throw an exception
            Customer nameBlank = new Customer("","123-456-7890");
            System.out.println("-----------Can you see this?????????????????"+nameBlank); // This line will not be executed due to the exception
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // new try-catch block to demonstrate the Customer class functionality
        try{


        Customer customer2 = new Customer("Alice Smith", "555-123-4567");
        System.out.println("Customer Created: " + customer2);
        System.out.println("Line 24: "+customer2.getCustomerInfo()); // Initial info

        // 2. Use getter methods to retrieve values
        System.out.println("\n--- Using Getter Methods ---");
        String currentName = customer2.getName();
        String currentPhoneNumber = customer2.getPhoneNumber();
        System.out.println("Retrieved Customer Name: " + currentName);
        System.out.println("Retrieved Phone Number: " + currentPhoneNumber);

        // 3. Use setter methods to modify values
        System.out.println("\n--- Using Setter Methods ---");
        customer2.setName("Bob Johnson");
        customer2.setPhoneNumber("555-987-6543");
        // customer2.displayInfo(); // Info after modification

        // 4. Demonstrate setter validation
        System.out.println("\n--- Demonstrating Setter Validation ---");
        customer2.setName(""); // Attempt to set an invalid name
        customer2.setPhoneNumber(null);  // Attempt to set an invalid phone number
        // customer2.displayInfo(); // Should still show "Bob Johnson", "555-987-6543"

        // 5. Create another customer and modify
        System.out.println("\n--- Another Customer ---");
        Customer customer3 = new Customer("Charlie Brown", "555-111-2222");
        // customer3.displayInfo();
        customer3.setPhoneNumber("555-333-4444");
        customer3.setName("Charles Davis");
        // customer3.displayInfo();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        
    }

}