package com.testbank.bankingservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseDTO {
    /*Por lo que se muestra no se necesita validar*/
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
    private String ownerName;
    private String ownerEmail;
}
