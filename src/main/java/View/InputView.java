package View;

import Util.Validation;
import domain.Ladder;
import domain.LadderGame;
import domain.Players;

import java.util.Scanner;

public class InputView {

    private static final String PLAYER_NAMES_COMMAND = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String PLAYER_NAMES_RESTRICTIONS = "[플레이어의 이름은 5자 이내(알파벳,숫자만가능), 가능 플레이어의 수는 2명이상 10명이하입니다.]";
    private static final String LADDER_HEIGHT_COMMAND = "최대 사다리 높이는 몇 개인가요?";
    private static final String RESULT_VALUES_COMMAND = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final Scanner scanner = new Scanner(System.in);



    public static LadderGame askSettingLadder() {
        return new LadderGame(askPlayers(),askLadderHeight(),askResultValues());
    }

    public static void close() {
        scanner.close();
    }

    private static Players askPlayers() {
        System.out.println(PLAYER_NAMES_COMMAND);
        System.out.println(PLAYER_NAMES_RESTRICTIONS);
        String players = scanner.nextLine().replaceAll(" ","");
        try {
            Validation.checkInputNames(players);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askPlayers();
        }
        return new Players(players);

    }

    public static int askLadderHeight() {
        System.out.println(LADDER_HEIGHT_COMMAND);
        return Integer.parseInt(scanner.nextLine());
    }

    private static String[] askResultValues() {
        System.out.println(RESULT_VALUES_COMMAND);
        return scanner.nextLine().replaceAll(" ","").split(",");
    }


}

