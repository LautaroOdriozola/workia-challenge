package com.workia.challenge.model.dto;

import jakarta.validation.Valid;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    @Valid
    private CustomerDto customer;

    @Valid
    private List<ProductDto> products;
}
