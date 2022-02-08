import java.util.Scanner;

public class FanDriver {
    public static void main(String[] args) {
      Fan fan1 = new Fan();
      Scanner sc = new Scanner(System.in);

      /**Initial output text*/
      System.out.println(fan1.toString()+"\n");
      System.out.println("Input S to pull speed cord, D to pull direction cord, Q to quit.\n");

      /**Until quit, prompt user for input*/
      while (true){
        String input = sc.nextLine();

        if (input.equals("Q")){
          break;
        }
        else if (input.equals("S")){
          fan1.changeSpeed();
        }
        else if (input.equals("D")){
          fan1.changeDirection();
        }
        else{
          System.out.println("Please enter a valid input.");
        }
        /**Display current fan settings after input*/
        System.out.println(fan1.toString()+"\n");
      }

      sc.close();
    }
}
