public class Main {
    public static void main(String[] args) {
        
        // Customer #1
        System.out.println("=== Customer Management System ===");
        System.out.println("This program demonstrates the Customer class functionality.\n");
        System.out.println("=== Customer #1 ===");
        try {
            Customer customer1 = new Customer("John Doe", "123-456-7890");
            System.out.println(customer1);
            
            // modify with setters
            System.out.println("--- Modify with setters ---");
            customer1.setName("Jane Smith");
            customer1.setPhoneNumber("098-765-4321");
            System.out.println(customer1);
            
            // throw an exception
            System.out.println("--Throw error:"); // This line will not be executed due to the exception
            customer1.setPhoneNumber(""); // Attempt to set an invalid phone number
            System.out.println("Updated Customer: " + customer1); // This line will not be executed due to the exception
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Customer #2
        System.out.println("\n=== Customer #2 ===");
        try{
            Customer customer2 = new Customer("Alice Smith", "555-123-4567");
            System.out.println("-Customer Created: " + customer2);
            System.out.println("2 ways to do the same: "+customer2.getCustomerInfo());

            // Use getter methods to retrieve values
            System.out.println("\n--- Using Getter Methods ---");
            String currentName = customer2.getName();
            String currentPhoneNumber = customer2.getPhoneNumber();
            System.out.println("get Customer Name: " + currentName);
            System.out.println("get Phone Number: " + currentPhoneNumber);

            // Use setter methods to modify values
            System.out.println("\n--- Using Setter to modify ---");
            customer2.setName("Bob Johnson");
            customer2.setPhoneNumber("555-987-6543");
            System.out.println("Updated Customer: " + customer2);

            // setter validation
            System.out.println("\n--- Demonstrating Setter Validation ---");
            customer2.setName(""); // Attempt to set an invalid name
            customer2.setPhoneNumber(null);  // Attempt to set an invalid phone number
            System.out.println("Updated Customer: " + customer2); // This line will not be executed due to the exception

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        

        // Customer #3
        System.out.println("\n=== Customer #3 ===");
        try{
            Customer customer3 = new Customer("Charlie Brown", "555-111-2222");
            System.out.println("-Customer Created: " + customer3);
            customer3.setPhoneNumber("555-333-4444");
            customer3.setName("Charles Davis");
            System.out.println("Updated Customer: " + customer3);

            // throw an exception
            System.out.println("\n--Throw error:");
            Customer nameBlank = new Customer("","123-456-7890");
            System.out.println("-----Not executed-----"+nameBlank);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        
    }

}