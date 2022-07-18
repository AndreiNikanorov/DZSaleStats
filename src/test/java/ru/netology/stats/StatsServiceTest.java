package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    //Сумма всех продаж
    public void shouldGetSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.totalSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    //Средняя сумма продаж в месяц
    public void shouldGetAverageSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.averageSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public void shouldShowMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthNumber = 8;
        int actualMonthNumber = service.maxSales(sales);

        Assertions.assertEquals(expectedMonthNumber, actualMonthNumber);
    }

    @Test
    // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public void shouldShowMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthNumber = 9;
        int actualMonthNumber = service.minSales(sales);

        Assertions.assertEquals(expectedMonthNumber, actualMonthNumber);
    }

    @Test
    // Кол-во месяцев, в которых продажи были ниже среднего
    public void shouldShowBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthCount = 5;
        int actualMonthCount = service.belowAverage(sales);

        Assertions.assertEquals(expectedMonthCount, actualMonthCount);
    }

    @Test
    // Кол-во месяцев, в которых продажи были выше среднего
    public void shouldShowAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthCount = 5;
        int actualMonthCount = service.aboveAverage(sales);

        Assertions.assertEquals(expectedMonthCount, actualMonthCount);
    }
}
