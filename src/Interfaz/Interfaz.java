package Interfaz;


import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import laboratorio_07ed.Empleado;
import laboratorio_07ed.ListaEmpleados;
import laboratorio_07ed.NodoEmpleado;

public class Interfaz extends javax.swing.JFrame {

    ListaEmpleados lista = new ListaEmpleados();
    
    
    
    public Interfaz() {
        initComponents();
        
        
        
        if(lista.estaVacia()){
            deshabilitar();
        }
    }

    
    public void deshabilitar(){
        BotonConsultar.setEnabled(false);
        BotonEliminar.setEnabled(false);
        BotonActualizar.setEnabled(false);
    }
    
    public void habilitar(){
        BotonConsultar.setEnabled(true);
        BotonEliminar.setEnabled(true);
        BotonActualizar.setEnabled(true);
    }
    
    public boolean camposVacios(){
        return TextApMaterno.getText().isEmpty() || 
                TextApPaterno.getText().isEmpty() ||
                TextNombre.getText().isEmpty() ||
                TextSueldoBase.getText().isEmpty() ||
                TextVentasRealizadas.getText().isEmpty() ||
                TextNumeroHijos.getText().isEmpty();
    }
    
    public void VaciarInputs(){
        TextApMaterno.setText("");
        TextApPaterno.setText("");
        TextNombre.setText("");
        TextSueldoBase.setText("");
        TextVentasRealizadas.setText("");
        TextNumeroHijos.setText("");
    }
    
    public void mostrarEmpleadosTabla(){
        DefaultTableModel modelo = (DefaultTableModel) TablaListaEmpleados.getModel();
        
        NodoEmpleado recorrer = lista.inicio;
        int indice = 1;
        String []infoEmpleado = new String[8];
        
        LimpiarFilasTabla(modelo);
        while(recorrer != null){
            
            infoEmpleado[0] = Integer.toString(indice);
            infoEmpleado[1] = recorrer.dato.nombres;
            infoEmpleado[2] = recorrer.dato.apPat + " " + recorrer.dato.apMat;
            infoEmpleado[3] = Double.toString(recorrer.dato.sueldoBase);
            infoEmpleado[4] = Double.toString(recorrer.dato.ventasRea);
            infoEmpleado[5] = recorrer.dato.estadoCivil;
            infoEmpleado[6] = Integer.toString(recorrer.dato.numHijos);
            infoEmpleado[7] = Double.toString(recorrer.dato.sueldoNeto);
            
            
            
            modelo.addRow(infoEmpleado);
            indice++;
            
            recorrer = recorrer.siguiente;
            
        }
        habilitar();
        VaciarInputs();
        
    }
    
    public void LimpiarFilasTabla(DefaultTableModel model){
            int filas = model.getRowCount();
            for(int i=0; filas>i; i++){
                model.removeRow(0);
            }
    }
    /*CREACIÓN DE TODOS LOS COMPONENTES DE LA INTERFAZ GRÁFICA*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Jpanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEstadoCivil = new javax.swing.JComboBox<>();
        TextNombre = new javax.swing.JTextField();
        ComisionesVentas = new javax.swing.JTextField();
        TextSueldoBase = new javax.swing.JTextField();
        TextNumeroHijos = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonConsultar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        TablaEmpleados = new javax.swing.JScrollPane();
        TablaListaEmpleados = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TextVentasRealizadas = new javax.swing.JTextField();
        TextApPaterno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TextApMaterno = new javax.swing.JTextField();
        DescuentosSeguros = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TextTotalSueldos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TextDescImpuestos = new javax.swing.JTextField();
        BotonGuardarFinal = new javax.swing.JButton();
        BotonEliminarFinal = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("MONTO TOTAL COMISIONES VENTAS");
        Jpanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 800, -1, -1));

        jLabel2.setText("Nombres");
        Jpanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setText("Ap. Paterno");
        Jpanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setText("Ap. Materno");
        Jpanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setText("Sueldo base");
        Jpanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        btnEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLTERO", "CASADO" }));
        btnEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoCivilActionPerformed(evt);
            }
        });
        Jpanel1.add(btnEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 130, -1));

        TextNombre.setName(""); // NOI18N
        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });
        Jpanel1.add(TextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, -1));
        TextNombre.getAccessibleContext().setAccessibleName("");

        ComisionesVentas.setEditable(false);
        Jpanel1.add(ComisionesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 840, 250, -1));
        Jpanel1.add(TextSueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 130, -1));
        Jpanel1.add(TextNumeroHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 130, -1));

        BotonGuardar.setText("Guardar Inicio");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        Jpanel1.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 110, -1));

        BotonConsultar.setText("Consultar");
        BotonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarActionPerformed(evt);
            }
        });
        Jpanel1.add(BotonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 100, -1));

        BotonActualizar.setText("Actualizar");
        Jpanel1.add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 110, -1));

        BotonEliminar.setText("Eliminar Inicio");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        Jpanel1.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 110, -1));

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        Jpanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 100, -1));

        TablaListaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombres", "APELLIDOS", "SUELDO BASE", "VENTAS", "ESTADO CIVIL", "# HIJOS", "SUELDO NETO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaListaEmpleados.getTableHeader().setReorderingAllowed(false);
        TablaEmpleados.setViewportView(TablaListaEmpleados);

        Jpanel1.add(TablaEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 690, 270));

        jLabel9.setText("Ventas realizadas");
        Jpanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel10.setText("Estado civil");
        Jpanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 20));

        jLabel11.setText("Número de hijos");
        Jpanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));
        Jpanel1.add(TextVentasRealizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 130, -1));

        TextApPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextApPaternoActionPerformed(evt);
            }
        });
        Jpanel1.add(TextApPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("LISTAS DOBLEMENTE ENLAZADAS Y LISTAS CIRCULARES");
        Jpanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("LISTA DE EMPLEADOS");
        Jpanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        TextApMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextApMaternoActionPerformed(evt);
            }
        });
        Jpanel1.add(TextApMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, -1));

        DescuentosSeguros.setEditable(false);
        Jpanel1.add(DescuentosSeguros, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 910, 190, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("MONTO TOTAL DE SUELDOS");
        Jpanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 800, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("DESCUENTO POR SEGUROS");
        Jpanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 880, -1, -1));

        TextTotalSueldos.setEditable(false);
        Jpanel1.add(TextTotalSueldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 830, 190, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("DESCUENTO POR IMPUESTOS");
        Jpanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 880, -1, -1));

        TextDescImpuestos.setEditable(false);
        Jpanel1.add(TextDescImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 910, 190, -1));

        BotonGuardarFinal.setText("Guardar Final");
        BotonGuardarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarFinalActionPerformed(evt);
            }
        });
        Jpanel1.add(BotonGuardarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 100, -1));

        BotonEliminarFinal.setText("Eliminar Final");
        BotonEliminarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarFinalActionPerformed(evt);
            }
        });
        Jpanel1.add(BotonEliminarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    /*CONTROLADORES*/
    
    
    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    private void TextApPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextApPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextApPaternoActionPerformed

    private void btnEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoCivilActionPerformed
        // TODO add your handling code here:
        String estadoCivil = (String)btnEstadoCivil.getSelectedItem();
        System.out.println(estadoCivil);
        
    }//GEN-LAST:event_btnEstadoCivilActionPerformed

    private void TextApMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextApMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextApMaternoActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        
        try {
            if(!camposVacios()){
                String nombres    = TextNombre.getText();
                String ApPaterno  = TextApPaterno.getText();
                String ApMaterno  = TextApMaterno.getText();
                double SueldoBase = Double.parseDouble(TextSueldoBase.getText());
                double ventas     = Double.parseDouble(TextVentasRealizadas.getText());
                String EstCivil   = (String)btnEstadoCivil.getSelectedItem();
                int    numHijos   = Integer.parseInt(TextNumeroHijos.getText());
                
                
                if(!(SueldoBase<0 || ventas<0 || numHijos<0)){
                     double comision = (0.05)*ventas;
                    int descuentoSeguro=0;
                
                    if("SOLTERO".equals(EstCivil)){
                        descuentoSeguro = 100;
                    }

                    if("CASADO".equals(EstCivil) & numHijos == 0){
                        descuentoSeguro = 120;
                    }

                    if("CASADO".equals(EstCivil) & numHijos != 0){
                        descuentoSeguro = 50 + 70*numHijos;
                    }

                    double TA = SueldoBase + comision;
                    double DescuentoImpuesto;

                    if(TA>=0 & TA<1500){
                        DescuentoImpuesto = 0;
                    }else if(TA>=1500 & TA<2300){
                        DescuentoImpuesto = (0.03)*TA;
                    }else if(TA>=2300 & TA<3000){
                        DescuentoImpuesto = (0.04)*TA;
                    }else{
                        DescuentoImpuesto = (0.06)*TA;
                    }


                    double SueldoNeto = SueldoBase + comision - descuentoSeguro -DescuentoImpuesto; 
                    SueldoNeto = (double)Math.round(SueldoNeto*100d)/100d;
                    
                    Empleado newEmpleado = new Empleado(nombres, ApMaterno, ApPaterno, SueldoBase, ventas, EstCivil, numHijos, SueldoNeto);
                    lista.agregarAlInicio(newEmpleado);
                    mostrarEmpleadosTabla();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "CAMPOS NUMÉRICOS NO PUEDEN SER MENORES A 0",
                                                    "ERROR DE VALIDACIÓN", JOptionPane.ERROR_MESSAGE);
                }
               
            }
            else{
                JOptionPane.showMessageDialog(null, "Llenar todos los campos",
                                               "ERROR DE VALIDACIÓN", 
                                               JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Verifico el tipo de dato de los campos");
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonConsultarActionPerformed

    
    
    
    
    
    
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // TODO add your handling code here:
        Empleado dato = lista.inicio.dato;
        if(lista.inicio == lista.fin){
            lista.inicio = lista.fin = null;
        }else{
            lista.inicio = lista.inicio.siguiente;
            lista.inicio.anterior = null;
        }
        mostrarEmpleadosTabla();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonEliminarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarFinalActionPerformed
        // TODO add your handling code here:
        Empleado dato = lista.fin.dato;
        if(lista.inicio == lista.fin){
            lista.inicio = lista.fin = null;
        }else{
            lista.fin = lista.fin.anterior;
            lista.fin.siguiente = null;
        }
        
        mostrarEmpleadosTabla();
    }//GEN-LAST:event_BotonEliminarFinalActionPerformed

    private void BotonGuardarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarFinalActionPerformed
        // TODO add your handling code here:
         try {
            if(!camposVacios()){
                String nombres    = TextNombre.getText();
                String ApPaterno  = TextApPaterno.getText();
                String ApMaterno  = TextApMaterno.getText();
                double SueldoBase = Double.parseDouble(TextSueldoBase.getText());
                double ventas     = Double.parseDouble(TextVentasRealizadas.getText());
                String EstCivil   = (String)btnEstadoCivil.getSelectedItem();
                int    numHijos   = Integer.parseInt(TextNumeroHijos.getText());
                
                
                if(!(SueldoBase<0 || ventas<0 || numHijos<0)){
                     double comision = (0.05)*ventas;
                    int descuentoSeguro=0;
                
                    if("SOLTERO".equals(EstCivil)){
                        descuentoSeguro = 100;
                    }

                    if("CASADO".equals(EstCivil) & numHijos == 0){
                        descuentoSeguro = 120;
                    }

                    if("CASADO".equals(EstCivil) & numHijos != 0){
                        descuentoSeguro = 50 + 70*numHijos;
                    }

                    double TA = SueldoBase + comision;
                    double DescuentoImpuesto;

                    if(TA>=0 & TA<1500){
                        DescuentoImpuesto = 0;
                    }else if(TA>=1500 & TA<2300){
                        DescuentoImpuesto = (0.03)*TA;
                    }else if(TA>=2300 & TA<3000){
                        DescuentoImpuesto = (0.04)*TA;
                    }else{
                        DescuentoImpuesto = (0.06)*TA;
                    }


                    double SueldoNeto = SueldoBase + comision - descuentoSeguro -DescuentoImpuesto; 
                    SueldoNeto = (double)Math.round(SueldoNeto*100d)/100d;
                    
                    Empleado newEmpleado = new Empleado(nombres, ApMaterno, ApPaterno, SueldoBase, ventas, EstCivil, numHijos, SueldoNeto);
                    lista.agregarAlFinal(newEmpleado);
                    mostrarEmpleadosTabla();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "CAMPOS NUMÉRICOS NO PUEDEN SER MENORES A 0",
                                                    "ERROR DE VALIDACIÓN", JOptionPane.ERROR_MESSAGE);
                }
               
            }
            else{
                JOptionPane.showMessageDialog(null, "Llenar todos los campos",
                                               "ERROR DE VALIDACIÓN", 
                                               JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Re");
        }
    }//GEN-LAST:event_BotonGuardarFinalActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonConsultar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonEliminarFinal;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonGuardarFinal;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField ComisionesVentas;
    private javax.swing.JTextField DescuentosSeguros;
    private javax.swing.JPanel Jpanel1;
    private javax.swing.JScrollPane TablaEmpleados;
    private javax.swing.JTable TablaListaEmpleados;
    private javax.swing.JTextField TextApMaterno;
    private javax.swing.JTextField TextApPaterno;
    private javax.swing.JTextField TextDescImpuestos;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextNumeroHijos;
    private javax.swing.JTextField TextSueldoBase;
    private javax.swing.JTextField TextTotalSueldos;
    private javax.swing.JTextField TextVentasRealizadas;
    private javax.swing.JComboBox<String> btnEstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
