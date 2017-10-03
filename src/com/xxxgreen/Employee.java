package com.xxxgreen;

public class Employee {
    private String name;
    private int number;
    private int shift;

    public Employee(String name, int number, int shift) {
        this.name = name;
        this.number = number;
        this.shift = shift;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setShift(int shift) {
        if (shift > 0 && shift < 4) {
            this.shift = shift;
        } else {
            System.out.println("Error: shift must be 1, 2, or 3");
        }
    }

    public int getNumber() {
        return number;
    }

    public int getShift() {
        return shift;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name:   " + name +
                "\nNumber: " + number +
                "\nShift:  " + shift;
    }
}
