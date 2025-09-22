package com.workia.challenge.repository;

import com.workia.challenge.model.entity.OrderEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class OrderRepository {

    private final Map<Integer, OrderEntity> store = new ConcurrentHashMap<>();
    private final AtomicInteger idGenerator = new AtomicInteger(0);

    public void save(OrderEntity orderEntity) {
        int id = idGenerator.incrementAndGet();
        store.put(id, orderEntity);
    }

}