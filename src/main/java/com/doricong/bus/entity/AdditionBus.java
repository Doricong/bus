package com.doricong.bus.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdditionBus {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDITION_BUS_ID")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "START_STATION_ID")
    private StartStationOfBus startStationOfBus;

    public AdditionBus(StartStationOfBus startStationOfBus) {
        this.startStationOfBus = startStationOfBus;
    }
}
