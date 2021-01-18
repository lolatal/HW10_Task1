package by.tms;

import java.util.Objects;

public class Courses {
    String name;
    int price;
    String duration;

    public Courses(){
    }
    public Courses(String name,int price, String duration){
        this.name=name;
        this.price = price;
        this.duration=duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String toString(){
        return name + "; Цена: " + price + "; Длительность: " + duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courses courses = (Courses) o;
        return price == courses.price &&
                Objects.equals(name, courses.name) &&
                Objects.equals(duration, courses.duration);
    }
}
