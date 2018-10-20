package props;

import ass2.Coordinate;
import ass2.Map;

public class Invincibility implements Props {

    private Map map;
    private boolean buff;

    public Invincibility(Map map) {
        this.map = map;
        this.buff = false;
    }

    @Override
    public boolean use() {
        if (this.buff) {
            return true;
        } else {
            this.buff = false;
            return true;
        }
    }

    @Override
    public boolean pickUp() {
        if (this.buff) {
            return false;
        }
        return true;
    }

    public void setBuff(boolean buff) {
        this.buff = buff;
    }

    @Override
    public int getNum() {
        return 0;
    }

    @Override
    public void setNum(int num) {
        return;
    }

    @Override
    public boolean validateSet(Coordinate coordinate) {
        return false;
    }

    @Override
    public boolean setPositionOnMap(int x, int y) {
        return false;
    }

    @Override
    public Coordinate getPosition() {
        return null;
    }

    @Override
    public boolean isBuff() {
        return false;
    }

    @Override
    public void setMap(Map map) {
        this.map = map;
    }

}
