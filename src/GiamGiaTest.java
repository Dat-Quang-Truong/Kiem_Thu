import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GiamGiaTest {
    // Kiem thu voi do phu all-uses
    @Test
    void test1() {
        assertEquals(GiamGia.checkGiamGia(-1,2), -1);
    }

    @Test
    void test2() { assertEquals(GiamGia.checkGiamGia(1,10), 0); }

    @Test
    void test3() {
        assertEquals(GiamGia.checkGiamGia(3,10), 0);
    }

    @Test
    void test4() {
        assertEquals(GiamGia.checkGiamGia(10,100000), 100000);
    }

    @Test
    void test5() {
        assertEquals(GiamGia.checkGiamGia(10,2500000), 2250000);
    }

    @Test
    void test6() {
        assertEquals(GiamGia.checkGiamGia(20,4000000), 3200000);
    }
}
