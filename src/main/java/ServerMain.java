import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class ServerMain {

    private final static Logger logger = (Logger) LogManager.getRootLogger();

    public static void main(String[] args) {
        ServerFrame win = new ServerFrame();
        win.setVisible(true);
        logger.debug("Corre frame");
    }
}
