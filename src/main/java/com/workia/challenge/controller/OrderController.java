package com.workia.challenge.controller;

import com.workia.challenge.model.dto.OrderCreatedDto;
import com.workia.challenge.model.dto.OrderDto;
import com.workia.challenge.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<OrderCreatedDto> save(@RequestBody @Valid OrderDto order) {
        return ResponseEntity.ok(orderService.save(order));
    }
}
