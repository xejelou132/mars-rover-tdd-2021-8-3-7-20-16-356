package com.afs.tdd;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.afs.tdd.CommonConstant.*;

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

            String[] commands = command.split("");
            Arrays.stream(commands).forEach(s -> {
                getMovements(s);
                isLeft(s);
                isRight(s);
            });

        } else {
            getMovements(command);
            isLeft(command);
            isRight(command);
        }
    }

    private void isRight(String command) {
        if (command.equals(RIGHT)) {
            turnRight();
        }
    }

    private void isLeft(String command) {
        if (command.equals(LEFT)) {
            turnLeft();
        }
    }

    private void getMovements(String command) {
        if (command.equals(MOVE)) {
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
