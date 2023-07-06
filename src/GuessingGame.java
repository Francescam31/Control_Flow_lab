public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 3;
        int guess = 3;

        if (secretNumber == guess){
            System.out.println("Correct");
        } else if (secretNumber < guess){
            System.out.println("Too high");
        } else {
            System.out.println("Too low");
        }
    }
}
