package com.testeyoux.testeyoux.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "sales")
@Entity
@Data
public class Sale {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Getter
    @Setter
    private LocalDate date;

    @Getter
    @Setter
    private SaleStatus status;

    @Getter
    @Setter
    private Double price;

    public Sale() {

    }

}

