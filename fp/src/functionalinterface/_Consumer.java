package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //Using Normal java function
        greetCustomer(new Customer("Maria", "99999999"));

        //Using Consumer Functional Interface
        // Consumer takes one argument and returns nothing
        greetCustomerConsumer.accept(new Customer("Maria1", "9999999"));

        //Bi Consumer Functional Interface
        //It takes two arguments
        greetCustomerConsumerV2.accept(new Customer("Maria2", "435345"), false);

    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+ customer.customerName +
                    ", thanks for registering phone number "+
                    customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+ customer.customerName +
                    ", thanks for registering phone number "+
                    (showPhoneNumber ? customer.customerPhoneNumber : "**********"));

    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.customerName +
                                        ", thanks for registering phone number "+
                                            customer.customerPhoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
