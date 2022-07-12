package com.smart_construction.api;

import com.smart_construction.domain.BridgeStatus;
import com.smart_construction.repository.BridgeStatusDto;
import com.smart_construction.service.BridgeStatusService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class BridgeStatusApiController {

    private final BridgeStatusService bridgeStatusService;

    @GetMapping("/api/bridges")
    public Result bridges() {
        List<BridgeStatus> findBridges = bridgeStatusService.findAllBridges();
        List<BridgeStatusDto> collect = findBridges.stream()
                .map(b -> new BridgeStatusDto(b))
                .collect(Collectors.toList());

        return new Result(collect);
    }

    @Getter
    @AllArgsConstructor
    static class Result<T> {
        private T data;
    }

}