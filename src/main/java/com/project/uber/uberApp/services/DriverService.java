package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.DriverDto;
import com.project.uber.uberApp.dto.RideDto;
import com.project.uber.uberApp.dto.RiderDto;
import com.project.uber.uberApp.entities.Ride;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);
    RideDto cancelRide(Long rideId);

    RiderDto rateRider(Long rideId,Integer Rating);

    DriverDto getMyProfile();
    List<RideDto> getAllMyRides();
}
