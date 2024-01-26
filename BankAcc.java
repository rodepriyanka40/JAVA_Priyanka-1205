import java.util.Scanner;
class AtmDemo
{
    int acc_no;
    String cust_name;
    int bal_amt, dep_amt,total_amt;
    Scanner s= new Scanner(System.in);
    AtmDemo()
    {
        System.out.println("Enter customer name:");
        cust_name=s.next();
        System.out.println("Enter account number:");
        acc_no=s.nextInt();
        System.out.println("Enter the balance:");
        bal_amt=s.nextInt();
        

    }
    void withdraw()
    {
        int amt;
        System.out.println("Enter the amount you want to withdraw...");
        amt=s.nextInt();
        if(bal_amt==0)
        {
            System.out.println("your bank acc is empty");
        }
        else if(amt>bal_amt)
        {
            System.out.println("you have insuffiecient balance");
        }
        else
        {
            bal_amt=bal_amt-amt;
        }
        //bal_amt=bal_amt-amt;
        System.out.println("withdraw done successfully");
    }
    void deposite()
    {
        int amt;
        System.out.println("Enter the amount you want to deposite..");
        amt=s.nextInt();
        bal_amt=bal_amt+amt;
        System.out.println("total amount after deposite:"+bal_amt);
    }
    void display()
    {
        System.out.println("name of customer:"+cust_name);
        //cust_name=s.next();
        System.out.println("account number of customer:"+acc_no);
       // acc_no=s.nextInt();
        System.out.println("balance amount:"+bal_amt);
        if(bal_amt==0)
        {
            System.out.println("your account is empty");
        }
        System.out.println("Your balance is:");
        bal_amt=s.nextInt();
    }
    void checkBalance()
    {
        System.out.println("your current balance is:"+bal_amt);
    }
}
class BankAcc extends AtmDemo
{
    public static void main(String args[])
    {
        int choice;
        BankAcc b = new BankAcc();
        //b. display();
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("Enter your choice\n1.deposite\n2.withdraw\n3.display\n4.checkkBalance\n5.exit");
            choice=sc.nextInt();
            switch(choice)
        {
            case 1:
            b.deposite();
            // System.out.println("-----customer details----");
            // System.out.println("customer name:"+b.cust_name);
            // System.out.println("Account number:"+b.acc_no);
            // System.out.println("Balance amount:"+b.bal_amt);
            // System.out.println("customer balance after deposite money:"+b.total_amt);
            break;

            case 2:
            b.withdraw();
            // System.out.println("-----customer details----");
            // System.out.println("customer name:"+b.cust_name);
            // System.out.println("Account number:"+b.acc_no);
            // System.out.println("Balance amount:"+b.bal_amt);
            // System.out.println("customer balance after deposite money:"+b.total_amt);
            break;

            case 3:
            b.display();   
            break;

            case 4:
            b.checkBalance();    
            break;

            case 5:
            System.out.println("okk you can exit");
            default:
            System.out.println("invalid size");

        }
        }while(choice<5);
        
        
         
    }  

}