package homework8;

public class AppArray {
    public static int processArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        int sum = 0;

        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException();
        }

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                try {
                    sum += Integer.parseInt(array[row][column]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(row, column);
                }
            }
        }

        return sum;
    }
}

