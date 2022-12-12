package subway.domain;

import java.util.List;
import java.util.Set;

public class Station {
    private String name;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 노선에 속한 역이 무엇인지 반환하는 필드
    private Set<String> stationOnLine;

    public void addLineOnStation(String line) {
        this.stationOnLine.add(line);
    }

    public Set<String> getStationOnLine() {
        return stationOnLine;
    }
}
