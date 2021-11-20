public class Move {
    private char sign;
    private Integer row;
    private Integer column;

    public Move(char sign, Integer row, Integer column) {
        this.sign = sign;
        this.row = row;
        this.column = column;
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
