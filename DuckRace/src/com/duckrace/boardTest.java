package com.duckrace;

class boardTest {
    public static void main(String[] args) {
        Board b = new Board();

        b.updateBoard(3, Reward.DEBIT_CARD);
        b.updateBoard(1, Reward.PRIZES);
        b.updateBoard(5, Reward.DEBIT_CARD);
        b.updateBoard(1, Reward.PRIZES);
        b.updateBoard(9, Reward.DEBIT_CARD);
        b.updateBoard(1, Reward.DEBIT_CARD);
        b.updateBoard(9, Reward.DEBIT_CARD);

        b.show();
    }
}