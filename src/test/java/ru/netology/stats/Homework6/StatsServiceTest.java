package ru.netology.stats.Homework6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calculateSumSalesMonth() {

        StatsService service = new StatsService();

        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(salesMonth);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calculateAverageSales() {

        StatsService service = new StatsService();

        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.averageSales(salesMonth);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void monthMaximumSales() {

        StatsService service = new StatsService();

        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(salesMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void monthMinimumSales() {

        StatsService service = new StatsService();

        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(salesMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void lowerAverage() {

        StatsService service = new StatsService();

        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinimum = 5;
        int actualMinimum = service.lowerThanAverage(salesMonth);

        Assertions.assertEquals(expectedMinimum, actualMinimum);
    }

    @Test
    public void biggerAverage() {

        StatsService service = new StatsService();

        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaximum = 5;
        int actualMaximum = service.biggerThanAverage(salesMonth);

        Assertions.assertEquals(expectedMaximum, actualMaximum);
    }


}
