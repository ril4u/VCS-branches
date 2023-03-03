public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    //определение максимального значения
    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    //определение минимального
    public long min() {
        long min = 1000;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long average() {
        long average = 0;
        for (long sale : sales) {
            average += sale;
        }
        //обрезание минимального и максимального значений
        average -= this.min();
        average -= this.max();
        average = average / (sales.length - 2);
        return average;
    }

}