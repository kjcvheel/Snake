package Board;

public class TileBoard {

  public Tile[][] board;

  public TileBoard() {
    board = new Tile[64][64];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = new Tile((float) i * 64, (float) j * 64, (float) 64, (float) 64);
      }
    }
  }

}
