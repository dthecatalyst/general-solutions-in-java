package mazesolver;

public class Maz {
    private int[][] maze;
    private int[][] solution;
    private int mazeSize;

    public Maz(int[][] maze) {
        this.maze = maze;
        this.mazeSize = maze.length;
        this.solution = new int[mazeSize][mazeSize];
    }

    public void solve() {
        if (solveMaze(0, 0)) {
            showResult();
        } else {
            System.out.print("No solution....");
        }
    }

    private boolean solveMaze(int x, int y) {

        if (isFinished(x, y)) {
            return true;
        }
        if (isValid(x, y)) {

            solution[x][y] = 1;

            if (solveMaze(x + 1, y)) {
                return true;
            }

            if (solveMaze(x, y + 1)) {
                return true;
            }

            solution[x][y] = 0;
        }
        return false;
    }

    private boolean isValid(int x, int y) {
        if (x < 0 || x >= mazeSize) return false;
        if (y < 0 || y >= mazeSize) return false;
        if (maze[x][y] != 1) return false;

        return true;
    }

    private boolean isFinished(int x, int y) {
        if (x == mazeSize - 1 && y == mazeSize - 1) {
            solution[x][y] = 1;
            return true;
        }
        return false;

    }

    private void showResult() {
        for (int i = 0; i < mazeSize; i++) {
            for (int j = 0; j < mazeSize; j++) {
                if (solution[i][j] == 1) {
                    System.out.print(" s ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
