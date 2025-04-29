public class Calculator {
    public static void main(String[] args) {
        double n1 = 20;
        double n2 = 5;

        double add = n1 + n2;
        double sub = n1 - n2;
        double mul = n1 * n2;
        double div = (n1 / n2);

        System.out.println("addition: " + add);
        System.out.println("substraction: " + sub);
        System.out.println("multiplication: " + mul);
        
        if (n2 != 0) {
            System.out.println("division: " + div);
        } else {
            System.out.println("division: Cannot divide by zero.");
        }
    }
}