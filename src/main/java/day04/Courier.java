package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride){
        if(rides.size() != 0 && !rides.get(rides.size() - 1).isBefore(ride)) {
            throw new IllegalArgumentException("The Ride is invalid!");
        }
        rides.add(ride);
    }

    public List<Ride> getRides() {
        return rides;
    }
}
