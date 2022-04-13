package com.example.calculator.model;


import javax.validation.constraints.Size;

final public class StatementDTO {
    @Size
    private double a;
    private double b;
    Operation operation;

    public StatementDTO(Operation operation) {
        this.operation = operation;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public StatementDTO(double a, double b, Operation operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public StatementDTO() {
    }


    public StatementDTO(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }



}
