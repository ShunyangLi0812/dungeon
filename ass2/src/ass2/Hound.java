package ass2;

public class Hound implements Enemy {

    private Coordinate position;
    private Map map;
    private boolean alive;

    public Hound(Map map)
    {
        this.getPosition().setX(5);
        this.getPosition().setY(5);
        this.getPosition().setValue(Objects.hound);
        map.setupMap(this.getPosition());
    }


    @Override
    public Coordinate getPosition() {
        return this.position;
    }

    @Override
    public void moveLeft() {

        Coordinate coordinate = new Coordinate(this.position.getX(), this.position.getY() - 1,Objects.player);
        if (vildateMove(coordinate))
        {
            this.position.setValue(Objects.road);
            this.map.setupMap(this.position);
            this.position.setY(this.position.getY() - 1);
            this.position.setValue(Objects.player);
            this.map.setupMap(this.position);
        }
    }

    @Override
    public void moveRight() {

        Coordinate coordinate = new Coordinate(this.position.getX(),this.position.getY() + 1,this.position.getValue());
        if (vildateMove(coordinate))
        {
            this.position.setValue(Objects.road);
            this.map.setupMap(this.position);
            this.position.setY(this.position.getY() + 1);
            this.position.setValue(Objects.player);
            this.map.setupMap(this.position);
        }
    }

    @Override
    public void moveDown() {

        Coordinate coordinate = new Coordinate(this.position.getX() + 1, this.position.getY(),Objects.player);
        if (vildateMove(coordinate))
        {
            this.position.setValue(Objects.road);
            this.map.setupMap(this.position);
            this.position.setX(this.position.getX() + 1);
            this.position.setValue(Objects.player);
            this.map.setupMap((this.position));
        }
    }

    @Override
    public void moveUp() {
        Coordinate coordinate = new Coordinate(this.position.getX() - 1 ,this.position.getY(), Objects.player);

        if (vildateMove(coordinate))
        {
            this.position.setValue(Objects.road);
            this.map.setupMap(this.position);
            this.position.setX(this.position.getX() - 1);
            this.position.setValue(Objects.player);
            this.map.setupMap(this.position);
        }
    }

    @Override
    public boolean vildateMove(Coordinate coordinate) {
        boolean flag = false;
        if (this.map.getValue(coordinate.getX(),coordinate.getY()) == Objects.road)
        {
            flag = true;
        }

        return flag;
    }
}