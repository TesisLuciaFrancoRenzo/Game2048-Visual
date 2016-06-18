package org.hol.game2048;

/**
 * JAVAONE 2014 - Create the Game 2048 with Java 8 and JavaFX [HOL3244]
 *
 * @authors bruno.borges@oracle.com @brunoborges & pereda@eii.uva.es @jperedadnr
 */
public class Location {

    private int x;
    private int y;

    /**
     *
     * @param x
     * @param y
     */
    public Location(int x,
            int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        final Location other = (Location) obj;
        if ( this.x != other.x ) {
            return false;
        }
        return this.y == other.y;
    }

    /**
     *
     * @param CELL_SIZE
     *
     * @return
     */
    public double getLayoutX(int CELL_SIZE) {
        return (x * CELL_SIZE) + CELL_SIZE / 2;
    }

    /**
     *
     * @param CELL_SIZE
     *
     * @return
     */
    public double getLayoutY(int CELL_SIZE) {
        return (y * CELL_SIZE) + CELL_SIZE / 2;
    }

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.x;
        hash = 61 * hash + this.y;
        return hash;
    }

    /**
     *
     * @return
     */
    public boolean isValidFor() {
        return x >= 0 && x < 4 && y >= 0 && y < 4;
    }

    /**
     *
     * @param direction
     *
     * @return
     */
    public Location offset(Direction direction) {
        // TO-DO: Step 12. Return the location of the tile in the selected direction
        if ( Game2048.STEP >= 11 ) {
            return new Location(x + direction.getX(), y + direction.getY());
        }
        return new Location(x, y);
    }

    @Override
    public String toString() {
        return "Location{" + "x=" + x + ", y=" + y + '}';
    }

}
