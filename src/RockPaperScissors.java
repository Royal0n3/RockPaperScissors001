import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String YNResp = "";
        boolean done = false;
        do {
            String[] rps = {"R", "P", "S"};
            System.out.println("Player A: Choose R, P, S");
            String playerA = in.nextLine();
            System.out.println("Player B: Choose R, P, S");
            String playerB = in.nextLine();
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Its a tie Rock X Rock");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock Player B wins");
                } else //playB is Scissors
                {
                    System.out.println("Rock breaks Scissors Player A wins");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors Player B wins");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Its a tie Paper X Paper");
                } else //playB is Scissors
                {
                    System.out.println("Scissors cuts Paper Player B wins");
                }
            } else  //playerA is Scissors
            {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors Player B wins");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper Player A wins");
                } else //playB is Scissors
                {
                    System.out.println("Its a tie Scissors x Scissors");
                    // Code and control logic to play again
                    System.out.print("Do you want to play again [Y/N]: ");
                    YNResp = in.nextLine();
                    if (YNResp.equalsIgnoreCase("N")) {
                        done = true;
                    }
                }
            }


        }while (!done) ;
    }
}
