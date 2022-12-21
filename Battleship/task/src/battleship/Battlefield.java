package battleship;

public class Battlefield {

    private final int x;
    private final int y;

    public Battlefield() {
        this.x = 10;
        this.y = 10;
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

}
