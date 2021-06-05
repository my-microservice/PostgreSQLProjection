package io.wisoft.eventsourcing.rdbms.query.service.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SensingDto {

    @Getter
    @Setter
    public static class SensingResponse {

        private UUID sensingId;
        private UUID sensorId;
        private LocalDateTime sensingTime;
        private HashMap<String, String> sensingValue;
        private HashMap<String, String> environmentValue;

    }
}
