package com.CartDemo13.ShopCartD13.Service;

import com.CartDemo13.ShopCartD13.Repository.Cart;
import com.CartDemo13.ShopCartD13.Service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(List<Long> items) {

    }

    @Override
    public List<Long> get() {
        return null;
    }
}
