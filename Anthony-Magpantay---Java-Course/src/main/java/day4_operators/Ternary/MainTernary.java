package day4_operators.Ternary;

public class MainTernary {
    public static void main(String[] args) {

        // condition ? expression1 : expression 2

        int age = 29;
        System.out.println( age < 65 ? " not yet retired" : "retired");

        boolean isReceived14thMonth = false;
        String receivedBonus = isReceived14thMonth ? "received" : "not yet received";
        System.out.println(" - Anthony has " + receivedBonus);
    }
}
