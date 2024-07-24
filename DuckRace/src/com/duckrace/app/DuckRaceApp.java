package com.duckrace.app;

import com.duckrace.Board;
import com.duckrace.Reward;

import java.util.Scanner;

/*
* Application controller
* It conducts the overall "flow" of the app, does all user prompting
* and passes
*/
class DuckRaceApp {
    private final Scanner scanner = new Scanner(System.in);
    private final Board board = new Board();

    public void execute(){
        welcome();
        showBoard();
        int id = promptForId();
        Reward reward = promptForReward();
        updateBoard(id, reward);
        showBoard();
    }

    private void updateBoard(int id, Reward reward) {
        board.update(id, reward)
    }


    private Reward promptForReward() {
        Reward reward = null;
        boolean validInput = false;
        while(!validInput){
            System.out.println("Please enter [D]ebit card or [P]rizes");
            String input = scanner.nextLine().trim().toUpperCase();
            if(input.matches("D|P")){
                reward = (input.equals("D")) ? Reward.DEBIT_CARD: Reward.PRIZES;
                validInput = true;
            }

        }

        return reward;
    }

    private int promptForId() {
        int id = 0;

        boolean validInput = false;
        while(!validInput){
            System.out.println("Please enter ID of winner [1-11]: "); //TODO: dont hard code 11
            String input = scanner.nextLine().trim();    //BLOCKS for [enter]
            if(input.matches("\\d{1,2}")){  //now you cna safely parseInt()
                id = Integer.parseInt(input);
                if(id >=1 && id <= 11){
                   validInput = true;
                }
            }
        }

        return id;
    }

    private void showBoard() {
        board.show();
    }

    private void welcome() {
        System.out.println("\n");
        System.out.println("------------------------------------------------------");
        System.out.println("W E L C O M E    T O     T H E     D U C K     R A C E");
        System.out.println("------------------------------------------------------");
        System.out.println("\n");
    }
}