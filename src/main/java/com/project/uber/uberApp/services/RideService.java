package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.RideRequestDto;
import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.entities.Ride;
import com.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
    Ride getRideById(Long rideId);
    void matchWithDrivers(RideRequestDto rideRequestDto);
    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);
    Ride updateRideStatus(Long RideId, RideStatus rideStatus);

    Page<Ride> getAllRideOfRider(Long riderId, PageRequest pageRequest);
    Page<Ride> getAllRideOfDriver(Long driverId, PageRequest pageRequest);
}
