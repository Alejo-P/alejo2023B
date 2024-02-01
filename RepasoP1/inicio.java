import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class inicio{
    
    public static void main(String [] args)
    {
        // Elementos necesarios
        JComboBox <String> lista;  //creamos el combobox de la lista
        JTextArea ejemplo = new JTextArea(2, 3);
        JLabel etiqueta1 = new JLabel("Selecciona una opcion:");
        JLabel etiqueta2 = new JLabel("Ingrese un valor");
        JTextField Entrada1 = new JTextField(8);

        JFrame inicio=new JFrame("Inicio");
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel ventana = new JPanel(new GridBagLayout());
        GridBagConstraints posicion = new GridBagConstraints();
        
        String [] Opciones={"Valor 1", "Valor 2", "Valor 3"};
        lista=new JComboBox<>(Opciones);
        lista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String Seleccion=(String)lista.getSelectedItem();
                System.out.println("Seleccionado: "+Seleccion);
             }
        });

        posicion.insets = new Insets(10, 10, 10, 10);   //espacio entre los elementos del panel

        posicion.gridx=0;
        posicion.gridy=0;
        ventana.add(etiqueta1, posicion);
        posicion.gridx=1;
        posicion.gridy=0;
        ventana.add(lista, posicion);
        posicion.gridx=0;
        posicion.gridy=1;
        ventana.add(etiqueta2, posicion);
        posicion.gridx=1;
        posicion.gridy=1;
        ventana.add(Entrada1, posicion);
        posicion.gridx=0;
        posicion.gridwidth=2;
        posicion.gridy=2;
        ventana.add(ejemplo, posicion);
        //PanelDibujo panel1 = new PanelDibujo();
        inicio.getContentPane().add(ventana);
        inicio.pack();
        inicio.setVisible(true);
        
    }
}