public class Main {
    public static void main(String[] args) {
        
        // Example usage of the Customer class
        try {
            Customer customer = new Customer("John Doe", "123-456-7890");
            System.out.println(customer);
            
            customer.setName("Jane Smith");
            customer.setPhoneNumber("098-765-4321");
            System.out.println(customer);
            
            // Uncommenting the following line will throw an exception
            // Customer invalidCustomer = new Customer("", "123-456-7890");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        // Additional code can be added here to further test or use the Customer class
        
    }
    

}