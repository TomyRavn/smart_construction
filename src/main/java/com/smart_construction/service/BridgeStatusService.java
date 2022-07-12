package com.smart_construction.service;

import com.smart_construction.domain.BridgeStatus;
import com.smart_construction.repository.BridgeStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BridgeStatusService {

    private final BridgeStatusRepository bridgeStatusRepository;

    public List<BridgeStatus> findAllBridges() { return bridgeStatusRepository.findAll(); }

    public BridgeStatus findOne(Long id) { return bridgeStatusRepository.findOne(id); }

    public List<BridgeStatus> findBridgesOverLength(Double length) { return bridgeStatusRepository.findByOverLength(length); }

    public List<BridgeStatus> findBridgesLowerPartName(String name) { return bridgeStatusRepository.findByLowerPartName(name); }

}
