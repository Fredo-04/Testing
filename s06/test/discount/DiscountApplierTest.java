package s06.test.discount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;


public class DiscountApplierTest {
    @Test
    public void testHomeProductGetsDiscount() {
        Product homeProduct = new Product("Sofa", 100.0, "HOME");
        ProductDao dao = mock(ProductDao.class);
        when(dao.all()).thenReturn(Arrays.asList(homeProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(90.0, homeProduct.getPrice(), 0.001);
    }

    @Test
    public void testBusinessProductGetsIncrease() {
        Product businessProduct = new Product("Office Desk", 200.0, "BUSINESS");
        ProductDao dao = mock(ProductDao.class);
        when(dao.all()).thenReturn(Arrays.asList(businessProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(220.0, businessProduct.getPrice(), 0.001);
    }

    @Test
    public void testMultipleProducts() {
        Product p1 = new Product("Chair", 50.0, "HOME");
        Product p2 = new Product("Printer", 150.0, "BUSINESS");
        Product p3 = new Product("Notebook", 80.0, "OTHER"); // No se debe modificar

        ProductDao dao = mock(ProductDao.class);
        when(dao.all()).thenReturn(Arrays.asList(p1, p2, p3));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(45.0, p1.getPrice(), 0.001);
        assertEquals(165.0, p2.getPrice(), 0.001);
        assertEquals(80.0, p3.getPrice(), 0.001);
    }
}
