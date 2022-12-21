package battleship;

public class Ship {
    private String shipName;
    private int size;
    private boolean destroyed;


    public Ship(String shipName, int size) {
        this.shipName = shipName;
        this.size = size;
    }

    public String getShipName() {
        return this.shipName;
    }

    public int getSize(){
        return this.size;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
}
