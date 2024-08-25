package com.testbank.bankingservice.mapper;

import com.testbank.bankingservice.model.dto.TransactionReportDTO;
import com.testbank.bankingservice.model.dto.TransactionRequestDTO;
import com.testbank.bankingservice.model.entity.Transaction;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@AllArgsConstructor
public class TransactionMapper {
    private final ModelMapper modelMapper;

    public Transaction convertToEntity(TransactionRequestDTO transactionDTO) {
        return modelMapper.map(transactionDTO, Transaction.class);
    }

    public TransactionRequestDTO convertToDTO(Transaction transaction) {
        return modelMapper.map(transaction, TransactionRequestDTO.class);
    }

    public List<TransactionRequestDTO> convertToListDTO(List<Transaction> transactions) {
        return transactions.stream()
                .map(this::convertToDTO)
                .toList();
    }

    public TransactionReportDTO convertTransactionReportDTO(Object[] transactionDta) {
        TransactionReportDTO reportDTO = new TransactionReportDTO();
        reportDTO.setDate((localDate) transactionDta[0]);
        reportDTO.setTransactionCount((Long) transactionDta[1]);
        return reportDTO;
    }
}
