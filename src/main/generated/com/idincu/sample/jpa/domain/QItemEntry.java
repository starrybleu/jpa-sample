package com.idincu.sample.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemEntry is a Querydsl query type for ItemEntry
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QItemEntry extends EntityPathBase<ItemEntry> {

    private static final long serialVersionUID = -1225097379L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemEntry itemEntry = new QItemEntry("itemEntry");

    public final QCart cart;

    public final StringPath name = createString("name");

    public final NumberPath<Long> no = createNumber("no", Long.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public QItemEntry(String variable) {
        this(ItemEntry.class, forVariable(variable), INITS);
    }

    public QItemEntry(Path<? extends ItemEntry> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemEntry(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemEntry(PathMetadata metadata, PathInits inits) {
        this(ItemEntry.class, metadata, inits);
    }

    public QItemEntry(Class<? extends ItemEntry> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cart = inits.isInitialized("cart") ? new QCart(forProperty("cart")) : null;
    }

}

