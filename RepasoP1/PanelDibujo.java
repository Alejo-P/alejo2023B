import javax.swing.*;
import java.awt.*;
public class PanelDibujo extends JPanel{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); //llamada a la clase padre para que se muestren los colores de fondo y borde
        int ancho = getWidth(); //obtener el ancho del panel
        int alto = getHeight(); //obtener el alto del panel

        g.drawLine(0, 0, ancho, alto);
        g.drawLine(0, alto, 0, alto);
        int[] xPoints = {100, 150, 200}; // Coordenadas x de los puntos
        int[] yPoints = {100, 50, 100};
        //g.drawPolyline(xPoints, yPoints, 5); // Dibujamos una polilínea con los puntos anteriores
        g.drawPolygon(xPoints, yPoints, 3);  // Dibujamos un polígono con los mismos puntos
        g.drawString("Mi nombre", 30, 60);
        g.drawRect(3, 8, 100, 50);
        g.drawOval(15, 15, 100, 250);
    }
}
