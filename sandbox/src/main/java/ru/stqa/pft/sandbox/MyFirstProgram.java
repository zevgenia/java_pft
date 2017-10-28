package ru.stqa.pft.sandbox;

public class MyFirstProgram {


  public static void main(String[] args) {

    System.out.println("Hello, world!");

    Square s = new Square(5); // создание объекта типа Квадрат и передача конкретного значения в конструктор для заполенния
    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area()); //обращение к методу объекта Квадрат


    Rectangle r = new Rectangle(4,6); //создание объекта типа Прямоугольник
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area()); //вызов метода объекта Прямоугольник
  }

}