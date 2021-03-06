/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera.Empleados;

/**
 *
 * @author User
 */
public class GestiondeEmpleados extends javax.swing.JPanel {
        private ConsultaEmpleados consulta= new ConsultaEmpleados();
        private ContratarEmpleado contratar= new ContratarEmpleado();
        private DespedirEmpleado despedir= new DespedirEmpleado();
        private EditarEmpleado editar= new EditarEmpleado();
    /**
     * Creates new form GestiondeEmpleados
     */
    public GestiondeEmpleados() {
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

        Superp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Listado = new javax.swing.JButton();
        Contratar = new javax.swing.JButton();
        Despedir = new javax.swing.JButton();
        Editar = new javax.swing.JButton();

        Superp.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel1.setText("GESTIÓN DE EMPLEADOS");

        Listado.setText("Lista de Empleados");
        Listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoActionPerformed(evt);
            }
        });

        Contratar.setText("Contratar Empleado");
        Contratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratarActionPerformed(evt);
            }
        });

        Despedir.setText("Despedir Empleado");
        Despedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DespedirActionPerformed(evt);
            }
        });

        Editar.setText("Cambiar datos");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Despedir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Contratar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Listado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Superp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(Contratar)
                        .addGap(12, 12, 12)
                        .addComponent(Despedir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Listado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Editar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Superp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoActionPerformed
        Superp.setVisible(false);
        Superp.removeAll();
        Superp.add(consulta);
        Superp.setVisible(true);
    }//GEN-LAST:event_ListadoActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        Superp.setVisible(false);
        Superp.removeAll();
        Superp.add(editar);
        Superp.setVisible(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void DespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DespedirActionPerformed
        Superp.setVisible(false);
        Superp.removeAll();
        Superp.add(despedir);
        Superp.setVisible(true);
    }//GEN-LAST:event_DespedirActionPerformed

    private void ContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratarActionPerformed
        Superp.setVisible(false);
        Superp.removeAll();
        Superp.add(contratar);
        Superp.setVisible(true);
    }//GEN-LAST:event_ContratarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Contratar;
    private javax.swing.JButton Despedir;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Listado;
    private javax.swing.JPanel Superp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
