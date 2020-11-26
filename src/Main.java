public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int plus = 1300;
        int limit = 1000;
        int newBalance;
        if (plus > limit) {
            newBalance = balance + plus / 100;
        } else {
            newBalance = balance + plus;
        }
        System.out.println(newBalance);
    }
}
