import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pintar_LogIn_Imagen extends Transformaciones{

    private BufferedImage foto = null;
    private final static Logger logger = (Logger) LogManager.getRootLogger();
    private int color;


    public Pintar_LogIn_Imagen(ImagenObjeto fondo) {
        imagenBase = fondo;
    }

    @Override
    public void hacer() {
        try {
            File imagen = new File("login oficial.jpg");
            foto = ImageIO.read(imagen);

            for (int i = 0; i < foto.getHeight(); i++) {
                for (int j = 0; j < foto.getWidth(); j++) {
                    color = foto.getRGB(j, i);
                    imagenBase.setPixel(color, j, i);
                }
            }
            imagenBase.cambioOk();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
