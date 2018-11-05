/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author Wral
 */
public class Account {
    
    private String fName = "";
    private String lName = "";
    private int balance = 0;
    
    
    
    
    public Account ()
    {
        
    }
    
    public Account (String firstName, String lastName, int bal)
    {
        this.balance = bal;
        this.fName = firstName;
        this.lName = lastName;
    }
    
    public void setFName(String value)
    {
        this.fName = value;
    }
    public String getFName()
    {
        return this.fName;
    }
    
    public void setLName(String value)
    {
        this.lName = value;
    }
    public String getLName()
    {
        return this.lName;
    }
           
    public void setBalance(int value)
    {
        this.balance = value;
    }
    public int getBalance()
    {
        return this.balance;
    }
    
    public void deposit(int amount)
    {
        this.balance = this.balance + amount;
    }
    
    public void withdraw(int amount)
    {
        this.balance = this.balance - amount;
    }
}
