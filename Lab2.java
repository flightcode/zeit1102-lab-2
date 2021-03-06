import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intLotteryNumber = (int) (Math.random() * (900) + 100);
        System.out.print("What number: ");
        int x = input.nextInt();
        while (x < 100 || x > 999) {
            System.out.println("Try again");
            System.out.print("What number: ");
            x = input.nextInt();
        }
        input.close();
        System.out.println("The number was " + intLotteryNumber);
        if (x == intLotteryNumber) {
            System.out.println("You have won $10000");
        } else {
            boolean wonDigit = false;
            int digitsUser = x;
            while (digitsUser > 0 && !wonDigit) {
                int digitsLott = intLotteryNumber;
                while (digitsLott > 0 && !wonDigit) {
                    if (digitsUser % 10 == digitsLott % 10) {
                        wonDigit = true;
                    }
                    digitsLott = digitsLott / 10;
                }
                digitsUser = digitsUser / 10;
            }
            if (wonDigit) {
                System.out.println("You have won $1000");
            } else {
                System.out.println("You have lost");
            }
        }
    }
}
