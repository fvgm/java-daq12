/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.intelligt.modbus.jlibmodbus.exception.ModbusIOException;
import com.intelligt.modbus.jlibmodbus.serial.SerialPortException;
import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.ModbusServer;
import util.PropertiesManager;
import util.WindowManager;

/**
 *
 * @author fernando_2
 */
public class Main extends javax.swing.JFrame {
    WindowManager windowManager;         // gerenciador de janelas
    public static PropertiesManager propsManager;
    
    ModbusServer modbusServer;
    Timer timer;
    TimerTask tarefa;
    final long segundos = (1 * 1000);
    String serialPort;
    
    
     /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH); // iniciar maximizado
        
        windowManager = new WindowManager(jDesktopPane1);
        
        // carrega os arquivo de configurações config.properties        
        try {
            propsManager = new PropertiesManager("config.properties");
            serialPort = propsManager.getProperty("props.serialPort");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao abrir o arquivo de configurações.");
        }
        
        if (serialPort.equals("")) {
            JOptionPane.showMessageDialog(null, "Porta serial não configurada.");
        }
        
 
        modbusServer = new ModbusServer(serialPort);
        
        try {
            modbusServer.connect();
            System.out.println("não gerou exceção!");
        } catch (SerialPortException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao abrir " + serialPort);
        } catch (ModbusIOException ex) {
            JOptionPane.showMessageDialog(null, "Falha: " + ex.getMessage());
        } 
          
        timer = new Timer();

            tarefa = new TimerTask() {
                @Override
                public void run() {
                    try { 
                        modbusServer.debug();
                        modbusServer.update();
                        System.out.println("Temp: " + modbusServer.getTemp());
                    } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null, "Falha timerTask: " + ex.getMessage());
                    }
                }
            };
        timer.scheduleAtFixedRate(tarefa, 0, segundos);
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
        jMenuItemLogotipo = new javax.swing.JMenuItem();
        jMenuItemRespTecnico = new javax.swing.JMenuItem();
        jMenuItemTecnicoExec = new javax.swing.JMenuItem();
        jMenuItemPOP = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuConfig = new javax.swing.JMenu();
        jMenuItemConfigComm = new javax.swing.JMenuItem();
        jMenuItemConfigGeral = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemConfigDebug = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemManual = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DAQ12");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

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
        jMenuItemNovaQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovaQActionPerformed(evt);
            }
        });
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

        jMenuItemLogotipo.setText("Logotipo");
        jMenuCadastro.add(jMenuItemLogotipo);

        jMenuItemRespTecnico.setText("Responsável Técnico");
        jMenuCadastro.add(jMenuItemRespTecnico);

        jMenuItemTecnicoExec.setText("Técnico Executante");
        jMenuCadastro.add(jMenuItemTecnicoExec);

        jMenuItemPOP.setText("Procedimentos (POPs)");
        jMenuCadastro.add(jMenuItemPOP);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorio.setText("Relatório");
        jMenuBar1.add(jMenuRelatorio);

        jMenuConfig.setText("Configurações");

        jMenuItemConfigComm.setText("Comunicação");
        jMenuItemConfigComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigCommActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItemConfigComm);

        jMenuItemConfigGeral.setText("Geral");
        jMenuItemConfigGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigGeralActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItemConfigGeral);
        jMenuConfig.add(jSeparator3);

        jMenuItemConfigDebug.setText("Debug");
        jMenuItemConfigDebug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigDebugActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMenuItemConfigDebug);

        jMenuBar1.add(jMenuConfig);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
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
        if (promptBeforeExiting() == true) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        windowManager.openWindow(JInternalFrameCliente.getInstance());
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemNovaQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovaQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemNovaQActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (promptBeforeExiting() == true)     {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {       
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
       }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemConfigGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigGeralActionPerformed
       //windowManager.openWindow(JInternalFrameConfigGeral.getInstance());
    }//GEN-LAST:event_jMenuItemConfigGeralActionPerformed

    private void jMenuItemConfigCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigCommActionPerformed
        windowManager.openWindow(JInternalFrameConfigComm.getInstance());
    }//GEN-LAST:event_jMenuItemConfigCommActionPerformed

    private void jMenuItemConfigDebugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigDebugActionPerformed
        windowManager.openWindow(JInternalFrameConfigDebug.getInstance());
        modbusServer.addObserver(JInternalFrameConfigDebug.getInstance());
    }//GEN-LAST:event_jMenuItemConfigDebugActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
    
    private Boolean promptBeforeExiting() {
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
            return true;
        } else {
            return false;
        }    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConfig;
    private javax.swing.JMenuItem jMenuItemAbrirQ;
    private javax.swing.JMenuItem jMenuItemCiclos;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConfigComm;
    private javax.swing.JMenuItem jMenuItemConfigDebug;
    private javax.swing.JMenuItem jMenuItemConfigGeral;
    private javax.swing.JMenuItem jMenuItemEquipamento;
    private javax.swing.JMenuItem jMenuItemLogotipo;
    private javax.swing.JMenuItem jMenuItemManual;
    private javax.swing.JMenuItem jMenuItemNovaQ;
    private javax.swing.JMenuItem jMenuItemPOP;
    private javax.swing.JMenuItem jMenuItemRespTecnico;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemTecnicoExec;
    private javax.swing.JMenu jMenuQualificacao;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
