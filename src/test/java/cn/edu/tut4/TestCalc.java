package cn.edu.tut4;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class TestCalc {
   @Test
   public void TestAdd() {
      Calc calc = new Calc();
      int answer = calc.add(3, 4);
      assertEquals(answer, 7);
   }
}

