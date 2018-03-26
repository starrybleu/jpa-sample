package com.idincu.sample.jpa.api;

import com.idincu.sample.jpa.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long>, JpaSpecificationExecutor<Cart>, QuerydslPredicateExecutor<Cart> {

    Cart findByNo(long no);

    List<Cart> findByNameContaining(String filter);

}
