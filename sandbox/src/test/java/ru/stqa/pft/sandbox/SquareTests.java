package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea() {

    Square s = new Square(5); //создали экземпляр класса Квадрат со стороной 5
    Assert.assertEquals(s.area(), 25.0); //проверяем что в методе вычисляется площадь = 25

  }
}
