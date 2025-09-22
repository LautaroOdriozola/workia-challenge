package com.workia.challenge.service;

import com.workia.challenge.model.dto.OrderCreatedDto;
import com.workia.challenge.model.dto.OrderDto;

public interface OrderService {

    OrderCreatedDto save(OrderDto order);
}
