package com.example.mapstruct.dto;

public class TransactionDTO {
    private String uuid;
    private Long totalInCents;

    public TransactionDTO(){};
    public TransactionDTO(String uuid, Long totalInCents) {
        this.uuid = uuid;
        this.totalInCents = totalInCents;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getTotalInCents() {
        return totalInCents;
    }

    public void setTotalInCents(Long totalInCents) {
        this.totalInCents = totalInCents;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "uuid='" + uuid + '\'' +
                ", totalInCents=" + totalInCents +
                '}';
    }
}
