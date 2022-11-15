package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        //Using Supplier
        //Returns any kind of value we want
        System.out.println(getDBConnectionSupplier.get());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionSupplier = () ->
            "jdbc://localhost:5432/users";
}
