public class Bank implements BankAPI{
  IO log = new IO("Log.txt");
  AccountList clients;
  Bank(){
    clients = new AccountList();
  }
  public void openAccount(Person p, Checking checking, CcAccount cc){
    Account a = new Account(p, checking, cc);
    clients.add(a);
    log.writeLine("Opened account " + a.getAccNum() + " with name " + a.getName());
  }
  public void closeAccount(int accNum){
    if(accNum < 0 || accNum >= clients.numberOfAccounts()){
      log.writeLine("Account " + accNum + " does not exist");
    }else {
    Account a = clients.getAccountInfo(accNum);
    clients.delete(accNum);
    log.writeLine("Account " + a.getAccNum() + " closed.");
    }
  }
  public Account getAccountInfo(int key){
    log.close();
    return clients.getAccountInfo(key);
  }
  public void getAllAccounts(){
    clients.getAllAccounts();
  }
  public void deposit(int key, double amount){
    Account a = clients.getAccountInfo(key);
    double newAmount = a.getAmount() + amount;
    a.setAmount(newAmount);
    log.writeLine("Deposited $" + amount + " to account " + a.getAccNum());
  }

  public int numOfAccounts(){
    return clients.numberOfAccounts();
  }
  public void buyWithChecking(int key, double amount){
    if(key < 0 || key >= clients.numberOfAccounts()){
      log.writeLine("Account " + key + " does not exist");
    }else if(amount < 0){
      log.writeLine("Cannot buy an item worth a negative amount");
    }else {
    Account a = clients.getAccountInfo(key);
   double newAmount = a.getAmount() - amount;
   a.setAmount(newAmount);
   log.writeLine("Account " + a.getAccNum() + " bought an item with checking worth $" + amount);
    }
  }
  public void buyWithCredit(int key, double amount){
    if(key < 0 || key >= clients.numberOfAccounts()){
      log.writeLine("Account " + key + " does not exist");
    }else if(amount < 0){
      log.writeLine("Cannot buy an item worth a negative amount");
    }else {
    Account a = clients.getAccountInfo(key);
    double newDebt = a.getDebt() + amount;
    a.setDebt(newDebt);
    log.writeLine("Account " + a.getAccNum() + " bought an item with credit worth $" + amount);
    }
  }
  public void payDebt(int key, double amount){
    if(key < 0 || key >= clients.numberOfAccounts()){
      log.writeLine("Account " + key + " does not exist");
    }else if(amount < 0){
      log.writeLine("Cannot pay negative on Debt");
    }else {
   Account a = clients.getAccountInfo(key);
   a.payDebt(amount);
   log.writeLine("Account " + a.getAccNum() + " paid $" + amount + " towards there debt");
  }
  }
}