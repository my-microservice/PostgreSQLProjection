package io.wisoft.eventsourcing.rdbms.query.service;

import io.wisoft.eventsourcing.rdbms.query.domain.Sensing;
import io.wisoft.eventsourcing.rdbms.query.infrastructure.SensingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class SensingService {

    private final SensingRepository sensingRepository;

    public Sensing findSensingBySensorId(UUID sensorId) {
        return sensingRepository.findFirstBySensorIdOrderBySensingTimeDesc(sensorId);
    }

    public void saveSensing(Sensing sensing) {
        sensingRepository.save(sensing);
    }
}
