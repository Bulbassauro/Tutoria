/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria.Telas;

/**
 *
 * @author gabinete
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelInicio = new javax.swing.JPanel();
        Barra = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        Cadastro = new javax.swing.JMenu();
        CadastroPaciente = new javax.swing.JMenuItem();
        CadastroHipertenso = new javax.swing.JMenuItem();
        CadastroDiabetico = new javax.swing.JMenuItem();
        CadastroGestante = new javax.swing.JMenuItem();
        CadastroMental = new javax.swing.JMenuItem();
        Consolidar = new javax.swing.JMenu();
        Agenda = new javax.swing.JMenu();
        Relatorios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PainelInicioLayout = new javax.swing.GroupLayout(PainelInicio);
        PainelInicio.setLayout(PainelInicioLayout);
        PainelInicioLayout.setHorizontalGroup(
            PainelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        PainelInicioLayout.setVerticalGroup(
            PainelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        Inicio.setText("Inicio");
        Barra.add(Inicio);

        Cadastro.setText("Cadastro");

        CadastroPaciente.setText("Paciente");
        CadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroPacienteActionPerformed(evt);
            }
        });
        Cadastro.add(CadastroPaciente);

        CadastroHipertenso.setText("Hipertenso");
        CadastroHipertenso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroHipertensoActionPerformed(evt);
            }
        });
        Cadastro.add(CadastroHipertenso);

        CadastroDiabetico.setText("Diabetico");
        Cadastro.add(CadastroDiabetico);

        CadastroGestante.setText("Gestante");
        Cadastro.add(CadastroGestante);

        CadastroMental.setText("Saude Mental");
        CadastroMental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroMentalActionPerformed(evt);
            }
        });
        Cadastro.add(CadastroMental);

        Barra.add(Cadastro);

        Consolidar.setText("Consolidar");
        Barra.add(Consolidar);

        Agenda.setText("Agenda");
        Barra.add(Agenda);

        Relatorios.setText("Relatorios");
        Barra.add(Relatorios);

        setJMenuBar(Barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroPacienteActionPerformed
        PainelInicio = new TelaPaciente();
    }//GEN-LAST:event_CadastroPacienteActionPerformed

    private void CadastroHipertensoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroHipertensoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroHipertensoActionPerformed

    private void CadastroMentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroMentalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroMentalActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agenda;
    private javax.swing.JMenuBar Barra;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem CadastroDiabetico;
    private javax.swing.JMenuItem CadastroGestante;
    private javax.swing.JMenuItem CadastroHipertenso;
    private javax.swing.JMenuItem CadastroMental;
    private javax.swing.JMenuItem CadastroPaciente;
    private javax.swing.JMenu Consolidar;
    private javax.swing.JMenu Inicio;
    private javax.swing.JPanel PainelInicio;
    private javax.swing.JMenu Relatorios;
    // End of variables declaration//GEN-END:variables
}
