public class SavingAcc extends BankAcc
{
  int in,min=100;
  void withDraw(int bal)
  {
      in=balance;
    if((in>bal)||((in-bal)>=min)){
        System.out.println("jai sriram");
    }
    else System.out.println("can not withdraw");
  }
}
