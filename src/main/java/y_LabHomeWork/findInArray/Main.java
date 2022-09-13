package y_LabHomeWork.findInArray;


import java.util.Arrays;


public class Main {
    private static long seed = System.currentTimeMillis();

    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = nextInt();
            }
        }

        System.out.println("Массив сгенерированых чисел: " + Arrays.deepToString(array));

        Integer max = getMaxInteger(array);
        System.out.println("Максимальное число в массиве: " + max);

        Integer min = getMinInteger(array);
        System.out.println("Минимальное число в массиве: " + min);

        double average = getAverageInteger(array);
        System.out.println("Среднее число в массиве: " + average);
    }

    /**
     * Для генерации случайных чисел выбран линейный конгруэнтный метод
     * по формуле x(i+1) = (a * x(i) + b) % m.
     * где m - модуль (натуральное число, относительно которого вычисляет остаток от деления)
     * а - множитель (0 <= a < m)
     * c - приращение (0 <= c < m)
     * x(i) - seed - начальное значение System.currentTimeMillis()
     */
    private static int nextInt() {
        int a = 45;
        int c = 21;
        int m = 67;

        seed = (a * seed + c) % m;
        return (int) seed;
    }


    private static Double getAverageInteger(int[][] array) {
        if (array == null) {
            return null;
        }

        double average = 0;

        if (array.length > 0) {
            double sum = 0;
            for (int[] i : array) {
                for (int j : i) {
                    sum += j;
                }
            }
            average = sum / (array.length * array.length);
        }
        return average;
    }


    private static Integer getMinInteger(int[][] array) {
        if (array == null) {
            return null;
        }

        if (array.length == 0) {
            return 0;
        }

        int minNum = array[0][0];

        for (int[] i : array) {
            for (int j : i) {
                if (j < minNum)
                    minNum = j;
            }
        }
        return minNum;
    }


    private static Integer getMaxInteger(int[][] array) {
        if (array == null) {
            return null;
        }

        if (array.length == 0) {
            return 0;
        }

        int maxNum = array[0][0];

        for (int[] i : array) {
            for (int j : i) {
                if (j > maxNum)
                    maxNum = j;
            }
        }
        return maxNum;
    }
}
