public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    /* Методы использовались в предыдущих заданиях
        public int max() {
            int max = -1;
            for (int sale : sales) {
                if (sale > max) {
                    max = sale;
                }
            }
            return max;
        }
        public int min() {
            int min = 1000;
            for (int sale : sales) {
                if (sale < min) {
                    min = sale;
                }
            }
            return min;
        }
    */
    public double average() {
        double average = 0;
        for (int sale : sales) {
            average += sale;
        }
        //определение максимального значения
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        //определение минимального
        int min = 1000;
        for (int sale : sales) {
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