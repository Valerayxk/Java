package com.mycompany.mavenproject1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class RecIntegral implements Externalizable {
    private static final long serialVersionUID = 1L;
    private double lowerLimit;
    private double upperLimit;
    private double step;
    private double result;

    public RecIntegral() {
    }

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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeDouble(lowerLimit);
        out.writeDouble(upperLimit);
        out.writeDouble(step);
        out.writeDouble(result);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        lowerLimit = in.readDouble();
        upperLimit = in.readDouble();
        step = in.readDouble();
        result = in.readDouble();
    }
}