import java.io.IOException;

public class TicTacToe {

    private char[][] playground = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
    };

    Playground playgroundObject = new Playground();
    UserInput userInput = new UserInput();

    public static void main(String[] args)
            throws IOException {
        new TicTacToe().startGame();
    }

    public void startGame() throws IOException {
        getInput();
    }

    public void getInput() throws IOException {
        this.userInput.getInput();
        Move move = new Move(this.userInput.getSign(), userInput.getRow(), this.userInput.getColumn());
        checkInputBeforeExecute(move);
    }

    public void checkInputBeforeExecute(Move move) throws IOException {
        if (isMoveValid(move)) {
            play(move);
        } else {
            getInput();
        }
    }

    public boolean isMoveValid(Move move) {
        if(move.getRow()>this.playground.length -1 || move.getColumn()>this.playground.length -1 ){
            System.out.println("error");
            return false;
        }
        if(this.playground[move.getRow()][move.getColumn()]!='_'){
            System.out.println("not empty field");
            return false;
        }
        return true;
    }

    public void play(Move move) throws IOException {
        this.playground[move.getRow()][move.getColumn()] = move.getSign();
        this.playgroundObject.printBoard(this.playground);
        if (isMatchWonByCurrentMove(move)) {
            System.out.println(move.getSign() + " has won");

        } else {
            getInput();
        }
    }

    public boolean isMatchWonByCurrentMove(Move move) {
        for(int i = 0;i<=2;i++){
            if(this.playground[i][0] == move.getSign() && this.playground[i][1] == move.getSign() && this.playground[i][2] == move.getSign()){
                return true;
            }
            if (this.playground[0][i] == move.getSign() && this.playground[1][i] == move.getSign() && this.playground[2][i] == move.getSign()) {
                return true;
            }
        }        if(this.playground[2][0] == move.getSign() && this.playground[1][1] == move.getSign() && this.playground[0][2] == move.getSign()){
            return true;
        }

        if(this.playground[0][0] == move.getSign() && this.playground[1][1] == move.getSign() && this.playground[2][2] == move.getSign()){
            return true;
        }

        return false;
    }

}
