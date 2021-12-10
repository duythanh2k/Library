/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author anhph
 */
public class menu extends javax.swing.JFrame {

    private qlsach nhapsach;
    private qltapchi nhaptapchi;
    private qlbao nhapbao;
    private hienthisach htsach;
    private hienthibao htbao;
    private hienthitapchi httapchi;
    private hienthitatca httatca;
    private timkiem tk;
    private inmayin imi;

    /**
     * Creates new form menu
     */
    public menu() {
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

        jMenuItem12 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        tpmain = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        m1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        mm2 = new javax.swing.JMenuItem();
        m2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        m4 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        btninan = new javax.swing.JMenu();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        btn_knmi = new javax.swing.JMenuItem();
        m64 = new javax.swing.JMenu();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        jMenuItem12.setText("jMenuItem12");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí thư viện - Nhóm 6");
        setBackground(new java.awt.Color(153, 204, 255));
        setLocation(new java.awt.Point(300, 10));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        m1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home-icon-16.png"))); // NOI18N
        m1.setMnemonic(KeyEvent.VK_H);
        m1.setText("Hệ thống");
        m1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });
        m1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                m1KeyPressed(evt);
            }
        });
        m1.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        jMenuItem1.setText("Quản lí người dùng");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        m1.add(jMenuItem1);

        mm2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mm2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-icon-16.png"))); // NOI18N
        mm2.setMnemonic(KeyEvent.VK_0);
        mm2.setText("Thoát");
        mm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm2ActionPerformed(evt);
            }
        });
        m1.add(mm2);

        jMenuBar1.add(m1);

        m2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-edit-icon-16.png"))); // NOI18N
        m2.setMnemonic(KeyEvent.VK_N);
        m2.setText("Nhập dữ liệu");
        m2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sach.png"))); // NOI18N
        jMenuItem3.setMnemonic(KeyEvent.VK_1);
        jMenuItem3.setText("Nhập sách");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        m2.add(jMenuItem3);
        m2.add(jSeparator2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bao.png"))); // NOI18N
        jMenuItem5.setText("Nhập báo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        m2.add(jMenuItem5);
        m2.add(jSeparator7);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapchi.png"))); // NOI18N
        jMenuItem4.setText("Nhập tạp chí");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        m2.add(jMenuItem4);
        m2.add(jSeparator3);

        jMenuBar1.add(m2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hienthi.jpg"))); // NOI18N
        jMenu3.setText("Hiển thị dữ liệu");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sach.png"))); // NOI18N
        jMenuItem6.setText("Sách");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);
        jMenu3.add(jSeparator5);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bao.png"))); // NOI18N
        jMenuItem7.setText("Báo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);
        jMenu3.add(jSeparator4);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapchi.png"))); // NOI18N
        jMenuItem8.setText("Tạp chí");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);
        jMenu3.add(jSeparator6);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gpa-icon.png"))); // NOI18N
        jMenuItem9.setText("Hiển thị tất cả");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        m4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon-16.png"))); // NOI18N
        m4.setMnemonic(KeyEvent.VK_S);
        m4.setText("Tìm kiếm");
        m4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/timkiem.png"))); // NOI18N
        jMenuItem20.setText("Tìm kiếm");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        m4.add(jMenuItem20);

        jMenuBar1.add(m4);

        btninan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mayin.png"))); // NOI18N
        btninan.setMnemonic(KeyEvent.VK_I);
        btninan.setText("In ấn");
        btninan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btninan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninanActionPerformed(evt);
            }
        });
        btninan.add(jSeparator8);

        btn_knmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btn_knmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gpa-icon.png"))); // NOI18N
        btn_knmi.setText("Kết nối máy in");
        btn_knmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_knmiActionPerformed(evt);
            }
        });
        btninan.add(btn_knmi);

        jMenuBar1.add(btninan);

        m64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Help-icon-16.png"))); // NOI18N
        m64.setMnemonic(KeyEvent.VK_T);
        m64.setText("Trợ giúp");
        m64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m64.add(jSeparator9);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Help-icon-16.png"))); // NOI18N
        jMenuItem15.setText("Nội dung trợ giúp");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        m64.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Help-icon-16.png"))); // NOI18N
        jMenuItem16.setText("Thông tin sản phẩm");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        m64.add(jMenuItem16);

        jMenuBar1.add(m64);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tpmain, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(tpmain, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Quản lí thư viện - Nhóm 6");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        trogiup n = new trogiup();
        //dangki dk = new dangki();
//        dk.show();  
        //this.dispose();  //Remove JFrame 1
        n.setVisible(true); //Show other frame        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        JOptionPane.showMessageDialog(frame,
                "Nhóm 6 - Lập trình Java",
                "About",
                JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (nhapsach == null) {
            nhapsach = new qlsach();
            tpmain.addTab("Nhập sách", null, nhapsach, "Nhập sách");
        }

        tpmain.setSelectedComponent(nhapsach);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (nhaptapchi == null) {
            nhaptapchi = new qltapchi();
            tpmain.addTab("Nhập tạp chí", null, nhaptapchi, "Nhập tạp chí");
        }

        tpmain.setSelectedComponent(nhaptapchi);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if (nhapbao == null) {
            nhapbao = new qlbao();
            tpmain.addTab("Nhập báo", null, nhapbao, "Nhập báo");
        }

        tpmain.setSelectedComponent(nhapbao);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if (htsach == null) {
            try {
                htsach = new hienthisach();
            } catch (Exception ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            tpmain.addTab("Hiển thị sách", null, htsach, "Hiển thị sách");

        }

        tpmain.setSelectedComponent(htsach);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (htbao == null) {
            try {
                htbao = new hienthibao();
            } catch (Exception ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            tpmain.addTab("Hiển thị báo", null, htbao, "Hiển thị báo");
        }

        tpmain.setSelectedComponent(htbao);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        if (httapchi == null) {
            try {
                httapchi = new hienthitapchi();
            } catch (Exception ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            tpmain.addTab("Hiển thị tạp chí", null, httapchi, "Hiển thị tạp chí");
        }

        tpmain.setSelectedComponent(httapchi);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if (httatca == null) {
            try {
                httatca = new hienthitatca();
            } catch (Exception ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            tpmain.addTab("Hiển thị tất cả", null, httatca, "Hiển thị tất cả");
        }

        tpmain.setSelectedComponent(httatca);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void mm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm2ActionPerformed
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        int result = JOptionPane.showConfirmDialog(frame,
                "Bạn có chắc muốn thoát",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
//            this.hide();
            LoginDialog ab = new LoginDialog();
//            ab.show();
//dangki dk = new dangki();
//        dk.show();  
            this.dispose();  //Remove JFrame 1
            ab.setVisible(true); //Show other frame
        }    // TODO add your handling code here:
    }//GEN-LAST:event_mm2ActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m1ActionPerformed

    private void m1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_m1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        if (tk == null) {
            tk = new timkiem();
            tpmain.addTab("Tìm kiếm", null, tk, "Tìm kiếm");
        }

        tpmain.setSelectedComponent(
                tk);                // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void btninanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninanActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btninanActionPerformed

    private void btn_knmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_knmiActionPerformed
        if (imi == null) {

            try {
                imi = new inmayin();
                tpmain.addTab("Máy in", null, imi, "Máy in");
                tpmain.setSelectedComponent(imi);
            } catch (Exception ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_knmiActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        quanliperson abc;
        try {
            abc = new quanliperson();
            dangki dk = new dangki();
//        dk.show();  
            //this.dispose();  //Remove JFrame 1
            abc.setVisible(true); //Show other frame
        } catch (Exception ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_knmi;
    private javax.swing.JMenu btninan;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu m1;
    private javax.swing.JMenu m2;
    private javax.swing.JMenu m4;
    private javax.swing.JMenu m64;
    private javax.swing.JMenuItem mm2;
    private javax.swing.JTabbedPane tpmain;
    // End of variables declaration//GEN-END:variables
}