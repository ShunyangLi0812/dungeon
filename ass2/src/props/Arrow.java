package props;

import ass2.*;

import javax.crypto.interfaces.PBEKey;

public class Arrow implements Props{

    private int numOfuse;
    private Coordinate position;
    private Map map;

    public Arrow(Map map) {
        this.map = map;
        this.setNum(0);
    }

    @Override
    public boolean use() {
        if (this.numOfuse > 0) {
            this.numOfuse -- ;
            return true;
        }
        return false;
    }

    @Override
    public int getNum() {
        return this.numOfuse;
    }

    @Override
    public void setNum(int num) {
        this.numOfuse = num;
    }

    @Override
    public boolean pickUp() {
        this.numOfuse ++;
        return true;
    }

    @Override
    public boolean setPositionOnMap(int x, int y) {
        Coordinate co = new Coordinate(x, y, Objects.arrow);
        if(validateSet(co)) {
            this.position = co;
            this.map.setupMap(co);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validateSet(Coordinate coordinate) {

        if (this.map.getValue(coordinate.getX(), coordinate.getY()) == Objects.road) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Coordinate getPosition() {
        return this.position;
    }

    @Override
    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public boolean isBuff() {
        return false;
    }

    @Override
    public String toString() {
        return "Arrow";
    }
}
