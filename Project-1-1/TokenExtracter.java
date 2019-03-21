import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TokenExtracter {
  BufferedReader br;
  String fileName;

  public TokenExtracter(String fileName){
    this.fileName = fileName;
    try {
      br = new BufferedReader(new FileReader(fileName));
    } catch (IOException e){
      System.out.println("Error reading file " + fileName);
    }
  }
  
  public String[] readLine(){
    String line = null;
    try {
      line = br.readLine();
    } catch (IOException e){
      System.out.println("Error reading line for " + fileName);
      return null;
    }
    if(line == null){
      System.out.println("End of file reached for " + fileName);
      return null;
    }
    return line.split(" ");
  }

  public void close(){
    try {
      br.close();
    } catch (IOException e){
      System.out.println("Error closing reader " + fileName);
    }
  }
}