package com.testbank.bankingservice.model.dto;

import com.testbank.bankingservice.model.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRespondeDTO {
    private Long id;
    private AccountRequestDTO targetAccount;
    private BigDecimal amount;
    private String description;
}
