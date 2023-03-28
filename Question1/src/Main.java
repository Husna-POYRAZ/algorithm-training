import java.util.ArrayList;
import java.util.List;

public class Main {
    // A dizisinde olup B dizisinde olmayan elemanları bulunuz.
    final static int[][] aMatris = {
            {3, 6, 2},
            {1, 5, 6},
            {2, 1, 5},
    };

    final static int[][] bMatris = {
            {1, 1, 2},
            {3, 3, 3},
            {2, 2, 1},
    };

    public static void main(String[] args) {
        List<Integer> list = contains(aMatris, bMatris);
        for (Integer i : list)
            System.out.println(i);
    }

    private static List contains(int[][] aMatris, int[][] bMatris) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < aMatris.length; i++) {
            for (int j = 0; j < aMatris[0].length; j++) {
                int variable = aMatris[i][j];
                int count = 0;
                for (int k = 0; k < bMatris.length; k++) {
                    for (int l = 0; l < bMatris[0].length; l++) {
                        if (variable == bMatris[k][l]) {
                            count++;
                            break;
                        }
                    }
                }
                if (count == 0 && !list.contains(variable))
                    list.add(variable);
            }
        }
        return list;
    }
}