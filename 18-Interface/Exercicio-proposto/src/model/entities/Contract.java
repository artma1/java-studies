package model.entities;

import java.time.LocalDate;


public class Contract {

    private int num; private LocalDate date;
    private  double value;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Contract(int num, double value, LocalDate date) {
        this.num = num;
        this.value = value;
        this.date = date;
    }
}
