package JavaPrograms.threads;

public class BaeldungSynchronizedMethods {
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private int sum = 0;

    public void calculate() {
        setSum(getSum() + 1);
    }

}
