package Projeto_Surpresa;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Tela_howard extends javax.swing.JFrame {

    int posicao;
    List<Roupas> lista;
    
    public Tela_howard() {
        initComponents();
        lista = new ArrayList<Roupas>();
        posicao = 0;
        Roupas r = lista.get(posicao);

    }
    void limpar(){
        txt_cor.setText("");
        txt_descrição.setText("");
        txt_tipo.setText("");    
        box_preferida.setAction(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Botão_Primeiro = new javax.swing.JButton();
        Botão_Proximo = new javax.swing.JButton();
        Botão_Anterior = new javax.swing.JButton();
        Botão_ultimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_cor = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descrição = new javax.swing.JTextArea();
        box_preferida = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Botao_cadastrar = new javax.swing.JButton();
        botão_limpar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Botão_consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Botão_Primeiro.setText("Primeiro");
        Botão_Primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_PrimeiroActionPerformed(evt);
            }
        });

        Botão_Proximo.setText("Proximo");
        Botão_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_ProximoActionPerformed(evt);
            }
        });

        Botão_Anterior.setText("Anterior");
        Botão_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_AnteriorActionPerformed(evt);
            }
        });

        Botão_ultimo.setText("Ultimo");
        Botão_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_ultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Botão_Primeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(Botão_Proximo)
                .addGap(54, 54, 54)
                .addComponent(Botão_Anterior)
                .addGap(54, 54, 54)
                .addComponent(Botão_ultimo)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botão_Primeiro)
                    .addComponent(Botão_ultimo)
                    .addComponent(Botão_Anterior)
                    .addComponent(Botão_Proximo))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("LilyUPC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Tela Howard de Roupas");

        txt_cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_corActionPerformed(evt);
            }
        });

        txt_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipoActionPerformed(evt);
            }
        });

        txt_descrição.setColumns(20);
        txt_descrição.setRows(5);
        jScrollPane1.setViewportView(txt_descrição);

        box_preferida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selecione", "Sim", "Não;" }));

        jLabel2.setText("Cor:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Descrição:");

        jLabel5.setText("Preferida:");

        Botao_cadastrar.setText("Cadastrar");
        Botao_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_cadastrarActionPerformed(evt);
            }
        });

        botão_limpar.setText("Limpar");
        botão_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão_limparActionPerformed(evt);
            }
        });

        jButton7.setText("Excluir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Botão_consultar.setText("Consultar");
        Botão_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(Botao_cadastrar)
                            .addGap(74, 74, 74)
                            .addComponent(botão_limpar)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_cor, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Botão_consultar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(box_preferida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 178, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(box_preferida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_cadastrar)
                    .addComponent(botão_limpar)
                    .addComponent(jButton7)
                    .addComponent(Botão_consultar))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipoActionPerformed

    private void Botão_PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão_PrimeiroActionPerformed
        if(lista.size()>0){
        
            posicao = 0;
        
            Roupas r = lista.get(0);
            
            box_preferida.setEditable(r.isFavorita());
            txt_descrição.setText(r.getDescricao());
            txt_cor.setText(r.getCor());
            txt_tipo.setText(r.getTipo());
        }  
    }//GEN-LAST:event_Botão_PrimeiroActionPerformed

    private void Botão_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão_ProximoActionPerformed
        
            if(posicao != lista.size() - 1){
        
            posicao = posicao + 1;
            
            Roupas r = lista.get(posicao);
            box_preferida.setEditable(r.isFavorita());
            txt_descrição.setText(r.getDescricao());
            txt_cor.setText(r.getCor());
            txt_tipo.setText(r.getTipo());
            }       
    }//GEN-LAST:event_Botão_ProximoActionPerformed

    private void Botão_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão_AnteriorActionPerformed
        
        if(posicao != 0){
        
            posicao = -1;
            Roupas r = lista.get(posicao);
            box_preferida.setEditable(r.isFavorita());
            txt_descrição.setText(r.getDescricao());
            txt_cor.setText(r.getCor());
            txt_tipo.setText(r.getTipo());
        }
        
    }//GEN-LAST:event_Botão_AnteriorActionPerformed

    private void Botão_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão_ultimoActionPerformed

        if(posicao != lista.size()){
        
            posicao = lista.size() - 1;
            Roupas r = lista.get(posicao);
            box_preferida.setEditable(r.isFavorita());
            txt_descrição.setText(r.getDescricao());
            txt_cor.setText(r.getCor());
            txt_tipo.setText(r.getTipo());
        }
    }//GEN-LAST:event_Botão_ultimoActionPerformed

    private void Botao_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_cadastrarActionPerformed

        posicao = +1;
        
        Roupas r = new Roupas();
        box_preferida.setEditable(r.isFavorita());
        txt_descrição.setText(r.getDescricao());
        txt_cor.setText(r.getCor());
        txt_tipo.setText(r.getTipo());
        
        lista.add(r);
        limpar();
        
    }//GEN-LAST:event_Botao_cadastrarActionPerformed

    private void botão_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão_limparActionPerformed
        limpar();
    }//GEN-LAST:event_botão_limparActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        lista.remove(lista.get(posicao));
        limpar();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void Botão_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão_consultarActionPerformed
        
        String descricao = JOptionPane.showInputDialog("de a descrição da roupa a ser encontrada");
        
        Boolean encontrou = null;
        
        for (Roupas Roupas : lista) {
            if(descricao.equals(Roupas.getDescricao())){
                encontrou = true;
                    box_preferida.setEditable(Roupas.isFavorita());
        
                    txt_descrição.setText(Roupas.getDescricao());
        
                    txt_cor.setText(Roupas.getCor());
        
                    txt_tipo.setText(Roupas.getTipo());
                
            }
        }
            
        if(encontrou == true){
            JOptionPane.showMessageDialog(null, "encontrou!");
            
                    Roupas r = lista.get(posicao);
                    box_preferida.setEditable(r.isFavorita());
                    txt_descrição.setText(r.getDescricao());
                    txt_cor.setText(r.getCor());
                    txt_tipo.setText(r.getTipo());
        }
        else{
            JOptionPane.showMessageDialog(null," Roupa não encontrada!");
            
                    Roupas r = lista.get(posicao);
                    box_preferida.setEditable(r.isFavorita());
                    txt_descrição.setText(r.getDescricao());
                    txt_cor.setText(r.getCor());
                    txt_tipo.setText(r.getTipo());
        
        }
    }//GEN-LAST:event_Botão_consultarActionPerformed

    private void txt_corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_corActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_corActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_howard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_howard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_howard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_howard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_howard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_cadastrar;
    private javax.swing.JButton Botão_Anterior;
    private javax.swing.JButton Botão_Primeiro;
    private javax.swing.JButton Botão_Proximo;
    private javax.swing.JButton Botão_consultar;
    private javax.swing.JButton Botão_ultimo;
    private javax.swing.JButton botão_limpar;
    private javax.swing.JComboBox box_preferida;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_cor;
    private javax.swing.JTextArea txt_descrição;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
