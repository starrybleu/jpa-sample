package com.idincu.sample.jpa.api;

import com.idincu.sample.jpa.domain.Cart;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.idincu.sample.jpa.api.spec.SamplePredicates.queryCarts;
import static com.idincu.sample.jpa.api.spec.SamplePredicates.queryCartsWithDSL;

@Transactional(readOnly = true)
@Service
public class SampleService {

    final private CartRepository cartRepository;

    public SampleService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Transactional(readOnly = true)
    public Cart getCart(long cartNo) {
        return cartRepository.findByNo(cartNo);
    }

    @Transactional(readOnly = true)
    public List<Cart> retrieveCarts(String filter) {
        return cartRepository.findAll(
                queryCarts(filter)
        );
    }

    @Transactional(readOnly = true)
    public List<Cart> retrieveCartsQueryDSL(String filter) {
        return (List<Cart>) cartRepository.findAll(
                queryCartsWithDSL(filter)
        );
    }

}
