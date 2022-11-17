
import java.awt.Color;
import static java.awt.Color.orange;
import static java.awt.Color.white;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class NewJFrame extends javax.swing.JFrame {

    private String turn = "O";
    private int xcount = 0;
    private int ocount = 0;
    private int totalcount = 0;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        
    }
    
    private void ChoosePlayer(){
         
        if(turn.equalsIgnoreCase("X")    ){
            turn = "O";
        }else{
            turn = "X";
        }
    }
    
    private void SetScore(){
        xscore.setText(String.valueOf(xcount));
        oscore.setText(String.valueOf(ocount));
    }
    
    private void ResetGame(){
      txtb1.setText("");
        txtb2.setText("");
        txtb3.setText("");
        txtb4.setText("");
        txtb5.setText("");
        txtb6.setText("");
        txtb7.setText("");
        txtb8.setText("");
        txtb9.setText("");
        
        txtb1.setBackground(white);
        txtb2.setBackground(white);
        txtb3.setBackground(white);
        txtb4.setBackground(white);
        txtb5.setBackground(white);
        txtb6.setBackground(white);
        txtb7.setBackground(white);
        txtb8.setBackground(white);
        txtb9.setBackground(white);
         
        totalcount = 0 ;
    }
    
    private void winingGame() 
    {
        totalcount++;
        
    String bt1 = txtb1.getText();
    String bt2 = txtb2.getText();
    String bt3 = txtb3.getText();
    String bt4 = txtb4.getText();
    String bt5 = txtb5.getText();
    String bt6 = txtb6.getText();
    String bt7 = txtb7.getText();
    String bt8 = txtb8.getText();
    String bt9 = txtb9.getText();
    
    if((bt1 == bt2 ) && (bt2 == bt3) && (bt1 != "")){
        
        String msg;
        if(turn.equalsIgnoreCase("X")){
            msg = "Player O Wins";
            ocount++;
        }else{
            msg = "Player X Wins";
            xcount++;
        }
        
        JOptionPane.showMessageDialog(this,msg , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         txtb1.setBackground(orange);
          txtb2.setBackground(orange);
          txtb3.setBackground(orange);
          
}else if((bt4 == bt5 ) && (bt5 == bt6)&& (bt4 != "")){
        
        String msg;
        if(turn.equalsIgnoreCase("X")){
            msg = "Player O Wins";
            ocount++;
        }else{
            msg = "Player X Wins";
            xcount++;
        }
        
        JOptionPane.showMessageDialog(this,msg , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         txtb4.setBackground(orange);
          txtb5.setBackground(orange);
          txtb6.setBackground(orange);
}else if((bt7 == bt8 ) && (bt8 == bt9) && (bt7 != "")){
        
        String msg;
        if(turn.equalsIgnoreCase("X")){
            msg = "Player O Wins";
            ocount++;
        }else{
            msg = "Player X Wins";
            xcount++;
        }
        
        JOptionPane.showMessageDialog(this,msg , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         txtb7.setBackground(orange);
         txtb8.setBackground(orange);
         txtb9.setBackground(orange);
         
}else  if((bt1 == bt4 ) && (bt4 == bt7) && (bt1 != "")) {
        
        String msg;
        if(turn.equalsIgnoreCase("X")){
            msg = "Player O Wins";
            ocount++;
        }else{
            msg = "Player X Wins";
            xcount++;
        }
        
        JOptionPane.showMessageDialog(this,msg , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         txtb1.setBackground(orange);
         txtb4.setBackground(orange);
         txtb7.setBackground(orange);
         
}else if((bt2 == bt5 ) && (bt5 == bt8) && (bt2 != "") ){
        
        String msg;
        if(turn.equalsIgnoreCase("X")){
            msg = "Player O Wins";
            ocount++;
        }else{
            msg = "Player X Wins";
            xcount++;
        }
        
        JOptionPane.showMessageDialog(this,msg , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         txtb2.setBackground(orange);
         txtb5.setBackground(orange);
         txtb8.setBackground(orange);  
        
}else if((bt3 == bt6 ) && (bt6 == bt9) && (bt3 != "")){
        
        String msg;
        if(turn.equalsIgnoreCase("X")){
            msg = "Player O Wins";
            ocount++;
        }else{
            msg = "Player X Wins";
            xcount++;
        }
        
        JOptionPane.showMessageDialog(this,msg , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         txtb3.setBackground(orange);
         txtb6.setBackground(orange);
         txtb9.setBackground(orange);
    } else if((bt1 == bt5 ) && (bt5 == bt9) && (bt1 != "")){
        
        String msg;
        if(turn.equalsIgnoreCase("X")){
            msg = "Player O Wins";
            ocount++;
        }else{
            msg = "Player X Wins";
            xcount++;
        }
        
        JOptionPane.showMessageDialog(this,msg , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         txtb1.setBackground(orange);
         txtb5.setBackground(orange);
         txtb9.setBackground(orange);
    }else if((bt3 == bt5 ) && (bt5 == bt7) && (bt3 != "")){
        
        String msg;
        if(turn.equalsIgnoreCase("X")){
            msg = "Player O Wins";
            ocount++;
        }else{
            msg = "Player X Wins";
            xcount++;
        }
        
        JOptionPane.showMessageDialog(this,msg , "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         txtb3.setBackground(orange);
         txtb5.setBackground(orange);
         txtb7.setBackground(orange);
    }else if(totalcount == 9){
        JOptionPane.showMessageDialog(this, "DRAW", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
       ResetGame(); 
    
    }
    
    SetScore();
   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtb1 = new javax.swing.JButton();
        txtb2 = new javax.swing.JButton();
        txtb3 = new javax.swing.JButton();
        txtb4 = new javax.swing.JButton();
        txtb7 = new javax.swing.JButton();
        txtb5 = new javax.swing.JButton();
        txtb8 = new javax.swing.JButton();
        txtb6 = new javax.swing.JButton();
        resetb = new javax.swing.JButton();
        exitb = new javax.swing.JButton();
        txtb9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GAMR");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setAutoscrolls(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TEO GAME");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        txtb1.setBackground(new java.awt.Color(204, 204, 204));
        txtb1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtb1.setForeground(new java.awt.Color(204, 204, 204));
        txtb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb1ActionPerformed(evt);
            }
        });

        txtb2.setBackground(new java.awt.Color(204, 204, 204));
        txtb2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtb2.setForeground(new java.awt.Color(204, 204, 204));
        txtb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb2ActionPerformed(evt);
            }
        });

        txtb3.setBackground(new java.awt.Color(204, 204, 204));
        txtb3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtb3.setForeground(new java.awt.Color(204, 204, 204));
        txtb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb3ActionPerformed(evt);
            }
        });

        txtb4.setBackground(new java.awt.Color(204, 204, 204));
        txtb4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtb4.setForeground(new java.awt.Color(204, 204, 204));
        txtb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb4ActionPerformed(evt);
            }
        });

        txtb7.setBackground(new java.awt.Color(204, 204, 204));
        txtb7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtb7.setForeground(new java.awt.Color(204, 204, 204));
        txtb7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb7ActionPerformed(evt);
            }
        });

        txtb5.setBackground(new java.awt.Color(204, 204, 204));
        txtb5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtb5.setForeground(new java.awt.Color(204, 204, 204));
        txtb5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb5ActionPerformed(evt);
            }
        });

        txtb8.setBackground(new java.awt.Color(204, 204, 204));
        txtb8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtb8.setForeground(new java.awt.Color(204, 204, 204));
        txtb8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb8ActionPerformed(evt);
            }
        });

        txtb6.setBackground(new java.awt.Color(204, 204, 204));
        txtb6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtb6.setForeground(new java.awt.Color(204, 204, 204));
        txtb6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb6ActionPerformed(evt);
            }
        });

        resetb.setBackground(new java.awt.Color(204, 255, 255));
        resetb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetb.setText("RESET");
        resetb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbActionPerformed(evt);
            }
        });

        exitb.setBackground(new java.awt.Color(255, 102, 102));
        exitb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitb.setText("EXIT");
        exitb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbActionPerformed(evt);
            }
        });

        txtb9.setBackground(new java.awt.Color(204, 204, 204));
        txtb9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtb9.setForeground(new java.awt.Color(204, 204, 204));
        txtb9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb9ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("PLAYER Y :  ");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SCORE CARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        xscore.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        xscore.setText("0");

        oscore.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        oscore.setText("0");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setText("PLAYER X :  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(xscore))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(oscore)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xscore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oscore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtb1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtb2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txtb3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtb7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtb8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txtb9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtb4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtb5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txtb6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(resetb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtb1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtb4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtb2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtb5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtb3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtb6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtb9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtb8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtb7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resetb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(156, 156, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame ("Exit");
//        if(JOptionpane.showconfirmDialog())
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit ?","Tic Tac Toa",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);    
        }
    }//GEN-LAST:event_exitbActionPerformed

    private void resetbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbActionPerformed
       
        ResetGame();
    }//GEN-LAST:event_resetbActionPerformed

    private void txtb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb1ActionPerformed
       txtb1.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtb1.setForeground(Color.red);
        }else {
            txtb1.setForeground(Color.GREEN);
        }
        winingGame();
        ChoosePlayer();
//        txtb1.setEnabled(false);
    }//GEN-LAST:event_txtb1ActionPerformed

    private void txtb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb2ActionPerformed
               txtb2.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtb2.setForeground(Color.red);
        }else {
            txtb2.setForeground(Color.GREEN);
        }
        winingGame();
        ChoosePlayer();
//        txtb2.setEnabled(false);
    }//GEN-LAST:event_txtb2ActionPerformed

    private void txtb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb3ActionPerformed
           txtb3.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtb3.setForeground(Color.red);
        }else {
            txtb3.setForeground(Color.GREEN);
        }
        winingGame();
        ChoosePlayer();
//        txtb3.setEnabled(false);
    }//GEN-LAST:event_txtb3ActionPerformed

    private void txtb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb4ActionPerformed
          txtb4.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtb4.setForeground(Color.red);
        }else {
            txtb4.setForeground(Color.GREEN);
        }
        winingGame();
        ChoosePlayer();
//        txtb4.setEnabled(false);
    }//GEN-LAST:event_txtb4ActionPerformed

    private void txtb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb5ActionPerformed
      txtb5.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtb5.setForeground(Color.red);
        }else {
            txtb5.setForeground(Color.GREEN);
        }
        winingGame();
        ChoosePlayer();
//        txtb5.setEnabled(false);
    }//GEN-LAST:event_txtb5ActionPerformed

    private void txtb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb6ActionPerformed
           txtb6.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtb6.setForeground(Color.red);
        }else {
            txtb6.setForeground(Color.GREEN);
        }
        winingGame();
        ChoosePlayer();
//        txtb6.setEnabled(false);
    }//GEN-LAST:event_txtb6ActionPerformed

    private void txtb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb7ActionPerformed
           txtb7.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtb7.setForeground(Color.red);
        }else {
            txtb7.setForeground(Color.GREEN);
        }
        winingGame();
        ChoosePlayer();
//        txtb7.setEnabled(false);
    }//GEN-LAST:event_txtb7ActionPerformed

    private void txtb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb8ActionPerformed
           txtb8.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtb8.setForeground(Color.red);
        }else {
            txtb8.setForeground(Color.GREEN);
        }
        winingGame();
        ChoosePlayer();
//        txtb8.setEnabled(false);
    }//GEN-LAST:event_txtb8ActionPerformed

    private void txtb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb9ActionPerformed
          txtb9.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            txtb9.setForeground(Color.red);
        }else {
            txtb9.setForeground(Color.GREEN);
        }
        winingGame();
        ChoosePlayer();
//         txtb9.setEnabled(false); // for removing background cheking the value once
    }//GEN-LAST:event_txtb9ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitb;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oscore;
    private javax.swing.JButton resetb;
    private javax.swing.JButton txtb1;
    private javax.swing.JButton txtb2;
    private javax.swing.JButton txtb3;
    private javax.swing.JButton txtb4;
    private javax.swing.JButton txtb5;
    private javax.swing.JButton txtb6;
    private javax.swing.JButton txtb7;
    private javax.swing.JButton txtb8;
    private javax.swing.JButton txtb9;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
