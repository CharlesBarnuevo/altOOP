package LTBPaintCenter;

public class EnamelPaintPanelView extends javax.swing.JPanel
{
    public EnamelPaintPanelView()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        redToggleButton = new javax.swing.JToggleButton();
        blueToggleButton = new javax.swing.JToggleButton();
        blackToggleButton = new javax.swing.JToggleButton();
        whiteToggleButton = new javax.swing.JToggleButton();
        greenToggleButton = new javax.swing.JToggleButton();
        yellowToggleButton = new javax.swing.JToggleButton();
        pinkToggleButton = new javax.swing.JToggleButton();
        purpleToggleButton = new javax.swing.JToggleButton();
        orangeToggleButton = new javax.swing.JToggleButton();
        brownToggleButton = new javax.swing.JToggleButton();
        beigeToggleButton = new javax.swing.JToggleButton();
        greyToggleButton = new javax.swing.JToggleButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(991, 1000));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(991, 658));

        jPanel1.setPreferredSize(new java.awt.Dimension(991, 1000));

        redToggleButton.setText("Boysen Enamel - Red");

        blueToggleButton.setText("Boysen Enamel - Blue");

        blackToggleButton.setText("Boysen Enamel - Black");

        whiteToggleButton.setText("Boysen Enamel - White");
        whiteToggleButton.setPreferredSize(new java.awt.Dimension(200, 200));
        whiteToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteToggleButtonActionPerformed(evt);
            }
        });

        greenToggleButton.setText("Boysen Enamel - Green");
        greenToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenToggleButtonActionPerformed(evt);
            }
        });

        yellowToggleButton.setText("Boysen Enamel - Yellow");
        yellowToggleButton.setPreferredSize(new java.awt.Dimension(200, 200));
        yellowToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowToggleButtonActionPerformed(evt);
            }
        });

        pinkToggleButton.setText("Boysen Enamel - Pink");
        pinkToggleButton.setPreferredSize(new java.awt.Dimension(200, 200));
        pinkToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkToggleButtonActionPerformed(evt);
            }
        });

        purpleToggleButton.setText("Boysen Enamel - Purple");
        purpleToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleToggleButtonActionPerformed(evt);
            }
        });

        orangeToggleButton.setText("Boysen Enamel - Orange");
        orangeToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeToggleButtonActionPerformed(evt);
            }
        });

        brownToggleButton.setText("Boysen Enamel - Brown");
        brownToggleButton.setPreferredSize(new java.awt.Dimension(200, 200));
        brownToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brownToggleButtonActionPerformed(evt);
            }
        });

        beigeToggleButton.setText("Boysen Enamel - Beige");
        beigeToggleButton.setPreferredSize(new java.awt.Dimension(200, 200));
        beigeToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beigeToggleButtonActionPerformed(evt);
            }
        });

        greyToggleButton.setText("Boysen Enamel - Grey");
        greyToggleButton.setPreferredSize(new java.awt.Dimension(200, 200));
        greyToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greyToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yellowToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pinkToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(whiteToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(greenToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brownToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blackToggleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(redToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orangeToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(greyToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purpleToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beigeToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whiteToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blackToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yellowToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purpleToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orangeToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinkToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brownToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beigeToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greyToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 338, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void greenToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greenToggleButtonActionPerformed

    private void pinkToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinkToggleButtonActionPerformed

    private void purpleToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purpleToggleButtonActionPerformed

    private void orangeToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangeToggleButtonActionPerformed

    private void brownToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brownToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brownToggleButtonActionPerformed

    private void beigeToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beigeToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beigeToggleButtonActionPerformed

    private void greyToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greyToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greyToggleButtonActionPerformed

    private void whiteToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whiteToggleButtonActionPerformed

    private void yellowToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yellowToggleButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton beigeToggleButton;
    private javax.swing.JToggleButton blackToggleButton;
    private javax.swing.JToggleButton blueToggleButton;
    private javax.swing.JToggleButton brownToggleButton;
    private javax.swing.JToggleButton greenToggleButton;
    private javax.swing.JToggleButton greyToggleButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton orangeToggleButton;
    private javax.swing.JToggleButton pinkToggleButton;
    private javax.swing.JToggleButton purpleToggleButton;
    private javax.swing.JToggleButton redToggleButton;
    private javax.swing.JToggleButton whiteToggleButton;
    private javax.swing.JToggleButton yellowToggleButton;
    // End of variables declaration//GEN-END:variables
}
