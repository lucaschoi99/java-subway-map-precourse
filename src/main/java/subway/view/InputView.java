package subway.view;

import java.util.Scanner;

public class InputView {

    public String selectMode(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateSelectMode(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    /**
     * 1. 역 관리
     */
    public String addStationByName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateAddStationByName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    public String deleteStationByName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateDeleteStationByName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    /**
     * 2. 노선 관리
     */

    public String addLineByName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateAddLineByName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }


    public String addLeftMostStationName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateAddLeftMostStationName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    public String addRightMostStationName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateAddLeftMostStationName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    public String deleteLineByName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateDeleteLineByName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    /**
     * 3. 구간 관리
     */
    public String addPathLineName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateAddPathLineName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    public String addPathStationName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateAddPathStationName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    public String addPathStationOrder(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateAddPathStationOrder(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    public String deletePathLineName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateDeletePathLineName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

    public String deletePathStationName(Scanner scanner) {
        String input = scanner.nextLine();
        if (validateDeletePathStationName(input)) {
            return input;
        }
        throw new IllegalArgumentException();
    }

}
