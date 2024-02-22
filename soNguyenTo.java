public class soNguyenTo {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");
        for (int i = 2, count = 0; count < 20; i++) {
            boolean soNguyenTo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    soNguyenTo = false;
                    break;
                }
            }
            if (soNguyenTo) {
                System.out.println(i);
                count++;
            }
        }
    }
}
