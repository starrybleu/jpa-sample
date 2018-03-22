package com.idincu.sample.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCart is a Querydsl query type for Cart
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCart extends EntityPathBase<Cart> {

    private static final long serialVersionUID = -1862590942L;

    public static final QCart cart = new QCart("cart");

    public final SetPath<ItemEntry, QItemEntry> items = this.<ItemEntry, QItemEntry>createSet("items", ItemEntry.class, QItemEntry.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Long> no = createNumber("no", Long.class);

    public final StringPath type = createString("type");

    public QCart(String variable) {
        super(Cart.class, forVariable(variable));
    }

    public QCart(Path<? extends Cart> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCart(PathMetadata metadata) {
        super(Cart.class, metadata);
    }

}

