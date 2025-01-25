package anonymous;

public class CpuMonitor implements Monitor {
    @Override
    public void monitor() {
        System.out.println("monitoring cpu...");
    }
}
