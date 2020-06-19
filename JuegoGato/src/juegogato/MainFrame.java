package juegogato;

import Paneles.PanelIndividual;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Adrian
 */
public class MainFrame extends JFrame {
 PanelIndividual pi;
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null); 
        pi = new PanelIndividual();
        insertarPanel(pi);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jugar Gato");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void insertarPanel(JPanel panel){
        this.getContentPane().add(panel);
        panel.setSize(676, 500);
        this.setVisible(true);
        this.repaint();
    }
    /*
    public void removerPanel(JPanel panel){
        this.remove(panel);
        this.repaint();
    }*/

}
