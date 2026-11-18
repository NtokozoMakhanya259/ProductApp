package productapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductCalculationsTest {

    // Unit Test 1
    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        IProductCalculations calc = new ProductCalculations(3500);

        double actual = calc.GetVat();

        assertEquals(525.0, actual, 0.001);
    }

    // Unit Test 2
    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        IProductCalculations calc = new ProductCalculations(3500);

        double actual = calc.GetTotal();

        assertEquals(4200.0, actual, 0.001);
    }
}
