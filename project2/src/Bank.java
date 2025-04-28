import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public Customer getCustomerByPin(String pin) {
        for (Customer customer : customers) {
            if (customer.getPin().equals(pin)) {
                return customer;
            }
        }
        return null;
    }

    public String getAllCustomersInfo() {
        StringBuilder info = new StringBuilder();
        for (Customer customer : customers) {
            info.append(customer.toString()).append("\n");
        }
        return info.toString();
    }
}
