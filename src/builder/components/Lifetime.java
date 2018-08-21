package builder.components;

public class Lifetime {
    private final double count;
    private double past;
    private boolean started;

    public Lifetime(double count, double past) {
        this.count = count;
        this.past = past;
    }

    public void on() {
        started = true;
    }

    public void of() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public double getCount() {
        return count;
    }

    public double getPast() {
        return past;
    }
}
