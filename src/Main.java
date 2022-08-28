import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZhumanynKundoru[] zhumanynKundoru = {
                ZhumanynKundoru.DUISHOMBU,
                ZhumanynKundoru.SHEISHEMBI,
                ZhumanynKundoru.SHARSHEMBI,
                ZhumanynKundoru.BEISHEMBI,
                ZhumanynKundoru.JUMA,
                ZhumanynKundoru.ISHEMBI,
                ZhumanynKundoru.ZHEKSHEMBI
        };
        for (ZhumanynKundoru z:zhumanynKundoru) {
            System.out.println(z.getJumanynKundoru());
        }
    }
}