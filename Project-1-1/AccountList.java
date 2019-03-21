public class AccountList{
  int size;
  Account[] accounts;

  public AccountList(){
    accounts = new Account[100];
    size = 0;
  }
  public AccountList(Account a){
    accounts = new Account[100];
    size = 0;
    this.add(a);
  }
  public void add(Account a){
    if(size < accounts.length){
      accounts[size++] = a;
    }else {
      expand();
      add(a);
    }  
  }
  public void expand() {
    Account[] newAccounts = new Account[accounts.length * 2];
    for (int i = 0; i < size; i++) {
      newAccounts[i] = accounts[i];
    }
    accounts = newAccounts;
  }
  public void delete(int idx){
    if(idx < 0 || idx > size){
      System.out.println("Index out of bounds");
    }else {
      for(int i = idx; i < size - 1; i++){
        accounts[i] = accounts[i + 1];
      }
      size--;
    }
  }
  public int numberOfAccounts(){
    return size;
  }
  public Account getAccountInfo(int accNum){
    if(accNum < 0 || accNum > size){
      return null;
    }else {
      return accounts[accNum];
    }
  }
  public void getAllAccounts(){
    if(size == 0) {
      System.out.println("No accounts");
      return;
    }
      for(int i = 0; i < size; i++){
        System.out.println(accounts[i]);
      }
  }
}