/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankaccountmanager;

/**
 *
 * @author DaytronSledge
 */
public class SavingsAccount extends Account{
    private double interest;

    public SavingsAccount(double interest, double money) {
        super(money);
        this.interest = interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    
    public void updateInterest(){
        super.setMoney((this.interest * super.getMoney())+ super.getMoney());
    }
    
    
    @Override
    public void withdraw(double amount) {
        if (amount <= super.getMoney())
        {
            super.setMoney(super.getMoney()-amount);
        }
    }

    @Override
    public void deposit(double amount) {
        super.setMoney(amount + super.getMoney());
    }

    @Override
    public String toString() {
        return ""+super.getMoney(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
