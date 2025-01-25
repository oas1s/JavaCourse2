package anonymous;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new CpuMonitor();
        monitor.monitor();

        Monitor monitor1 = new Monitor() {
            @Override
            public void monitor() {
                System.out.println("monitoring GPU");
            }
        };

        Monitor monitor2 = () -> System.out.println("monitoring RAM");
    }
}
