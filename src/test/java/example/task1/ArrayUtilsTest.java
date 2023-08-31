package example.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    private  int[] testedArray;

    @BeforeEach
    public void init() {
        testedArray = ArrayUtils.getArrayBySize(7);
    }

    @Test
    public void checkArrayInnerValue() {
        int expected = 4;
        int actual = testedArray[3];
        assertEquals(expected, actual, "Проверка внутреннего содержания массива");
    }

    @Test
    public void checkIfArrayIsNotNull() {
        int[] actual = testedArray;
        assertNotNull(actual, "Метод вернул null вместо массива");
    }

    @Test
    public void checkCorrectArraysSize() {
        int expected  = 7;
        int actual = testedArray.length;
        assertEquals(expected, actual, "Размер массива не соответствует ожиданию");
    }

    @Test
    public void exceptionIfIndexUnderZero() {
        try {
            ArrayUtils.getArrayBySize(-1);
        } catch (RuntimeException e) {
            return;
        }
        fail();
    }
}
