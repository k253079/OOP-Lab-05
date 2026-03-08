import java.util.ArrayList;
import java.util.Collections;

public class OnlineStore {

    public static void main(String[] args) {

        ArrayList<Double> orders = new ArrayList<Double>();

        orders.add(1200.0);
        orders.add(450.0);
        orders.add(8900.0);
        orders.add(300.0);
        orders.add(5500.0);
        orders.add(750.0);
        orders.add(120.0);
        orders.add(6200.0);
        orders.add(980.0);
        orders.add(4800.0);

        int i = 0;
        while (i < orders.size()) {
            if (orders.get(i) < 500) {
                orders.remove(i);
            } else {
                i++;
            }
        }

        for (i = 0; i < orders.size(); i++) {
            if (orders.get(i) > 5000) {
                orders.set(i, orders.get(i) * 0.9);
            }
        }

        double total = 0;
        for (i = 0; i < orders.size(); i++) {
            total = total + orders.get(i);
        }

        Collections.sort(orders);

        System.out.println("Sorted Order List:");
        for (i = 0; i < orders.size(); i++) {
            System.out.println("Order " + (i + 1) + ": " + orders.get(i));
        }

        System.out.println();
        System.out.println("Total Revenue: " + total);

    }
}
