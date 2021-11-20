import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    private char sign;
    private Integer row;
    private Integer column;

    public void getInput() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Whats your Sign");
        String sign = reader.readLine();
        setSign(sign.charAt(0));
        System.out.println("Which row ");
        String row = reader.readLine();
        setRow(Integer.parseInt(row));
        System.out.println("Which column ");
        String column = reader.readLine();
        setColumn(Integer.parseInt(column));
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }
}
