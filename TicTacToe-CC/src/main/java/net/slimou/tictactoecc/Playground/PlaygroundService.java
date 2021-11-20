package net.slimou.tictactoecc.Playground;

import org.springframework.stereotype.Service;

@Service
public class PlaygroundService {

    public void printBoard(char[][] playground) {
        for (char[] row : playground) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
