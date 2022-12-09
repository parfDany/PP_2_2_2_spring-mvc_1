package web.Model;


import java.util.Objects;

public class Car {
    private String nameCar;
    private String color;
    private int power;

    public Car(String nameCar, String color, int power) {
        this.nameCar = nameCar;
        this.color = color;
        this.power = power;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
