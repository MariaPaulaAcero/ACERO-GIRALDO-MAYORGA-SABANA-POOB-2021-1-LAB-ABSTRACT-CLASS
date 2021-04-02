package edu.sabana.poob.sabanapayroll;

import java.time.LocalDate;

public class Checking extends BankAccount {

    public final static double DEPOSIT_DISCOUNT=5000;



    @Override
    public double getDepositDiscount() {
        double depositV=10000;
        double deposit=0;
        if(depositV>DEPOSIT_DISCOUNT){
           deposit =depositV-DEPOSIT_DISCOUNT;
        }

        return deposit;
    }

    /**
     * Calcula el porcentaje de intereses y los deposita en la cuenta sin ningñun descuento.
     * <br><br>
     * @return el porcentaje depositado en la cuenta.
     */

    public boolean processCheck(Check check){
        boolean result = false;
        LocalDate currentDate = LocalDate.now();
        if(currentDate.isBefore(check.getExpirationDate())){
            if(check.getAmount() > getDepositDiscount()){
                result = true;
            }
        }
        return result;
    }

}
