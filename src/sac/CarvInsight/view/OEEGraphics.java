
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
        horno1 = new javax.swing.JButton();
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
        fNav = new javax.swing.JPanel();
        fBody = new javax.swing.JPanel();
        Body = new javax.swing.JLabel();
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

        tub1.setText("jButton1");
        getContentPane().add(tub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 300, 34));

        tub2.setText("jButton1");
        getContentPane().add(tub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 236, 300, 34));

        tub3.setText("jButton1");
        getContentPane().add(tub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 300, 34));

        tub4.setText("jButton1");
        getContentPane().add(tub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 304, 300, 34));

        tub5.setText("jButton1");
        getContentPane().add(tub5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 338, 300, 34));

        tub6.setText("jButton1");
        getContentPane().add(tub6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 372, 300, 34));

        sliter1.setText("jButton1");
        getContentPane().add(sliter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 493, 300, 34));

        sliter2.setText("jButton1");
        getContentPane().add(sliter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 527, 300, 34));

        horno1.setText("jButton1");
        getContentPane().add(horno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 654, 300, 34));
        getContentPane().add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 40, 40));
        getContentPane().add(slitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 40, 40));
        getContentPane().add(furance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 40, 40));

        MACHINE3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MACHINE3.setForeground(new java.awt.Color(255, 255, 255));
        MACHINE3.setText("Furnances machines");
        getContentPane().add(MACHINE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 579, 180, 40));

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

        getContentPane().add(Line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 633, 270, 3));

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

        Body.setBackground(new java.awt.Color(232, 236, 241));

        javax.swing.GroupLayout fBodyLayout = new javax.swing.GroupLayout(fBody);
        fBody.setLayout(fBodyLayout);
        fBodyLayout.setHorizontalGroup(
            fBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fBodyLayout.setVerticalGroup(
            fBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseEntered
        Llenar.Img2Btn(btn_Logout, "btnLogOutHover");
    }//GEN-LAST:event_btn_LogoutMouseEntered

    private void btn_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseExited
        Llenar.Img2Btn(btn_Logout, "btnLogOut");
    }//GEN-LAST:event_btn_LogoutMouseExited

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_LogoutActionPerformed

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
        Llenar.Img2Btn(btn_Logout, "btnLogOut");
        //bto
         Llenar.Img2Btn(tub1, "logo");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ava;
    private javax.swing.JLabel Body;
    private javax.swing.JLabel Header;
    private javax.swing.JPanel Line;
    private javax.swing.JPanel Line1;
    private javax.swing.JPanel Line2;
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
