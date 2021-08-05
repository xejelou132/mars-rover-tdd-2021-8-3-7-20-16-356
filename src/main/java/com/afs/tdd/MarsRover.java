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
        if (command.length() > 1) {
            for (int i = 0; i < command.length(); i++) {
                getMovements(String.valueOf(command.charAt(i)));
                getLeft(String.valueOf(command.charAt(i)));
                getRight(String.valueOf(command.charAt(i)));
            }

        } else {
            getMovements(command);
            getLeft(command);
            getRight(command);
        }
    }

    private void getRight(String command) {
        if (command.equals("R")) {
            turnRight();
        }
    }

    private void getLeft(String command) {
        if (command.equals("L")) {
            turnLeft();
        }
    }

    private void getMovements(String command) {
        if (command.equals("M")) {
            move();
        }
    }

    private void move() {
        switch (direction) {
            case N:
                locationY += 1;
                break;
            case S:
                locationY -= 1;
                break;
            case E:
                locationX += 1;
                break;
            case W:
                locationX -= 1;
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
