package com.CartDemo13.ShopCartD13.service;

import java.util.List;

public interface  CartService {

    void add(List<Long> items);

    List<Long> get();
}
