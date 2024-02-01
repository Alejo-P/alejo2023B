import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Calculadora {
    ArrayList <String> lista = new ArrayList<>();
    JPanel Panel = new JPanel(new  GridBagLayout()); // Crea un panel de 4 filas y 3
    GridBagConstraints grd = new GridBagConstraints();// Establece las restricciones para el layout
    
    // Creamos los componentes de la interfaz gráfica
    JTextField pantalla = new JTextField();
    JButton botonSuma = new JButton("+"), 
            botonResta = new JButton("-"), 
            botonIgual = new JButton("="), 
            botonMultiplicacion =  new JButton("*"),  
            botonDivision = new JButton("/"),
            limpiar = new JButton("Limpiar"),
            cero = new JButton("0"),
            uno = new JButton("1"), dos= new JButton("2"), tres= new JButton("3"),
            cuatro = new JButton("4"), cinco = new JButton("5"), seis = new JButton("6"),
            siete = new JButton("7"), ocho = new JButton("8"), nueve = new JButton("9");

    public static void main(String[] args) {
        JFrame Calculadora = new JFrame();
        Calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calculadora.setContentPane(new Calculadora().Panel);
        Calculadora.pack();
        //Calculadora.setSize(300, 250);
        Calculadora.setResizable(false);
        Calculadora.setVisible(true);
    }

    public Calculadora(){
        pantalla.setEditable(false);

        grd.insets=new Insets(5, 2, 5, 2);

        grd.gridx=0;
        grd.gridy=0;
        grd.gridwidth=5;
        grd.fill=GridBagConstraints.HORIZONTAL;
        Panel.add(pantalla,grd);

        grd.gridy=1;
        grd.gridx=0;
        grd.gridwidth=2;
        grd.fill=GridBagConstraints.HORIZONTAL;
        Panel.add(limpiar,grd);
        grd.gridx=2;
        grd.gridwidth=3;
        grd.fill=GridBagConstraints.HORIZONTAL;
        Panel.add(botonIgual,grd);

        grd.gridwidth=1;

        grd.gridy=2;
        grd.gridx=0;
        grd.fill=GridBagConstraints.HORIZONTAL;
        grd.gridwidth=3;
        grd.insets=new Insets(0, 0, 0, 0);
        Panel.add(new JSeparator(SwingConstants.HORIZONTAL), grd);

        grd.gridwidth=1;
        grd.fill=GridBagConstraints.NONE;
        grd.insets=new Insets(5, 2, 5, 2);

        grd.gridy=3;
        grd.gridx=0;
        Panel.add(uno, grd);
        grd.gridx=1;
        Panel.add(dos, grd);
        grd.gridx=2;
        Panel.add(tres,grd);

        grd.gridy=4;
        grd.gridx=0;
        Panel.add(cuatro,grd);
        grd.gridx=1;
        Panel.add(cinco,grd);
        grd.gridx=2;
        Panel.add(seis,grd);

        grd.gridy=5;
        grd.gridx=0;
        Panel.add(siete,grd);
        grd.gridx=1;
        Panel.add(ocho,grd);
        grd.gridx=2;
        Panel.add(nueve, grd);

        grd.gridy=6;
        grd.gridx=1;
        Panel.add(cero, grd);

        grd.gridx=3;
        grd.gridy=3;
        grd.gridheight=4;
        grd.fill=GridBagConstraints.VERTICAL;
        Panel.add(new JSeparator(SwingConstants.VERTICAL), grd);
        
        grd.gridheight=1;
        grd.fill=GridBagConstraints.NONE;

        grd.gridx=4;
        grd.gridy=3;
        Panel.add(botonSuma, grd);
        grd.gridy=4;
        Panel.add(botonResta, grd);
        grd.gridy=5;
        Panel.add(botonMultiplicacion, grd);
        grd.gridy=6;
        Panel.add(botonDivision, grd);

        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"1");
            }
        });

        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"2");
            }
        });

        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"3");
            }
        });

        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"4");
            }
        });

        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"5");
            }
        });

        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"6");
            }
        });

        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"7");
            }
        });

        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"8");
            }
        });

        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"9");
            }
        });

        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae){
                String entrada = pantalla.getText();
                pantalla.setText(entrada+"0");
            }
        });

        limpiar.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(java.awt.event.ActionEvent e) {
                lista.clear();
                pantalla.setText("");
            }
        });

        botonSuma.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(java.awt.event.ActionEvent e) {
                String entrada = pantalla.getText();
                if (entrada.length()>0 && lista.size()<1)
                {
                    lista.add("+");
                    pantalla.setText(entrada+"+");
                }
                else if (entrada.length()>0 && lista.size()>=1)
                {
                    Obtener_operacion(entrada);

                }
                else
                {
                    JOptionPane.showMessageDialog(Panel, "No hay valores para la suma!", "Valores invalidos", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String entrada = pantalla.getText();
                boolean numero=false;
                for (char c : entrada.toCharArray())
                {
                    if (Character.isDigit(c))
                    {
                        numero=true;
                    }
                }
                if (lista.size()<1 && (entrada.length()==0 || numero))
                {
                    if (entrada.length()>0)
                    {
                        lista.add("-");
                    }
                    pantalla.setText(entrada+"-");
                }
                else if (entrada.length()>0 && lista.size()>=1 && numero)
                {
                    Obtener_operacion(entrada);
                }
            }
        });

        botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(java.awt.event.ActionEvent e) {
                String entrada = pantalla.getText();
                if (entrada.length()>0 && lista.size()<1)
                {
                    lista.add("*");
                    pantalla.setText(entrada+"*");
                }
                else if (entrada.length()>0 && lista.size()>=1)
                {
                    Obtener_operacion(entrada);
                }
                else
                {
                    JOptionPane.showMessageDialog(Panel, "No hay valores para la multiplicacion!", "Valores invalidos", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        botonDivision.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(java.awt.event.ActionEvent e) {
                String entrada = pantalla.getText();
                if (entrada.length()>0 && lista.size()<1)
                {
                    lista.add("/");
                    pantalla.setText(entrada+"/");
                }
                else if (entrada.length()>0 && lista.size()>=1)
                {
                    Obtener_operacion(entrada);

                }
                else
                {
                    JOptionPane.showMessageDialog(Panel, "No hay valores para la division!", "Valores invalidos", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String Cadena=pantalla.getText();
                Obtener_operacion(Cadena);
            }
        });
    }

    public void Obtener_operacion (String Cadena){
        char op=' ';
        String cad="";
        int resultado=0, idx=0;
        boolean mostrarResultado=true;
        ArrayList <Integer> Numeros = new ArrayList<>();
        for (char c : Cadena.toCharArray())
        {
            idx++;
            if (c=='-' && idx==1)
            {
                cad+=c;
            }
            if (Character.isDigit(c))
            {
                Numeros.add(Integer.parseInt(cad+Character.getNumericValue(c)));
                cad="";
            }
            else if (idx>1)
            {
                op=c;
            }
        }
        if (op=='+')
        {
            for (int  num : Numeros)
            {
                resultado+=num;
            }
        }
        else if (op=='-')
        {
            resultado=Numeros.get(0);
            for (int i=0; i < Numeros.size(); i++)
            {
                if (i>0)
                {
                    resultado-=Numeros.get(i);
                }
            }
        }
        else if (op=='*')
        {
            resultado=Numeros.get(0);
            for (int i=0; i < Numeros.size(); i++)
            {
                if (i>0)
                {
                    resultado*=Numeros.get(i);
                }
            }
        }
        else if (op=='/')
        {
            resultado=Numeros.get(0);
            for (int i=0; i < Numeros.size(); i++)
            {
                if (i>0 && Numeros.get(i)!=0)
                {
                    resultado/=Numeros.get(i);
                }
                else if (i>0 && Numeros.get(i)==0)
                {
                    JOptionPane.showMessageDialog(Panel, "No podemos dividir para cero", "Division invalida", JOptionPane.WARNING_MESSAGE);
                    mostrarResultado=false;
                    break;
                }
            }
        }
        if (mostrarResultado)
        {
            pantalla.setText(""+resultado);
        }
        lista.clear();
    }
}