package chess;

import boardgame.Position;

public class ChessPosition {

	private char col;
	private int linha;

	public ChessPosition(char col, int linha) {
		if (col < 'a' || col > 'h' || linha < 1 || linha > 8) {
			throw new ChessException("Erro: Informe valores de a1 a h8");
		}
		this.col = col;
		this.linha = linha;
	}

	public char getCol() {
		return col;
	}

	public int getLinha() {
		return linha;
	}

	protected Position toPosition() {
		return new Position(8 - linha, col - 'a');
	}

	protected static ChessPosition fromPosition(Position pos) {
		return new ChessPosition((char) ('a' + pos.getColumn()), 8 - pos.getRow());
	}

	@Override
	public String toString() {
		return "" + col + linha;
	}

}
