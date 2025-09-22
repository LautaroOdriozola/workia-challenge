package com.workia.challenge.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @NotNull(message = "Name cannot be null")
    private String name;

    @Email(message = "Email must be a correctly formatted email address")
    @NotNull(message = "Email cannot be null")
    private String email;
}
