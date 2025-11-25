package Exception.ThrowKeyword;

public class WithdrawFromATM {
    public static void withdraw(double amount){
        double balance = 4000;

        if (amount > balance || amount <=0){
            if (amount == 0){
                throw new RuntimeException("You cant withdraw 0 amount!!");
            }
            throw new RuntimeException("You can't withdraw amount because insufficient balance!!!");
        }else {
            System.out.println("Available balance : "+balance);
            System.out.println("Withdrawal successfully : "+amount);
            balance-=amount;
            System.out.println("Balance after withdraw : "+balance);
        }
    }

    public static void main(String[] args) {
        //Withdrawal not possible
        try{
            withdraw(5000);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        //Withdrawal not possible
        try {
            withdraw(0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        //Withdraw possible
        try {
            withdraw(3000);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
