package io.wisoft.eventsourcing.rdbms.query.domain;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.UUID;

@Entity
@Table(name = "Sensing")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@TypeDef(
        name = "jsonb",
        typeClass = JsonBinaryType.class
)
public class Sensing {

    @Id
    @Column(name = "sensing_id", nullable = false)
    private UUID sensingId;

    @Column(name = "sensor_id", nullable = false)
    private UUID sensorId;

    @Column(name = "sensing_time")
    private LocalDateTime sensingTime;

    @Type(type = "jsonb")
    @Column(name = "sensing_value", columnDefinition = "jsonb")
    private HashMap<String, String> sensingValue;

    @Type(type = "jsonb")
    @Column(name = "environment_value", columnDefinition = "jsonb")
    private HashMap<String, String> environmentValue;

}
