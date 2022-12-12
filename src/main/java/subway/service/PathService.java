package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class PathService {

    /**
     * 3. 구간 관리
     */
    // 구간 등록
    public boolean addNewPath(String lineName, String stationName, int order) {
        Line line = LineRepository.hasLine(lineName);
        if (line == null) {
            return false;
        }
        Station station = new Station(stationName);
        station.addLineOnStation(lineName);
        StationRepository.addStation(station);
        line.addStation(station);

        line.addStationByOrder(station, order);
        return true;
    }

    // 구간 삭제
    public boolean deletePath(String deletePathLine, String deletePathStation) {
        Line line = LineRepository.hasLine(deletePathLine);
        if (line == null) {
            return false;
        }
        if (StationRepository.hasStation(deletePathStation) == null) {
            return false;
        }
        line.deleteGivenStation(deletePathStation);
        if (StationRepository.deleteStation(deletePathStation) == false) {
            return false;
        }
        return true;
    }

}
