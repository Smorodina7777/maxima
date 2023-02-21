package lesson15Streams;

import java.util.List;
import java.util.stream.Stream;

public class Case1LastName {
    public static void main(String[] args) {
        Stream.of("Воробьев", "Классен", "Иванова", "Андрюхина", "Москалева", "Ломакина", "Елкин",
                "Гучихин", "Чибисова", "Седых", "Терехов", "Панина", "Сарыгина", "Столярова", "Свиридова", "Тишина",
                "Маркелова", "Косенкова", "Бычкова", "Трошина", "Воробьева", "Ефимов", "Абашина", "Бутылева",
                "Ибатулина", "Бенедис", "Сотникова", "Митина", "Свитенко", "Корсикова", "Пронина",
                "Голованова", "Анатольевна", "Брулева")
        .filter(s->s.startsWith("Е"))
                .forEach(s-> System.out.println(s));


    }
}
