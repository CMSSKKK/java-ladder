import View.InputView;
import View.OutputView;
import domain.Ladder;
import domain.LadderGame;

public class GameController {

    public void run() {
        LadderGame ladderGame = InputView.askSettingLadder();
        InputView.close();
        OutputView.showLadder(ladderGame);
    }

}
