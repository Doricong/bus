package com.doricong.bus.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DepartureTime {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPARTURE_TIME_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "START_STATION_ID")
    private StartStationOfBus startStationOfBus;

    private LocalTime departureTime;
}
