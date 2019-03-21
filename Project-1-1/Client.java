// class not used
class Client{
  String name;
  Account a;
  Account[] clinetAccount;
  Client(String name){
    clinetAccount = new Account[100];
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  
}