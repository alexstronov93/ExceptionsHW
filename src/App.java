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
            if (step == 0) {
                throw new ProgressionConfigurationException("Step is ZERO!!!");
            }
            prog = new ArithmeticProgression(step, initial);
        } catch (ProgressionConfigurationException e) {
            System.err.println("IT`S EXCEPTION!!!");
            e.printStackTrace();
        }
        try {
            System.out.println("Put number of progression");
            n = scanner.nextInt();
            if (n==-0) throw new ProgressionConfigurationException("element is ZERO!!!");
            prog.calculate(n);
        } catch (ProgressionConfigurationException e){
            System.err.println("IT`S EXCEPTION!!!");
            e.printStackTrace();
        }

    }
}
