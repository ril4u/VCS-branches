import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Github!");
        int[] managerSales = {10, 5, 17, 3, 11, 7};
        SalesManager manager1 = new SalesManager(managerSales);
        System.out.println("Продажи: " + Arrays.toString(managerSales));
        //System.out.println("Продажи в лучшем месяце: " + manager1.max());
        //System.out.println("Max: " + manager1.max());
        //System.out.println("Min: " + manager1.min());
        System.out.println("Среднее обрезанное значение: " + manager1.average());

    }
}