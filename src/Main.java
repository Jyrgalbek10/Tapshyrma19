import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZhumanynKundoru zhumanynKundoru = ZhumanynKundoru.valueOf(scanner.nextLine());
        switch (zhumanynKundoru){
            case DUISHOMBU :
                System.out.println("Duishombu kunu java okuim");
                break;
            case SHEISHEMBI:
                System.out.println("Anglis tili sabagyn okuim");
                break;
            case SHARSHEMBI:
                System.out.println("Java sabagy");
                break;
            case BEISHEMBI:
                System.out.println("Soft skills");
                break;
            case JUMA:
                System.out.println("Java lesson");
                break;
            case ISHEMBI:
                System.out.println("Oz aldyncha javany kaitaloo");
                break;
            case ZHEKSHEMBI:
                System.out.println("Tapshyrma kyluu");
                break;

        }
    }
}