package racingcar;

import java.util.List;

public class InputValidator {
    public void validateCarNames(List<String> carNames, String input) {
        carNames.forEach(name -> {
            validateEmpty(name);
            validateLength(name);
            validateEnglishOnly(name);
        });
        validateEndWithComma(input);

    }

    public void validateTryCount(String input) {
        validateEmpty(input);
        validateNumber(input);

    }

    private void validateEmpty(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    private void validateLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
    }

    private void validateEnglishOnly(String name) {
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException();
        }
    }

    private void validateEndWithComma(String input) {
        if (input.endsWith(",")) {
            throw new IllegalArgumentException();
        }
    }

    private void validateNumber(String input) {
        try {
            int count = Integer.parseInt(input);
            parsePositiveInteger(count);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    private void parsePositiveInteger(int count) {
        if (count < 1) {
            throw new IllegalArgumentException();
        }
    }

}
