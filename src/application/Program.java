package application;

import boardgame.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) throws Exception {

        Position p = new Position(3, 5);
        System.out.println(p);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
