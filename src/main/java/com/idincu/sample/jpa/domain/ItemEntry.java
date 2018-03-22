package com.idincu.sample.jpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ItemEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    private String name;

    private Integer price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cart_no", nullable = false)
    private Cart cart;

    private ItemEntry() {}
}
