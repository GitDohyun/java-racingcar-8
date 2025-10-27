package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.Arrays;

public class InputReader {
    private final InputValidator validator;
    public InputReader() {this.validator = new InputValidator();}

    public List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input =  Console.readLine();
        return parseCarNames(input);
    }

    private List<String> parseCarNames(String input) {
        List<String> carNames = Arrays.asList(input.split(","));
        validator.validateCarNames(carNames, input);
        return carNames;
    }
}
