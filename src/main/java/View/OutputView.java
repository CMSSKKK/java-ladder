package View;

import domain.LadderGame;

public class OutputView {

    public static void showLadder(LadderGame ladderGame) {
        System.out.println(ladderGame.toString());
    }

}