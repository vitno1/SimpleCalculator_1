package com.example.calculator.service;

import com.example.calculator.model.Operation;
import com.example.calculator.model.StatementDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyCalculatorService implements CalculatorService {


  double result;


    @Override
    public double calculate(double a , double b , Operation operation) {
        if (operation.equals(Operation.ADD)) {
            result = a + b;
            return result;
        } else if (operation.equals(Operation.SUBTRACT)) {
            result = a - b;
            return result;
        } else if (operation.equals(Operation.MULTIPLY)) {
            result = a * b;
            return result;
        } else if (operation.equals(Operation.DIVIDE)) {
            if(a == 0){
                return 0;
            }
            if(b == 0){
                return 0;
            }
            result = a / b;
            return result;
        } else {
            throw new IllegalArgumentException("Неверная операция");
        }

    }
}
