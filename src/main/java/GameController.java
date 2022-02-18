import View.InputView;
import View.OutputView;
import domain.Ladder;

public class LadderGame {

    public void run() {
        Ladder ladder = InputView.askSettingLadder();
        InputView.close();
        OutputView.showLadder(ladder);
    }

}
