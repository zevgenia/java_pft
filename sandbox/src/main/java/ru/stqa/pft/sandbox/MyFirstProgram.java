package ru.stqa.pft.sandbox;

public class MyFirstProgram {


  public static void main(String[] args) {

    System.out.println("Hello, world!");

    Square s = new Square(5); // создание объекта типа Квадрат и передача конкретного значения в конструктор для заполенния
    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + area(s)); //в качестве пераметра передается созданный объект


    Rectangle r = new Rectangle(); //создание объекта типа Прямоугольник
    r.a = 4; //заполнение атрибутов объекта конкретными значениями
    r.b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + area(r));
  }

  public static double area(Square s) { //функция в качестве параметра принимает объект типа Квадрат
    return s.l * s.l; //доступ к атрибутам объекта
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }

}