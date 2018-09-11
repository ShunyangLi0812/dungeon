package TestPlay;

public class Coordinate {
    private int x;
    private int y;
    private int value;

    public Coordinate () {}

    public Coordinate (int x, int y, int value) {
        this.setX(x);
        this.setY(y);
        this.setValue(value);
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getX () {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getValue() {
        return this.value;
    }
}
