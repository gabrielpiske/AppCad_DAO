/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */


import dao.ProdutoDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author Professor
 */
public class FormProduto extends javax.swing.JInternalFrame {
    
    // Variavéis de Controle (FLAGS)
    public static boolean editPro = false;

    /**
     * Creates new form FormProduto
     */
    public FormProduto() {
        initComponents();
        loadProd();
        desativarCamposPro();
    }
    
    public boolean isAnyFilledPro() {
        boolean response = !jTfDescriPro.getText().isBlank()
                && !jTfPrecoPro.getText().isBlank() && !jTfUniPro.getText().isBlank()
                && !jTfQtdPro.getText().isBlank();
        return (response);
    }
    
    public void ativarCamposPro() {
        jTfCodPro.setEnabled(true);
        jTfPrecoPro.setEnabled(true);
        jTfUniPro.setEnabled(true);
        jTfDescriPro.setEnabled(true);
        jTfQtdPro.setEnabled(true);
    }

    public void desativarCamposPro() {
        jTfCodPro.setEnabled(false);
        jTfCodPro.setText("");
        jTfPrecoPro.setEnabled(false);
        jTfPrecoPro.setText("");
        jTfUniPro.setEnabled(false);
        jTfUniPro.setText("");
        jTfDescriPro.setEnabled(false);
        jTfDescriPro.setText("");
        jTfQtdPro.setEnabled(false);
        jTfQtdPro.setText("");

        jBtnSalvarPro.setEnabled(false);
        jBtnCancelarPro.setEnabled(false);
        jBtnExcluiPro.setEnabled(false);
        jBtnEditarPro.setEnabled(false);
    }
    
    ProdutoDaoImpl produtoImpl = new ProdutoDaoImpl();
    
    public void loadProd(){
        DefaultTableModel defaultPro = new DefaultTableModel(new Object[]{
            "Código",
            "Preço",
            "Unidade",
            "Quantidade",
            "Descrição"
        }, 0);
        List<Produto> produtos = produtoImpl.getAllProdutos();
        for (Produto produto : produtos) {
            Object linha[] = new Object[] {
                produto.getCod(),
                produto.getPreco(),
                produto.getUnit(),
                produto.getQtd(),
                produto.getDesc(),
            };
            defaultPro.addRow(linha);
        }
        jTblPro.setModel(defaultPro);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTfQtdPro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTfDescriPro = new javax.swing.JTextField();
        jBtnExcluiPro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtnNovoPro = new javax.swing.JButton();
        jTfCodPro = new javax.swing.JTextField();
        jBtnEditarPro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnSalvarPro = new javax.swing.JButton();
        jTfPrecoPro = new javax.swing.JTextField();
        jBtnCancelarPro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblPro = new javax.swing.JTable();
        jTfUniPro = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel4.setText("Quantidade:");

        jTfQtdPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfQtdProKeyReleased(evt);
            }
        });

        jLabel5.setText("Descrição:");

        jTfDescriPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfDescriProKeyReleased(evt);
            }
        });

        jBtnExcluiPro.setText("Excluir");
        jBtnExcluiPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluiProActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jBtnNovoPro.setText("Novo");
        jBtnNovoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoProActionPerformed(evt);
            }
        });

        jTfCodPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfCodProKeyReleased(evt);
            }
        });

        jBtnEditarPro.setText("Editar");
        jBtnEditarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarProActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço:");

        jBtnSalvarPro.setText("Salvar");
        jBtnSalvarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarProActionPerformed(evt);
            }
        });

        jTfPrecoPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfPrecoProKeyReleased(evt);
            }
        });

        jBtnCancelarPro.setText("Cancelar");
        jBtnCancelarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarProActionPerformed(evt);
            }
        });

        jLabel3.setText("Unidade:");

        jTblPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Preço", "Unidade", "Quantidade", "Descrição"
            }
        ));
        jTblPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblProMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTblPro);

        jTfUniPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfUniProKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTfDescriPro, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jTfQtdPro)
                    .addComponent(jTfUniPro)
                    .addComponent(jTfPrecoPro)
                    .addComponent(jTfCodPro))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jBtnNovoPro)
                .addGap(70, 70, 70)
                .addComponent(jBtnEditarPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jBtnExcluiPro)
                .addGap(63, 63, 63)
                .addComponent(jBtnCancelarPro)
                .addGap(61, 61, 61)
                .addComponent(jBtnSalvarPro)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTfCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfPrecoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfUniPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfQtdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfDescriPro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnExcluiPro)
                    .addComponent(jBtnNovoPro)
                    .addComponent(jBtnEditarPro)
                    .addComponent(jBtnSalvarPro)
                    .addComponent(jBtnCancelarPro))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>                        
    
    
    //Ações dos Botões
    private void jBtnNovoProActionPerformed(java.awt.event.ActionEvent evt) {                                            
        ativarCamposPro();
        jBtnCancelarPro.setEnabled(true);
        jBtnNovoPro.setEnabled(false);
        jBtnSalvarPro.setEnabled(false);
    }                                           

    private void jBtnEditarProActionPerformed(java.awt.event.ActionEvent evt) {                                              
        ativarCamposPro();
        editPro = true;
        jBtnSalvarPro.setEnabled(true);
        loadProd();
    }                                             

    private void jBtnExcluiProActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int opt = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente excluir este registro?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            produtoImpl.deleteProduto(Integer.parseInt(jTfCodPro.getText()));
            loadProd();
            desativarCamposPro();
            jBtnNovoPro.setEnabled(true);
        }
    }                                             

    private void jBtnCancelarProActionPerformed(java.awt.event.ActionEvent evt) {                                                
        desativarCamposPro();

        jBtnCancelarPro.setEnabled(false);
        jBtnNovoPro.setEnabled(true);
        jBtnSalvarPro.setEnabled(false);
    }                                               

    private void jBtnSalvarProActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int cod = Integer.parseInt(jTfCodPro.getText());
        String descricao = jTfDescriPro.getText();
        String unidade = jTfUniPro.getText();
        float quantidade = Float.parseFloat(jTfQtdPro.getText());
        float preco = Float.parseFloat(jTfPrecoPro.getText());
        int a = JOptionPane.showConfirmDialog(null,
                "Deseja realmente salvar?\n\n"
                + "Código: " + cod
                + "\nDescricao: " + descricao
                + "\nUnidade: " + unidade
                + "\nQuantidade: " + quantidade
                + "\nPreço: " + preco,
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            Produto produto = new Produto(cod, descricao, unidade, quantidade, preco);

            if (editPro) {
                produtoImpl.updateProduto(produto);
                editPro = false;
            } else {
                produtoImpl.addProduto(produto);
            }
            
            loadProd();

            desativarCamposPro();

            jBtnCancelarPro.setEnabled(false);
            jBtnNovoPro.setEnabled(true);
            jBtnSalvarPro.setEnabled(false);
        }
    }                                             

    
    
    // Tecla pressionada
    private void jTfCodProKeyReleased(java.awt.event.KeyEvent evt) {                                      
        jBtnSalvarPro.setEnabled(isAnyFilledPro());
    }                                     

    private void jTfPrecoProKeyReleased(java.awt.event.KeyEvent evt) {                                        
        jBtnSalvarPro.setEnabled(isAnyFilledPro());
    }                                       

    private void jTfUniProKeyReleased(java.awt.event.KeyEvent evt) {                                      
        jBtnSalvarPro.setEnabled(isAnyFilledPro());
    }                                     

    private void jTfQtdProKeyReleased(java.awt.event.KeyEvent evt) {                                      
        jBtnSalvarPro.setEnabled(isAnyFilledPro());
    }                                     

    private void jTfDescriProKeyReleased(java.awt.event.KeyEvent evt) {                                         
        jBtnSalvarPro.setEnabled(isAnyFilledPro());
    }                                        

    
    // Mouse
    private void jTblProMouseClicked(java.awt.event.MouseEvent evt) {                                     
        int selectedRow = jTblPro.getSelectedRow();
        jBtnExcluiPro.setEnabled(true);
        jBtnEditarPro.setEnabled(true);
        if (jTblPro.getSelectedRow() != -1) {

            jTfCodPro.setText(jTblPro.getValueAt(selectedRow, 0).toString());
            jTfPrecoPro.setText(jTblPro.getValueAt(selectedRow, 1).toString());
            jTfUniPro.setText(jTblPro.getValueAt(selectedRow, 2).toString());
            jTfQtdPro.setText(jTblPro.getValueAt(selectedRow, 3).toString());
            jTfDescriPro.setText(jTblPro.getValueAt(selectedRow, 4).toString());
        }
    }                                    


    // Variables declaration - do not modify                     
    private javax.swing.JButton jBtnCancelarPro;
    private javax.swing.JButton jBtnEditarPro;
    private javax.swing.JButton jBtnExcluiPro;
    private javax.swing.JButton jBtnNovoPro;
    private javax.swing.JButton jBtnSalvarPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblPro;
    private javax.swing.JTextField jTfCodPro;
    private javax.swing.JTextField jTfDescriPro;
    private javax.swing.JTextField jTfPrecoPro;
    private javax.swing.JTextField jTfQtdPro;
    private javax.swing.JTextField jTfUniPro;
    // End of variables declaration                   
}
