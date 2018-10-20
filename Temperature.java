import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        System.out.println("Введите температуру в грудусах цельсия: ");

        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        System.out.print("Данная температура будет равна ");
        System.out.println(temp *1.8+32 + " в Фаренгейтах");
    }
}
