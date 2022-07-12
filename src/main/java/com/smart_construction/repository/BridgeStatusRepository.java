package com.smart_construction.repository;

import com.smart_construction.domain.BridgeStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BridgeStatusRepository {

    private int LIMIT_COUNT = 10;

    private final EntityManager em;

    public BridgeStatus findOne(Long id) { return em.find(BridgeStatus.class, id); }

    public List<BridgeStatus> findAll() {
        return em.createQuery("select b from BridgeStatus b", BridgeStatus.class)
                .setMaxResults(LIMIT_COUNT)
                .getResultList();
    }

    public List<BridgeStatus> findByOverLength(Double length) {
        return em.createQuery("select b from BridgeStatus b where b.totLt >= :length", BridgeStatus.class)
                .setParameter("length", length)
                .setMaxResults(LIMIT_COUNT)
                .getResultList();
    }

    public List<BridgeStatus> findByLowerPartName(String name) {
        return em.createQuery("select b from BridgeStatus b where b.strctLwprt = :name", BridgeStatus.class)
                .setParameter("name", name)
                .setMaxResults(LIMIT_COUNT)
                .getResultList();
    }

}
