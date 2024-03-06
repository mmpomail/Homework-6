package ru.netology.stats.Homework6;

public class StatsService {
    public static int sumSales(int[] salesMonth) {
        int sum = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            sum = sum + salesMonth[i];
        }
        return sum;
    }

    public static int averageSales(int[] salesMonth) {
        int sum = 0;
        for (int x : salesMonth) {
            sum += x;
        }
        return sum / salesMonth.length;
    }

    public int maxSales(int[] salesMonth) {
        int minMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] >= salesMonth[minMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                minMonth = i; // запомним его как максимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] salesMonth) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] <= salesMonth[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public static int lowerThanAverage(int[] salesMonth) {
        int min = 0;
        int calc = averageSales(salesMonth);
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] < calc) {
                min++;
            }
        }
        return min;
    }

    public static int biggerThanAverage(int[] salesMonth) {
        int max = 0;
        int calc = averageSales(salesMonth);
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] > calc) {
                max++;
            }
        }
        return max;
    }

}


