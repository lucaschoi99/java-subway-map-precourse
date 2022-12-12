package subway.domain;

public class Station {
    private String name;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 노선에 속한 역인지 여부를 확인하는 메서드
    private boolean hasLine = false;

}
