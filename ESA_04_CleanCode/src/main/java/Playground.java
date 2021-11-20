import javax.annotation.PostConstruct;

public class Playground {
    private char[][] playground = new char[][]{
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
    };

    public Playground() {
    }

    public Playground(char[][] playground) {
        this.playground = playground;
    }


    public void printBoard(char[][] playground) {
        for (char[] row : playground) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public char[][] getPlayground() {
        return playground;
    }

    public void setPlayground(char[][] playground) {
        this.playground = playground;
    }
}
