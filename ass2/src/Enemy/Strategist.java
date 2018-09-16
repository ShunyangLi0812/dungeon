package Enemy;

import ass2.*;

public class Strategist extends Enemy {
    private Coordinate position;
    private Map map;
    private boolean alive;

    @Override
    public boolean autoMove() {
        return false;
    }

    public Strategist(Map map, Coordinate position)
    {
        this.position = position;
        this.map = map;
        this.map.setupMap(this.position);
        this.alive = true;
    }

    @Override
    public void moveDown(Enemy enemy) {
        super.moveDown(this);
    }

    @Override
    public void moveUp(Enemy enemy) {
        super.moveUp(this);
    }

    @Override
    public void moveRight(Enemy enemy) {
        super.moveRight(this);
    }

    @Override
    public void moveLeft(Enemy enemy) {
        super.moveLeft(this);
    }

    @Override
    public Coordinate getPosition(Enemy enemy) {
        return this.position;
    }

    @Override
    public Map getMap(Enemy enemy) {
        return this.map;
    }

    @Override
    public int getVal(Enemy enemy) {
        return Objects.strategist;
    }
    @Override
    public void setAlive(boolean s) {
        this.alive = s;
    }

    @Override
    public boolean alive() {
        return this.alive;
    }

    @Override
    public void hide() {

    }
}
