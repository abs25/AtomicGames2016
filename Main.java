import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;
import org.apache.commons.cli.*;

public class Main {
  public static void main(String[] args) {
    try {
      //add the potential flags for cmd args
      Options options = new Options();
      options.addOption("b", true, "get the board");
      options.addOption("p", true, "what's my name?");
      options.addOption("t", true, "timer length");

      CommandLineParser parser = new DefaultParser();
      CommandLine cmd = parser.parse(options, args);

      //get the arguments
      String boardJson = cmd.getOptionValue("b");
      String playerName = cmd.getOptionValue("p");
      String time = cmd.getOptionValue("t");


      Gson gson = new Gson();

      //put the board in JSON format
      int[][] board = gson.fromJson(boardJson, int[][].class);
      for(int i = 0; i < board.length; i++){
        System.out.println(Arrays.toString(board[i]));
      }

    }catch(Exception e){
      System.out.println("it broke :(");
    }
  }
}
