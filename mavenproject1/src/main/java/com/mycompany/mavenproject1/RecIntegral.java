/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;


public class RecIntegral implements Serializable{
    private static final long serialVersionUID = 1L;
    private double lowerLimit;
    private double upperLimit;
    private double step;
    private double result;

    public RecIntegral(double lowerLimit, double upperLimit, double step) throws InvalidInputException {
        if (lowerLimit < 0.000001 || lowerLimit > 1000000 ||
            upperLimit < 0.000001 || upperLimit > 1000000 ||
            step < 0.000001 || step > 1000000) {
            throw new InvalidInputException("Значения должны быть в диапазоне от 0,000001 до 1000000!");
        }

        if (lowerLimit >= upperLimit || step <= 0) {
            throw new InvalidInputException("Нижний предел должен быть меньше верхнего");
        }

        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.step = step;
        this.result = 0.0;
    }

    public double getLowerLimit() {
        return lowerLimit;
    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public double getStep() {
        return step;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
