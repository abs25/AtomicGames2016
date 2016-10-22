import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;
import org.apache.commons.cli.*;
import java.util.Random;

public class Main {
  final int WIN = 10;
  final int BLOCKWIN = 5;
  final int 3INROW = 4;
  final int BLOCK3 = 3;
  final int 2INROW = 2;
  final int BLOCK2 = 1;

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

      int playerNum;
      if(playerName.equals("player-one")){
        playerNum = 1;
      } else {
        playerNum = 2;
      }
      Gson gson = new Gson();

      //put the board in JSON format
      int[][] board = gson.fromJson(boardJson, int[][].class);
      //loop through each entry in the first array and print out the array at that entry
      for(int i = 0; i < board.length; i++){
        System.out.println(Arrays.toString(board[i]));
      }

      //Pick a random number n between 0...6
      Random rand = new Random();
      int col = rand.nextInt(7); //that random number is our column
      assert(col < 7 && col >= 0);
      System.out.println("Column: " + col);
      //[row][col]
      //row is highest at bottom

      System.exit(getCol(col, board));
        //if colum is full, increment number


    }catch(Exception e){
      System.out.println("it broke :(");
    }
  }

  /** getCol recursively checks for an open column that is not outside of any bounds.
  */
  public static int getCol(int column, int[][] boardState) {
    int returnCol = 0;
    if(column > 6) {
      column = 0;
    }
    if(boardState[0][column] != 0){

      //pick new number
      //call recursively
      return (returnCol = getCol(column + 1, boardState));
    }
    return column;
    // //loop through rows from bottom to top
    // for(int m = 5; m >= 0 ; m--){
    //   if (boardState[column][m] == 0) {
    //     return column;
    //   }
    // }
    // return -1;
  }
}
