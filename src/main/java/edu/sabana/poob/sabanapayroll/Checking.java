package edu.sabana.poob.sabanapayroll;

import java.time.LocalDate;

public class Checking extends BankAccount {

    public final static double DEPOSIT_DISCOUNT=5000;
    private double balance;

    @Override
    public double getDepositDiscount() {
        double depositV=10000;
        double deposit = 0;
        if(depositV>DEPOSIT_DISCOUNT){
           deposit = depositV-DEPOSIT_DISCOUNT;
        }
        return deposit;
    }


    /**
     * Calcula el porcentaje de intereses y los deposita en la cuenta sin ningñun descuento.
     * <br><br>
     * @return el porcentaje depositado en la cuenta.
     */

    public boolean processCheck(Check check) {
        boolean result = false;
        double newBalance;
        LocalDate currentDate = LocalDate.now();
        if(currentDate.isBefore(Check.getExpirationDate())){
            if(check.getAmount() > getDepositDiscount()){
                newBalance =check.getAmount() -getDepositDiscount();
                balance += newBalance;
                result = true;

            }
        }
        return result;
    }
    
}
