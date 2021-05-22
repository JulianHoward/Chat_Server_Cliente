import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class panelImagen extends JPanel implements PropertyChangeListener {

    private ImagenObjeto imagen;

    public panelImagen(ImagenObjeto img) {
        setLayout(null);
        imagen = img;
    }

    @Override
    public Dimension getPreferredSize() {

        return new Dimension(900,900);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (imagen != null) {
            imagen.dibujar(g);
        }
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        repaint();
    }
}
