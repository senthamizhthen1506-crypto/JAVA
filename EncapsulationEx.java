 class Bank {
    private String name;
    private int balance;
   Bank(String name,int balance){
    this.name=name;
    this.balance=balance;
  }
  public String getName(){
    return name;

  }
  public int getBalance(){
    return balance;

  }
  public void deposit(int amount){
    if(amount>0){
        balance+=amount;

    }
    
  }
  public void withdraw(int amount){
    if(balance!=0 && amount< balance){
        balance=amount;

    }

  }
    
}
 
public class EncapsulationEx{
    public static void main(String[]args){
        Bank b=new Bank("customer1",0);
        b.deposit(1000);
        b.withdraw(500);
        System.out.println(b.getName()+" "+b.getBalance()); 




    }

    
}
