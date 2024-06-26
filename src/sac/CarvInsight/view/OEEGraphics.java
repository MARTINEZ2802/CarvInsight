
package sac.CarvInsight.view;

import sac.CarvInsight.util.Imgs;

public class OEEGraphics extends javax.swing.JFrame {
    Imgs Llenar = new Imgs();

    public OEEGraphics() {
        initComponents();
        LlenadoImagenes();
        this.setLocationRelativeTo(this);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Logout = new javax.swing.JButton();
        ww = new javax.swing.JButton();
        dd = new javax.swing.JButton();
        tub1 = new javax.swing.JButton();
        tub2 = new javax.swing.JButton();
        tub3 = new javax.swing.JButton();
        tub4 = new javax.swing.JButton();
        tub5 = new javax.swing.JButton();
        tub6 = new javax.swing.JButton();
        sliter1 = new javax.swing.JButton();
        sliter2 = new javax.swing.JButton();
        sliter3 = new javax.swing.JButton();
        horno1 = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        roll = new javax.swing.JLabel();
        slitter = new javax.swing.JLabel();
        furance = new javax.swing.JLabel();
        MACHINE3 = new javax.swing.JLabel();
        MACHINE2 = new javax.swing.JLabel();
        MACHINE1 = new javax.swing.JLabel();
        Line = new javax.swing.JPanel();
        Line1 = new javax.swing.JPanel();
        Line2 = new javax.swing.JPanel();
        Oee = new javax.swing.JPanel();
        Ava = new javax.swing.JPanel();
        Per = new javax.swing.JPanel();
        Qua = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        Nav = new javax.swing.JLabel();
        Body = new javax.swing.JLabel();
        fNav = new javax.swing.JPanel();
        fBody = new javax.swing.JPanel();
        Body1 = new javax.swing.JLabel();
        Machin1 = new javax.swing.JPanel();
        n2 = new javax.swing.JPanel();
        n3 = new javax.swing.JPanel();
        n4 = new javax.swing.JPanel();
        n5 = new javax.swing.JPanel();
        n6 = new javax.swing.JPanel();
        n7 = new javax.swing.JPanel();
        machin2 = new javax.swing.JPanel();
        n9 = new javax.swing.JPanel();
        n10 = new javax.swing.JPanel();
        machine3 = new javax.swing.JPanel();
        n12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseExited(evt);
            }
        });
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 260, 60));

        ww.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1W.png"))); // NOI18N
        ww.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wwMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wwMouseExited(evt);
            }
        });
        getContentPane().add(ww, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 50, 50));

        dd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1D.png"))); // NOI18N
        dd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ddMouseExited(evt);
            }
        });
        getContentPane().add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 50, 50));

        tub1.setBorder(null);
        tub1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tub1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tub1MouseExited(evt);
            }
        });
        tub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tub1ActionPerformed(evt);
            }
        });
        tub1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tub1KeyPressed(evt);
            }
        });
        getContentPane().add(tub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 300, 34));

        tub2.setBorder(null);
        tub2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tub2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tub2MouseExited(evt);
            }
        });
        getContentPane().add(tub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 236, 300, 34));

        tub3.setBorder(null);
        tub3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tub3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tub3MouseExited(evt);
            }
        });
        getContentPane().add(tub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 300, 34));

        tub4.setBorder(null);
        tub4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tub4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tub4MouseExited(evt);
            }
        });
        getContentPane().add(tub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 304, 300, 34));

        tub5.setBorder(null);
        tub5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tub5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tub5MouseExited(evt);
            }
        });
        getContentPane().add(tub5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 338, 300, 34));

        tub6.setBorder(null);
        tub6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tub6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tub6MouseExited(evt);
            }
        });
        getContentPane().add(tub6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 372, 300, 34));

        sliter1.setBorder(null);
        sliter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sliter1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sliter1MouseExited(evt);
            }
        });
        getContentPane().add(sliter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 493, 300, 34));

        sliter2.setBorder(null);
        sliter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sliter2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sliter2MouseExited(evt);
            }
        });
        getContentPane().add(sliter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 527, 300, 34));

        sliter3.setBorder(null);
        sliter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sliter3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sliter3MouseExited(evt);
            }
        });
        getContentPane().add(sliter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 561, 300, 34));

        horno1.setBorder(null);
        horno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                horno1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                horno1MouseExited(evt);
            }
        });
        getContentPane().add(horno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 688, 300, 34));

        Logout.setBorder(null);
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 200, 50));
        getContentPane().add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 40, 40));
        getContentPane().add(slitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 40, 40));
        getContentPane().add(furance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 40, 40));

        MACHINE3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MACHINE3.setForeground(new java.awt.Color(255, 255, 255));
        MACHINE3.setText("Furnances machines");
        getContentPane().add(MACHINE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 613, 180, 40));

        MACHINE2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MACHINE2.setForeground(new java.awt.Color(255, 255, 255));
        MACHINE2.setText("Slitter Machines");
        getContentPane().add(MACHINE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 422, 180, 40));

        MACHINE1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MACHINE1.setForeground(new java.awt.Color(255, 255, 255));
        MACHINE1.setText("Tube machines");
        getContentPane().add(MACHINE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 210, 40));

        Line.setBackground(new java.awt.Color(29, 85, 121));
        Line.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 211), 3));
        Line.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout LineLayout = new javax.swing.GroupLayout(Line);
        Line.setLayout(LineLayout);
        LineLayout.setHorizontalGroup(
            LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        LineLayout.setVerticalGroup(
            LineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, 270, 3));

        Line1.setBackground(new java.awt.Color(29, 85, 121));
        Line1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 211), 3));
        Line1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Line1Layout = new javax.swing.GroupLayout(Line1);
        Line1.setLayout(Line1Layout);
        Line1Layout.setHorizontalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        Line1Layout.setVerticalGroup(
            Line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(Line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 472, 270, 3));

        Line2.setBackground(new java.awt.Color(29, 85, 121));
        Line2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 211), 3));
        Line2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Line2Layout = new javax.swing.GroupLayout(Line2);
        Line2.setLayout(Line2Layout);
        Line2Layout.setHorizontalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        Line2Layout.setVerticalGroup(
            Line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(Line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 677, 270, 3));

        Oee.setBackground(new java.awt.Color(33, 36, 41));

        javax.swing.GroupLayout OeeLayout = new javax.swing.GroupLayout(Oee);
        Oee.setLayout(OeeLayout);
        OeeLayout.setHorizontalGroup(
            OeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        OeeLayout.setVerticalGroup(
            OeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(Oee, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 1040, 280));

        Ava.setBackground(new java.awt.Color(33, 36, 41));

        javax.swing.GroupLayout AvaLayout = new javax.swing.GroupLayout(Ava);
        Ava.setLayout(AvaLayout);
        AvaLayout.setHorizontalGroup(
            AvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );
        AvaLayout.setVerticalGroup(
            AvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(Ava, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 336, 290));

        Per.setBackground(new java.awt.Color(33, 36, 41));

        javax.swing.GroupLayout PerLayout = new javax.swing.GroupLayout(Per);
        Per.setLayout(PerLayout);
        PerLayout.setHorizontalGroup(
            PerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        PerLayout.setVerticalGroup(
            PerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(Per, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 460, 340, 290));

        Qua.setBackground(new java.awt.Color(33, 36, 41));

        javax.swing.GroupLayout QuaLayout = new javax.swing.GroupLayout(Qua);
        Qua.setLayout(QuaLayout);
        QuaLayout.setHorizontalGroup(
            QuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );
        QuaLayout.setVerticalGroup(
            QuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(Qua, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 336, 290));

        Header.setBackground(new java.awt.Color(51, 51, 255));
        Header.setForeground(new java.awt.Color(102, 102, 255));
        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 100));

        Nav.setBackground(new java.awt.Color(29, 85, 121));
        Nav.setForeground(new java.awt.Color(29, 85, 121));
        getContentPane().add(Nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 700));

        Body.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 1100, 700));

        fNav.setBackground(new java.awt.Color(29, 85, 121));

        javax.swing.GroupLayout fNavLayout = new javax.swing.GroupLayout(fNav);
        fNav.setLayout(fNavLayout);
        fNavLayout.setHorizontalGroup(
            fNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        fNavLayout.setVerticalGroup(
            fNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        getContentPane().add(fNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 700));

        fBody.setBackground(new java.awt.Color(204, 204, 204));

        Body1.setBackground(new java.awt.Color(232, 236, 241));

        javax.swing.GroupLayout fBodyLayout = new javax.swing.GroupLayout(fBody);
        fBody.setLayout(fBodyLayout);
        fBodyLayout.setHorizontalGroup(
            fBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Body1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fBodyLayout.setVerticalGroup(
            fBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Body1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(fBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 1100, 700));

        Machin1.setBackground(new java.awt.Color(29, 85, 121));
        Machin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Machin1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Machin1Layout = new javax.swing.GroupLayout(Machin1);
        Machin1.setLayout(Machin1Layout);
        Machin1Layout.setHorizontalGroup(
            Machin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        Machin1Layout.setVerticalGroup(
            Machin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(Machin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 34));

        n2.setBackground(new java.awt.Color(29, 85, 121));
        n2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        n2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout n2Layout = new javax.swing.GroupLayout(n2);
        n2.setLayout(n2Layout);
        n2Layout.setHorizontalGroup(
            n2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        n2Layout.setVerticalGroup(
            n2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 300, 34));

        n3.setBackground(new java.awt.Color(29, 85, 121));
        n3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        n3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout n3Layout = new javax.swing.GroupLayout(n3);
        n3.setLayout(n3Layout);
        n3Layout.setHorizontalGroup(
            n3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        n3Layout.setVerticalGroup(
            n3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 236, 300, 34));

        n4.setBackground(new java.awt.Color(29, 85, 121));
        n4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        n4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout n4Layout = new javax.swing.GroupLayout(n4);
        n4.setLayout(n4Layout);
        n4Layout.setHorizontalGroup(
            n4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        n4Layout.setVerticalGroup(
            n4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 300, 34));

        n5.setBackground(new java.awt.Color(29, 85, 121));
        n5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        n5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout n5Layout = new javax.swing.GroupLayout(n5);
        n5.setLayout(n5Layout);
        n5Layout.setHorizontalGroup(
            n5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        n5Layout.setVerticalGroup(
            n5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 304, 300, 34));

        n6.setBackground(new java.awt.Color(29, 85, 121));
        n6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        n6.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout n6Layout = new javax.swing.GroupLayout(n6);
        n6.setLayout(n6Layout);
        n6Layout.setHorizontalGroup(
            n6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        n6Layout.setVerticalGroup(
            n6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 338, 300, 34));

        n7.setBackground(new java.awt.Color(29, 85, 121));
        n7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        n7.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout n7Layout = new javax.swing.GroupLayout(n7);
        n7.setLayout(n7Layout);
        n7Layout.setHorizontalGroup(
            n7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        n7Layout.setVerticalGroup(
            n7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 372, 300, 34));

        machin2.setBackground(new java.awt.Color(29, 85, 121));
        machin2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        machin2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout machin2Layout = new javax.swing.GroupLayout(machin2);
        machin2.setLayout(machin2Layout);
        machin2Layout.setHorizontalGroup(
            machin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        machin2Layout.setVerticalGroup(
            machin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(machin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 422, 300, 34));

        n9.setBackground(new java.awt.Color(29, 85, 121));
        n9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        n9.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout n9Layout = new javax.swing.GroupLayout(n9);
        n9.setLayout(n9Layout);
        n9Layout.setHorizontalGroup(
            n9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        n9Layout.setVerticalGroup(
            n9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 493, 300, 34));

        n10.setBackground(new java.awt.Color(29, 85, 121));
        n10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        n10.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout n10Layout = new javax.swing.GroupLayout(n10);
        n10.setLayout(n10Layout);
        n10Layout.setHorizontalGroup(
            n10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        n10Layout.setVerticalGroup(
            n10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 527, 300, 34));

        machine3.setBackground(new java.awt.Color(29, 85, 121));
        machine3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        machine3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout machine3Layout = new javax.swing.GroupLayout(machine3);
        machine3.setLayout(machine3Layout);
        machine3Layout.setHorizontalGroup(
            machine3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        machine3Layout.setVerticalGroup(
            machine3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(machine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 579, 300, 34));

        n12.setBackground(new java.awt.Color(29, 85, 121));
        n12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        n12.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout n12Layout = new javax.swing.GroupLayout(n12);
        n12.setLayout(n12Layout);
        n12Layout.setHorizontalGroup(
            n12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        n12Layout.setVerticalGroup(
            n12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(n12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 654, 300, 34));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddMouseEntered
        Llenar.Img2Btn(dd, "1DHover");
    }//GEN-LAST:event_ddMouseEntered

    private void ddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddMouseExited
        Llenar.Img2Btn(dd, "1D");
    }//GEN-LAST:event_ddMouseExited

    private void wwMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wwMouseEntered
        Llenar.Img2Btn(ww, "1WHover");
    }//GEN-LAST:event_wwMouseEntered

    private void wwMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wwMouseExited
        Llenar.Img2Btn(ww, "1W");
    }//GEN-LAST:event_wwMouseExited

    private void tub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tub1ActionPerformed

    }//GEN-LAST:event_tub1ActionPerformed

    private void tub1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tub1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tub1KeyPressed

    private void tub1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub1MouseEntered
        Llenar.Img2Btn(tub1, "maq1Hover");
    }//GEN-LAST:event_tub1MouseEntered

    private void tub1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub1MouseExited
        Llenar.Img2Btn(tub1, "maq1");
    }//GEN-LAST:event_tub1MouseExited

    private void tub2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub2MouseEntered
        Llenar.Img2Btn(tub2, "maq2Hover");
    }//GEN-LAST:event_tub2MouseEntered

    private void tub2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub2MouseExited
        Llenar.Img2Btn(tub2, "maq2");
    }//GEN-LAST:event_tub2MouseExited

    private void tub3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub3MouseEntered
         Llenar.Img2Btn(tub3, "maq3Hover");
    }//GEN-LAST:event_tub3MouseEntered

    private void tub3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub3MouseExited
        Llenar.Img2Btn(tub3, "maq3");
    }//GEN-LAST:event_tub3MouseExited

    private void tub4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub4MouseEntered
        Llenar.Img2Btn(tub4, "maq4Hover");
    }//GEN-LAST:event_tub4MouseEntered

    private void tub4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub4MouseExited
        Llenar.Img2Btn(tub4, "maq4");
    }//GEN-LAST:event_tub4MouseExited

    private void tub5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub5MouseEntered
       Llenar.Img2Btn(tub5, "maq5Hover");
    }//GEN-LAST:event_tub5MouseEntered

    private void tub5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub5MouseExited
        Llenar.Img2Btn(tub5, "maq5");
    }//GEN-LAST:event_tub5MouseExited

    private void tub6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub6MouseEntered
        Llenar.Img2Btn(tub6, "maq6Hover");
    }//GEN-LAST:event_tub6MouseEntered

    private void tub6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tub6MouseExited
        Llenar.Img2Btn(tub6, "maq6");
    }//GEN-LAST:event_tub6MouseExited

    private void sliter1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliter1MouseEntered
        Llenar.Img2Btn(sliter1, "maq7Hover");
    }//GEN-LAST:event_sliter1MouseEntered

    private void sliter1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliter1MouseExited
        Llenar.Img2Btn(sliter1, "maq7");
    }//GEN-LAST:event_sliter1MouseExited

    private void sliter3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliter3MouseEntered
       Llenar.Img2Btn(sliter3, "maq9Hover");
    }//GEN-LAST:event_sliter3MouseEntered

    private void sliter3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliter3MouseExited
        Llenar.Img2Btn(sliter3, "maq9");
    }//GEN-LAST:event_sliter3MouseExited

    private void sliter2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliter2MouseEntered
        Llenar.Img2Btn(sliter2, "maq8Hover");
    }//GEN-LAST:event_sliter2MouseEntered

    private void sliter2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliter2MouseExited
        Llenar.Img2Btn(sliter2, "maq8");
    }//GEN-LAST:event_sliter2MouseExited

    private void horno1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horno1MouseEntered
        Llenar.Img2Btn(horno1, "maq10Hover");
    }//GEN-LAST:event_horno1MouseEntered

    private void horno1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horno1MouseExited
        Llenar.Img2Btn(horno1, "maq10");
    }//GEN-LAST:event_horno1MouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        Llenar.Img2Btn(Logout, "LogOutHover");
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        Llenar.Img2Btn(Logout, "LogOut");
    }//GEN-LAST:event_LogoutMouseExited

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OEEGraphics().setVisible(true);
            }
        });
    }
    
    
    public void LlenadoImagenes(){
        
        Llenar.Img2Label(Header,"NewHead");
        Llenar.Img2Label(Nav, "BlueBlock");
        Llenar.Img2Label(Body, "WhiteBlock");
        Llenar.Img2Btn(ww,"1W");
        Llenar.Img2Btn(dd,"1D");
        Llenar.Img2Label(roll, "roll");
        Llenar.Img2Label(slitter, "slitter");
        Llenar.Img2Label(furance, "furance");
        Llenar.Img2Btn(Logout, "LogOut");
        
        //bto
         Llenar.Img2Btn(tub1, "maq1");
         Llenar.Img2Btn(tub2, "maq2");
         Llenar.Img2Btn(tub3, "maq3");
         Llenar.Img2Btn(tub4, "maq4");
         Llenar.Img2Btn(tub5, "maq5");
         Llenar.Img2Btn(tub6, "maq6");
         Llenar.Img2Btn(sliter1, "maq7");
         Llenar.Img2Btn(sliter2, "maq8");
         Llenar.Img2Btn(sliter3, "maq9");
         Llenar.Img2Btn(horno1, "maq10");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ava;
    private javax.swing.JLabel Body;
    private javax.swing.JLabel Body1;
    private javax.swing.JLabel Header;
    private javax.swing.JPanel Line;
    private javax.swing.JPanel Line1;
    private javax.swing.JPanel Line2;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel MACHINE1;
    private javax.swing.JLabel MACHINE2;
    private javax.swing.JLabel MACHINE3;
    private javax.swing.JPanel Machin1;
    private javax.swing.JLabel Nav;
    private javax.swing.JPanel Oee;
    private javax.swing.JPanel Per;
    private javax.swing.JPanel Qua;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton dd;
    private javax.swing.JPanel fBody;
    private javax.swing.JPanel fNav;
    private javax.swing.JLabel furance;
    private javax.swing.JButton horno1;
    private javax.swing.JPanel machin2;
    private javax.swing.JPanel machine3;
    private javax.swing.JPanel n10;
    private javax.swing.JPanel n12;
    private javax.swing.JPanel n2;
    private javax.swing.JPanel n3;
    private javax.swing.JPanel n4;
    private javax.swing.JPanel n5;
    private javax.swing.JPanel n6;
    private javax.swing.JPanel n7;
    private javax.swing.JPanel n9;
    private javax.swing.JLabel roll;
    private javax.swing.JButton sliter1;
    private javax.swing.JButton sliter2;
    private javax.swing.JButton sliter3;
    private javax.swing.JLabel slitter;
    private javax.swing.JButton tub1;
    private javax.swing.JButton tub2;
    private javax.swing.JButton tub3;
    private javax.swing.JButton tub4;
    private javax.swing.JButton tub5;
    private javax.swing.JButton tub6;
    private javax.swing.JButton ww;
    // End of variables declaration//GEN-END:variables



}
