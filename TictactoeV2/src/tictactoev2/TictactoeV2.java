
/*  Tic Tac Toe V2 is the what was assigned to be done including the extra 
    credit, with a little extra with formating it to be centered to make it look 
    cleaner and also has the function of being able to do as many game as wanted
    without having the rerun the program. With this the program also counts how 
    many games the users have played and also keeps track of how many wins each
    user has and the draws. These stats are displayed after the users indicate 
    they do not wish to play again. */

package tictactoev2;
import java.util.Scanner;
public class TictactoeV2 {
// Main methoid
    public static void main(String[] args) {
    // Calling and intializing variables
        Scanner scnr = new Scanner(System.in);
        char boardArray[][] = new char[17][17]; // Array of chars to make the board
        int stats[] = new int[4]; // stats[0] = games played, stats[1] = player1 wins, stats[2] = player2 wins, stats[3] = draws
        int player = 0; // Location player places their token
        int turn = 1;   // Player turn tracker
        int win = 0;    // Player 1 wins if win=1, player 2 wins if win=2, draw if win=0
        String answer;  // User string input  // keeps track of games ending in draws
        
    // Information for the user
        System.out.println("    Welcome to Tic Tac Toe");
        System.out.println("     2 Players are Needed");
        System.out.println("       Ready to Begin? ");
        System.out.println("          Yes or No");
        answer = scnr.next();// Player's Answer
        
    // The start of the game
        theGame(boardArray, player, turn, win, answer, stats);
        
    // Game Stats
        System.out.println("Games played: " + stats[0]);
        System.out.println("Draws: " + stats[3]);
        System.out.println("Player 1: " + stats[1] + " Wins");
        System.out.println("Player 2: " + stats[2] + " Wins");  
    }// main end
// Assigning values to the array    
    public static void setBoard(char boardArray[][]) {
        for (int row = 0; row < 17; row++){     //checks the rows value
            for(int col = 0; col < 17; col++){  //checks the columns value
                if (row != 5 && row != 11){
                    if (col != 5 && col != 11) boardArray[row][col] = ' ';
                    else boardArray[row][col] = '|';
                }//if row end
                else {
                    if (col != 5 && col != 11) boardArray[row][col] = '-';
                    else boardArray[row][col] = '|';
                }//else row end
            }//for loop 2 end
        }//for loop 1 end
    //assigns tokens locations
        boardArray[2][2] = '1';
        boardArray[2][8] = '2';
        boardArray[2][14] = '3';
        boardArray[8][2] = '4';
        boardArray[8][8] = '5';
        boardArray[8][14] = '6';
        boardArray[14][2] = '7';
        boardArray[14][8] = '8';
        boardArray[14][14] = '9';
    }
// Outputs Array    
    public static void showBoard(char boardArray[][]) {
        for (int row = 0; row < 17; row++){     //checks the rows value
            System.out.print("      ");
            for (int col = 0; col < 17; col++){ //checks the columns value
                System.out.print(boardArray[row][col]);
            }
        System.out.println("");
        }
        System.out.println("");
    }
// Player's turn
    public static void playerTurn(char boardArray[][], int player, int turn) {
        Scanner scnr = new Scanner(System.in);
        int y = 0; // Variable to check if a valid input was provided
    // if else statement checks which players turn it is
    // player 1's turn
        if (turn == 1){ 
        // loops until a valid input is provided
            do {
                y = 0;
                System.out.println("       Player 1's Turn");
                System.out.println("Enter Were to Place Your Token");
                player = scnr.nextInt();
                switch (player){
                    case 1: if(boardArray[2][2] == '1') boardArray[2][2] = 'X'; else y = 1; break; 
                    case 2: if(boardArray[2][8] == '2') boardArray[2][8] = 'X'; else y = 1; break;
                    case 3: if(boardArray[2][14] == '3') boardArray[2][14] = 'X'; else y = 1; break;
                    case 4: if(boardArray[8][2] == '4') boardArray[8][2] = 'X'; else y = 1; break;
                    case 5: if(boardArray[8][8] == '5') boardArray[8][8] = 'X'; else y = 1; break;
                    case 6: if(boardArray[8][14] == '6') boardArray[8][14] = 'X'; else y = 1; break;
                    case 7: if(boardArray[14][2] == '7') boardArray[14][2] = 'X'; else y = 1; break;
                    case 8: if(boardArray[14][8] == '8') boardArray[14][8] = 'X'; else y = 1; break;
                    case 9: if(boardArray[14][14] == '9') boardArray[14][14] = 'X'; else y = 1; break;
                    default: y = 1;
                }// switch end
                if (y == 1) System.out.println("        Invalid Input");
            }while (y == 1);// do while end
        }// if end
        
        // player 2's turn
        else{
        // loops until a valid input is provided
            do {
                y = 0;
                System.out.println("       Player 2's turn");
                System.out.println("Enter were to place your token");
                player = scnr.nextInt();
                switch (player){
                    case 1: if(boardArray[2][2] == '1') boardArray[2][2] = 'O'; else y = 1; break; 
                    case 2: if(boardArray[2][8] == '2') boardArray[2][8] = 'O'; else y = 1; break;
                    case 3: if(boardArray[2][14] == '3') boardArray[2][14] = 'O'; else y = 1; break;
                    case 4: if(boardArray[8][2] == '4') boardArray[8][2] = 'O'; else y = 1; break;
                    case 5: if(boardArray[8][8] == '5') boardArray[8][8] = 'O'; else y = 1; break;
                    case 6: if(boardArray[8][14] == '6') boardArray[8][14] = 'O'; else y = 1; break;
                    case 7: if(boardArray[14][2] == '7') boardArray[14][2] = 'O'; else y = 1; break;
                    case 8: if(boardArray[14][8] == '8') boardArray[14][8] = 'O'; else y = 1; break;
                    case 9: if(boardArray[14][14] == '9') boardArray[14][14] = 'O'; else y = 1; break;
                    default: y = 1;
                }// switch end
                if (y == 1) System.out.println("        Invalid Input");
            }while (y == 1);// do while end
        }// else end
        showBoard(boardArray); // Shows updated board
    }// methoid end
// Win check
    public static int checkWin(char boardArray[][], int turn, int win) {
    // row win checks
        if (boardArray[2][2] == boardArray[2][8] && boardArray[2][8] == boardArray[2][14]) win = turn;
        if (boardArray[8][2] == boardArray[8][8] && boardArray[8][8] == boardArray[8][14]) win = turn;
        if (boardArray[14][2] == boardArray[14][8] && boardArray[14][8] == boardArray[14][14]) win = turn;
    // column win checks
        if (boardArray[2][2] == boardArray[8][2] && boardArray[8][2] == boardArray[14][2]) win = turn;
        if (boardArray[2][8] == boardArray[8][8] && boardArray[8][8] == boardArray[14][8]) win = turn;
        if (boardArray[2][14] == boardArray[8][14] && boardArray[8][14] == boardArray[14][14]) win = turn;
    // diagnal win checks    
        if (boardArray[2][2] == boardArray[8][8] && boardArray[8][8] == boardArray[14][14]) win = turn;
        if (boardArray[14][2] == boardArray[8][8] && boardArray[8][8] == boardArray[2][14]) win = turn;
        return (win);
    }// checkWin end 
// Game Play
    public static int gamePlay(char boardArray[][], int player, int turn, int win){
        win = 0; // Resets win
        setBoard(boardArray);  // Sets up starting board layout
        showBoard(boardArray); // Shows the starting board 
    // Players turns
        for (int x = 0; x < 9; x++) {
            playerTurn(boardArray, player, turn); // Players turn and input
            checkWin(boardArray, turn, win);// Check if someone won and who won
            win = checkWin(boardArray, turn, win);// Gets the value of win returned by checkWin
        // ends loop early if someone wins
            if (win != 0) x = 9;
        // Switches between players turns
            if (turn == 1) turn++; 
            else turn--;
        }// for loop end
        return win;
    }// gamePlay Ends
    // The Game
    public static void theGame(char boardArray[][], int player, int turn, int win, String answer, int stats[]){
        Scanner scnr = new Scanner(System.in);
    // The start of the game
        while (answer.equalsIgnoreCase("Yes")) {
        // Playing the game
            win = gamePlay(boardArray, player, turn, win);// Gets value of win returned by game(boardArray, player, turn, win);

        // Checks who won
            switch (win) {
                case 1: System.out.println("       Player 1 Wins"); stats[1]++; break;
                case 2: System.out.println("       Player 2 Wins"); stats[2]++; break;
                default: System.out.println("      It is a Draw"); stats[3]++;
            }// switch end
            stats[0]++;// +1 to games count
        
        //Checks if players want to do another round
            System.out.println(" Do you want to play again?");
            System.out.println("        Yes or No");
            answer = scnr.next();
        }// While loop ends
    }// theGame Ends
}// class end