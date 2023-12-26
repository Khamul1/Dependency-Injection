package Computer;

public class Monitor implements IMonitor{

    public Monitor(String name) {
        this.name = name;
    }

    public Monitor() {
    }

    private String name;

    @Override
    public String getname() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
