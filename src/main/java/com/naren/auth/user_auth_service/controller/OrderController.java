package com.naren.auth.user_auth_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    //@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_USER')")
    public String getOrders() {
        return "Order list";
    }

    @PostMapping
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')") // Only ADMIN can create orders
    public String createOrder() {
        return "Order created";
    }

    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('delete:orders')") // Permission-based access
    public String deleteOrder(@PathVariable String id) {
        return "Order " + id + " deleted";
    }
}
