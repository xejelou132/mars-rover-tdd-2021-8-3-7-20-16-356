package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    @Test
    void should_return_0_1_N_when_execute_command_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.N);
        RoverStatus expectedStatus = new RoverStatus(0 , 1, Direction.N);

        //when
        marsRover.executeCommand("M");

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
        marsRover.executeCommand("M");

        //then

        assertEquals(expectedStatus.getLocationY(),marsRover.getLocationY());

    }

    @Test
    void should_return_0_0_E_when_execute_command_given_0_0_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.S);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.E);

        //when
        marsRover.executeCommand("L");

        //then

        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }

    @Test
    void should_return_0_0_W_when_execute_command_given_0_0_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.S);
        RoverStatus expectedStatus = new RoverStatus(0 , 0, Direction.W);

        //when
        marsRover.executeCommand("R");

        //then

        assertEquals(expectedStatus.getDirection(),marsRover.getDirection());

    }

    @Test
    void should_return_1_0_E_when_execute_command_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0 , 0 , Direction.E);
        RoverStatus expectedStatus = new RoverStatus(1 , 0, Direction.E);

        //when
        marsRover.executeCommand("M");

        //then

        assertEquals(expectedStatus.getLocationX(),marsRover.getLocationX());

    }

}
