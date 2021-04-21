import runtimes.Essentials;
import runtimes.HomeWork;
import runtimes.Optionals;
import runtimes.Streams;

public class App {

    public static void main(String[] args) throws Exception {
        Essentials.run(false);
        Optionals.run(false);
        HomeWork.run(true);
        Streams.run(false);
    }

}
