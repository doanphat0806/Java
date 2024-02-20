import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        float[] mangSoThuc = {1.2F,2f,3f,5f,6.2f};
        float max = mangSoThuc[0];
        for (int i =1; i<mangSoThuc.length; i++){
            if (mangSoThuc[i]>max){
            max= mangSoThuc[i];
        }
        }
        float tong= 0;
        for (float soThuc: mangSoThuc){
            tong +=soThuc;
        }
        float tich =1;
        for (float soThuc : mangSoThuc){
            tich *= soThuc;
        }
        System.out.println(max);
        System.out.println(tong);
        System.out.println(tich);
    }
}
