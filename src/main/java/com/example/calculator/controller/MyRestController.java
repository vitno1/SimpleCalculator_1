package com.example.calculator.controller;


import com.example.calculator.model.Operation;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/calculate")
public class MyRestController {

    @Autowired
    CalculatorService calculatorService;


    @GetMapping("/{a}/{b}/{Operation}")
    public double calculate(@PathVariable("a") double a, @PathVariable("b") double b, @PathVariable("Operation") String operation) {
        System.out.println("a " + a + "b " + b);
        Operation stringOperation = Operation.ADD.valueOf(operation);
        double result = calculatorService.calculate(a , b ,stringOperation);
        return result;
    }


}
