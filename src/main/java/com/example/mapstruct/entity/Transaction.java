package com.example.mapstruct.entity;

import java.math.BigDecimal;
import java.util.UUID;

public class Transaction {
    private Long id;
    private String uuid= UUID.randomUUID().toString();
    private BigDecimal total;

    public Transaction(Long id, String uuid, BigDecimal total) {
        this.id = id;
        this.uuid = uuid;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", total=" + total +
                '}';
    }
}
