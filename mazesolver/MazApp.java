package mazesolver;

public class MazApp {
    public static void main(String[] args) {
        int maze[][] = {{1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1}};

        Maz maz = new Maz(maze);
        maz.solve();
    }
}
