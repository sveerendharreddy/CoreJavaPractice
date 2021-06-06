package java8.combinatorpattern;

import java.time.LocalDate;
import static java8.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+09876543219",
                LocalDate.of(2000,1,1)
        );

        //Using Combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS)
            throw new IllegalStateException(result.name());

    }
}
