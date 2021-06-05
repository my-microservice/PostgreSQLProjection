package io.wisoft.eventsourcing.rdbms.query.ui;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.wisoft.eventsourcing.rdbms.query.domain.Sensing;
import io.wisoft.eventsourcing.rdbms.query.service.SensingService;
import io.wisoft.eventsourcing.rdbms.query.service.dto.SensingDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rdbms-sensings")
public class SensingController {

    private final SensingService sensingService;
    private final ModelMapper modelMapper;

    @ApiOperation(value = "센싱 수집 값 조회", notes = "센싱 수집 값을 조회합니다.")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK")})
    @ResponseStatus(OK)
    @GetMapping("{id}")
    public SensingDto.SensingResponse findSensingBySensorId(@PathVariable() final UUID id) {
        System.out.println(id);
        Sensing sensing = sensingService.findSensingBySensorId(id);

        return modelMapper.map(sensing, SensingDto.SensingResponse.class);
    }
}
