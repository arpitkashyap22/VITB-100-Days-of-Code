package Day68CodeVita;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RajuLanguageInterpreter {

    private static final Map<Character, Integer> variables = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String code = readUntilEmptyLine(scanner);
        interpretRajuCode(code);

        String variableNames = scanner.nextLine();
        String variableValues = scanner.nextLine();

        initializeVariables(variableNames, variableValues);
    }

    private static String readUntilEmptyLine(Scanner scanner) {
        StringBuilder code = new StringBuilder();
        String line;

        while (!(line = scanner.nextLine()).isEmpty()) {
            code.append(line).append("\n");
        }

        return code.toString().trim();  // Trim to remove the extra newline at the end
    }

    private static void initializeVariables(String variableNames, String variableValues) {
        String[] names = variableNames.split(" ");
        String[] values = variableValues.split(" ");

        for (int i = 0; i < names.length; i++) {
            variables.put(names[i].charAt(0), Integer.parseInt(values[i]));
        }
    }

    private static void interpretRajuCode(String code) {
        String[] lines = code.split("\n");

        for (String line : lines) {
            interpretLine(line);
        }
    }

    private static void interpretLine(String line) {
        String[] tokens = line.split(" ");

        if (tokens.length >= 3) {
            String keyword = tokens[0].toLowerCase();
            String comparator = tokens[1];
            char variable = tokens[2].charAt(0);

            int operand1 = variables.get(variable);
            int operand2 = Integer.parseInt(tokens[3]);

            switch (keyword) {
                case "is":
                    if (compare(comparator, operand1, operand2)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    break;
                case "print":
                    System.out.println(operand1);
                    break;
                case "si":
                    // Nested if case
                    if (tokens.length >= 7 && tokens[4].toLowerCase().equals("is")) {
                        String nestedComparator = tokens[5];
                        int nestedOperand1 = variables.get(tokens[6].charAt(0));
                        int nestedOperand2 = Integer.parseInt(tokens[7]);

                        if (compare(nestedComparator, nestedOperand1, nestedOperand2)) {
                            System.out.println(operand1);
                        } else {
                            System.out.println(operand2);
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid syntax");
            }
        } else {
            System.out.println("Invalid syntax");
        }
    }

    private static boolean compare(String comparator, int operand1, int operand2) {
        switch (comparator) {
            case "<":
                return operand1 < operand2;
            case ">":
                return operand1 > operand2;
            case "==":
                return operand1 == operand2;
            case "!=":
                return operand1 != operand2;
            default:
                return false;
        }
    }
}
