
package expresionesregulares;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/**
 *
 * @author martin
 */
public class ExpresionRegularFrame extends javax.swing.JFrame {
    
    // Atributos
    Color colorfondodefault;
    Highlighter hilit                    = new DefaultHighlighter();
    Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.CYAN);
    
    // Constructor
    public ExpresionRegularFrame() {
        initComponents();
        
        txtRegex.setText("([A-Z])\\w+");
        txtTexto.setText("Edite o escriba un nuevo texto para evaluar la Expresion "
                + "regular. Intente ingresando un nueva Expresion regular en la parte "
                + "superior. Puede obtener mas informacion en el menu de Ayuda. "
                + "Gracias por usar este programa.");
        
        txtTexto.setHighlighter(hilit);
        colorfondodefault = txtRegex.getBackground();
        this.procesarTexto(txtRegex.getText(), txtTexto.getText());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRegex = new javax.swing.JTextField();
        lblMatches = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test de Expresiones Regulares");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expresión regular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(51, 102, 255))); // NOI18N

        txtRegex.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        txtRegex.setForeground(new java.awt.Color(0, 51, 255));
        txtRegex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRegexKeyReleased(evt);
            }
        });

        lblMatches.setEditable(false);
        lblMatches.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        lblMatches.setForeground(new java.awt.Color(0, 102, 255));
        lblMatches.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblMatches.setText("0 matches");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRegex, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMatches)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblMatches)
                    .addComponent(txtRegex, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Texto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        txtTexto.setColumns(20);
        txtTexto.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtTexto.setLineWrap(true);
        txtTexto.setRows(5);
        txtTexto.setWrapStyleWord(true);
        txtTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTextoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtTexto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Ayuda");

        jMenuItem1.setText("Documentación");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Acerca de");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegexKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegexKeyReleased
        hilit.removeAllHighlights();
        this.procesarTexto(txtRegex.getText(), txtTexto.getText());
    }//GEN-LAST:event_txtRegexKeyReleased

    private void txtTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextoKeyReleased
        hilit.removeAllHighlights();
        this.procesarTexto(txtRegex.getText(), txtTexto.getText());
    }//GEN-LAST:event_txtTextoKeyReleased
    
    private void procesarTexto(String regex,  String texto) {
        
        Integer numMatches = 0;
                
        if (!regex.equals("") && !texto.equals("")) {
            
            try {
                Pattern patron = Pattern.compile(regex); // exp regular
                Matcher matcher = patron.matcher(texto);

                int inicio = 0;
                int fin = 0;

                while ( matcher.find() ) {
                    inicio = matcher.start();
                    fin   = matcher.end();
                    this.resaltarTexto(inicio, fin);
                    numMatches++;
                } 
            } catch (PatternSyntaxException e) {
                System.out.println(e.getMessage());
            }
                       
        }
        
        if(regex.equals("") && numMatches == 0)
            lblMatches.setText("infinite");
        else if (numMatches == 0)
            lblMatches.setText( "no matches");
        else //if (numMatches > 0)
            lblMatches.setText(numMatches.toString() + " matches");
        
    }
    
    private void resaltarTexto(int begin, int end)
    {
        try {
            hilit.addHighlight(begin, end, painter);
        } catch (BadLocationException ex) {
            Logger.getLogger(ExpresionRegularFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(ExpresionRegularFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpresionRegularFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpresionRegularFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpresionRegularFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpresionRegularFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblMatches;
    private javax.swing.JTextField txtRegex;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables

  
}