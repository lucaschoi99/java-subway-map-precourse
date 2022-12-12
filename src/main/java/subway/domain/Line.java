package subway.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private String name;

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 노선에 존재하는 역 정보를 관리
    private List<Station> existingStations = new ArrayList<>();

    public void addStation(Station station) {
        this.existingStations.add(station);
    }

    public List<Station> getExistingStations() {
        return existingStations;
    }
}
