package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    @Test
    void should_return_0_0_1_N_when_execute_command_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0 , 0 , "N"));
        RoverStatus expectedStatus = new RoverStatus(0 , 1, "N");


        //when
        marsRover.executeCommand("M");

        //then

        assertEquals(expectedStatus.getLocationY(),marsRover.getLocationY());
        
    }
}
