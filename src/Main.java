public class Main {
    public static void main(String[] args) {
        
        // Example usage of the Customer class
        try {
            Customer customer = new Customer("John Doe", "123-456-7890");
            System.out.println(customer);
            
            customer.setName("Jane Smith");
            customer.setPhoneNumber("098-765-4321");
            System.out.println(customer);
            
            // the following line will throw an exception
            Customer invalidCustomer = new Customer("","123-456-7890");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        // Additional code can be added here to further test or use the Customer class

               // 1. Create a new Customer object
        System.out.println("--- Creating a Customer object ---");
        Customer customer1 = new Customer("Alice Smith", "555-123-4567");
        System.out.println("Customer Created: " + customer1);
        customer1.getCustomerInfo(); // Initial info

        // 2. Use getter methods to retrieve values
        System.out.println("\n--- Using Getter Methods ---");
        String currentName = customer1.getName();
        String currentPhoneNumber = customer1.getPhoneNumber();
        System.out.println("Retrieved Customer Name: " + currentName);
        System.out.println("Retrieved Phone Number: " + currentPhoneNumber);

        // 3. Use setter methods to modify values
        System.out.println("\n--- Using Setter Methods ---");
        customer1.setName("Bob Johnson");
        customer1.setPhoneNumber("555-987-6543");
        // customer1.displayInfo(); // Info after modification

        // 4. Demonstrate setter validation
        System.out.println("\n--- Demonstrating Setter Validation ---");
        customer1.setName(""); // Attempt to set an invalid name
        customer1.setPhoneNumber(null);  // Attempt to set an invalid phone number
        // customer1.displayInfo(); // Should still show "Bob Johnson", "555-987-6543"

        // 5. Create another customer and modify
        System.out.println("\n--- Another Customer ---");
        Customer customer2 = new Customer("Charlie Brown", "555-111-2222");
        // customer2.displayInfo();
        customer2.setPhoneNumber("555-333-4444");
        customer2.setName("Charles Davis");
        // customer2.displayInfo();
        
    }
    

}