import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Github!");
        int[] managerSales = {10,5,17,0,11,7};
        SalesManager manager1 = new SalesManager(managerSales);
        System.out.println("Продажи за полгода: " + Arrays.toString(managerSales));
        System.out.println("Продажи в лучшем месяце: " + manager1.max());
    }
}