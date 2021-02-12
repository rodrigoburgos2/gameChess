package application;

import java.util.Locale;
import java.util.Scanner;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ChessMatch cm = new ChessMatch();
		UI.printBoard(cm.getPieces());
		
		
		sc.close();
		
/*commit git
 * git status
 * git add .
 * git commit -m "comentario" 
 * git push*/		

	}

}
