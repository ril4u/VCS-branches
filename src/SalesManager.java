public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    //Методы использовались в предыдущих заданиях

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

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
        //определение максимального значения
        long max = -1L;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        //определение минимального
        long min = 1000L;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        //обрезание минимального и максимального значений
        average -= min;
        average -= max;
        average = average / (sales.length - 2);
        return average;
    }

}