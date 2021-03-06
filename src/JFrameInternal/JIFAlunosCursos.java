/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package JFrameInternal;

import Conectar.bean.AlunosBean;
import Conectar.bean.AlunosCursosBean;
import Conectar.bean.CursosBean;
import Conectar.conecta;
import CrudBanco.CrudAluno;
import CrudBanco.CrudAlunosCursos;
import CrudBanco.CrudCurso;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Welington
 */
public class JIFAlunosCursos extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFAlunosCursos
     */
    public JIFAlunosCursos() {
       
        initComponents();
        
        // pesquisar
        Connection con = conecta.abrirConexao();
        CrudCurso cursoCrud = new CrudCurso(con);
        //cria uma list de ProdutosBean
        List<CursosBean> listaCursos = new ArrayList<CursosBean>();
        String where = "";
        
        //atribui os valores a lista 
        listaCursos = cursoCrud.listar(where);
     
        jComboBox1.removeAllItems();
        if(listaCursos != null){
            
            int i = 0;
            for(CursosBean cb : listaCursos){
                jComboBox1.addItem(cb.getDescricao());
                i++;
            }
        }
       
        
        CrudAluno AlunoCrud = new CrudAluno(con);
        //cria uma list de ProdutosBean
        List<AlunosBean> listaAlunos = new ArrayList<AlunosBean>();
        where = "";
        
        //atribui os valores a lista 
        listaAlunos = AlunoCrud.listar(where);
       
        jComboBox2.removeAllItems();
        if(listaAlunos != null){  
            int i = 0;
            for(AlunosBean cb : listaAlunos){
                jComboBox2.addItem(cb.getNome());
                i++;
            }
        }
        conecta.fecharConexao(con);

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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btInserir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbresultado1 = new javax.swing.JTable();
        lbMessagem = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.gray));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Curso");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("C??digo ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 152, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, 152, Short.MAX_VALUE)
                    .addComponent(tfCodigo))
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.gray));

        btInserir.setText("Inserir");
        btInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btInserirMouseClicked(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirMouseClicked(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarMouseClicked(evt);
            }
        });

        jButton5.setText("Limpar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Fechar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btExcluir)
                    .addComponent(btPesquisar)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        tbresultado1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Nome", "Cursos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbresultado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbresultado1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbresultado1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbMessagem, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMessagem, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInserirMouseClicked
        // Abrndo Conex??o
        Connection con = conecta.abrirConexao();

        AlunosCursosBean AlunosCBean = new AlunosCursosBean();
        CrudAlunosCursos AlunosCCrud = new CrudAlunosCursos(con);
        
        List<AlunosBean> ListaAluno = new ArrayList<AlunosBean>();
        CrudAluno AlunosCrud = new CrudAluno(con);
        
        ListaAluno = AlunosCrud.listar("nome like '%"+jComboBox2.getName()+"%'");
        
        List<CursosBean> listaCursos = new ArrayList<CursosBean>();
        CrudCurso CursoCrud = new CrudCurso(con);
        
        listaCursos = CursoCrud.listar("Descricao like '%"+jComboBox1.getName()+"%'");
        
        AlunosCBean.setCodigo(Integer.parseInt(tfCodigo.getText()));
        AlunosCBean.setAluno_codigo(ListaAluno.get(0).getCodigo());
        AlunosCBean.setCurso_codigo(listaCursos.get(0).getCodigo());

        lbMessagem.setText(AlunosCCrud.inserir(AlunosCBean));

        conecta.fecharConexao(con);
        chamadaPesquisa();
    }//GEN-LAST:event_btInserirMouseClicked

    
    private void chamadaPesquisa(){
         // pesquisar
        Connection con = conecta.abrirConexao();
        CrudAlunosCursos AlunosCCrud = new CrudAlunosCursos(con);
        //cria uma list de ProdutosBean
        List<AlunosCursosBean> listaAlunosC = new ArrayList<AlunosCursosBean>();
        String where = "";
        
        
        //atribui os valores a lista 
        listaAlunosC = AlunosCCrud.listar(where);
        //instancia o table model 
        if(listaAlunosC != null){
            
            DefaultTableModel tbm = (DefaultTableModel)tbresultado1.getModel();

            for(int i = tbm.getRowCount()-1;i>=0;i--){
                tbm.removeRow(i);
            }
            int i = 0;
            for(AlunosCursosBean cb : listaAlunosC){
                tbm.addRow(new String[1]);
                tbresultado1.setValueAt(cb.getCodigo(), i, 0);
                tbresultado1.setValueAt(cb.getAluno_codigo(), i, 1);
                tbresultado1.setValueAt(cb.getCurso_codigo(), i, 2);
          
                i++;
            }
        }
        conecta.fecharConexao(con);
    }
    
    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        // Excluir Registro
        Connection con = conecta.abrirConexao();
        AlunosCursosBean AlunoCBean = new AlunosCursosBean();
        CrudAlunosCursos AlunoCCrud = new CrudAlunosCursos(con);

        AlunoCBean.setCodigo(Integer.parseInt(tfCodigo.getText()));
        
        Object[] opcoes ={"Sim","N??o"};

        int i = JOptionPane.showOptionDialog(this, "Deseja excluir este registro: "+tfCodigo.getText()+"?", "Exclus??o", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if(i == JOptionPane.YES_NO_OPTION){
            lbMessagem.setText(AlunoCCrud.excluir(AlunoCBean));

        }
        conecta.fecharConexao(con);
        chamadaPesquisa();
    }//GEN-LAST:event_btExcluirMouseClicked

    private void btPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarMouseClicked
        chamadaPesquisa();
    }//GEN-LAST:event_btPesquisarMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // Limpa a tela
       // tfCodigo.setText("");
       // tfDescricao.setText("");
        lbMessagem.setText("");

        //limpa a tabela
        DefaultTableModel tbm = (DefaultTableModel)tbresultado1.getModel();

        for(int i = tbm.getRowCount()-1;i >=0;i--){
            tbm.removeRow(i);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Torna o internal frame invisivel
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tbresultado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbresultado1MouseClicked
        // Recebe a referencia do index da tabela selecionado
        Integer linha = tbresultado1.getSelectedRow();

        int codigo = (int) tbresultado1.getValueAt(linha, 0);
        String descricao = (String) tbresultado1.getValueAt(linha, 1);
        String Ementa = (String) tbresultado1.getValueAt(linha, 2);

       // tfCodigo.setText(String.valueOf(codigo));
       // tfDescricao.setText(descricao);

    }//GEN-LAST:event_tbresultado1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbMessagem;
    private javax.swing.JTable tbresultado1;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables
}
