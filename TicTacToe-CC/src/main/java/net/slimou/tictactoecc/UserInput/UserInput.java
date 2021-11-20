package net.slimou.tictactoecc.UserInput;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
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
        selectRow(reader);
        selectColumn(reader);
    }

    private void selectRow(BufferedReader reader) throws IOException {
        System.out.println("Which row ");
        String row = reader.readLine();
        try {
            setRow(Integer.parseInt(row));
        } catch (Exception e) {
            System.out.println("Falsche Eingabe");
            selectRow(reader);
        }
    }

    private void selectColumn(BufferedReader reader) throws IOException {
        System.out.println("Which column ");
        String column = reader.readLine();
        try {
            setColumn(Integer.parseInt(column));
        } catch (Exception e) {
            System.out.println("Falsche Eingabe");
            selectColumn(reader);
        }
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
