package Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Order {
    private OrderItem[] items;

    public Product[] getProducts() {
        Product[] products = new Product[items.length];
        for (int i = 0; i < items.length; i++) {
            products[i] = items[i].getP();
        }
        return products;
    }


    public Order(OrderItem[] items) {
        this.items = items;
    }

    public double cost() {
        int total = 0;
        for (OrderItem item : items) {
            total += item.getQuality() * item.getP().getPrice();
        }
        return total;
    }

    // using binary search approach
    public boolean contains(Product p) {
        Arrays.sort(items, Comparator.comparing(o -> o.getP().getName()));
        int low = 0;
        int high = items.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (items[mid].getP().equals(p)) {
                return true;
            } else if (p.compareTo(items[mid].getP()) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }


    // get all products based on the given type using linear search
    public Product[] filter(String type) {
        int count = 0;
        for (OrderItem item : items) {
            if (item.getP().getType().equals(type)) {
                count++;
            }
        }
        Product[] products = new Product[count];
        for (int i = 0, index = 0; i < items.length; i++) {
            if (items[i].getP().getType().equals(type)) {
                products[index++] = items[i].getP();
            }
        }
        return products;
    }
}
