import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainProgram();
    }
        public static void mainProgram() {
            try {
                System.out.println("Please enter a number from 1-100 to calculate the optimal change");
                Scanner in = new Scanner(System.in);
                int response = in.nextInt();
                ChangeMachine newChangeMachine = new ChangeMachine();
                newChangeMachine.setAmount(response);
                newChangeMachine.counterQuarter();
                newChangeMachine.dimeCounter();
                newChangeMachine.nickelCounter();
                newChangeMachine.pennyCounter();

                System.out.println(newChangeMachine.getQuarterNum() + " Number of quarters");
                System.out.println(newChangeMachine.getDimeNum() + " Number of dimes");
                System.out.println(newChangeMachine.getNickelNum() + " Number of nickels");
                System.out.println(newChangeMachine.getPennyNum() + " Number of pennies");
            } catch (Exception e) {
                System.out.println("I don't understand, please try again");
                mainProgram();
            }


        }

}
