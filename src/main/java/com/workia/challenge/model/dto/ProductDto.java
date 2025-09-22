package com.workia.challenge.model.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    @NotNull(message = "Name cannot be null")
    private String name;

    @NotNull(message = "Quantity cannot be null")
    @Min(value = 1, message = "Quantity must be greater than 0")
    private Integer quantity;

    @NotNull(message = "Unit price cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Unit price must be greater than 0")
    private Double unitPrice;
}
