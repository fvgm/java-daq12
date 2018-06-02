/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import util.WindowManager;

/**
 *
 * @author fernando_2
 */
public class Main extends javax.swing.JFrame {
    WindowManager windowManager; // gerenciador de janelas

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        windowManager = new WindowManager(jDesktopPane1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuQualificacao = new javax.swing.JMenu();
        jMenuItemNovaQ = new javax.swing.JMenuItem();
        jMenuItemAbrirQ = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemEquipamento = new javax.swing.JMenuItem();
        jMenuItemCiclos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemTecnicoExec = new javax.swing.JMenuItem();
        jMenuItemRespTecnico = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuInstrumentos = new javax.swing.JMenu();
        jMenuItemConfig = new javax.swing.JMenuItem();
        jMenuItemVis = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemManual = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DAQ12");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(3);
        jScrollPane1.setViewportView(jTextArea1);

        jMenuQualificacao.setText("Qualificação");

        jMenuItemNovaQ.setText("Nova Qualificação");
        jMenuQualificacao.add(jMenuItemNovaQ);

        jMenuItemAbrirQ.setText("Abrir Qualificação");
        jMenuQualificacao.add(jMenuItemAbrirQ);
        jMenuQualificacao.add(jSeparator1);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuQualificacao.add(jMenuItemSair);

        jMenuBar1.add(jMenuQualificacao);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemEquipamento.setText("Equipamento");
        jMenuCadastro.add(jMenuItemEquipamento);

        jMenuItemCiclos.setText("Ciclos");
        jMenuCadastro.add(jMenuItemCiclos);
        jMenuCadastro.add(jSeparator2);

        jMenuItemTecnicoExec.setText("Técnico Executante");
        jMenuCadastro.add(jMenuItemTecnicoExec);

        jMenuItemRespTecnico.setText("Responsável Técnico");
        jMenuCadastro.add(jMenuItemRespTecnico);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorio.setText("Relatório");
        jMenuBar1.add(jMenuRelatorio);

        jMenuInstrumentos.setText("Instrumentos");

        jMenuItemConfig.setText("Configurar");
        jMenuInstrumentos.add(jMenuItemConfig);

        jMenuItemVis.setText("Visualização");
        jMenuInstrumentos.add(jMenuItemVis);

        jMenuBar1.add(jMenuInstrumentos);

        jMenuAjuda.setText("Ajuda");

        jMenuItemManual.setText("Manual de Usuário");
        jMenuAjuda.add(jMenuItemManual);

        jMenuItemSobre.setText("Sobre...");
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        String[] options = {"Sim", "Não"};
        
        int i = JOptionPane.showOptionDialog(null,
                "Deseja mesmo sair?", 
                "Confirmação", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[1]);
        
        if (i==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        windowManager.openWindow(JInternalFrameCliente.getInstance());
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuInstrumentos;
    private javax.swing.JMenuItem jMenuItemAbrirQ;
    private javax.swing.JMenuItem jMenuItemCiclos;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConfig;
    private javax.swing.JMenuItem jMenuItemEquipamento;
    private javax.swing.JMenuItem jMenuItemManual;
    private javax.swing.JMenuItem jMenuItemNovaQ;
    private javax.swing.JMenuItem jMenuItemRespTecnico;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemTecnicoExec;
    private javax.swing.JMenuItem jMenuItemVis;
    private javax.swing.JMenu jMenuQualificacao;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
