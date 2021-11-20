import org.junit.Test;

public class TicTacToeTest {
    @Test
    public void zuWenigGeldGibtZeigtFahrpreis(){
        TicTacToe ticTacToe = new TicTacToe();
        Move move = new Move('X',0,0);

        ticTacToe.isMatchWonByCurrentMove(move);

    }
}
