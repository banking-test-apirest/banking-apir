package com.testbank.bankingservice.model.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestDTO {
    private Long id;

    @NotNull(message = "The source account number can not be null")
    private String sourceAccountNumber;

    @NotNull(message = "The target account number can not be null")
    private String targetAccountNumber;

    @NotNull(message = "The amount can not be null")
    @DecimalMin(value = "0.01", message = "The amount must be above 0")
    private BigDecimal amount;
}
