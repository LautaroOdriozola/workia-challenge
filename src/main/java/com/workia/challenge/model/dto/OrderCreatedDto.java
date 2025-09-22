package com.workia.challenge.model.dto;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCreatedDto {

    private Double totalOrder;
    private Date dateCreated;
}
