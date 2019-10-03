import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ProgressionConfigurationException {
        Scanner scanner = new Scanner(System.in);
        ArithmeticProgression prog = null;
        int n;
        try {
            System.out.println("Put initial and step");
            int initial = scanner.nextInt();
            int step = scanner.nextInt();

            prog = new ArithmeticProgression(initial, step);
        } catch (ProgressionConfigurationException e) {
            System.err.println("IT`S EXCEPTION!!!");
            e.printStackTrace();
        }
        try {
            System.out.println("Put number of progression");
            n = scanner.nextInt();
            prog.calculate(n);
        } catch (ProgressionConfigurationException e){
            System.err.println("IT`S EXCEPTION!!!");
            e.printStackTrace();
        }

    }
}
