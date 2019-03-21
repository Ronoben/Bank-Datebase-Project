public class Checking{
  int checkingNum;
  double amount;
  static int checkingAccNum = 100;
  public Checking(double amount){
    checkingNum = checkingAccNum++;
    this.amount = amount;
  }
  public double getAmount(){
    return amount;
  }
  public void setAmount(double val){
    amount = val;
  }
  public String toString(){
    return " | Amount: " + amount + " | Checking account number: " + checkingNum;
  }
}