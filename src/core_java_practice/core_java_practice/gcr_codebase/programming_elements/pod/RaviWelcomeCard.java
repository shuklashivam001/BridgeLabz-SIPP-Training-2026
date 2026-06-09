package core_java_practice.core_java_practice.gcr_codebase.programming_elements.pod;

public class RaviWelcomeCard {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 25;
        String rank = "Novice";
        int salary = 50000;
        float membershipFee = 299.99f;
        int annualBonus = (int)(salary * 0.12);
        System.out.println("===== Welcome to the Coding Guild =====");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + annualBonus);
    }
}
