import java.util.Scanner;

public class rock_paper_Scissor_Game {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int win = 0, loss = 0, draw = 0;
            System.out.println("\n");
            System.out.println("\t-----Welcome-----\n");
            System.out.println("Let's Play Rock-Paper-Scissors-----\n ");
            System.out.println("Enter your move \nType Rock-Paper-Scissors---");
            System.out.println("For exit game,Type exit\n");
            while (true) {
                System.out.print("--> ");
                String myMove = s.nextLine();
                System.out.println();
                if (myMove.equalsIgnoreCase("exit")) {
                    System.out.println();
                    System.out.println("-----Score Card-----\n");
                    System.out.println("Win = " + win + "\n");
                    System.out.println("Lose = " + loss + "\n");
                    System.out.println("Draw = " + draw + "\n");
                    System.out.println("Thank You, For Playing....\n");
                    System.out.println();
                    break;
                }
                if (!myMove.equalsIgnoreCase("Rock") && !myMove.equalsIgnoreCase("Paper")
                        && !myMove.equalsIgnoreCase("Scissors")) {
                    System.out.println("Invalid input , Please try again...\n");
                } else {
                    int ran = (int) (Math.random() * 3);
                    String oppMove = "";
                    if (ran == 0) {
                        oppMove = "Rock";
                    } else if (ran == 1) {
                        oppMove = "Paper";
                    } else {
                        oppMove = "Scissors";
                    }
                    System.out.println("Opponent Move = " + oppMove);

                    if (myMove.equalsIgnoreCase(oppMove)) {
                        System.out.println("Draw...\n");
                        draw++;
                    } else if ((myMove.equalsIgnoreCase("Rock") && oppMove.equalsIgnoreCase("Scissors"))
                            || (myMove.equalsIgnoreCase("Paper") && oppMove.equalsIgnoreCase("Rock"))
                            || (myMove.equalsIgnoreCase("Scissors") && oppMove.equalsIgnoreCase("Paper"))) {
                        System.out.println("You Won....\n");
                        win++;
                    } else {
                        System.out.println("You lose....\n");
                        loss++;
                    }
                }
            }
        }
    }
}
