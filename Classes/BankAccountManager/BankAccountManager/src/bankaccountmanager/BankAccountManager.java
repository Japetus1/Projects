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
public class BankAccountManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount b = new SavingsAccount(0.015, 2000);
        SavingsAccount c = new SavingsAccount(0.015, 1000);
        System.out.println(b);
        
        b.deposit(1000);
        System.out.println(b);
        b.withdraw(500.50);
        System.out.println(b);
        b.updateInterest();
        System.out.println(b);
        b.setInterest(0);
        System.out.println(b);
        
        System.out.println("a: "+c);
        c.deposit(6000.58);
        c.deposit(0.02);
        c.deposit(.4);
        System.out.println(c);
        
    }
    
}
