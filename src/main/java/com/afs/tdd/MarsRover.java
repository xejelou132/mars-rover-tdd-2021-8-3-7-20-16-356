package com.afs.tdd;

public class MarsRover implements RoverMovement {
    int locationX;
    int locationY;
    Direction direction;

    public MarsRover(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void executeCommand(String command) {
        if (command.equals("M")) {
            move();
        }
        if (command.equals("L")) {
            turnLeft();
        }
        if (command.equals("R")){
            turnRight();
        }
    }

    private void move() {
        switch (direction) {
            case N:
                locationY += 1;
                break;
            default:
                return;
        }
    }

    @Override
    public void turnLeft() {
        direction = direction.rotateLeft();
    }

    @Override
    public void turnRight() {
        direction = direction.rotateRight();
    }

}
