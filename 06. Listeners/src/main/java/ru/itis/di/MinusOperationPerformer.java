package ru.itis.di;

public class MinusOperationPerformer implements OperationPerformer{
    @Override
    public Double performOperation(Double var1, Double var2) {
        return var1-var2;
    }
}
