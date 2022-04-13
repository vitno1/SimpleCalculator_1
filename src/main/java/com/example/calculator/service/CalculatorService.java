package com.example.calculator.service;

import com.example.calculator.model.Operation;
import com.example.calculator.model.StatementDTO;

public interface CalculatorService {
    public double calculate(double a, double b, Operation operation);
}
