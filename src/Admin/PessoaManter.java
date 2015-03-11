/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;
import Modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Guilherme
 */
public class PessoaManter extends javax.swing.JFrame {

    private List<Pessoa> Lista;
    private int posição;
    public PessoaManter() {
        initComponents();
        Lista =  new ArrayList<Pessoa>();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Ultimo = new javax.swing.JButton();
        Primeiro = new javax.swing.JButton();
        Proximo = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CaixaCodigo = new javax.swing.JTextField();
        CaixaSexo = new javax.swing.JComboBox();
        CaixaNome = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Cadastrar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        Ultimo.setText("Ultimo");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });

        Primeiro.setText("Primeiro");
        Primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeiroActionPerformed(evt);
            }
        });

        Proximo.setText("Proximo");
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoActionPerformed(evt);
            }
        });

        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Primeiro)
                .addGap(18, 18, 18)
                .addComponent(Proximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Anterior)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(Ultimo))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ultimo)
                    .addComponent(Primeiro)
                    .addComponent(Anterior)
                    .addComponent(Proximo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Sexo:");

        CaixaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaCodigoActionPerformed(evt);
            }
        });

        CaixaSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Feminino", "Outros" }));
        CaixaSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaSexoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Açoes"));

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Cadastrar)
                .addGap(18, 18, 18)
                .addComponent(Excluir)
                .addGap(18, 18, 18)
                .addComponent(Consultar)
                .addGap(18, 18, 18)
                .addComponent(Limpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(Excluir)
                    .addComponent(Consultar)
                    .addComponent(Limpar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaixaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaixaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(CaixaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CaixaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CaixaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CaixaSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaSexoActionPerformed

    private void CaixaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaCodigoActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
            Pessoa item = new Pessoa();
            if (CaixaCodigo.getText().isEmpty() || CaixaNome.getText().isEmpty() || CaixaSexo.getSelectedIndex() == 0){
            
                JOptionPane.showMessageDialog(rootPane, "todos os campos são obrigatorios");}
            
            else if (CaixaCodigo.getText().isEmpty()){
                boolean deu = false;
                try {
                item.setCodigo (Integer.parseInt(CaixaCodigo.getText()));
                deu = true;
                }
                catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "o codigo inserido deve ser numeral");
                deu = false;
                } 
            if (deu == true)
                
            item.setNome(CaixaNome.getText());
            item.setSexo(CaixaSexo.getSelectedItem().toString());
            Lista.add(item);
            
            JOptionPane.showMessageDialog(rootPane, "cadastro feito com sucesso");}
    }//GEN-LAST:event_CadastrarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        
    
    if(CaixaCodigo.getText().isEmpty()==false)
        {
            Lista.remove(posição);
            //limpar
            Limpar();
            posição=0;
        }
    }                                          
    
    private void Limpar()
    {
        CaixaNome.setText("");
        CaixaCodigo.setText("");
        CaixaSexo.setSelectedIndex(0);
        

    }//GEN-LAST:event_ExcluirActionPerformed

    private void PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeiroActionPerformed
       
        if (Lista.size()>0)
            
            posição = 0;
            Pessoa pessoa = Lista.get(0);
            CaixaCodigo.setText(pessoa.getCodigo().toString());
            CaixaNome.setText(pessoa.getNome());
    
            if (pessoa.getSexo().equals("feminino"))
                CaixaSexo.setSelectedIndex(1);
            else 
                CaixaSexo.setSelectedIndex(2);
    }//GEN-LAST:event_PrimeiroActionPerformed

    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
         if (posição <Lista.size())
            
            posição = +1;
            Pessoa pessoa = Lista.get(posição);
            CaixaCodigo.setText(pessoa.getCodigo().toString());
            CaixaNome.setText(pessoa.getNome());
    
            if (pessoa.getSexo().equals("feminino"))
                CaixaSexo.setSelectedIndex(1);
            else 
                CaixaSexo.setSelectedIndex(2);
    }//GEN-LAST:event_ProximoActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
             if (posição != 0)
            
            posição = -1;
            Pessoa pessoa = Lista.get(posição);
            CaixaCodigo.setText(pessoa.getCodigo().toString());
            CaixaNome.setText(pessoa.getNome());
    
            if (pessoa.getSexo().equals("feminino"))
                CaixaSexo.setSelectedIndex(1);
            else 
                CaixaSexo.setSelectedIndex(2);
    }//GEN-LAST:event_AnteriorActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
         if (Lista.size()>0)
            
            posição = Lista.size();
            Pessoa pessoa = Lista.get(posição);
            CaixaCodigo.setText(pessoa.getCodigo().toString());
            CaixaNome.setText(pessoa.getNome());
    
            if (pessoa.getSexo().equals("feminino"))
                CaixaSexo.setSelectedIndex(1);
            else 
                CaixaSexo.setSelectedIndex(2);
    }//GEN-LAST:event_UltimoActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        
        Limpar();
             
    }//GEN-LAST:event_LimparActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        String consultar = JOptionPane.showInputDialog("digite o nome");
        int posiçãoachou = 0;
        boolean encontrou = false;
        if (consultar.isEmpty() == false)
        for (Pessoa pessoa : Lista){
                if (consultar.equals(pessoa.getNome())){
                    CaixaNome.setText(pessoa.getNome());
                    CaixaCodigo.setText(pessoa.getCodigo().toString());
                    if (pessoa.getSexo().equals("feminino"))
                    {
                        CaixaSexo.setSelectedIndex(1);
                    }
                    else 
                    {
                        CaixaSexo.setSelectedIndex(2);
                    }
                posição = posiçãoachou;    
                break;
                        }
        }
            if (encontrou == false)
            
                JOptionPane.showMessageDialog(rootPane,"pessoa não encontrada" );
                    
    }//GEN-LAST:event_ConsultarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            PessoaManter tela = new PessoaManter();
            tela.setVisible(true);
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
            java.util.logging.Logger.getLogger(PessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField CaixaCodigo;
    private javax.swing.JTextField CaixaNome;
    private javax.swing.JComboBox CaixaSexo;
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Primeiro;
    private javax.swing.JButton Proximo;
    private javax.swing.JButton Ultimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
