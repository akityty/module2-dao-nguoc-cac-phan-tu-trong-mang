import java.util.Scanner;
public class daoNguocPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhap so luong phan tu cua mang");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("so phan tu toi da cua mang la 20");
            }
        } while (size > 20);
        int[] arr = new int[size];
        System.out.println("nhap cac phan tu trong mang");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "]= ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            temp = arr[i + 1];
        }
        System.out.println("mang sau khi hoan doi la");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
