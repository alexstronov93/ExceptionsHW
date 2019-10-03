public class ArithmeticProgression  {
    private final int initial;
    private final int step;

    public ArithmeticProgression(int initial, int step)  throws ProgressionConfigurationException{
        this.initial = initial;
        this.step = step;

    }
    public  int calculate(int n) throws ProgressionConfigurationException{
        int result=initial+(n-1)*step;
        System.out.println(n+" number of progression is "+result);
        return result;

    }
}
