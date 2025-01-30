package com.project.uber.uberApp.strategy.impl;

import com.project.uber.uberApp.dto.RideRequestDto;
import com.project.uber.uberApp.strategy.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
