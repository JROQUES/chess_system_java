package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class ChessPice extends Piece {
	private Color color;
	
    public ChessPice(Position position, Board board, Color color) {
		super(position, board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}


	
}




