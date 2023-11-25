package Day15_CodeVita;

import java.util.Scanner;

public class OrchardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Ashok's row of trees:");
        String ashokRow = scanner.nextLine();

        System.out.println("Enter Anand's row of trees:");
        String anandRow = scanner.nextLine();

        String winner = findWinner(ashokRow, anandRow);

        System.out.println(winner);
    }

    static String findWinner(String ashokRow, String anandRow) {
        int ashokPossibilities = countPossibilities(ashokRow);
        int anandPossibilities = countPossibilities(anandRow);

        if (ashokPossibilities > anandPossibilities) {
            return "Ashok";
        } else if (anandPossibilities > ashokPossibilities) {
            return "Anand";
        } else {
            return "Draw";
        }
    }

    static int countPossibilities(String row) {
        int possibilities = 0;

        for (int i = 0; i < row.length() - 2; i++) {
            if (row.charAt(i) != row.charAt(i + 1) && row.charAt(i + 1) != row.charAt(i + 2)
                    && row.charAt(i) != row.charAt(i + 2)) {
                possibilities++;
            }
        }

        return possibilities;
    }
}
