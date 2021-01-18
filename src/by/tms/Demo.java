package by.tms;

import java.util.*;


public class Demo {
    public static void main(String[] args) {
        ArrayList<Courses> coursesList = new ArrayList<>();
        coursesList.add(new Courses("English for Beginners", 390, "3 months"));
        coursesList.add(new Courses("English Reading", 250, "3 months"));
        coursesList.add(new Courses("English based on movies", 600, "4 months"));
        coursesList.add(new Courses("English for Advanced Learners", 360, "2 months"));
        coursesList.add(new Courses("Spoken English: Improve fluency", 450, "3 months"));
        coursesList.forEach(System.out::println);
        System.out.println("Количество доступных курсов: " + coursesList.size());
        System.out.println("----------------------------------------");
        System.out.println("Курс " +coursesList.get(1).name + " больше недоступен");
        coursesList.remove(1);
        System.out.println("Доступные курсы (" + coursesList.size() + "):");
        coursesList.forEach(System.out::println);

        coursesList.get(3).setPrice(405);
        System.out.println("На курс " + coursesList.get(3).name + " действует скидка 10%. Новая цена курса: " + coursesList.get(2).getPrice());
        System.out.println("Наличие курса Spoken English по старой цене: " + coursesList.contains(new Courses("Spoken English: Improve fluency", 450, "3 months")));
        System.out.println("Наличие курса Spoken English со скидкой: " +coursesList.contains(new Courses("Spoken English: Improve fluency", 405, "3 months")));
        System.out.println("----------------------------------------");
        coursesList.sort(Comparator.comparing(Courses::getPrice));
        System.out.println("Курсы, отсортированные по возрастанию цены: ");
        coursesList.forEach(System.out::println);
        System.out.println("Индекс курса English based on movies после сортировки: " +
                coursesList.indexOf(new Courses("English based on movies", 600, "4 months")));
        System.out.println("----------------------------------------");

        List<Courses>coursesList2 = coursesList.subList (2,4);
        System.out.println("Список самых дорогих курсов: ");
        coursesList2.forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println("Список покупателей в очереди на покупку курсов: ");
        Queue<String> customersQueue = new LinkedList<>();
        customersQueue.offer("Jacob");
        customersQueue.offer("Mike");
        customersQueue.offer("Helen");
        customersQueue.offer("Monika");
        customersQueue.offer("Dave");
        customersQueue.offer("Julia");
        customersQueue.offer("Peter");
        customersQueue.offer("Brian");
        customersQueue.forEach(System.out::println);
        System.out.println("Количество человек в очереди: " + customersQueue.size());
        System.out.println(customersQueue.poll() + " купил курс. Следующий(ая) в очереди " + customersQueue.peek());
        System.out.println(customersQueue.poll() + " купил курс. Следующий(ая) в очереди " + customersQueue.peek());





    }

}
