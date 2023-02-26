package lesson15Streams;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Case3Orderes {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Первый товар");
        Item item2 = new Item(2, "Второй товар");
        Item item3 = new Item(3, "Третий товар");
        List<Item> itemList1 = List.of(new Item[]{item3, item1});
        List<Item> itemList2 = List.of(new Item[]{item2, item1});
        List<Item> itemList3 = List.of(new Item[]{item3, item2});
        Order order1 = new Order(11, "Petrov", itemList1, LocalDateTime.of(2014, 9, 19, 14, 5));
        Order order2 = new Order(12, "Ivanov", itemList2, LocalDateTime.of(2014, 9, 25, 14, 5));
        Order order3 = new Order(13, "Sidorov", itemList3, LocalDateTime.of(2014, 10, 19, 14, 5));
        List<Order> orderList = List.of(new Order[]{order1, order2, order3});
        LocalDateTime start = LocalDateTime.of(2014, 9, 24, 14, 5);
        LocalDateTime finish = LocalDateTime.of(2014, 10, 26, 14, 5);
//    for (int i = 0; i < orderList.size(); i++) {
//        for (int j = 0; j<orderList.get(i).getItemList().size(); j++){
//        System.out.println(orderList.get(i).getItemList().get(j).getName());
//            }}
        List<Item> items = orderList.stream()
                .filter(order -> order.getDate().compareTo(start) >= 0)
                .filter(order -> order.getDate().compareTo(finish) <= 0)
                .flatMap(order -> order.getItemList().stream()
                .filter(item -> item.getName().toLowerCase().contains("первый")))
                .collect(Collectors.toList());

        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

    static class Order {
        long id;
        String name;
        List<Item> itemList; // Это то, что заказали
        LocalDateTime date;

        public Order(long id, String name, List<Item> itemList, LocalDateTime date) {
            this.id = id;
            this.name = name;
            this.itemList = itemList;
            this.date = date;
        }

        public List<Item> getItemList() {
            return itemList;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public LocalDateTime getDate() {
            return date;
        }
    }


    static class Item {
        long id;
        String name;

        public Item(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}