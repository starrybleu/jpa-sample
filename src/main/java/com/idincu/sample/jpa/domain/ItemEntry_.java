package com.idincu.sample.jpa.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ItemEntry.class)
public class ItemEntry_ {

    public static volatile SingularAttribute<ItemEntry, Long> no;
    public static volatile SingularAttribute<ItemEntry, String> name;
    public static volatile SingularAttribute<ItemEntry, Integer> price;
    public static volatile SingularAttribute<ItemEntry, Cart> cart;

}
