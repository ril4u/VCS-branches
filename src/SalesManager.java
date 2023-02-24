public class SalesManager {
    protected Long[] sales;

    public SalesManager(Long[] sales) {
        this.sales = sales;
    }

    public Long max() {
        Long max = -1L;
        for (Long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}