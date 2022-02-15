package Util;

public class Valid {

    private static final int MIN_PLAYER = 2;
    private static final String PLAYER_COUNT_ERROR_MESSAGE = "player의 수는 2명 이상이어야 합니다.";
    private static final String PLAYER_NAME_ERROR_MESSAGE = "player의 이름은 5글자까지 가능합니다.";

    public static void checkPlayers(int count) {
        if(count < MIN_PLAYER) {
            throw new IllegalArgumentException(PLAYER_COUNT_ERROR_MESSAGE);
        }
    }
    // 도메인 구현 후 input검증을 정규식으로 리팩토링 해봐야 함
    public static void checkNames(String input) {
        if(!input.contains(",")) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean checkNameLength(String name) {
        if(name.length() > 5) {
            throw new IllegalArgumentException(PLAYER_NAME_ERROR_MESSAGE);
        }
        return true;
    }
}
