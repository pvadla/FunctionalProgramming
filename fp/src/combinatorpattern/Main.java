package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicegmail.com",
                "334213",
                LocalDate.of(2000,1,1)
                );


//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        System.out.println(validatorService.isValid(customer));

        // Using Combinator pattern
        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);

        System.out.println(result);
        if(result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }










    }
}
