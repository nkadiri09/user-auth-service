package com.naren.auth.user_auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myLoans")
    public  String getLoansDetails () {
        return "Here are the loans details from the DB";
    }

}