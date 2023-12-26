package Computer;

public class Computer implements IComputer {

    public Computer() {
    }
    private String name;
    private IMonitor monitor;

    public Computer(String name, IMonitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IMonitor getMonitor() {
        return monitor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonitor(IMonitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void on() {
        System.out.println("Компьютер включился " + name + ", используется монитор " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер выключился " + name + ", используется монитор " + monitor.getName());
    }
}
