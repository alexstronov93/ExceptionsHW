public class ArithmeticProgression  {
    private final int initial;
    private final int step;

    public ArithmeticProgression(int initial, int step)  throws ProgressionConfigurationException{
        this.initial = initial;
        this.step = step;
        if (step == 0) {
            throw new ProgressionConfigurationException("Step is ZERO!!!");
        }

    }
    public  int calculate(int n) throws ProgressionConfigurationException{
        if (n<=0) throw new ProgressionConfigurationException("element is ZERO!!!");
        int result=initial+(n-1)*step;
        System.out.println(n+" number of progression is "+result);
        return result;

    }
}
