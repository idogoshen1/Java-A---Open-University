
public class Account
{ //intribute
    private int _accountNum;
    private double _balance;
    private String _name;
    private final double _intrest;
    //constructor
    public Account(int accountNum, double balance, String name)  {
        this._accountNum= accountNum;
        this._balance=balance;
        this._name=name;
        this._intrest = 0.035;
    }
    //methods
    public double deposit(double amount) {
        this._balance=amount+this._balance;
        return this._balance;
    }

    public double withdraw(double amount,double fee) {
        this._balance=this._balance-(amount+fee);
        return this._balance; 
    }

    public double addInterest() {
        this._balance= this._balance+(this._balance*this._intrest);
        return this._balance;
    }
    
    public double getBalance() {
        return this._balance;
    }
    
    public String toString()  {
        return "accountNum is:" + this._accountNum+ "name is:" + this._name + "balance:" + this._balance;
    }
    
    
}
