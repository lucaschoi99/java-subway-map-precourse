package subway.service;

import subway.domain.Station;
import subway.domain.StationRepository;

import java.util.List;

public class StationService {

    /**
     * 1. 역 관리
     */
    // 역 등록
    public Station addNewStation(String newStation) {
        Station station = new Station(newStation);
        StationRepository.addStation(station);
    }

    // 역 삭제
    public boolean deleteStation(String deleteStation) {
        if (StationRepository.deleteStation(deleteStation)) {
            return true;
        }
        return false;
    }

    // 역 조회
    public List<Station> lookUpStation() {
        return StationRepository.stations();
    }

}
