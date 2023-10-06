import java.util.Scanner;

public class GiamGia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tuổi khách hàng: ");
        float a = scanner.nextFloat();
        System.out.println("Nhập tổng số tiền hóa đơn phải trả: ");
        float b = scanner.nextFloat();

        b = checkGiamGia(a, b);
        if(b == -1) {
            System.out.println("Input Không hợp lệ");
        } else {
            System.out.println("Tổng số tiền phải trả sau khi giảm giá: ");
            System.out.println(b);
        }
    }

    public static float checkGiamGia(float a, float b) {
        if (a <= 0 || b <= 0) {
            b = -1;
        } else if (a < 7) {
            b = 0;
        } else if (b > 2000000 && b <= 3000000) {
            b = b * 90 / 100;
        } else if (b > 3000000) {
            b = b * 80 / 100;
        }
        return b;
    }
}
