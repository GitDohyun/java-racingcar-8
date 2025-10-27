package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        List<String> carNames = inputReader.readCarNames();
        long tryCount = inputReader.readTryCount();

    }
}
