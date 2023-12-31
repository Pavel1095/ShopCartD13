package com.CartDemo13.ShopCartD13.controller;

import com.CartDemo13.ShopCartD13.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/order")
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam List<Long> items ) {
        cartService.add(items);
        return "Товары добавлены.";
    }
    @GetMapping("/get")
    public List<Long> get() {
        return cartService.get();
    }
}
