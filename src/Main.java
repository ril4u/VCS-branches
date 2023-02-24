import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Github!");
        Long[] managerSales = {10L,5L,17L,0L,11L,7L};
        SalesManager manager1 = new SalesManager(managerSales);
        System.out.println("Продажи за полгода: " + Arrays.toString(managerSales));
        System.out.println("Продажи в лучшем месяце: " + manager1.max());
    }
}