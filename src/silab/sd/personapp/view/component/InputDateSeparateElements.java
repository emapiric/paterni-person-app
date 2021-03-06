/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.view.component;

import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author EMA
 */
public class InputDateSeparateElements extends javax.swing.JPanel implements GetValue{

    /**
     * Creates new form InputDateSeparateElements
     */
    public InputDateSeparateElements() {
        initComponents();
        prepareComponent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblText = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox<>();
        cbDay = new javax.swing.JComboBox<>();
        cbMonth = new javax.swing.JComboBox<>();
        lblErrorValue = new javax.swing.JLabel();

        lblText.setText("jLabel1");

        lblErrorValue.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorValue.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorValue)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblText)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorValue))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JComboBox<Integer> getCbDay() {
        return cbDay;
    }

    public JComboBox<Integer> getCbMonth() {
        return cbMonth;
    }

    public JComboBox<Integer> getCbYear() {
        return cbYear;
    }

    public JLabel getLblErrorValue() {
        return lblErrorValue;
    }

    public JLabel getLblText() {
        return lblText;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Integer> cbDay;
    private javax.swing.JComboBox<Integer> cbMonth;
    private javax.swing.JComboBox<Integer> cbYear;
    private javax.swing.JLabel lblErrorValue;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables

    private void prepareComponent() {
        for (int i = 1; i< 31; i++) {
            cbDay.addItem(i);
        }
         for (int i = 1; i< 12; i++) {
            cbMonth.addItem(i);
        }
          for (int i = 1900; i< 2020; i++) {
            cbYear.addItem(i);
        }
    }

    @Override
    public Object getValue() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d.m.yyyy");
        return sdf.parse(cbDay.getSelectedItem()+"."+cbMonth.getSelectedItem()+"."+cbYear.getSelectedItem()+".");
    }
}
