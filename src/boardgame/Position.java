package boardgame;

//encapsulamento
public class Position {
	private int row;
	private int column;
	
	//Construtores
	public Position(int row, int column) {
	
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override//sobrescrevendo uma classe
	public String toString() {
		return row + " , " + column;
	}

}
