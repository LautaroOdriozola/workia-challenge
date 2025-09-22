package com.workia.challenge.model.dto;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private CustomerDto customer;
    private List<ProductDto> products;
}
