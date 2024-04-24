package com.doricong.bus.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StartStationOfBus {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "START_STATION_ID")
    private Long id;
    private String busNumber;

    private String startStation;

    @OneToMany(mappedBy = "startStationOfBus")
    private List<DepartureTime> departureTimes;


}
