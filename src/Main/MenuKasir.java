/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USER
 */

public class MenuKasir extends javax.swing.JFrame {
         private  DefaultTableModel model;
         int x=0;
         SimpleDateFormat tglFormat = new SimpleDateFormat("yyyy-MM-dd");
         

    /**
     * Creates new form StaffMenu
     */
    public MenuKasir() {
        initComponents();
        isiComboBox();
        model = new DefaultTableModel(){
                        @Override
            public boolean isCellEditable(int row, int column) {
                // Make all cells non-editable
                return false;
            }
        }; 
        model.addColumn("Id Buku"); //menambah column Tanggal ditable model
        model.addColumn("Nama Buku"); //menambah column Judul ditable model
        model.addColumn("Tanggal"); //menambah column Catatan ditable model
        model.addColumn("Jumlah Buku"); 
        model.addColumn("Harga Per Buku"); 
        model.addColumn("Diskon"); 
        model.addColumn("Total Harga"); 
        tblSale.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        tfTotalHarga = new javax.swing.JTextField();
        cmbBuku = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfDiskon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateTanggal = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tfJumlah = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSale = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kasir", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        jLabel1.setText("Nama Buku");

        jLabel2.setText("Tanggal");

        jLabel3.setText("Total Harga");

        jLabel4.setText("Harga Per Buku");

        tfHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHargaActionPerformed(evt);
            }
        });

        tfTotalHarga.setEditable(false);
        tfTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalHargaActionPerformed(evt);
            }
        });

        cmbBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBukuActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/print.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel6.setText("%");

        tfDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiskonActionPerformed(evt);
            }
        });

        jLabel5.setText("Diskon");

        jLabel7.setText("Jumlah Buku");

        tfJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJumlahActionPerformed(evt);
            }
        });

        jLabel9.setText("id_buku");

        tfId.setEditable(false);
        tfId.setBackground(new java.awt.Color(204, 204, 204));
        tfId.setText("Otomatis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addComponent(tfTotalHarga))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(100, 100, 100)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(tfDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jDateTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 108, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrint)
                                .addGap(56, 56, 56)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(71, 71, 71)
                        .addComponent(cmbBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cmbBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDateTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnPrint))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );

        tblSale.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblSale);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(btnKembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalHargaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cmbBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBukuActionPerformed
        // TODO add your handling code here:
        // Koding untuk mendapatkan id buku berdasarkan nama buku yang dipilih
        String selectedNamaBuku = cmbBuku.getSelectedItem().toString();
        loadIdBuku(selectedNamaBuku);
        loadHargaBuku(selectedNamaBuku);
    }//GEN-LAST:event_cmbBukuActionPerformed

    private void tfJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJumlahActionPerformed
        // TODO add your handling code here:
        updateTotalHarga();
    }//GEN-LAST:event_tfJumlahActionPerformed

    private void tfHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHargaActionPerformed
        // TODO add your handling code here:
        updateTotalHarga();
    }//GEN-LAST:event_tfHargaActionPerformed

    private void tfDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiskonActionPerformed
        // TODO add your handling code here:
        updateTotalHarga();
    }//GEN-LAST:event_tfDiskonActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        //Koding untuk btnSimpan yang berfungsi menyimpan data
        String date = tglFormat.format(jDateTanggal.getDate()); 
        //mengambil tanggal dan mengubah formatnya menjadi Hari-Bulan-Tahun
        if ((tfJumlah.getText().equals("") || tfDiskon.equals("")) || tfTotalHarga.equals("")) {
            //if else, jika data kodong maka akan keluar peringatan
            JOptionPane.showMessageDialog(this, "Jumlah, Diskon, dan Total Harga Tidak Boleh Kosong");
        } else {
            // Add a new row to the table model
            model.addRow(new Object[]{ tfId.getText(),cmbBuku.getSelectedItem().toString(), date, 
                tfJumlah.getText(), tfHarga.getText(), tfDiskon.getText(), tfTotalHarga.getText()});
            x = x + 1; //Operasi digunakan untuk menambah row data suapaya tidak bentrok
            tfJumlah.setText(""); //mengosongkan texfield judul
            tfDiskon.setText("");// sama tapi textArea catatan
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                    int selectedRow = tblSale.getSelectedRow();
            if (selectedRow != -1) {
                String date = tglFormat.format(jDateTanggal.getDate());
                // mengupdate row yang telah dipilih
                model.setValueAt(tfId.getText(), selectedRow, 0);
                model.setValueAt(cmbBuku.getSelectedItem().toString(), selectedRow, 1);
                model.setValueAt(date, selectedRow, 2);
                model.setValueAt(tfJumlah.getText(), selectedRow, 3);
                model.setValueAt(tfHarga.getText(), selectedRow, 4);
                model.setValueAt(tfDiskon.getText(), selectedRow, 5);
                model.setValueAt(tfTotalHarga.getText(), selectedRow, 6);
                tfJumlah.setText("");
                tfDiskon.setText("");
                tfTotalHarga.setText("");
            }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSale.getSelectedRow();
        if (selectedRow != -1) {
            // Menghapus row yang dipilih dari tabel
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
                JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                // Format file akan ditentukan dari extension Example: .txt / .csv
                String fileFormat = getFileExtension(selectedFile);

                // FileWriter with append option set to true
                FileWriter out = new FileWriter(selectedFile, true);

                // membaca dan mengubah data dari tabel menjadi string
                for (int row = 0; row < model.getRowCount(); row++) {
                    String id = model.getValueAt(row, 0).toString();
                    String namaBuku = model.getValueAt(row, 1).toString();
                    String tgl = model.getValueAt(row, 2).toString();
                    String jumlahBuku = model.getValueAt(row, 3).toString();
                    String hargaBuku = model.getValueAt(row, 4).toString();
                    String diskon = model.getValueAt(row, 5).toString();
                    String totalHarga = model.getValueAt(row, 6).toString();

                    // menulis data ke file
                    if ("txt".equalsIgnoreCase(fileFormat)) {
                        //jika file menggunakan extensi .txt
                        out.write(id + "\t" + namaBuku + "\t" + tgl + jumlahBuku + "\t" + hargaBuku + "\t" + diskon + "\t" + totalHarga);
                        out.write(System.getProperty("line.separator"));
                    } else if ("csv".equalsIgnoreCase(fileFormat)) {
                        //jika file menggunakan ext4ensi csv
                        out.write(id + "," + namaBuku + "," + tgl + jumlahBuku + "," + hargaBuku + ","  + diskon + "," + totalHarga);
                        out.write(System.getProperty("line.separator"));
                    }
                }

                // Menutup Writer
                out.close();

                JOptionPane.showMessageDialog(this, "Data exported successfully.", "Export Success",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace(); // Handle the exception appropriately
                JOptionPane.showMessageDialog(this, "Error exporting data.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        saveDataToDatabase();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
       MenuBuku menuBuku = new MenuBuku();
       menuBuku.setVisible(true);
        
       this.dispose(); 
    }//GEN-LAST:event_btnKembaliActionPerformed

    private String getFileExtension(File file) {
         //method untuk membaca extensi file
        String fileName = file.getName();
        int lastDotIndex = fileName.lastIndexOf(".");
        if (lastDotIndex > 0 && lastDotIndex < fileName.length() - 1) {
            return fileName.substring(lastDotIndex + 1).toLowerCase();
        }
        return "";
    }
    
    private void loadHargaBuku(String namaBuku) {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_penjualanbuku", "root", "");

        // Query untuk mendapatkan harga buku berdasarkan nama buku
        String query = "SELECT harga FROM tb_buku WHERE nama_buku = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, namaBuku);
        resultSet = preparedStatement.executeQuery();

        // Set nilai harga buku ke tfHargaBuku
        if (resultSet.next()) {
            double hargaBuku = resultSet.getDouble("harga");
            tfHarga.setText(String.format("%.2f", hargaBuku));
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan dalam memuat data buku.", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            // Tutup semua resource
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
    private void saveDataToDatabase() {
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_penjualanbuku", "root", "");

        // Loop melalui setiap baris di tabel sementara (tblSale) dan simpan ke dalam database
        for (int i = 0; i < tblSale.getRowCount(); i++) {
            // Mendapatkan nilai dari setiap kolom dalam baris
            String idBuku = tblSale.getValueAt(i, 0).toString();
            String namaBuku = tblSale.getValueAt(i, 1).toString();
            String tglTransaksi = tblSale.getValueAt(i, 2).toString();
            int jumlahBuku = Integer.parseInt(tblSale.getValueAt(i, 3).toString());
            double harga = Double.parseDouble(tblSale.getValueAt(i, 4).toString());
            double diskon = Double.parseDouble(tblSale.getValueAt(i, 5).toString());
            double totalHarga = Double.parseDouble(tblSale.getValueAt(i, 6).toString());

            // Query untuk menyimpan data ke dalam tb_sale
            String query = "INSERT INTO tb_sale (id_buku, nama_buku, tgl_transaksi, jumlah_buku, harga, diskon, total_harga) VALUES (?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);

            // Set nilai parameter dalam query
            preparedStatement.setString(1, idBuku);
            preparedStatement.setString(2, namaBuku);
            preparedStatement.setString(3, tglTransaksi);
            preparedStatement.setInt(4, jumlahBuku);
            preparedStatement.setDouble(5, harga);
            preparedStatement.setDouble(6, diskon);
            preparedStatement.setDouble(7, totalHarga);

            // Jalankan query untuk menyimpan data
            int result = preparedStatement.executeUpdate();

            // Tampilkan pesan berhasil atau gagal
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke database.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data ke database.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan dalam menyimpan data.", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            // Tutup semua resource
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
    private void loadIdBuku(String namaBuku) {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_penjualanbuku", "root", "");

        // Query untuk mendapatkan id buku berdasarkan nama buku
        String query = "SELECT id_buku FROM tb_buku WHERE nama_buku = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, namaBuku);
        resultSet = preparedStatement.executeQuery();

        // Set nilai id buku ke tfId
        if (resultSet.next()) {
            String idBuku = resultSet.getString("id_buku");
            tfId.setText(idBuku);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan dalam memuat data buku.", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            // Tutup semua resource
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
    private void updateTotalHarga() {
    // Koding untuk menghitung total harga berdasarkan jumlah buku, harga per buku, dan diskon
    try {
        int jumlahBuku = Integer.parseInt(tfJumlah.getText());
        double hargaPerBuku = Double.parseDouble(tfHarga.getText());
        double diskon = Double.parseDouble(tfDiskon.getText());

        // Hitung total harga
        double totalHarga = jumlahBuku * hargaPerBuku * (1 - diskon / 100);

        // Set nilai total harga ke tfTotalHarga
        tfTotalHarga.setText(String.format("%.2f", totalHarga));
    } catch (NumberFormatException e) {
        // Tangani kesalahan jika input tidak valid
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void isiComboBox() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_penjualanbuku", "root", "");
            String query = "SELECT nama_buku FROM tb_buku";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String namaBuku = resultSet.getString("nama_buku");
                    cmbBuku.addItem(namaBuku);
                }

                // Close resources
                resultSet.close();
            }

            // Close resources
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    
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
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuKasir().setVisible(true);
            }
        });
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbBuku;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSale;
    private javax.swing.JTextField tfDiskon;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfJumlah;
    private javax.swing.JTextField tfTotalHarga;
    // End of variables declaration//GEN-END:variables
}
