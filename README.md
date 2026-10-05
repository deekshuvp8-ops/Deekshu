public class IfElseExample {
    public static void main(String[] args) {
        int number = 15;

        // 1. Basic if-else
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // 2. if - else if - else ladder
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // 3. Ternary Operator (Shorthand if-else)
        String result = (score >= 60) ? "Passed" : "Failed";
        System.out.println("Status: " + result);
    }
}