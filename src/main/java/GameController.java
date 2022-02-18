import View.InputView;
import View.OutputView;
import domain.Ladder;

public class GameController {

    public void run() {
        Ladder ladder = InputView.askSettingLadder();
        InputView.close();
        OutputView.showLadder(ladder);
    }

}
