public class Account {
  int accNum;
  static int accNumCounter = 0;
  Person info;
  Checking checking;
  CcAccount cc;
  public Account(Person info, Checking checking, CcAccount cc){
    this.info = info;
    this.checking = checking;
    this.cc = cc;
    accNum = accNumCounter++;
    }
  public double getAmount(){
    return checking.getAmount();
  }
  public void setAmount(double amount){
    checking.setAmount(amount);
  }
  public int getAccNum(){
    return accNum;
  }
  public String getName(){
    return info.getName();
  }
  public void setName(String name){
    info.setName(name);
  }
  public double getDebt(){
    return cc.getDebt();
  }
  public void setDebt(double amount){
    cc.setDebt(amount);
  }
  public void payDebt(double amount){
    double oldDebt = cc.getDebt(); 
    oldDebt = oldDebt - amount;
    cc.setDebt(oldDebt);
  }
  public String toString(){
   String s = "";
   s+= info;
   s+= " | Account number: " + accNum;
   if(cc != null) s+= cc;
   if(checking != null) s+= checking;
   return s;
   
  }
}