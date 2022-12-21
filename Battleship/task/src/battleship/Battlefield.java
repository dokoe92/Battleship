package battleship;

import java.util.ArrayList;

public class Battlefield {

    private final int x;
    private final int y;
    private boolean[][] fields;
    private ArrayList<Player> players;
    public Battlefield() {
        this.x = 10;
        this.y = 10;
        fields = new boolean[this.x][this.y];

    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void createField() {
        for (int i = 0; i <= this.x; i++) {
            for (int j = 0; j <= this.y; j++) {
                if (i == 0 && j > 0) {
                    System.out.print("  " + j);
                }

                int alpha = 'A';
                if (i > 0 && j == 0) {
                    alpha = alpha + i - 1;
                    System.out.print((char) alpha);
                }
                if (i > 0 && j > 0) {
                    System.out.print(" ~ ");
                }
            }
            System.out.print("\n");
        }
    }

    public void checkField() {
        for (int i = 0; i < getY(); i++) {
            for (int j = 0; j < getX(); j++) {
                if (fields[i][y] && !checkOutOfBound) {
                    fields[i][y] = true;
                }
            }
        }
    }

    public void checkOutOfBound(Player player) {

    }

    public void addPlayer1(Player player) {
        if (players.size() < 3 && players.size() >= 0) {
            players.add(player);
        }
    }

}
