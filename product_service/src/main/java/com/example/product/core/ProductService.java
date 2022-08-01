package com.example.product.core;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
    public Item getItemDetail() {
        return new RestTemplate().getForObject("http://localhost:8001/item/1009", Item.class);
    }
}
