package Task2;

import java.util.Arrays;

public class TestTask2 {
    public static void main(String[] args) {
        Product sach1 = new Product("Sach001", "Sach LTNC", 2000, "Sach");
        Product sach2 = new Product("Sach002", "Sach Hoa Nang Cao", 1000, "Sach1");
        Product sach3 = new Product("Sach003", "Sach Dau Thai Kiep Nguoi", 5000, "Sach1");
        Product sach0 = new Product("Sach003", "Sach Dau Thai Kiep Nguoi", 5000, "Sach");
        OrderItem orderItem1 = new OrderItem(sach1, 2);
        OrderItem orderItem2 = new OrderItem(sach2, 1);
        OrderItem orderItem3 = new OrderItem(sach3, 5);
        Order order = new Order(new OrderItem[]{orderItem1, orderItem2, orderItem3});

        System.out.println(order.cost());
        System.out.println(order.contains(sach1));
        System.out.println(order.contains(sach2));
        System.out.println(order.contains(sach3));
        System.out.println(order.contains(sach0));
        System.out.println(Arrays.toString(order.filter("Sach")));
    }
}
