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
public abstract class Account {
   // private String errorMsg="";
    private String fName = "";
    private String lName = "";
    private String msg="";
    private int balance = 0;
    private int totWithdraw = 0;
    private int totDeposit = 0;


    private Transaction[] transList  = new Transaction[100];
            
    public Account ()
    {
        
    }
    
    public Account (String firstName, String lastName, int bal)
    {
        
        this.balance = bal;
        this.fName = firstName;
        this.lName = lastName;
    }
    
    public int getTotWithdraw()
    {
        return totWithdraw;
    }
    public void setTotWithdraw(int value)
    {
        this.totWithdraw=value;
    }
    public int getTotDeposit()
    {
        return totDeposit;
    }
    public void setTotDeposit(int value)
    {
        this.totDeposit=value;
    }
    public String getMessage()
    {
    return this.msg;
    }
    public void setMessage(String value)
    {
        this.msg = value;
    }
    public Transaction[] getTransaction()
    {
        return transList;
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
    public String errors(int amount)
    {
        return null;
    }

    public void message(int x)
    {

    }

    public void transaction(int rand, int count, int month)
    {

    }
    }
