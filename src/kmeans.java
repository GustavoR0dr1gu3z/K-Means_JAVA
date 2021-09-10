
import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


/**
 *
 * @author 
 * gustavo rodriguez calzada
 * francisco javier miguel garcia
 */
public class kmeans extends javax.swing.JFrame {

    /**
     * Creates new form kmeans
     */
    public kmeans() {
        initComponents();
      //  System.out.println(puntosEnteros);
        this.setLocationRelativeTo(null); //Para que al inicio nos centre la ventana
        a1.setSelected(true); // Selección de un boton al inicial el programa
            

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        puntos = new javax.swing.JTextField();
        generarP = new javax.swing.JButton();
        aplicar = new javax.swing.JButton();
        a1 = new javax.swing.JRadioButton();
        a2 = new javax.swing.JRadioButton();
        a3 = new javax.swing.JRadioButton();
        a4 = new javax.swing.JRadioButton();
        a5 = new javax.swing.JRadioButton();
        a6 = new javax.swing.JRadioButton();
        a7 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        atractores = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Contenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContenedorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jButton1.setText("Comenzar algoritmo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("¿Cuántos puntos desea?");

        generarP.setText("Generar Puntos");
        generarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarPMouseClicked(evt);
            }
        });

        aplicar.setText("Reestablecer");
        aplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aplicarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aplicarMousePressed(evt);
            }
        });

        a1.setText("Azul");

        a2.setText("Cyan");

        a3.setText("Verde");

        a4.setText("Magenta");

        a5.setText("Naranja");

        a6.setText("Rosa");

        a7.setText("Rojo");

        jLabel1.setText("¿Cuantos atractores quiere?");

        jTextField2.setEditable(false);
        jTextField2.setText("(1)");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("(2)");

        jTextField4.setEditable(false);
        jTextField4.setText("(3)");

        jTextField5.setEditable(false);
        jTextField5.setText("(4)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a2)
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(a3)
                                        .addContainerGap()))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(a5))
                                    .addContainerGap()))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a6)
                                    .addComponent(a7)
                                    .addComponent(a1)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aplicar)
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atractores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(a1)
                        .addGap(18, 18, 18)
                        .addComponent(a2)
                        .addGap(18, 18, 18)
                        .addComponent(a3)
                        .addGap(18, 18, 18)
                        .addComponent(a4)
                        .addGap(18, 18, 18)
                        .addComponent(a5)
                        .addGap(18, 18, 18)
                        .addComponent(a6)
                        .addGap(18, 18, 18)
                        .addComponent(a7)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generarP))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(atractores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(aplicar)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // ArrayList Publicos Para las coordenadas de los atractores y los puntos
    // Así acceder a su contenido en otros métodos
    public ArrayList cooaX = new ArrayList();
    public ArrayList cooaY = new ArrayList();
    public ArrayList coopX = new ArrayList();
    public ArrayList coopY = new ArrayList();
    public ArrayList<Color> clasesColor = new ArrayList<>();
    public ArrayList<Color> colorAtractor = new ArrayList<>();
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        // EN PRIMER INSTANCIA COLOCAMOS QUE SE HAGA EL ALGORITMO CUANDO SE HAYAN
        // PUESTO TODOS LOS ATRACTORES        
        coordenadas(cooaX, cooaY, coopX, coopY, clasesColor);
        centroides(coopX, coopY, colorAtractor, clasesColor, cooaX, cooaY);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void generarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarPMouseClicked
        
    boolean isNumeric1 =   puntos.getText().matches("[+-]?\\d*(\\.\\d+)?");
      
    // ELEMENTOS VACIOS
        if(puntos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un valor en el campo", "K-Means", JOptionPane.WARNING_MESSAGE);
            return;
        }
    
    // ELEMENTOS NUMERICOS EN EL TEXTFIELD
        if(!isNumeric1){
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico", "K-Means", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    //Haace un parseo el cual pasa los numeros a int 
        int PuntosEnteros = Integer.parseInt(puntos.getText());        
        
    // NUMEROS POSITIVOS
        if(PuntosEnteros < 0){
            JOptionPane.showMessageDialog(null, "¡Ingrese un numero positivo! ", "K-Means", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        pintandoPuntos(coopX, coopY);
    }//GEN-LAST:event_generarPMouseClicked

    private void aplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aplicarMouseClicked
        // TODO add your handling code here:
        
        puntos.setText("");      
        Contenedor.repaint();
        atractores.setText("");
        System.out.println("\nLIMPIO");
        cooaX.clear();
        cooaY.clear();
        coopX.clear();
        coopY.clear();
        colorAtractor.clear();
        clasesColor.clear();
    }//GEN-LAST:event_aplicarMouseClicked

    private void aplicarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aplicarMousePressed
        // TODO add your handling code here:
        
 
      
    }//GEN-LAST:event_aplicarMousePressed


    
    private void ContenedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContenedorMousePressed
 
          
          // Se manda a llamar la funcion de pintar los puntos, con 
          // parametros cooaX,cooaY para registrar coordenadas de los atractores
            pintarAtractores(evt, cooaX, cooaY);
            
    }//GEN-LAST:event_ContenedorMousePressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kmeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kmeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kmeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kmeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kmeans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JRadioButton a5;
    private javax.swing.JRadioButton a6;
    private javax.swing.JRadioButton a7;
    private javax.swing.JButton aplicar;
    private javax.swing.JTextField atractores;
    private javax.swing.JButton generarP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField puntos;
    // End of variables declaration//GEN-END:variables


private void pintandoPuntos(ArrayList coopX, ArrayList coopY){
    
        int PuntosEnteros = Integer.parseInt(puntos.getText());                    
        Graphics gp = Contenedor.getGraphics(); //Dibujando en el JPanel
        int numeroX,numeroY;
        
        for (int i = 1; i <= PuntosEnteros; i++) {
            numeroX = (int) (Math.random() * 700 + 1);
            numeroY = (int) (Math.random() * 320 + 1);
            gp.setColor(Color.BLACK);
            gp.fillOval(numeroX, numeroY, 5, 5);
            coopX.add(numeroX);
            coopY.add(numeroY);
            System.out.println("Punto "+i+": X: "+numeroX+", Y: "+numeroY);
        }
}

private void pintarAtractores(java.awt.event.MouseEvent evt, ArrayList cooaX, ArrayList cooaY ){
       // TODO add your handling code here:
        int cx = 0;
        int cy = 0;
        Graphics gp = Contenedor.getGraphics(); //Dibujando en el JPanel
          // Crear un grupo de Botones
            ButtonGroup grupo = new ButtonGroup();
            grupo.add(a1);
            grupo.add(a2);
            grupo.add(a3);
            grupo.add(a4);
            grupo.add(a5);      
            grupo.add(a6);      
            grupo.add(a7);      
            
            int xX = evt.getX();
            int yY = evt.getY();
            
            int numAt = Integer.parseInt( atractores.getText() );
            



            if(a1.isSelected()==true)
            {
             System.out.print("\nAtractor Azul     "+"Posicion x = "+xX+" Posicion y = "+yY);
             gp.setColor(Color.BLUE);
             gp.fillRect(xX, yY, 8, 8);
             cooaX.add(xX);
             cooaY.add(yY);
             colorAtractor.add(Color.BLUE);
            }
            else if(a2.isSelected()==true)
            {
             System.out.print("\nAtractor Cyan     "+"Posicion x = "+xX+" Posicion y = "+yY);
             gp.setColor(Color.CYAN);
             gp.fillRect(xX, yY, 8, 8);
             cooaX.add(xX);
             cooaY.add(yY);
             colorAtractor.add(Color.CYAN);
            }
            else if(a3.isSelected()==true)
            {
             System.out.print("\nAtractor Verde     "+"Posicion x = "+xX+" Posicion y = "+yY);
             gp.setColor(Color.GREEN);
             gp.fillRect(xX, yY, 8, 8);
             cooaX.add(xX);
             cooaY.add(yY);
             colorAtractor.add(Color.GREEN);
            }
            else if(a4.isSelected()==true)
            {
             System.out.print("\nAtractor Magenta     "+"Posicion x = "+xX+" Posicion y = "+yY);
             gp.setColor(Color.MAGENTA);
             gp.fillRect(xX, yY, 6, 6);
             cooaX.add(xX);
             cooaY.add(yY);
             colorAtractor.add(Color.MAGENTA);
            }
            else if(a5.isSelected()==true)
            {
             System.out.print("\nAtractor Naranja     "+"Posicion x = "+xX+" Posicion y = "+yY);
             gp.setColor(Color.ORANGE);
             gp.fillRect(xX, yY, 8, 8);
             cooaX.add(xX);
             cooaY.add(yY);
             colorAtractor.add(Color.ORANGE);
            }
             else if(a6.isSelected()==true)
            {
             System.out.print("\nAtractor Rosa     "+"Posicion x = "+xX+" Posicion y = "+yY);
             gp.setColor(Color.PINK);
             gp.fillRect(xX, yY, 6, 6);
             cooaX.add(xX);
             cooaY.add(yY);
             colorAtractor.add(Color.PINK);
            }
              else if(a7.isSelected()==true)
            {
             System.out.print("\nAtractor Rojo     "+"Posicion x = "+xX+" Posicion y = "+yY);
             gp.setColor(Color.RED);
             gp.fillRect(xX, yY, 8, 8);
             this.cooaX.add(xX);
             this.cooaX.add(yY);
             colorAtractor.add(Color.RED);
            }
            else{
                // SIno seleccionó nada, que mande un mensaje
                JOptionPane.showMessageDialog(null, "¡Seleccione un Atractor! ", "Atractor", JOptionPane.WARNING_MESSAGE);
            }
        

}


private void coordenadas(ArrayList cooaX, ArrayList cooaY, ArrayList coopX, ArrayList coopY, ArrayList clasesColor ){
        
        // COORDENADAS ATRACTORES
        System.out.println("\n\n");
        int tamAtrac = Integer.parseInt( atractores.getText() );
        for(int i=0; i<tamAtrac; i++){
            System.out.println("COORDENADAS ATRACTORES: X: "+cooaX.get(i)+", Y: "+cooaY.get(i));
        }
        
        // COORDENADAS PUNTOS
        System.out.println("\n\n");
        int tamPuntos = Integer.parseInt( puntos.getText() );        
        for(int i=0; i<tamPuntos; i++){
            System.out.println("COORDENADAS PUNTOS: X: "+coopX.get(i)+", Y: "+coopY.get(i));
        }


        // PINTAR PUNTOS PARA CADA ATRACTOR
        float resDistancia;        
        ArrayList distancias = new ArrayList();
        ArrayList distanciasMin = new ArrayList();        
        System.out.println("");
        float minimo;
        int indexM;
        
        Color caux;
        Graphics gp = Contenedor.getGraphics(); //Dibujando en el JPanel

        // Para cada punto calcula la distancia ente  punto-atractor
        for(int i=0; i<tamPuntos; i++){  // X1, Y1            
            for(int j=0; j<tamAtrac; j++){ // X2, Y2
                
                // Calculo de distancias entre dos puntos
                // Forma euclidiana 
                // ( (x2-x1)^2 + (y2-y1)^2 )^(1/2)

                int x1 = (int) coopX.get(i);
                int y1 = (int) coopY.get(i);
                int x2 = (int) cooaX.get(j);
                int y2 = (int) cooaY.get(j);
                               
                // Calculando Distancias
                resDistancia = (float)Math.sqrt( Math.pow( x2-x1 , 2) + Math.pow(y2-y1 , 2) );
                System.out.println("Distancia del Punto: "+i+" con el  Atractor: "+j+".\tES: "+resDistancia);
                                
                // Agregando Distancias
                distancias.add(resDistancia);                                    
                
                              
            }    
                // Calculando distancia minima entre punto y cada atractor
                minimo = (float) Collections.min(distancias);
                // Obteniendo su indice
                indexM = distancias.indexOf(minimo);
                System.out.println("Indice: "+indexM+", Minimo: "+minimo+"\n");
                // Distancias mínimas guardadas
                distanciasMin.add(minimo);
                
            //System.out.println("indice valor "+indexMin);
            caux = colorAtractor.get(indexM);
           System.out.println("color del atractor "+caux);

            //colorPuntos.add(caux);
            clasesColor.add(caux);
            gp.setColor(caux);
            gp.fillOval( (int)coopX.get(i), (int)coopY.get(i), 5, 5);
            distancias.clear();
        }
    
             }
                

private void centroides(ArrayList coopX, ArrayList coopY, ArrayList colorAtractor, ArrayList clasesColor, ArrayList cooaX, ArrayList cooaY){

        int tamPuntos = Integer.parseInt( puntos.getText() );        
        int tamAtrac = Integer.parseInt( atractores.getText() );
        
        ArrayList auxAX = new ArrayList<>();
        ArrayList auxAY = new ArrayList<>();      
        int contadores[] = new int[tamAtrac];
        int cont;
        
        for(int i=0; i<tamAtrac; i++){
            auxAX.add(0);
            auxAY.add(0);
            contadores[i] = 0;
        }
        
        for(int i=0; i<tamPuntos; i++){             
            for(int j=0; j<tamAtrac; j++){
                if( clasesColor.get(i) == colorAtractor.get(j) ){
                    cont = (int)auxAX.get(j) + (int)coopX.get(i);
                    auxAX.set(j, cont);
                    cont = 0;
                    cont = (int)auxAY.get(j) + (int)coopY.get(i);
                    auxAY.set(j, cont);
                    
                    // Guarda numero de puntos del mismo color
                    contadores[j]+=1;
                }
            }
        }
        
        Graphics gp = Contenedor.getGraphics();
        for(int i=0; i<tamAtrac; i++){
            // Calculo de centroides
            cooaX.set( i, (int)auxAX.get(i)/contadores[i] );
            cooaY.set( i, (int)auxAY.get(i)/contadores[i] );
            
            gp.setColor((Color) colorAtractor.get(i));
            gp.fillOval( (int)cooaX.get(i) , (int)cooaY.get(i), 10, 10);
        }
        
        
        clasesColor.clear();

    }



}

