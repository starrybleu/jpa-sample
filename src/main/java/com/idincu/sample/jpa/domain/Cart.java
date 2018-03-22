package com.idincu.sample.jpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    private String name;

    private String type;

    @OneToMany(mappedBy = "cart")
    private Set<ItemEntry> items;

    private Cart() {}

    public static Cart EMPTY = null;

}
