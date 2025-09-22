package com.workia.challenge.service.impl;

import com.workia.challenge.model.dto.OrderCreatedDto;
import com.workia.challenge.model.dto.OrderDto;
import com.workia.challenge.model.entity.OrderEntity;
import com.workia.challenge.repository.OrderRepository;
import com.workia.challenge.service.OrderService;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderCreatedDto save(OrderDto order) {
        log.info("Received order from customer: {} - {}",
                order.getCustomer().getName(),
                order.getCustomer().getEmail());

        final Double totalOrder = order.getProducts()
                .stream()
                .mapToDouble(p -> p.getQuantity() * p.getUnitPrice())
                .sum();
        log.info("Calculated total order: {}", totalOrder);

        final Date dateCreated = new Date();
        log.info("Saving order at {}", dateCreated);

        orderRepository.save(OrderEntity.builder()
                .order(order)
                .totalOrder(totalOrder)
                .dateCreated(dateCreated)
                .build());

        log.info("Order saved successfully");

        return OrderCreatedDto.builder()
                .totalOrder(totalOrder)
                .dateCreated(dateCreated)
                .build();
    }
}
