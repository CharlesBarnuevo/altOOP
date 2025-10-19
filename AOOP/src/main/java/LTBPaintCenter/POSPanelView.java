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
        allPaintToggleButton = new javax.swing.JToggleButton();
        acrylicPaintToggleButton = new javax.swing.JToggleButton();
        enamelPaintToggleButton = new javax.swing.JToggleButton();
        oilPaintToggleButton = new javax.swing.JToggleButton();
        latexPaintToggleButton = new javax.swing.JToggleButton();
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

        PaintButtonsGroup.add(allPaintToggleButton);
        allPaintToggleButton.setText("ALL");
        allPaintToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allPaintToggleButtonActionPerformed(evt);
            }
        });

        PaintButtonsGroup.add(acrylicPaintToggleButton);
        acrylicPaintToggleButton.setText("Acrylic Paint");
        acrylicPaintToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acrylicPaintToggleButtonActionPerformed(evt);
            }
        });

        PaintButtonsGroup.add(enamelPaintToggleButton);
        enamelPaintToggleButton.setText("Enamel Paint");
        enamelPaintToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamelPaintToggleButtonActionPerformed(evt);
            }
        });

        PaintButtonsGroup.add(oilPaintToggleButton);
        oilPaintToggleButton.setText("Oil Paint");
        oilPaintToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilPaintToggleButtonActionPerformed(evt);
            }
        });

        PaintButtonsGroup.add(latexPaintToggleButton);
        latexPaintToggleButton.setText("Latex");
        latexPaintToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latexPaintToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(allPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acrylicPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enamelPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oilPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(latexPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acrylicPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enamelPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oilPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latexPaintToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void allPaintToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allPaintToggleButtonActionPerformed
        ALLPaintPanelView all = new ALLPaintPanelView();
        jpload.jPanelLoader(paintPanelLoad, all);
    }//GEN-LAST:event_allPaintToggleButtonActionPerformed

    private void acrylicPaintToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acrylicPaintToggleButtonActionPerformed
        AcrylicPaintPanelView acr =  new AcrylicPaintPanelView();
        jpload.jPanelLoader(paintPanelLoad, acr);
    }//GEN-LAST:event_acrylicPaintToggleButtonActionPerformed

    private void enamelPaintToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamelPaintToggleButtonActionPerformed
        EnamelPaintPanelView ena = new EnamelPaintPanelView();
        jpload.jPanelLoader(paintPanelLoad, ena);
    }//GEN-LAST:event_enamelPaintToggleButtonActionPerformed

    private void oilPaintToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilPaintToggleButtonActionPerformed
        OilPaintPanelView oil = new OilPaintPanelView();
        jpload.jPanelLoader(paintPanelLoad, oil);
    }//GEN-LAST:event_oilPaintToggleButtonActionPerformed

    private void latexPaintToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latexPaintToggleButtonActionPerformed
        LatexPaintPanelView latx = new LatexPaintPanelView();
        jpload.jPanelLoader(paintPanelLoad, latx);
    }//GEN-LAST:event_latexPaintToggleButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup PaintButtonsGroup;
    private javax.swing.JToggleButton acrylicPaintToggleButton;
    private javax.swing.JToggleButton allPaintToggleButton;
    private javax.swing.JToggleButton enamelPaintToggleButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton latexPaintToggleButton;
    private javax.swing.JToggleButton oilPaintToggleButton;
    private javax.swing.JPanel paintPanelLoad;
    // End of variables declaration//GEN-END:variables
}
