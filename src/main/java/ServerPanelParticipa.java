import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ServerPanelParticipa extends JPanel implements PropertyChangeListener {

    private final static Logger logger = (Logger) LogManager.getRootLogger();

    public ServerPanelParticipa() {
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);
        logger.debug("Pinta panel amarillo");
    }

    public Dimension getPreferredSize() {
        return new Dimension(300, 1000);
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        repaint();
    }

}
