import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);
        System.out.println("please insert theaccount number");
        int account= scan.nextInt();
        System.out.println("please insert your balance");
        double balance= scan.nextDouble();
        System.out.println("please insert your name");
        String name= scan.next();

        Account accountA =new Account(account,balance,name);
        System.out.println("Please insert the amount you want to withdraw");
        double deposit= scan.nextDouble();
        accountA.withdraw(deposit,5.0);
        System.out.println("your new balance is:" + accountA.getBalance());

        accountA.addInterest();
        System.out.println("your new balance is" + accountA.getBalance());

        System.out.println("how much you want to deposit");
        double amount= scan.nextDouble();
        accountA.deposit(amount);
        System.out.println(" your new balance is:" + accountA.getBalance());

        
        
    }
}
