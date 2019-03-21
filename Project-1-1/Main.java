public class Main {
  public static void main(String[] args) {
  TokenExtracter te = new TokenExtracter("InputFile.txt");
  Bank bank = new Bank();
  IO finalState = new IO("finalState.txt");
  String[] s = te.readLine();
  while(s != null){
  if(s[0].equals("OCA")){
    bank.openAccount(new Person(s[1]), new Checking(Double.valueOf(s[2])), null);
  }else if(s[0].equals("OCCA")){
    bank.openAccount(new Person(s[1]), null, new CcAccount());
  }else if(s[0].equals("DE")){
    bank.deposit(Integer.valueOf(s[1]), Double.valueOf(s[2]));
  }else if(s[0].equals("BWC")){
    bank.buyWithChecking(Integer.valueOf(s[1]), Double.valueOf(s[2]));
  }else if(s[0].equals("BWCC")){
    bank.buyWithCredit(Integer.valueOf(s[1]), Double.valueOf(s[2]));
  }else if(s[0].equals("PD")){
    bank.payDebt(Integer.valueOf(s[1]), Double.valueOf(s[2]));
  }else if(s[0].equals("CA")){
    bank.closeAccount(Integer.valueOf(s[1]));
  }
  s = te.readLine();
  }
  for(int i = 0; i < bank.numOfAccounts(); i++){
      finalState.writeLine(bank.getAccountInfo(i));
    }
    finalState.close();
    te.close();
  }
}