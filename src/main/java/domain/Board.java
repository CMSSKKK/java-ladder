package domain;

import java.util.ArrayList;
import java.util.List;

import static Util.Valid.checkPlayers;

public class Board {

    private static final String VERTICAL = "|";

    private final int players;
    private final int height;
    private final List<List<String>> frame;
    private final Line line;

    public Board(int players, int height) {
        this.players = players;
        this.height = height;
        checkPlayers(players);
        frame = new ArrayList<>();
        line = new Line();
    }

    public int countPlayers() {
        return players;
    }

    public int getLadderHeight() {
        return height;
    }

    public void generateFrame() {
        for (int row = 0; row < height; row++) {
            frame.add(draw(row));
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.toString();
    }

    private List<String> draw(int row) {
        List<String> floor = new ArrayList<>();
        for (int col = 0; col < players*2-1 ; col++) {
            floor.add(drawLine(col));
        }
        return floor;
    }

    private String drawLine(int col) {
        if(col % 2 == 0) {
            return VERTICAL;
        }
        return line.generateRandomLine();
    }
}

