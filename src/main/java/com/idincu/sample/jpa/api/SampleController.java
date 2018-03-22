package com.idincu.sample.jpa.api;

import com.idincu.sample.jpa.domain.Cart;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class SampleController {

    final private SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/carts")
    public List<Cart> retrieveCarts(@RequestParam(name = "filter", required = false, defaultValue = "%") String filter) {
        return sampleService.retrieveCarts(filter);
    }

    @GetMapping("/dsl/carts")
    public List<Cart> retrieveCartsQueryDSL(@RequestParam(name = "filter", required = false, defaultValue = "%") String filter) {
        return sampleService.retrieveCartsQueryDSL(filter);
    }

    @GetMapping("/carts/{cartNo}")
    public Cart getCart(@PathVariable long cartNo) {
        return sampleService.getCart(cartNo);
    }

}
