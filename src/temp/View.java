package temp;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JRadioButton;

public class View extends javax.swing.JFrame {
    public View() {
        initComponents();
        init();
    }
    
    private Contact contact = new Contact();
    
    private void init(){
        this.setTitle("出题!");
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        Image i = tk.getImage(DBUtils.getTopoc());
        
        this.setIconImage(i);
        
        //获取屏幕的宽高
        Dimension d = tk.getScreenSize();
        
        double screenWidth = d.getWidth();
        double screenHeight = d.getHeight();
        
        int frameWidth = this.getWidth();
        int frameHeight = this.getHeight();
        
        int width = (int)(screenWidth-frameWidth)/2;
        int height =(int)(screenHeight-frameHeight)/2;
        
        this.setLocation(width,height);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        add = new javax.swing.JRadioButton();
        sub = new javax.swing.JRadioButton();
        mul = new javax.swing.JRadioButton();
        div = new javax.swing.JRadioButton();
        dec = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        bra = new javax.swing.JRadioButton();
        t1 = new java.awt.TextField();
        tijiao = new javax.swing.JButton();
        t2 = new java.awt.TextField();
        printnum = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("请输入题目是否需要加法");

        jLabel2.setText("请输入题目是否需要减法");

        jLabel3.setText("请输入题目是否需要乘法");

        jLabel4.setText("请输入题目是否需要除法");

        jLabel5.setText("请输入题目是否包含小数");

        jLabel6.setText("请输入题目的最大值");

        jLabel7.setText("请输入题目数量");

        jLabel8.setText("请选择题目输出方式");

        add.setText("是/否");
        add.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                addItemStateChanged(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        sub.setText("是/否");
        sub.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subItemStateChanged(evt);
            }
        });
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        mul.setText("是/否");
        mul.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mulItemStateChanged(evt);
            }
        });
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        div.setText("是/否");
        div.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                divItemStateChanged(evt);
            }
        });
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        dec.setText("是/否");
        dec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                decItemStateChanged(evt);
            }
        });

        jLabel9.setText("请输入题目是否需要括号");

        bra.setText("是/否");
        bra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                braItemStateChanged(evt);
            }
        });
        bra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                braActionPerformed(evt);
            }
        });

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });

        tijiao.setText("提交");
        tijiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijiaoActionPerformed(evt);
            }
        });

        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });

        printnum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "打印机", "屏幕", "文件" }));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bra)
                            .addComponent(add)
                            .addComponent(sub)
                            .addComponent(mul)
                            .addComponent(dec)
                            .addComponent(div)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tijiao)
                                .addGap(156, 156, 156))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(printnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mul)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(div))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(bra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(printnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(tijiao)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>                        

    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void divActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void braActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void subActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void tijiaoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Integer i1  = Integer.parseInt(this.t1.getText());
        contact.setMaxRule(i1);
        
        Integer i2 = Integer.parseInt(this.t2.getText());
        contact.setNumRule(i2);
        
        String symbol = this.printnum.getSelectedItem().toString();
        
        if(symbol == "打印机")contact.setOutRule(1);
        else if(symbol == "屏幕")contact.setOutRule(2);
        else contact.setOutRule(3);
        
        Topic topic =new Topic(contact);
        
        List<String>question = topic.UseMethod();
        
        Verify verify = new Verify(question,contact);
        List<Float>answer = verify.UseClazz();
        
        if(contact.getOutRule() ==1){
        	PrintOpera po = new PrintOpera();
    		DBUtils.setAnswer(answer);
    		DBUtils.setQuestion(question);
    		po.write();
    		System.exit(0);
        }else if(contact.getOutRule()==2){
        	ViewContent view = new ViewContent(question,contact.getNumRule());
    		view.start();
        }else {
        	FileOpera fo = new FileOpera(question,answer);
    		fo.write();
    		System.exit(0);
        }
        
        this.setVisible(false);
        //System.exit(0);
        
    }                                      

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {                              
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(!(ch>='0'&&ch<='9'||ch=='.'))
	evt.consume();
    }                             

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {                              
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(!(ch>='0'&&ch<='9'||ch=='.'))
	evt.consume();
    }                             

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void addItemStateChanged(java.awt.event.ItemEvent evt) {                                     
        // TODO add your handling code here:
        JRadioButton jrb =(JRadioButton)evt.getItem();
        
        if(jrb.isSelected()){
            contact.setAddRule(true);
        }else{
            contact.setAddRule(false);
        }
        
    }                                    

    private void subItemStateChanged(java.awt.event.ItemEvent evt) {                                     
        JRadioButton jrb =(JRadioButton)evt.getItem();
        
        if(jrb.isSelected()){
            contact.setSubRule(true);
        }else{
            contact.setSubRule(false);
        }
    }                                    

    private void mulItemStateChanged(java.awt.event.ItemEvent evt) {                                     
        JRadioButton jrb =(JRadioButton)evt.getItem();
        
        if(jrb.isSelected()){
            contact.setMulRule(true);
        }else{
            contact.setMulRule(false);
        }
    }                                    

    private void divItemStateChanged(java.awt.event.ItemEvent evt) {                                     
        JRadioButton jrb =(JRadioButton)evt.getItem();
        
        if(jrb.isSelected()){
            contact.setDivRule(true);
        }else{
            contact.setDivRule(false);
        }
    }                                    

    private void decItemStateChanged(java.awt.event.ItemEvent evt) {                                     
        JRadioButton jrb =(JRadioButton)evt.getItem();
        
        if(jrb.isSelected()){
            contact.setDecRule(true);
        }else{
            contact.setDecRule(false);
        }
    }                                    

    private void braItemStateChanged(java.awt.event.ItemEvent evt) {                                     
        JRadioButton jrb =(JRadioButton)evt.getItem();
        
        if(jrb.isSelected()){
            contact.setBraRule(true);
        }else{
            contact.setBraRule(false);
        }
    }                                    

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton add;
    private javax.swing.JRadioButton bra;
    private javax.swing.JRadioButton dec;
    private javax.swing.JRadioButton div;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButton mul;
    private javax.swing.JComboBox printnum;
    private javax.swing.JRadioButton sub;
    private java.awt.TextField t1;
    private java.awt.TextField t2;
    private javax.swing.JButton tijiao;
    // End of variables declaration                   
}
