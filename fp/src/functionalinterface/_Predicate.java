package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        //Without Predicate
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000999999"));

        //Using Predicate
        System.out.println(isPhoneNumberValiePredicate.test("07000000000"));
        System.out.println(isPhoneNumberValiePredicate.test("09000999999"));

        //Using multiple predicates using "and"
        System.out.println(isPhoneNumberValiePredicate.and(containsNumber3).test("07030000000"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValiePredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
