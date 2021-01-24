package com.company;

import java.security.PublicKey;

public class LimitException extends Exception{
    private double remainingAmount;
    private String remainingAmount2;
    public LimitException(String message,double remainingAmount){
        super(message);
        this.remainingAmount=remainingAmount;

    }





    public double getRemainingAmount() {
        return remainingAmount;
    }

}
