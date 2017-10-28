package ru.stqa.pft.sandbox;

public class Rectangle {

//прямоугольник описывается длинами двух его сторон
  public double a;
  public double b;

  public Rectangle (double a, double b){//это констуктор

    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }
}
