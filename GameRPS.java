import java.util.Scanner;
import java.util.Random;

public class GameRPS {
    public static void main(String args[]){
        System.out.println("Playing Rock, Paper and Scissor");

        int i=1;
        int user = 0;
        int computer = 0;
        while(i<=5) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 for Rock, 1 for paper and 2 for Scissor");
            int user_input = sc.nextInt();

            Random random = new Random();
            int computer_input = random.nextInt(3);

            if (user_input == computer_input) {
                System.out.println("Draw");
            } else if (user_input == 0 && computer_input == 2 || user_input == 1 && computer_input == 0 || user_input == 2 && computer_input == 1) {
                System.out.println("You Win");
                user++;
            } else {
                System.out.println("Computer Win");
                computer++;
            }
            System.out.println("Computer Choice " + computer_input);

            i++;
        }
        System.out.println("Series has completed");

        if(user>computer){
            System.out.println("You have won the series by " + user + "-" + computer);
        }
        else if(user == computer){
            System.out.println("Series is Draw by " + user + "-" + computer);
        }
        else{
            System.out.println("Computer has won the series by " + computer + "-" + user);
        }
    }
}
