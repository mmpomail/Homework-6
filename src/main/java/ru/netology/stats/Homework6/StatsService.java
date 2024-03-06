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
        int maxMonth = 0;

        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] >= salesMonth[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] salesMonth) {
        int minMonth = 0;

        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] <= salesMonth[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
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


