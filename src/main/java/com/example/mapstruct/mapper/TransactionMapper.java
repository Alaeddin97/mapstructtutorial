package com.example.mapstruct.mapper;

import com.example.mapstruct.ServiceToInject;
import com.example.mapstruct.dto.TransactionDTO;
import com.example.mapstruct.entity.Transaction;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

//@Component
@Mapper(componentModel = "spring")
public abstract class TransactionMapper {

   /* @Autowired
    protected ServiceToInject serviceToInject;*/
    public TransactionDTO toTransactionDTO(Transaction transaction){
        TransactionDTO transactionDTO=new TransactionDTO();
        transactionDTO.setUuid(transaction.getUuid());
        transactionDTO.setTotalInCents(transaction.getTotal()
                .multiply(new BigDecimal("100")).longValue());
        return transactionDTO;
    }

    public abstract List<TransactionDTO> toTransactionDTO(Collection<Transaction> transactions);
}
