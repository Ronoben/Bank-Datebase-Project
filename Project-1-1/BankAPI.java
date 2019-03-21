public interface BankAPI{
  public void openAccount(Person p, Checking checking, CcAccount cc);
  public void closeAccount(int accNum);
  public Account getAccountInfo(int key);
  public void deposit(int key, double amount);
  public void buyWithChecking(int key, double amount);
  public void buyWithCredit(int key, double amount);
  public void payDebt(int key, double amount);

}