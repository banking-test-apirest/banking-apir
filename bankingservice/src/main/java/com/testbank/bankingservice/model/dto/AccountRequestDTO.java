package com.testbank.bankingservice.model.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequestDTO {
    @NotBlank(message = "Account number can not be null")
    @Size(min = 5, max = 20, message = "The account number must be between 5 and 20 characters")
    @Pattern(regexp = "[0-9]+", message = "The account number must have only digits")
    private String accountNumber;

    @NotNull(message = "The balance can not be null")
    private BigDecimal balance;

    @NotBlank(message = "The owner name can not be null")
    private String ownerName;

    @NotBlank(message = "The email can not be null")
    @Email
    private String ownerEmail;
}
