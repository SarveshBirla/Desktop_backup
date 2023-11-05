import java.util.* ;
import java.lang.Math ;
class Bank{
    long accNo ;
    String name ;
   private double balance;
    float roi;

    Bank(double balance,float roi,String name){
        this.balance=balance;
        this.roi=roi;
        this.name=name;
        accNo=(long)((Math.random())*1000000000);
    }
    void deposit(double amount){
      balance=balance+amount;
    }

    void withdraw(double amount){
     if(balance>=amount){
        balance=balance-amount;
     }
     else{
        System.out.println("\n\nInsufficient Balance\n\n");
     }
    }

    double interest(int t){
        double i=Math.pow((1+roi/100),t);
        double interest=balance*i-balance;
        return interest ;
    }

    double getBalance(){
        return balance;
    }
}
class Main{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE Account Holder Name :");
     String name=sc.next();
     System.out.println("ENTER THE BALANCE :");
    double balance=sc.nextDouble();
     System.out.println("Enter the Rate of Interest :");
    float roi=sc.nextFloat();

   
    Bank a=new Bank(balance,roi,name);
    
  while(true){
    System.out.println("Enter Choice No. \n 1.Deposit Amount\n 2.Withdraw Amount\n 3.Calculate Compound Interest \n 4.Know the Balance\n5.Exit");
     int j=sc.nextInt();
    switch(j){
    case 1:
        System.out.println("Enter the Amount to be Deposited :");
        double deposit = sc.nextDouble();
        a.deposit(deposit);
        break;
    case 2:
        System.out.println("Enter the Amount to be Withdrawm");
        double withdraw=sc.nextDouble();
        a.withdraw(withdraw);

        break;
    case 3:
        System.out.println("Enter the Time Peroid for which Compund Interest to be calculated");
        int time=sc.nextInt();
        double interest=a.interest(time);
        System.out.println("\nYou get Interest :"+interest+"\n");
        break;
    case 4:
         balance=a.getBalance();
        System.out.println("\nYour Balance is :"+balance+"\n");
        break;
        
    default:
    }
    if(j==5){
        break;
    }
  }

    }
}