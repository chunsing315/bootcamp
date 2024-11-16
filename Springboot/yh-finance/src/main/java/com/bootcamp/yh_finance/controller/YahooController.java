package com.bootcamp.yh_finance.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface YahooController {
    @GetMapping (value = "/crumb")
    String getCrumb();
}
