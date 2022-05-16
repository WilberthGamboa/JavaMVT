/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model.soswing;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Wilberth
 */
public class Plantilla extends javax.swing.JFrame {
    int contador=-1;

    /**
     * Creates new form NewJFrame
     */
    public Plantilla() {
        
        initComponents();
    }
    private void jButtonpasoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpasoNActionPerformed
        // TODO add your handling code here:
        //12.5%
        contador++;
        int x = jPanel1.getHeight();

        if(contador==0){
            jLabelno1.setText("1");
            jLabellocal1.setText("10");
            jLabeltamal1.setText("54");
            jLabelestado1.setText("D");
        }
        if(contador==1){
            
            A.setPreferredSize(new Dimension(1, (int)(x*.125)));
            jLabela.setText("A");

            jLabelno1.setText("1");
            jLabellocal1.setText("18");
            jLabeltamal1.setText("46");
            jLabelestado1.setText("D");


            jLabelno5.setText("1");
            jLabellocal5.setText("10");
            jLabeltama5.setText("8");
            jLabelproceso0.setText("A");

             //JLABELS
           
        }
        //21.875%%%
        if(contador==2){
            B.setPreferredSize(new Dimension(1, (int)(x*.21875)));
            jLabelb.setText("B");


            jLabelno1.setText("1");
            jLabellocal1.setText("32");
            jLabeltamal1.setText("32");
            jLabelestado1.setText("D");


            jLabelno6.setText("2");
            jLabellocal6.setText("18");
            jLabeltama6.setText("14");
            jLabelproceso1.setText("B");

            //jlabels

             //JLABELS
            
         //    jLabelproceso1.setText("A");
         //    jLabelpro.setText("D");
         

        }
        //28,125%
        if(contador==3){
            C.setPreferredSize(new Dimension(1, (int)(x*.28125)));
            jLabelc.setText("C");

            //JLABELS
            jLabelno1.setText("1");
            jLabellocal1.setText("50");
            jLabeltamal1.setText("14");
            jLabelestado1.setText("D");


            jLabelno5.setText("1");
            jLabellocal5.setText("10");
            jLabeltama6.setText("8");
            jLabelproceso0.setText("A");
           
            jLabelno6.setText("2");
            jLabellocal6.setText("18");
            jLabeltama6.setText("14");
            jLabelproceso1.setText("B");

            jLabelno7.setText("3");
            jLabellocal7.setText("32");
            jLabeltama7.setText("18");
            jLabelproceso2.setText("C");
        }

        //9,375%
        if(contador==4){
            D.setPreferredSize(new Dimension(1, (int)(x*.09375)));
            jLabeld.setText("D");

            jLabelno1.setText("1");
            jLabellocal1.setText("56");
            jLabeltamal1.setText("8");
            jLabelestado1.setText("D");


            jLabelno5.setText("1");
            jLabellocal5.setText("10");
            jLabeltama6.setText("8");
            jLabelesta5.setText("A");
            jLabelproceso0.setText("A");
           
            jLabelno6.setText("2");
            jLabellocal6.setText("18");
            jLabeltama6.setText("14");
            jLabelesta6.setText("B");
            jLabelproceso1.setText("A");

            jLabelno7.setText("3");
            jLabellocal7.setText("32");
            jLabeltama7.setText("18");
            jLabelesta7.setText("C");
            jLabelproceso2.setText("A");

            jLabelno8.setText("4");
            jLabellocal8.setText("50");
            jLabeltama8.setText("6");
            jLabelesta8.setText("D");
            jLabelproceso3.setText("A");

        }

        if(contador==5){
            C.setBackground(Color.WHITE);
           
         
          
            jLabelc.setText("");


            jLabelno1.setText("1");
            jLabellocal1.setText("56");
            jLabeltamal1.setText("8");
            jLabelestado1.setText("D");

            jLabelno2.setText("2");
            jLabellocal2.setText("32");
            jLabeltamal2.setText("18");
            jLabelestado2.setText("D");



            jLabelno5.setText("1");
            jLabellocal5.setText("10");
            jLabeltama6.setText("8");
            jLabelesta5.setText("A");
            jLabelproceso0.setText("A");
           
            jLabelno6.setText("2");
            jLabellocal6.setText("18");
            jLabeltama6.setText("14");
            jLabelesta6.setText("B");
            jLabelproceso1.setText("A");

            jLabelno7.setText("3");
            jLabellocal7.setText("32");
            jLabeltama7.setText("18");
            jLabelesta7.setText("C");
            jLabelproceso2.setText("D");

            jLabelno8.setText("4");
            jLabellocal8.setText("50");
            jLabeltama8.setText("6");
            jLabelesta8.setText("D");
            jLabelproceso3.setText("A");

        }
        //21.875%
        if(contador==6){
            C.setPreferredSize(new Dimension(1, (int)(x*.21875)));
            C.setBackground(Color.GRAY);
           jPanelvacio.setPreferredSize(new Dimension(1, (int)(x*.0625)));
           
          
            jLabelc.setText("E");


            jLabelno1.setText("1");
            jLabellocal1.setText("56");
            jLabeltamal1.setText("8");
            jLabelestado1.setText("D");

            jLabelno2.setText("2");
            jLabellocal2.setText("46");
            jLabeltamal2.setText("4");
            jLabelestado2.setText("D");


            jLabelno5.setText("1");
            jLabellocal5.setText("10");
            jLabeltama6.setText("8");
            jLabelesta5.setText("A");
            jLabelproceso0.setText("A");
           
            jLabelno6.setText("2");
            jLabellocal6.setText("18");
            jLabeltama6.setText("14");
            jLabelesta6.setText("B");
            jLabelproceso1.setText("A");

            jLabelno7.setText("3");
            jLabellocal7.setText("50");
            jLabeltama7.setText("6");
            jLabelesta7.setText("D");
            jLabelproceso2.setText("A");

            jLabelno8.setText("4");
            jLabellocal8.setText("32");
            jLabeltama8.setText("14");
            jLabelesta8.setText("E");
            jLabelproceso3.setText("A");

        }

        if(contador==7){
            A.setBackground(Color.WHITE);
           
         
          
            jLabela.setText("");

            jLabelno1.setText("1");
            jLabellocal1.setText("56");
            jLabeltamal1.setText("8");
            jLabelestado1.setText("D");

            jLabelno2.setText("2");
            jLabellocal2.setText("46");
            jLabeltamal2.setText("4");
            jLabelestado2.setText("D");

            jLabelno3.setText("3");
            jLabellocal3.setText("10");
            jLabeltamal3.setText("8");
            jLabelestado3.setText("D");



            jLabelno5.setText("1");
            jLabellocal5.setText("10");
            jLabeltama6.setText("8");
            jLabelesta5.setText("A");
            jLabelproceso0.setText("D");
           
            jLabelno6.setText("2");
            jLabellocal6.setText("18");
            jLabeltama6.setText("14");
            jLabelesta6.setText("B");
            jLabelproceso1.setText("A");

            jLabelno7.setText("3");
            jLabellocal7.setText("50");
            jLabeltama7.setText("6");
            jLabelesta7.setText("D");
            jLabelproceso2.setText("A");

            jLabelno8.setText("4");
            jLabellocal8.setText("32");
            jLabeltama8.setText("14");
            jLabelesta8.setText("E");
            jLabelproceso3.setText("A");
        }

        if(contador==8){
            B.setBackground(Color.WHITE);
           
         
          
            jLabelb.setText("");
            

            jLabelno1.setText("1");
            jLabellocal1.setText("56");
            jLabeltamal1.setText("8");
            jLabelestado1.setText("D");

            jLabelno2.setText("2");
            jLabellocal2.setText("46");
            jLabeltamal2.setText("4");
            jLabelestado2.setText("D");

            jLabelno3.setText("3");
            jLabellocal3.setText("10");
            jLabeltamal3.setText("22");
            jLabelestado3.setText("D");




            jLabelno5.setText("1");
            jLabellocal5.setText("18");
            jLabeltama5.setText("14");
            jLabelesta5.setText("B");
            jLabelproceso0.setText("D");
           
            jLabelno6.setText("2");
            jLabellocal6.setText("50");
            jLabeltama6.setText("6");
            jLabelesta6.setText("D");
            jLabelproceso1.setText("A");

            jLabelno7.setText("3");
            jLabellocal7.setText("32");
            jLabeltama7.setText("14");
            jLabelesta7.setText("E");
            jLabelproceso2.setText("A");

            jLabelno8.setText("");
            jLabellocal8.setText("");
            jLabeltama8.setText("");
            jLabelesta8.setText("");
            jLabelproceso3.setText("");
        }

        if(contador==9){
            C.setBackground(Color.WHITE);
           
         
          
            jLabelc.setText("");

            D.setBackground(Color.WHITE);
           
         
          
            jLabeld.setText("");


            jLabelno1.setText("1");
            jLabellocal1.setText("10");
            jLabeltamal1.setText("54");
            jLabelestado1.setText("D");

            jLabelno2.setText("");
            jLabellocal2.setText("");
            jLabeltamal2.setText("");
            jLabelestado2.setText("");

            jLabelno3.setText("");
            jLabellocal3.setText("");
            jLabeltamal3.setText("");
            jLabelestado3.setText("");




            jLabelno5.setText("1");
            jLabellocal5.setText("50");
            jLabeltama5.setText("6");
            jLabelesta5.setText("D");
            jLabelproceso0.setText("D");
           
            jLabelno6.setText("2");
            jLabellocal6.setText("32");
            jLabeltama6.setText("14");
            jLabelesta6.setText("E");
            jLabelproceso1.setText("D");

            jLabelno7.setText("");
            jLabellocal7.setText("");
            jLabeltama7.setText("");
            jLabelesta7.setText("");
            jLabelproceso2.setText("");




        }
       

        
    }//GEN-LAST:event_jButtonpasoNActionPerformed

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTabladeP = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelno5 = new javax.swing.JLabel();
        jLabelno6 = new javax.swing.JLabel();
        jLabelno7 = new javax.swing.JLabel();
        jLabelno8 = new javax.swing.JLabel();
        jLabellocal5 = new javax.swing.JLabel();
        jLabellocal6 = new javax.swing.JLabel();
        jLabellocal7 = new javax.swing.JLabel();
        jLabellocal8 = new javax.swing.JLabel();
        jLabeltama5 = new javax.swing.JLabel();
        jLabeltama6 = new javax.swing.JLabel();
        jLabeltama7 = new javax.swing.JLabel();
        jLabeltama8 = new javax.swing.JLabel();
        jLabelesta5 = new javax.swing.JLabel();
        jLabelesta6 = new javax.swing.JLabel();
        jLabelesta7 = new javax.swing.JLabel();
        jLabelesta8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelproceso0 = new javax.swing.JLabel();
        jLabelproceso1 = new javax.swing.JLabel();
        jLabelproceso2 = new javax.swing.JLabel();
        jLabelproceso3 = new javax.swing.JLabel();
        jPanelSO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        A = new javax.swing.JPanel();
        jLabela = new javax.swing.JLabel();
        B = new javax.swing.JPanel();
        jLabelb = new javax.swing.JLabel();
        C = new javax.swing.JPanel();
        jLabelc = new javax.swing.JLabel();
        jPanelvacio = new javax.swing.JPanel();
        D = new javax.swing.JPanel();
        jLabeld = new javax.swing.JLabel();
        jPanelTableAL = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelno2 = new javax.swing.JLabel();
        jLabelno3 = new javax.swing.JLabel();
        jLabelno4 = new javax.swing.JLabel();
        jLabelno1 = new javax.swing.JLabel();
        jLabellocal1 = new javax.swing.JLabel();
        jLabellocal2 = new javax.swing.JLabel();
        jLabellocal3 = new javax.swing.JLabel();
        jLabellocal4 = new javax.swing.JLabel();
        jLabeltamal1 = new javax.swing.JLabel();
        jLabeltamal2 = new javax.swing.JLabel();
        jLabeltamal3 = new javax.swing.JLabel();
        jLabeltamal4 = new javax.swing.JLabel();
        jLabelestado1 = new javax.swing.JLabel();
        jLabelestado2 = new javax.swing.JLabel();
        jLabelestado3 = new javax.swing.JLabel();
        jLabelestado4 = new javax.swing.JLabel();
        jPanelbotton = new javax.swing.JPanel();
        jButtonpasoN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTabladeP.setBackground(new java.awt.Color(153, 153, 153));
        jPanelTabladeP.setMinimumSize(new java.awt.Dimension(100, 350));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel7.setText("Tabla de P");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("No.");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Localidad");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Tamaño");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Estado");

        jLabelno5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelno6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelno7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelno8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabellocal5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabellocal6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabellocal7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabellocal8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabeltama5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabeltama6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabeltama7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabeltama8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelesta5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelesta6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelesta7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelesta8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Proceso");

        jLabelproceso0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelproceso1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelproceso2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelproceso3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelTabladePLayout = new javax.swing.GroupLayout(jPanelTabladeP);
        jPanelTabladeP.setLayout(jPanelTabladePLayout);
        jPanelTabladePLayout.setHorizontalGroup(
            jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabladePLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTabladePLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelTabladePLayout.createSequentialGroup()
                        .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTabladePLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel9))
                            .addGroup(jPanelTabladePLayout.createSequentialGroup()
                                .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelno8)
                                    .addComponent(jLabelno7)
                                    .addComponent(jLabelno6)
                                    .addComponent(jLabelno5))
                                .addGap(109, 109, 109)
                                .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabellocal6)
                                        .addComponent(jLabellocal5))
                                    .addComponent(jLabellocal8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(jLabellocal7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(66, 66, 66)
                        .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabeltama7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabeltama6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                            .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabeltama5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabeltama8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelesta8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelesta7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanelTabladePLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelesta6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTabladePLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelTabladePLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelproceso0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelproceso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabelproceso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTabladePLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabelproceso3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 68, Short.MAX_VALUE))))
        );
        jPanelTabladePLayout.setVerticalGroup(
            jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabladePLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTabladePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTabladePLayout.createSequentialGroup()
                        .addComponent(jLabelno5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelno6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelno7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelno8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTabladePLayout.createSequentialGroup()
                        .addComponent(jLabellocal5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabellocal6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabellocal7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabellocal8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTabladePLayout.createSequentialGroup()
                        .addComponent(jLabeltama5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabeltama6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabeltama7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabeltama8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTabladePLayout.createSequentialGroup()
                        .addComponent(jLabelproceso0, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelproceso1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelproceso2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelproceso3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTabladePLayout.createSequentialGroup()
                        .addComponent(jLabelesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelesta6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelesta7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelesta8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSO.setBackground(new java.awt.Color(204, 255, 255));
        jPanelSO.setMinimumSize(new java.awt.Dimension(100, 109));
        jPanelSO.setPreferredSize(new java.awt.Dimension(100, 109));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelSOLayout = new javax.swing.GroupLayout(jPanelSO);
        jPanelSO.setLayout(jPanelSOLayout);
        jPanelSOLayout.setHorizontalGroup(
            jPanelSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSOLayout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanelSOLayout.setVerticalGroup(
            jPanelSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSOLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 590));

        A.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout ALayout = new javax.swing.GroupLayout(A);
        A.setLayout(ALayout);
        ALayout.setHorizontalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ALayout.setVerticalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        B.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout BLayout = new javax.swing.GroupLayout(B);
        B.setLayout(BLayout);
        BLayout.setHorizontalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLayout.createSequentialGroup()
                .addComponent(jLabelb)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BLayout.setVerticalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelb)
                .addGap(33, 33, 33))
        );

        C.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout CLayout = new javax.swing.GroupLayout(C);
        C.setLayout(CLayout);
        CLayout.setHorizontalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelc)
                .addContainerGap(646, Short.MAX_VALUE))
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelc)
                .addGap(41, 41, 41))
        );

        jPanelvacio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelvacio.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanelvacioLayout = new javax.swing.GroupLayout(jPanelvacio);
        jPanelvacio.setLayout(jPanelvacioLayout);
        jPanelvacioLayout.setHorizontalGroup(
            jPanelvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelvacioLayout.setVerticalGroup(
            jPanelvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        D.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout DLayout = new javax.swing.GroupLayout(D);
        D.setLayout(DLayout);
        DLayout.setHorizontalGroup(
            DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabeld)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DLayout.setVerticalGroup(
            DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabeld)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                    .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)))
            .addComponent(jPanelvacio, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
            .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelvacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelTableAL.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTableAL.setPreferredSize(new java.awt.Dimension(100, 350));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setText("Tabla A.L.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("No.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Localidad");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Tamaño");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Estado");

        jLabelno2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelno3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelno4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelno1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabellocal1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabellocal2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabellocal3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabellocal4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabeltamal1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabeltamal2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabeltamal3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabeltamal4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelestado1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelestado2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelestado3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelestado4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelTableALLayout = new javax.swing.GroupLayout(jPanelTableAL);
        jPanelTableAL.setLayout(jPanelTableALLayout);
        jPanelTableALLayout.setHorizontalGroup(
            jPanelTableALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableALLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelTableALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTableALLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelTableALLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelTableALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabelno4)
                            .addComponent(jLabelno3)
                            .addComponent(jLabelno2)
                            .addComponent(jLabelno1))
                        .addGap(49, 49, 49)
                        .addGroup(jPanelTableALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabellocal4)
                            .addComponent(jLabellocal3)
                            .addComponent(jLabellocal2)
                            .addComponent(jLabellocal1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelTableALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabeltamal4)
                            .addComponent(jLabeltamal3)
                            .addComponent(jLabeltamal2)
                            .addComponent(jLabeltamal1))
                        .addGap(110, 110, 110)
                        .addGroup(jPanelTableALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelestado4)
                            .addComponent(jLabelestado3)
                            .addComponent(jLabelestado2)
                            .addComponent(jLabelestado1)
                            .addComponent(jLabel16))
                        .addGap(71, 71, 71))))
        );
        jPanelTableALLayout.setVerticalGroup(
            jPanelTableALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableALLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(jPanelTableALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelTableALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTableALLayout.createSequentialGroup()
                        .addComponent(jLabelno1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelno2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelno3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelno4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTableALLayout.createSequentialGroup()
                        .addComponent(jLabellocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabellocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabellocal3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabellocal4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTableALLayout.createSequentialGroup()
                        .addComponent(jLabeltamal1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabeltamal2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabeltamal3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabeltamal4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTableALLayout.createSequentialGroup()
                        .addComponent(jLabelestado1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelestado2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelestado3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelestado4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelbotton.setBackground(new java.awt.Color(255, 153, 0));

        jButtonpasoN.setText("jButton1");
        jButtonpasoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpasoNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelbottonLayout = new javax.swing.GroupLayout(jPanelbotton);
        jPanelbotton.setLayout(jPanelbottonLayout);
        jPanelbottonLayout.setHorizontalGroup(
            jPanelbottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbottonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonpasoN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelbottonLayout.setVerticalGroup(
            jPanelbottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbottonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonpasoN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTableAL, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addComponent(jPanelbotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelTabladeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSO, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelTableAL, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelTabladeP, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelbotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A;
    private javax.swing.JPanel B;
    private javax.swing.JPanel C;
    private javax.swing.JPanel D;
    private javax.swing.JButton jButtonpasoN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabela;
    private javax.swing.JLabel jLabelb;
    private javax.swing.JLabel jLabelc;
    private javax.swing.JLabel jLabeld;
    private javax.swing.JLabel jLabelesta5;
    private javax.swing.JLabel jLabelesta6;
    private javax.swing.JLabel jLabelesta7;
    private javax.swing.JLabel jLabelesta8;
    private javax.swing.JLabel jLabelestado1;
    private javax.swing.JLabel jLabelestado2;
    private javax.swing.JLabel jLabelestado3;
    private javax.swing.JLabel jLabelestado4;
    private javax.swing.JLabel jLabellocal1;
    private javax.swing.JLabel jLabellocal2;
    private javax.swing.JLabel jLabellocal3;
    private javax.swing.JLabel jLabellocal4;
    private javax.swing.JLabel jLabellocal5;
    private javax.swing.JLabel jLabellocal6;
    private javax.swing.JLabel jLabellocal7;
    private javax.swing.JLabel jLabellocal8;
    private javax.swing.JLabel jLabelno1;
    private javax.swing.JLabel jLabelno2;
    private javax.swing.JLabel jLabelno3;
    private javax.swing.JLabel jLabelno4;
    private javax.swing.JLabel jLabelno5;
    private javax.swing.JLabel jLabelno6;
    private javax.swing.JLabel jLabelno7;
    private javax.swing.JLabel jLabelno8;
    private javax.swing.JLabel jLabelproceso0;
    private javax.swing.JLabel jLabelproceso1;
    private javax.swing.JLabel jLabelproceso2;
    private javax.swing.JLabel jLabelproceso3;
    private javax.swing.JLabel jLabeltama5;
    private javax.swing.JLabel jLabeltama6;
    private javax.swing.JLabel jLabeltama7;
    private javax.swing.JLabel jLabeltama8;
    private javax.swing.JLabel jLabeltamal1;
    private javax.swing.JLabel jLabeltamal2;
    private javax.swing.JLabel jLabeltamal3;
    private javax.swing.JLabel jLabeltamal4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelSO;
    private javax.swing.JPanel jPanelTabladeP;
    private javax.swing.JPanel jPanelTableAL;
    private javax.swing.JPanel jPanelbotton;
    private javax.swing.JPanel jPanelvacio;
    // End of variables declaration//GEN-END:variables
}
