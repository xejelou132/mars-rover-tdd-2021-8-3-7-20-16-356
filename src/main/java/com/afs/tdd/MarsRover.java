package com.afs.tdd;

public class MarsRover {
    int locationX;
    int locationY;
    String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public MarsRover(RoverStatus roverStatus) {
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }

    public void executeCommand(String command) {
    }
}
