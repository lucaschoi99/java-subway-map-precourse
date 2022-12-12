package subway.view;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;

import java.util.List;

public class OutputView {

    /**
     * 메인 화면
     */
    public void printMain() {
        System.out.println("## 메인 화면\n" +
                "1. 역 관리\n" +
                "2. 노선 관리\n" +
                "3. 구간 관리\n" +
                "4. 지하철 노선도 출력\n" +
                "Q. 종료\n");
    }

    public void selectFuncMode() {
        System.out.println("## 원하는 기능을 선택하세요.");
    }

    /**
     * 1. 역 관리
     */
    public void printStationService() {
        System.out.println("## 역 관리 화면\n" +
                "1. 역 등록\n" +
                "2. 역 삭제\n" +
                "3. 역 조회\n" +
                "B. 돌아가기\n");
    }

    public void addStationName() {
        System.out.println("## 등록할 역 이름을 입력하세요.");
    }

    public void deleteStationName() {
        System.out.println("## 삭제할 역 이름을 입력하세요.");
    }

    public void lookUpStationList(List<Station> result) {
        System.out.println("## 역 목록");

    }

    /**
     * 2. 노선 관리
     */
    public void printLineService() {
        System.out.println("## 노선 관리 화면\n" +
                "1. 노선 등록\n" +
                "2. 노선 삭제\n" +
                "3. 노선 조회\n" +
                "B. 돌아가기\n");
    }

    public void addLineName() {
        System.out.println("## 등록할 노선 이름을 입력하세요.");
    }

    public void addLeftMostLine() {
        System.out.println("## 등록할 노선의 상행 종점역 이름을 입력하세요.");
    }

    public void addRightMostLine() {
        System.out.println("## 등록할 노선의 하행 종점역 이름을 입력하세요.");
    }

    public void deleteLineName() {
        System.out.println("## 삭제할 노선 이름을 입력하세요.");
    }

    public void lookUpLineList(List<Line> result) {
        System.out.println("## 노선 목록");

    }

    /**
     * 3. 구간관리
     */
    public void printPathService() {
        System.out.println("## 구간 관리 화면\n" +
                "1. 구간 등록\n" +
                "2. 구간 삭제\n" +
                "B. 돌아가기\n");
    }

    public void addPathLine() {
        System.out.println("## 노선을 입력하세요.");
    }

    public void addPathStation() {
        System.out.println("## 역이름을 입력하세요.");
    }

    public void addOrder() {
        System.out.println("## 순서를 입력하세요.");
    }

    public void deletePathLine() {
        System.out.println("## 삭제할 구간의 노선을 입력하세요.");
    }

    public void deletePathStation() {
        System.out.println("## 삭제할 구간의 역을 입력하세요.");
    }

    /**
     * 4. 지하철 노선도 출력
     */
    public void printSubwayMap(LineRepository lineRepository) {
        System.out.println("## 지하철 노선도");

    }



















}
