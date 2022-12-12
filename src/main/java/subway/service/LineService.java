package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

import java.util.List;

public class LineService {

    /**
     * 2. 노선 관리
     */
    // 노선 등록
    public void addNewLine(String newLine, String leftMost, String rightMost) {
        Line line = new Line(newLine);
        Station left = getStations(newLine, leftMost);
        Station right = getStations(newLine, rightMost);

        line.addStation(left);
        line.addStation(right);
        LineRepository.addLine(line);
    }

    private Station getStations(String newLine, String stationName) {
        Station station = StationRepository.hasStation(stationName);
        if (station == null) {
            station = new Station(stationName);
            station.addLineOnStation(newLine);
            StationRepository.addStation(station);
        }
        station.addLineOnStation(newLine);
        return station;
    }

    // 노선 삭제
    public boolean deleteLine(String deleteLine) {
        if (LineRepository.deleteLineByName(deleteLine)) {
            return true;
        }
        return false;
    }

    // 노선 조회
    public List<Line> lookUpLine() {
        return LineRepository.lines();
    }

}
