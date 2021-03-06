package interface2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Leandro
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

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        optFeminino = new javax.swing.JRadioButton();
        optMasculino = new javax.swing.JRadioButton();
        chkSuperior = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFilhos = new javax.swing.JList<>();
        cbxCurso = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 27, 14);

        txtNome.setName("txtNome"); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(90, 40, 130, 30);

        jLabel2.setText("Sexo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 24, 14);

        buttonGroupSexo.add(optFeminino);
        optFeminino.setText("Feminino");
        optFeminino.setName("optFeminino"); // NOI18N
        getContentPane().add(optFeminino);
        optFeminino.setBounds(90, 100, 67, 23);

        buttonGroupSexo.add(optMasculino);
        optMasculino.setText("masculino");
        optMasculino.setName("optMasculino"); // NOI18N
        getContentPane().add(optMasculino);
        optMasculino.setBounds(160, 100, 71, 23);

        chkSuperior.setText("Tem nível superior");
        chkSuperior.setName("chkSuperior"); // NOI18N
        getContentPane().add(chkSuperior);
        chkSuperior.setBounds(60, 160, 120, 23);

        listFilhos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nenhum filho", "1 filho", "2 filhos", "3 filhos", "4 filhos", "5 filhos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listFilhos.setName("listFilhos"); // NOI18N
        jScrollPane1.setViewportView(listFilhos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 250, 230, 80);

        cbxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o curso", "Ciência da Computação", "Sistemas de Informação", "Tecnologia em Análise e Desenvolvimento de Sistemas" }));
        cbxCurso.setName("cbxCurso"); // NOI18N
        getContentPane().add(cbxCurso);
        cbxCurso.setBounds(60, 200, 230, 30);

        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(320, 60, 170, 120);

        jLabel3.setText("Observação");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 40, 110, 14);

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nome", "sexo", "superior", "filhos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblResultado.setName("tblResultado"); // NOI18N
        jScrollPane3.setViewportView(tblResultado);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 360, 460, 90);

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelecionar);
        btnSelecionar.setBounds(410, 230, 90, 23);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(310, 300, 80, 23);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(410, 300, 80, 23);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(320, 233, 63, 20);

        setSize(new java.awt.Dimension(528, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        //tblResultado.getModel().setValueAt("oi", 0, 0);
        //tblResultado.remove(0);
        
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) tblResultado.getModel();
        dtm.removeRow(tblResultado.getSelectedRow());
        tblResultado.setModel(dtm);
        
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        AlunoBean bean = new AlunoBean();
        bean.setNome(txtNome.getText());
        bean.setCurso(chkSuperior.isSelected()?cbxCurso.getSelectedItem().toString():"Não possui curso supeior");
        bean.setFilhos(listFilhos.getSelectedValue());
        bean.setSexo(optFeminino.isSelected()?"Feminino":"Masculino");
        bean.setNivel_superior(chkSuperior.isSelected()?"Tem":"Não tem");
      
        AlunoDAO dao = new AlunoDAO();
        dao.inserir(bean);
        
DefaultTableModel model = (DefaultTableModel) tblResultado.getModel();

String[] linha = {txtNome.getText(),optFeminino.isSelected()?"Feminino":"Masculino",chkSuperior.isSelected()?"Tem":"Não tem", listFilhos.getSelectedValue()};
model.addRow(linha);
tblResultado.setModel(model);


    }//GEN-LAST:event_btnSalvarActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JComboBox<String> cbxCurso;
    private javax.swing.JCheckBox chkSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList<String> listFilhos;
    private javax.swing.JRadioButton optFeminino;
    private javax.swing.JRadioButton optMasculino;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
