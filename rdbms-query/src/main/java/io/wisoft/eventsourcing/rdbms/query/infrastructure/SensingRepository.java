package io.wisoft.eventsourcing.rdbms.query.infrastructure;



import io.wisoft.eventsourcing.rdbms.query.domain.Sensing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SensingRepository extends JpaRepository<Sensing, UUID> {

    Sensing findFirstBySensorIdOrderBySensingTimeDesc(UUID sensorId);

    Optional<Sensing> findById(UUID sensingId);

}
