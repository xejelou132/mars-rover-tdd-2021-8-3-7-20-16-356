package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.afs.tdd.CommonConstant.*;
class DemoTest {

    @Test
    void should_return_0_1_N_when_execute_command_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.N);
        RoverStatus expectedStatus = new RoverStatus(0 , 1, Direction.N);

        //when
        marsRover.executeCommand(MOVE);

        //then

        assertEquals(expectedStatus.getLocationY(),marsRover.getLocationY());

    }

    @Test
    void should_return_0_0_W_when_execute_command_given_0_0_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.N);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.W);

        //when
        marsRover.executeCommand("L");

        //then

        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }

    @Test
    void should_return_0_0_E_when_execute_command_given_0_0_N_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.N);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.E);

        //when
        marsRover.executeCommand("R");

        //then

        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }

    @Test
    void should_return_0_negative_1_S_when_execute_command_given_0_0_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.S);
        RoverStatus expectedStatus = new RoverStatus(0 , -1, Direction.S);

        //when
        marsRover.executeCommand(MOVE);

        //then

        assertEquals(expectedStatus.getLocationY(),marsRover.getLocationY());

    }

    @Test
    void should_return_0_0_E_when_execute_command_given_0_0_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.S);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.E);

        //when
        marsRover.executeCommand(LEFT);

        //then

        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }

    @Test
    void should_return_0_0_W_when_execute_command_given_0_0_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.S);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.W);

        //when
        marsRover.executeCommand(RIGHT);

        //then

        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }

    @Test
    void should_return_1_0_E_when_execute_command_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.E);
        RoverStatus expectedStatus = new RoverStatus(1 , 0, Direction.E);

        //when
        marsRover.executeCommand(MOVE);

        //then

        assertEquals(expectedStatus.getLocationX(),marsRover.getLocationX());

    }

    @Test
    void should_return_0_0_N_when_execute_command_given_0_0_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.E);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.N);

        //when
        marsRover.executeCommand(LEFT);

        //then

        assertEquals(expectedStatus.getLocationX(),marsRover.getLocationX());

    }

    @Test
    void should_return_0_0_S_when_execute_command_given_0_0_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.E);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.S);

        //when
        marsRover.executeCommand(RIGHT);

        //then

        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }

    @Test
    void should_return_negative_1_0_W_when_execute_command_given_0_0_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.W);
        RoverStatus expectedStatus = new RoverStatus(-1 , 0, Direction.W);

        //when
        marsRover.executeCommand(MOVE);

        //then

        assertEquals(expectedStatus.getLocationX(),marsRover.getLocationX());

    }

    @Test
    void should_return_0_0_S_when_execute_command_given_0_0_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.W);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.S);

        //when
        marsRover.executeCommand(LEFT);

        //then

        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }
    @Test
    void should_return_0_0_N_when_execute_command_given_0_0_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.W);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.N);

        //when
        marsRover.executeCommand(RIGHT);

        //then

        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }
    @Test
    void should_return_1_1_E_when_execute_command_given_Multiple_Command() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.N);
        RoverStatus expectedStatus = new RoverStatus(1 , 1, Direction.E);

        //when
        marsRover.executeCommand("MRM");

        //then
        assertEquals(expectedStatus.getLocationX(),marsRover.getLocationX());
        assertEquals(expectedStatus.getLocationY(),marsRover.getLocationY());
        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }



}
