package edu.sabana.poob.sabanapayroll;

public class Savings extends BankAccount {

    public final static double DEPOSIT_DISCOUNT=2000;
    public final static double ANNUAL_INTEREST_RATE=0.01;



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
    public double depositMontlyInterest(){
        double depositInitial=10000;
        double deposit;
        deposit=depositInitial-(depositInitial*(ANNUAL_INTEREST_RATE/12));
        System.out.println(deposit);
        return deposit;
    }
}
