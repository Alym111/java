class Bank{
    int cash;
    Bank(int cash){
        this.cash=cash;
    }
    public String get(int money) throws TestException{
        if (money>cash){
            throw new TestException("you don't have enough money");
        }
        cash-=money;
        return "success";
    }
}

public class checkExceptions{
    public static void main(String[] args) {
        Bank b=new Bank(1000);
        try{
            System.out.println(b.get(1500));
        }catch(TestException e){
            System.out.println(e.getMessage());
        }
    }
}
