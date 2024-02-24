import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n  1 | 2 | 3 %n----|---|----%n  4 | 5 | 6 %n----|---|----%n  7 | 8 | 9 %n%n");
        System.out.println(" How many rounds do you want to play? 1 or 3");
        int round = scanner.nextInt();
        while (true){
            if(round == 3){
                break;}
        if (round==1) {
            break;
        }

        System.out.println(" Please enter the number of rounds you want to play correctly: 1 or 3");
          round = scanner.nextInt();
        }



        System.out.printf("%nChoose one of the following shapes: “X” or “O” %nEnter the number 1 for “O” or the number 2 for “X” : %n");
        int r = scanner.nextInt();

        String q = "";
        String q1 = "";

        if (r == 1) {
            q = "o";
            q1 = "x";
        } else {
            q = "x";
            q1 = "o";
        }

        ArrayList<Integer> a = new ArrayList<Integer>();
        String[][] A = new String[3][3];
        A[0][0] = "1";
        A[0][1] = "2";
        A[0][2] = "3";
        A[1][0] = "4";
        A[1][1] = "5";
        A[1][2] = "6";
        A[2][0] = "7";
        A[2][1] = "8";
        A[2][2] = "9";

int countUser = 0;
int countComputer = 0;
for (int j =0 ; j<round ; j++){
        for (int i = 0; i < 5; i++) {
            int index = checkUser(a);
            TicTacToe(A, q, index);
            if(winner( A,  q,  q1)=="User" ){
                countUser++;
                break;
            }
            int index1 = checkRandom(a,index);
            System.out.println("The role of the computer in play:");
            TicTacToe(A, q1, index1);
            if(winner( A,  q,  q1)=="Computer"){
                countComputer++;
                break;
            }

            }

        if (round==3){
            System.out.println("round "+(j+2)+" : ");
            Rounds( A, a );
        }
        }
        if(countComputer<countUser){
    System.out.println("Congratulations! I won against the computer ("+countUser+ " vs "+ countComputer+")");

      }else  System.out.println("Good luck, the computer won ( " +countUser+" vs "+ countComputer +") . Try again");

    }

    public static void TicTacToe(String[][] A, String s, int index) {

        switch (index) {

            case 1:
                A[0][0] = s ;
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (j<2)
                        System.out.printf(A[i][j]+ " | ");
                        else  System.out.printf(A[i][j]);
                    }
                    System.out.println("");
                }
                break;
            case 2:
                A[0][1] = s ;
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (j<2)
                            System.out.printf(A[i][j]+ " | ");
                        else  System.out.printf(A[i][j]);
                    }
                    System.out.println("");
                }
                break;
            case 3:
                A[0][2] = s;
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (j<2)
                            System.out.printf(A[i][j]+ " | ");
                        else  System.out.printf(A[i][j]);
                    }
                    System.out.println("");
                }
                break;
            case 4:
                A[1][0] = s ;
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (j<2)
                            System.out.printf(A[i][j]+ " | ");
                        else  System.out.printf(A[i][j]);
                    }
                    System.out.println("");
                }
                break;
            case 5:
                A[1][1] = s;
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (j<2)
                            System.out.printf(A[i][j]+ " | ");
                        else  System.out.printf(A[i][j]);
                    }
                    System.out.println("");
                }
                break;
            case 6:
                A[1][2] = s;
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (j<2)
                            System.out.printf(A[i][j]+ " | ");
                        else  System.out.printf(A[i][j]);
                    }
                    System.out.println("");
                }
                break;
            case 7:
                A[2][0] = s ;
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (j<2)
                            System.out.printf(A[i][j]+ " | ");
                        else  System.out.printf(A[i][j]);
                    }
                    System.out.println("");
                }
                break;
            case 8:
                A[2][1] = s ;
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (j<2)
                            System.out.printf(A[i][j]+ " | ");
                        else  System.out.printf(A[i][j]);
                    }
                    System.out.println("");
                }
                break;
            case 9:
                A[2][2] = s;
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (j<2)
                            System.out.printf(A[i][j]+ " | ");
                        else  System.out.printf(A[i][j]);
                    }
                    System.out.println("");
                }
                break;

        }

    }
    public static int checkUser(ArrayList<Integer> a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the place you want to play");
        int index = scanner.nextInt();

        int i = 0;
        while (i < a.size()) {

            if (index == a.get(i)) {
                System.out.println("Please enter the number of a place available in the game");
                index = scanner.nextInt();
                i = -1;
            }
            if (index > 9) {
                System.out.println("Please enter one of the numbers from 1 to 9");
                index = scanner.nextInt();
                i = -1;
            }
            i++;
        }
        a.add(index);
        return index;
    }

    public static int checkRandom(ArrayList<Integer> a, int index) {
        Random random = new Random();
        int index1 = random.nextInt(9) + 1;
int i=0;
        while (i < a.size()) {
            if (index1 == a.get(i) || index1 == index) {
                index1 = random.nextInt(9) + 1;
                i = -1;

            }
            i++;
        }
        a.add(index1);
        return index1;
    }

    public static String winner(String[][] A, String q, String q1) {

              if (A[0][0] == A[0][1] && A[0][1] == A[0][2]) {
                  if (A[0][0]==q){
                  System.out.println("Congratulations! You have won");
                      return "User";
                  }else {System.out.println("Good luck, the computer won. Try again");
                  return "Computer";}
        } else if (A[1][0] == A[1][1] && A[1][1] == A[1][2]) {
                  if (A[1][0]==q){
                      System.out.println("Congratulations! You have won");
                      return "User";
                  }else {System.out.println("Good luck, the computer won. Try again");
                      return "Computer";}
        } else if (A[2][0] == A[2][1] && A[2][1] == A[2][2]) {
                  if (A[2][0]==q){
                      System.out.println("Congratulations! You have won");
                      return "User";
                  }else {System.out.println("Good luck, the computer won. Try again");
                      return "Computer";}
        }else if (A[0][0] == A[1][0] && A[1][0] == A[2][0]){
                  if (A[0][0]==q){
                      System.out.println("Congratulations! You have won");
                      return "User";
                  }else {System.out.println("Good luck, the computer won. Try again");
                      return "Computer";}
        } else if (A[0][1] == A[1][1] && A[1][1] == A[2][1]){
                  if (A[0][1]==q){
                      System.out.println("Congratulations! You have won");
                      return "User";
                  }else {System.out.println("Good luck, the computer won. Try again");
                      return "Computer";}
        }else if (A[0][2] == A[1][2] && A[1][2] == A[2][2]){
                  if (A[0][0]==q){
                      System.out.println("Congratulations! You have won");
                      return "User";
                  }else {System.out.println("Good luck, the computer won. Try again");
                      return "Computer";}
        }else if (A[0][0] == A[1][1] && A[1][1] == A[2][2]){
                  if (A[0][0]==q){
                      System.out.println("Congratulations! You have won");
                      return "User";
                  }else {System.out.println("Good luck, the computer won. Try again");
                      return "Computer";}
        }else if (A[0][2] == A[1][1] && A[1][1] == A[2][0]){
                  if (A[0][0]==q){
                      System.out.println("Congratulations! You have won");
                      return "User";
                  }else {System.out.println("Good luck, the computer won. Try again");
                      return "Computer";}

    }
        return "";
    }
    public static void Rounds(String[][] A, ArrayList a){
        A[0][0] = "1";
        A[0][1] = "2";
        A[0][2] = "3";
        A[1][0] = "4";
        A[1][1] = "5";
        A[1][2] = "6";
        A[2][0] = "7";
        A[2][1] = "8";
        A[2][2] = "9";

for (int i=0 ;i<a.size();i++){
    a.set(i,0);
}

    }


}

