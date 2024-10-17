/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.telas;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Tacio
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuUsuario = new javax.swing.JMenu();
        MenuUsuarioMeu = new javax.swing.JCheckBoxMenuItem();
        MenuUsuarioCad = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        MenuProdutos = new javax.swing.JMenu();
        MenuPedidos = new javax.swing.JMenu();
        MenuPedidosFazer = new javax.swing.JMenuItem();
        MenuPedidosHis = new javax.swing.JMenuItem();
        MenuOpcoes = new javax.swing.JMenu();
        MenuOpcoesSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mother's House Store - Tela Inicial");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/LogoLoja.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário");

        MenuUsuario.setText("Usuário");

        MenuUsuarioMeu.setSelected(true);
        MenuUsuarioMeu.setText("Meu usuário");
        MenuUsuarioMeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuarioMeuActionPerformed(evt);
            }
        });
        MenuUsuario.add(MenuUsuarioMeu);

        MenuUsuarioCad.setText("Cadastrar");
        MenuUsuarioCad.setEnabled(false);
        MenuUsuarioCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuarioCadActionPerformed(evt);
            }
        });
        MenuUsuario.add(MenuUsuarioCad);

        Menu.add(MenuUsuario);

        MenuClientes.setText("Clientes");
        Menu.add(MenuClientes);

        MenuProdutos.setText("Produtos");
        Menu.add(MenuProdutos);

        MenuPedidos.setText("Pedidos");

        MenuPedidosFazer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuPedidosFazer.setText("Fazer Pedido");
        MenuPedidos.add(MenuPedidosFazer);

        MenuPedidosHis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuPedidosHis.setText("Historico");
        MenuPedidos.add(MenuPedidosHis);

        Menu.add(MenuPedidos);

        MenuOpcoes.setText("Opções");

        MenuOpcoesSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuOpcoesSair.setText("Sair");
        MenuOpcoesSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpcoesSairActionPerformed(evt);
            }
        });
        MenuOpcoes.add(MenuOpcoesSair);

        Menu.add(MenuOpcoes);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblUsuario))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(820, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuUsuarioCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuarioCadActionPerformed
        // as linhas abaixo abrem o form de cadastro do usuario dentro do painel desktop
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        Desktop.add(usuario);
    }//GEN-LAST:event_MenuUsuarioCadActionPerformed

    private void MenuUsuarioMeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuarioMeuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuUsuarioMeuActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void MenuOpcoesSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpcoesSairActionPerformed
        // exibe uma caixa de dialogo para sair do programa
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_MenuOpcoesSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuOpcoes;
    private javax.swing.JMenuItem MenuOpcoesSair;
    private javax.swing.JMenu MenuPedidos;
    private javax.swing.JMenuItem MenuPedidosFazer;
    private javax.swing.JMenuItem MenuPedidosHis;
    private javax.swing.JMenu MenuProdutos;
    private javax.swing.JMenu MenuUsuario;
    public static javax.swing.JMenuItem MenuUsuarioCad;
    private javax.swing.JCheckBoxMenuItem MenuUsuarioMeu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
