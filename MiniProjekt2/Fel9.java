package MiniProjekt2;

public class Fel9 {
    public static void main(String[] args) {
        int[][] tomb = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    tomb[i][j] = i + 1;
                } else {
                    tomb[i][j] = 0;
                }
                System.out.print(tomb[i][j] + " ");
            }
            System.out.println();
        }
    }
}
