package com.idincu.sample.jpa.domain;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Cart.class)
public class Cart_ {

    public static volatile SingularAttribute<Cart, Long> no;
    public static volatile SingularAttribute<Cart, String> name;
    public static volatile SingularAttribute<Cart, String> type;
    public static volatile SetAttribute<Cart, ItemEntry> items;

}
