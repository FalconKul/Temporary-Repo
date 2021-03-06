package Tutorial.MultiThread;

public class SumObject {
    private int sum = 0;
    public static int staticSum = 0;
    
    public int getSum() {
        return sum;
    }
    
    public void setSum(int sum) {
        this.sum = sum;
    }
    
    public void calculate() {
        setSum(getSum() + 1);
    }
    
    public synchronized void synchronisedCalculate() {
        setSum(getSum() + 1);
    }
    
    public static synchronized void syncStaticCalculate() {
        staticSum = staticSum + 1;
    }
    
    public static void performSynchrinisedTask() {
        synchronized (SumObject.class) {
            staticSum = staticSum + 1;
        }
    }
}
