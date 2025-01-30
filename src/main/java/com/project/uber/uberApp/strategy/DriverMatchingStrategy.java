package com.project.uber.uberApp.strategy;

import com.project.uber.uberApp.dto.RideRequestDto;
import com.project.uber.uberApp.entities.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DriverMatchingStrategy {
 List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}

