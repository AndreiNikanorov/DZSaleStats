package ru.netology.stats;

public class StatsService {


    public int totalSales(int[] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    }

    public int averageSales(int[] sales) {
        int average = totalSales(sales) / sales.length;

        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int belowAverage = 0;
        for (int sale : sales) {
            if (sale < averageSales(sales)) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int aboveAverage(int[] sales) {
        int aboveAverage = 0;
        for (int sale : sales) {
            if (sale > averageSales(sales)) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}


