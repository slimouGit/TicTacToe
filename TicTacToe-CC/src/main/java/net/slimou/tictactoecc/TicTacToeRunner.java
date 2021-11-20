package net.slimou.tictactoecc;

import net.slimou.tictactoecc.Move.Move;
import net.slimou.tictactoecc.Playground.PlaygroundService;
import net.slimou.tictactoecc.UserInput.UserInput;
import net.slimou.tictactoecc.Validation.ValidationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TicTacToeRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(TicTacToeRunner.class);

    private UserInput userInput;
    private ValidationService validationService;
    private PlaygroundService playgroundService;
    private char[][] playground = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
    };

    public TicTacToeRunner(UserInput userInput, ValidationService validationService, PlaygroundService playgroundService) {
        this.userInput = userInput;
        this.validationService = validationService;
        this.playgroundService = playgroundService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Welcome to TicTacToe");
        receiveUserInput();
    }

    public void receiveUserInput() throws IOException {
        this.userInput.getInput();
        log.info("Input {} {} {}", this.userInput.getSign(), this.userInput.getRow(), this.userInput.getColumn());
        Move move = new Move(this.userInput.getSign(), userInput.getRow(), this.userInput.getColumn());
        checkInputBeforeExecute(move);
    }

    public void checkInputBeforeExecute(Move move) throws IOException {
        log.info("Move {} {} {}", move.getSign(), move.getRow(), move.getColumn());
        if (this.validationService.isMoveValid(move, this.playground)) {
            play(move);
        } else {
            receiveUserInput();
        }
    }

    private void play(Move move) throws IOException {
        this.playground[move.getRow()][move.getColumn()] = move.getSign();
        this.playgroundService.printBoard(this.playground);
        if (this.validationService.isMatchWonByCurrentMove(move, this.playground)) {
            log.info("{} has won the game", move.getSign());
        } else {
            receiveUserInput();
        }
    }

}



