package battleship;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Ship> ships;
    private String name;

    private Battlefield battlefield;

    public Player(String name) {
        this.ships = new ArrayList<>();
        addShips();
        this.name= name;
    }

    public void setBattlefield(Battlefield battlefield) {
        this.battlefield = battlefield;
    }

    public void addShips() {
        ships.add(new Ship("Aircraft Carrier",5));
        ships.add(new Ship("Battleship", 4));
        ships.add(new Ship("Submarine", 3));
        ships.add(new Ship("Cruiser", 3));
        ships.add(new Ship("Destroyer", 2));
    }

    public void positionShip(Ship ship) {
        battlefield.
    }


}
