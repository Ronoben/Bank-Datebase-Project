public class CcAccount{
  int ccAccNum;
  static int ccCounter = 200;
  double debt;
  public CcAccount(){
    ccAccNum = ccCounter++;
    debt = 0;
  }
  public double getDebt(){
    return debt;
  }
  public void setDebt(double amount){
    debt = amount;
  }
  public String toString(){
    return " | Debt: " + debt + " | Credit account number: " + ccAccNum;
  }
}