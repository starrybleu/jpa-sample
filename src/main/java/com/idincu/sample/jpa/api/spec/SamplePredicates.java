package com.idincu.sample.jpa.api.spec;

import com.idincu.sample.jpa.domain.*;
import com.querydsl.core.BooleanBuilder;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class SamplePredicates {

    public static Specification<Cart> queryCarts(String filter) {
        List<Predicate> predicates = new ArrayList<>();
        return (root, query, cb) -> {
            final String param = "%" + filter + "%";
            Join<Cart, ItemEntry> join = root.join(Cart_.items, JoinType.LEFT);
            predicates.add(cb.like(cb.lower(root.get(Cart_.name)), param));
            predicates.add(cb.like(cb.lower(root.get(Cart_.type)), param));
            predicates.add(cb.like(cb.lower(join.get(ItemEntry_.name)), param));

            return cb.or(predicates.toArray(new Predicate[0]));
        };
    }

    public static com.querydsl.core.types.Predicate queryCartsWithDSL(String filter) {
        BooleanBuilder builder = new BooleanBuilder();
        QCart cart = QCart.cart;
        final String param = "%" + filter + "%";
        builder.or(cart.name.lower().like(param));
        builder.or(cart.type.lower().like(param));
        builder.or(cart.items.any().name.like(param));

        return builder;

    }

}
