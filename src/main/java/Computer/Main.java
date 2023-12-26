package Computer;

public class Main {
    public static void main(String[] args) {

    Computer computer = new Computer("MackBook", new Monitor("Samsung"));

    computer.on();
    computer.off();
    }
}