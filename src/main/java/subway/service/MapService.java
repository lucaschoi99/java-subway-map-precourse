package subway.service;

import subway.domain.LineRepository;
import subway.domain.Station;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapService {

    /**
     * 4. 지하철 노선도 출력
     */

    public Map<String, List<Station>> printMap() {
        Map<String, List<Station>> result = new HashMap<>();

        LineRepository.lines().forEach(line -> result.put(line.getName(), line.getExistingStations()));
        return result;
    }
}
