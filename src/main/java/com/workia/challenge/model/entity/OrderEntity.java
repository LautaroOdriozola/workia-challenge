package com.workia.challenge.model.entity;

import com.workia.challenge.model.dto.OrderDto;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity {

    private OrderDto order;
    private Double totalOrder;
    private Date dateCreated;
}
