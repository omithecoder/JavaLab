package codes.Abstraction;

//1)Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Display balance of each bank.

abstract class Bank
{
    int balance =0;
    int getBalance()
    {
        return this.balance;
    }
}

class Bank1 extends Bank
{
    int balance =0;
    Bank1(int bal)
    {
        this.balance=bal;
    }
    int getBalance()
    {
        return this.balance;
    }
}
class Bank2 extends Bank
{
    int balance =0;
    Bank2(int bal)
    {
        this.balance=bal;
    }
    int getBalance()
    {
        return this.balance;
    }
}
class Bank3 extends Bank
{
    int balance =0;
    Bank3(int bal)
    {
        this.balance=bal;
    }
    int getBalance()
    {
        return this.balance;
    }
}

public class ps1 {
    public static void main(String[] args) {
        Bank1 b1 = new Bank1(100);
        Bank2 b2 = new Bank2(200);
        Bank3 b3 = new Bank3(300);

        System.out.println("\nBalance in 1st Bank : "+b1.getBalance());
        System.out.println("\nBalance in 2nd Bank : "+b2.getBalance());
        System.out.println("\nBalance in 3rd Bank : "+b3.getBalance());


    }
}
