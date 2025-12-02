import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {
   public static void main(String[] args) {

      // hold direction and amt
      ArrayList<Instruction> instructions = new ArrayList<>();

      try {
         BufferedReader reader = new BufferedReader(new FileReader("src/inputadvent.txt"));
         String line = reader.readLine();

         while (line != null) {
         

            // split the stuff
            String[] tokens = line.trim().split("\\s+");

            // further split stuff
            for (String token : tokens) {
               if (token.isEmpty()) {
                  continue; 
               }

             
               char dir = token.charAt(0);

              
               int amount = Integer.parseInt(token.substring(1));

            
               instructions.add(new Instruction(dir, amount));
            }

            line = reader.readLine();
         }

         reader.close();
      } catch (IOException e) {
         e.printStackTrace();
      }

      /* test output
      for (Instruction instr : instructions) {
         System.out.println(instr.getDirection() + " " + instr.getAmount());
      }
   }
}
*/

// this is so that my arraylist can hold the things linked together
class Instruction {
   private char direction;
   private int amount;

   public Instruction(char direction, int amount) {
      this.direction = direction;
      this.amount = amount;
   }

   public char getDirection() {
      return direction;
   }

   public int getAmount() {
      return amount;
   }
}
