import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {
   public static void main(String[] args) {
      /* Type your code here. */
      int zeroCounter = 0;
    int currentNumber = 0;
    int dialStart = 50;
    ArrayList<String> turns = new ArrayList<String>();
    BufferedReader reader;

  try {
   reader = new BufferedReader(new FileReader("src/inputadvent.txt"));
   String line = reader.readLine();

   while (line != null) {
    System.out.println(line);
    // read next line
    line = reader.readLine();
   }

   reader.close();
  } catch (IOException e) {
   e.printStackTrace();
  }
   }
}