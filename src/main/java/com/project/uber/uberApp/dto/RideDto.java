package com.project.uber.uberApp.dto;

import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.entities.Rider;
import com.project.uber.uberApp.entities.enums.PaymentMethod;
import com.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDto {
    private Long id;
    
    private Point pickUpLocation;
    private Point dropOffLoaction;
    private LocalDateTime createdTime; //  time at which driver accepts the ride
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private Double fare;
}
