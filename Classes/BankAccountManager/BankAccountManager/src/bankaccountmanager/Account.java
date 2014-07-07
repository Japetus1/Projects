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
public abstract class Account {
    private double money;

    public Account(double money) {
        this.money = money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return this.money;
    }
    
    
    
    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    
}
