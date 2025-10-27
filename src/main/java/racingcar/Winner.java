package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Winner {
    public void printWinner(Map<String, Integer> positions) {
        int maxPosition = getMaxPosition(positions);
        List<String> winners = getWinnersNames(positions, maxPosition);
        System.out.println("최종 우승자 : " + String.join(", ", winners));

    }

    private int getMaxPosition(Map<String, Integer> positions) {
        return Collections.max(positions.values());
    }

    private List<String> getWinnersNames(Map<String, Integer> positions, int maxPosition) {
        List<String> winners = new ArrayList<>();
        for (Map.Entry<String, Integer> car : positions.entrySet()) {
            if (car.getValue() == maxPosition) {
                winners.add(car.getKey());
            }
        }
        return winners;
    }
}
