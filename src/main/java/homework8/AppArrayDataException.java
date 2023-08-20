package homework8;

class AppArrayDataException extends Exception {
    public AppArrayDataException(int row, int column) {
        super("Неверные данные в ячейке, значение строки: " + row + ", значение столбца: " + column);
    }
}
