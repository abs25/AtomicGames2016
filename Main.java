import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

      Gson gson = new Gson();

      int[][] board = gson.fromJson(args[0], int[][].class);
      for(int i = 0; i < board.length; i++){
      System.out.println(Arrays.toString(board[i]));
      }

      //Board board = gson.fromJson(json1, Board.class);
    }
}
