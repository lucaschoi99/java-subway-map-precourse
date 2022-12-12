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

    /**
     * 노선에 존재하는 역 정보를 관리
      */
    private List<Station> existingStations = new ArrayList<>();

    public void addStation(Station station) {
        this.existingStations.add(station);
    }

    // 구간 등록: 역이 등록될 순서를 정하는 메서드
    public void addStationByOrder(Station newStation, int order) {
        List<Station> temp = List.copyOf(existingStations);
        existingStations.clear();
        for (int i = 0; i < order - 1; i++) {
            existingStations.add(temp.get(i));
        }
        existingStations.add(newStation);
        for (int i = order - 1; i < temp.size(); i++) {
            existingStations.add(temp.get(i));
        }
    }

    // 구간 삭제: 임의의 역을 삭제하는 메서드
    public boolean deleteGivenStation(String deleteStation) {
        int order = getIndexOfStation(deleteStation) + 1;
        if (order == 0) {
            return false;
        }
        List<Station> temp = List.copyOf(existingStations);
        existingStations.clear();

        for (int i = 0; i < order - 1; i++) {
            existingStations.add(temp.get(i));
        }
        for (int i = order; i < temp.size(); i++) {
            existingStations.add(temp.get(i));
        }
        return true;
    }

    // 역이 위치하는 인덱스를 반환하는 메서드
    private int getIndexOfStation(String name) {
        for (int i = 0; i < existingStations.size(); i++) {
            if (existingStations.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public List<Station> getExistingStations() {
        return existingStations;
    }
}
