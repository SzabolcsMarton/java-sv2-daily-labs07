package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RideTest {

    @Test
    void createRideTest(){
        Ride ride = new Ride(1,3,2);

        assertEquals(1,ride.getDay());
        assertEquals(3,ride.getNumberOfRide());
        assertEquals(2,ride.getKms());
    }

    @Test
    void isBeforeTest(){
        Ride ride = new Ride(1,3,2);
        Ride otherRide = new Ride(2,3,2);

        assertEquals(true,ride.isBefore(otherRide));
        assertEquals(false,otherRide.isBefore(ride));
    }

}