import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;
import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) {

      Options options = new Options();
      CommandLineParser parser = new DefaultParser();
      CommandLine cmd = parser.parse(options, args);

      String boardJson = cmd.getOptionValue("b");
      String playerName = cmd.getOptionValue("p");
      String time = cmd.getOptionValue("t");

      System.out.println(boardJson + "\n" + playerName + "\n" + time );

      // Gson gson = new Gson();
      //
      // int[][] board = gson.fromJson(args[0], int[][].class);
      // for(int i = 0; i < board.length; i++){
      //   System.out.println(Arrays.toString(board[i]));
      // }

      //Board board = gson.fromJson(json1, Board.class);
    }
}
