package LTBPaintCenter;

public class POSPanelView extends javax.swing.JPanel
{
    JpanelLoader jpload = new JpanelLoader();
    
    public POSPanelView()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaintButtonsGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        allPaintButton = new javax.swing.JToggleButton();
        acrylicPaintButton = new javax.swing.JToggleButton();
        enamelPaintButton = new javax.swing.JToggleButton();
        oilPaintButton = new javax.swing.JToggleButton();
        latexPaintButton = new javax.swing.JToggleButton();
        paintPanelLoad = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1300, 780));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PaintButtonsGroup.add(allPaintButton);
        allPaintButton.setText("ALL");
        allPaintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allPaintButtonActionPerformed(evt);
            }
        });

        PaintButtonsGroup.add(acrylicPaintButton);
        acrylicPaintButton.setText("Acrylic Paint");
        acrylicPaintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acrylicPaintButtonActionPerformed(evt);
            }
        });

        PaintButtonsGroup.add(enamelPaintButton);
        enamelPaintButton.setText("Enamel Paint");
        enamelPaintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamelPaintButtonActionPerformed(evt);
            }
        });

        PaintButtonsGroup.add(oilPaintButton);
        oilPaintButton.setText("Oil Paint");
        oilPaintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilPaintButtonActionPerformed(evt);
            }
        });

        PaintButtonsGroup.add(latexPaintButton);
        latexPaintButton.setText("Latex");
        latexPaintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latexPaintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(allPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acrylicPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enamelPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oilPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(latexPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acrylicPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enamelPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oilPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latexPaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        paintPanelLoad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        paintPanelLoad.setPreferredSize(new java.awt.Dimension(991, 658));

        javax.swing.GroupLayout paintPanelLoadLayout = new javax.swing.GroupLayout(paintPanelLoad);
        paintPanelLoad.setLayout(paintPanelLoadLayout);
        paintPanelLoadLayout.setHorizontalGroup(
            paintPanelLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paintPanelLoadLayout.setVerticalGroup(
            paintPanelLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paintPanelLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paintPanelLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void allPaintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allPaintButtonActionPerformed
        ALLPaintPanelView all = new ALLPaintPanelView();
        jpload.jPanelLoader(paintPanelLoad, all);
    }//GEN-LAST:event_allPaintButtonActionPerformed

    private void acrylicPaintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acrylicPaintButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acrylicPaintButtonActionPerformed

    private void enamelPaintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamelPaintButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enamelPaintButtonActionPerformed

    private void oilPaintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilPaintButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oilPaintButtonActionPerformed

    private void latexPaintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latexPaintButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latexPaintButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup PaintButtonsGroup;
    private javax.swing.JToggleButton acrylicPaintButton;
    private javax.swing.JToggleButton allPaintButton;
    private javax.swing.JToggleButton enamelPaintButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton latexPaintButton;
    private javax.swing.JToggleButton oilPaintButton;
    private javax.swing.JPanel paintPanelLoad;
    // End of variables declaration//GEN-END:variables
}
