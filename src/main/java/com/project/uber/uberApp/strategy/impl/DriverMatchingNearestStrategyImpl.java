package com.project.uber.uberApp.strategy.impl;

import com.project.uber.uberApp.dto.RideRequestDto;
import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.strategy.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestStrategyImpl implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
