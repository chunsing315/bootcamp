package com.bootcamp.demo_sb_calculator.controller.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@ResponseBody
public class CalculatorController {
    @GetMapping(value = "/sum/{x}/{y}")
    public String sum(@PathVariable String x, @PathVariable String y) {
        System.out.println("plus is called");
        try {
            return String.valueOf(Math.addExact(Integer.valueOf(x), Integer.valueOf(y)));
        } catch (ArithmeticException e) {
            return "overflow!!";
        } catch (NumberFormatException e) {// Exception
            return "The input params should be number.";
        }
    }

    @GetMapping(value = "/difference/{a}/{b}")
    public String difference(@PathVariable(value = "a") String x, @PathVariable(value = "b") String y) {
        System.out.println("minus is called");
        try {
            return String.valueOf(Long.parseLong(x) - Long.parseLong(y));
        } catch (NumberFormatException e) {// Exception
            return "The input params should be number.";
        }
    }

    @GetMapping(value = "/multiply/{x}/{y}")
    public int multiply(@PathVariable int x, @PathVariable int y) {
        System.out.println("multiply is called");
        return x * y;
    }

    @GetMapping(value = "/divide/{x}/{y}")
    public String divide(@PathVariable String x, @PathVariable String y) {
        System.out.println("divide is called");
        try {
            return String.valueOf(BigDecimal.valueOf(Double.valueOf(x))
                    .divide(BigDecimal.valueOf(Double.valueOf(y)), 2, RoundingMode.CEILING));
        } catch (ArithmeticException e) {
            return "not support divided by 0";
        } catch (NumberFormatException e) {// Exception
            return "The input params should be number.";
        }
    }

    @GetMapping(value = "/")
    public String hello() {
        return "hello";
    }
}
