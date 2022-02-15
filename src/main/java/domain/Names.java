package domain;

import Util.Valid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Names {

    private List<String> names;

    public Names(String strNames) {
        this.names = new ArrayList<>();
        generateNames(strNames);
    }

    public void generateNames(String strNames) {
        Valid.checkNames(strNames);
        String[] splited = strNames.split(",");
        Valid.checkPlayers(splited.length);
        Arrays.stream(splited).filter(s -> Valid.checkNameLength(s.trim())).forEach(s -> names.add(s.trim()));
    }

    public int getPlayersCount() {
        return names.size();
    }
}
