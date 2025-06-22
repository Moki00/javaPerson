public class Customer {

    private String name;
    private String phoneNumber;

    /**
     * Constructor for Customer class.
     * @param name The name of the customer.
     * @param phoneNumber The phone number of the customer.
     * Initializes a new instance of the Customer class with the specified name and phone number.
     * * @throws IllegalArgumentException if name or phoneNumber is null or empty.
     */
    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        if (name == null || name.isEmpty() || phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Name and phone number cannot be null or empty.");
        }
    }

    /**
     * Gets the name of the customer.
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the customer.
     * @param name The new name of the customer.
     * @throws IllegalArgumentException if name is null or empty.
     */
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    /**
     * Gets the phone number of the customer.
     * @return The phone number of the customer.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the customer.
     * @param phoneNumber The new phone number of the customer.
     * @throws IllegalArgumentException if phoneNumber is null or empty.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty.");
        }
        this.phoneNumber = phoneNumber;
    }

    /** Override toString method to provide a string representation of the Customer object.
     * @return A string representation of the Customer object.
     */
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    /**
     * Checks if two Customer objects are equal based on their name and phone number.
     * @param o The object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name) && phoneNumber.equals(customer.phoneNumber);
    }

    /**
     * Generates a hash code for the Customer object based on its name and phone number.
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        return 31 * name.hashCode() + phoneNumber.hashCode();
    }
    
    /**
     * Returns a string representation of the customer.
     * @return A string containing the customer's name and phone number.
     */
    public String getCustomerInfo() {
        return "Customer Name: " + name + ", Phone Number: " + phoneNumber;
    }

    
}
