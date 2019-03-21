import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IO{
  PrintWriter out;
  String fileName;
  public IO(String fileName){
    try{
      out = new PrintWriter(new FileWriter(fileName));
      this.fileName = fileName;
    } catch (IOException e) {
      System.out.println("Failed to open file " + fileName);
    }
  }
  public void writeLine(Account a){
    try {
      out.println(a);
    }catch (NullPointerException np){
      System.out.println("Must first initiate the file writer");
    }
  }
  public void writeLine(String line){
    try {
      out.println(line);
    }catch (NullPointerException np){
      System.out.println("Must first initiate the file writer");
    }
  }
  public void close(){
    try {
      out.flush();
      out.close();
    } catch (NullPointerException np){
      System.out.println("Must first initiate the file writer");
    }
  }
}