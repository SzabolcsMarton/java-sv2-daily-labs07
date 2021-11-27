package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    Courier courier = new Courier();

    @BeforeEach
    void init(){
        Ride ride = new Ride(1,3,2);
        Ride otherRide = new Ride(2,3,2);
        courier.addRide(ride);
        courier.addRide(otherRide);
    }

    @Test
    void addRideTest(){
        Ride ride = new Ride(4,3,2);
        courier.addRide(ride);

        assertEquals(4,courier.getRides().get(2).getDay());
        assertEquals(3,courier.getRides().get(2).getNumberOfRide());
        assertEquals(2,courier.getRides().get(2).getKms());
    }

    @Test
    void addRideFail(){
        Ride ride = new Ride(1,3,2);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()->courier.addRide(ride));
        assertEquals("The Ride is invalid!",exception.getMessage());
    }

}