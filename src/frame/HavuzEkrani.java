/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import dao.HavuzDao;
import entity.Havuz;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author cemr_
 */
public class HavuzEkrani extends javax.swing.JDialog {

    DefaultTableModel model;

    HavuzDao havuzDao = new HavuzDao();

    Havuz havuz = new Havuz();

    /**
     * Creates new form HavuzEkrani
     */
    public HavuzEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) table_alani.getModel();
        havuzGoruntule();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_alani = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        havuz_no_alani = new javax.swing.JTextField();
        kategori_alani = new javax.swing.JTextField();
        miktar_alani = new javax.swing.JTextField();
        balik_cinsi_alani = new javax.swing.JTextField();
        tarih_alani = new javax.swing.JTextField();
        ekle_button = new javax.swing.JButton();
        guncelle_button = new javax.swing.JButton();
        sil_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        arama_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        balik_sayisi_alani = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setForeground(new java.awt.Color(0, 51, 255));

        table_alani.setBackground(new java.awt.Color(255, 51, 255));
        table_alani.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Havuz No", "Yem Kategori", "Yem Miktar", "Balik Cinsi", "Balık Sayısı", "Yem Verme Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_alani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_alaniMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_alani);
        if (table_alani.getColumnModel().getColumnCount() > 0) {
            table_alani.getColumnModel().getColumn(0).setResizable(false);
            table_alani.getColumnModel().getColumn(2).setResizable(false);
            table_alani.getColumnModel().getColumn(3).setResizable(false);
            table_alani.getColumnModel().getColumn(4).setResizable(false);
            table_alani.getColumnModel().getColumn(5).setResizable(false);
            table_alani.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setText("Havuz No : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("Yem Katgori(milim) : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Yem Miktar(kg) : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Balik Cinsi : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Tarih : ");

        ekle_button.setBackground(new java.awt.Color(51, 255, 102));
        ekle_button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ekle_button.setText("Havuz Ekle");
        ekle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_buttonActionPerformed(evt);
            }
        });

        guncelle_button.setBackground(new java.awt.Color(51, 255, 51));
        guncelle_button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        guncelle_button.setText("Havuz Guncelle");
        guncelle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_buttonActionPerformed(evt);
            }
        });

        sil_button.setBackground(new java.awt.Color(51, 255, 51));
        sil_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sil_button.setText("Havuz Sil");
        sil_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_buttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Ara : ");

        arama_alani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_alaniKeyReleased(evt);
            }
        });

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("Havudaki Balık Sayisi :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("Havuz Ekrani");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(havuz_no_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(balik_sayisi_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(balik_cinsi_alani)
                                    .addComponent(miktar_alani)
                                    .addComponent(kategori_alani)
                                    .addComponent(tarih_alani))))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guncelle_button, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(sil_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ekle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 539, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(arama_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arama_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(havuz_no_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekle_button))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kategori_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(miktar_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelle_button))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(balik_cinsi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(balik_sayisi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil_button))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bosalt() {
        havuz_no_alani.setText("");
        kategori_alani.setText("");
        miktar_alani.setText("");
        balik_cinsi_alani.setText("");
        balik_sayisi_alani.setText("");
        tarih_alani.setText("");
    }

    private void table_alaniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_alaniMouseClicked
        // TODO add your handling code here:
        int selectedRow = table_alani.getSelectedRow();

        havuz_no_alani.setText(model.getValueAt(selectedRow, 1).toString());
        kategori_alani.setText(model.getValueAt(selectedRow, 2).toString());
        miktar_alani.setText(model.getValueAt(selectedRow, 3).toString());
        balik_cinsi_alani.setText(model.getValueAt(selectedRow, 4).toString());
        balik_sayisi_alani.setText(model.getValueAt(selectedRow, 5).toString());
        tarih_alani.setText(model.getValueAt(selectedRow, 6).toString());
    }//GEN-LAST:event_table_alaniMouseClicked
    public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        table_alani.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    private void arama_alaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_alaniKeyReleased
        // TODO add your handling code here:
        String ara = arama_alani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_arama_alaniKeyReleased

    private void ekle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_buttonActionPerformed
        // TODO add your handling code here:
        mesaj_yazisi.setText("");

        String havuz_no = havuz_no_alani.getText();
        String kategori = kategori_alani.getText();
        String miktar = miktar_alani.getText();
        String balikCins = balik_cinsi_alani.getText();
        String balikSayisi = balik_sayisi_alani.getText();
        String tarih = tarih_alani.getText();

        boolean kontrol = havuzDao.kontrolYap(havuz_no,balikCins,balikSayisi,tarih);
        
        if (havuz_no.equals("") || kategori.equals("") || miktar.equals("") || balikCins.equals("") || balikSayisi.equals("") || tarih.equals("")) {

            JOptionPane.showMessageDialog(this, "Lutfen gerekli alanları doldurunuz ...");
            
        }else if (!kontrol) {
             JOptionPane.showMessageDialog(this, "Boyle bir kayıt zaten mevcut");
        }
        else {
            havuzDao.ekleHavuz(havuz_no, kategori, miktar, balikCins, balikSayisi, tarih);

            mesaj_yazisi.setText("Havuz basarıyla eklendi");
            
        }

        havuzGoruntule();
        bosalt();
    }//GEN-LAST:event_ekle_buttonActionPerformed

    private void guncelle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_buttonActionPerformed
        // TODO add your handling code here:
        mesaj_yazisi.setText("");

        String havuz_no = havuz_no_alani.getText();
        String kategori = kategori_alani.getText();
        String miktar = miktar_alani.getText();
        String balikCins = balik_cinsi_alani.getText();
        String balikSayisi = balik_sayisi_alani.getText();
        String tarih = tarih_alani.getText();

        int selectedRow = table_alani.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("balık tablosu suanda bos");
            } else {
                mesaj_yazisi.setText("lutfen guncellenecek bir balık seçiniz?");
            }

        } else {
            long id = (long) model.getValueAt(selectedRow, 0);
            if (true) {
                havuzDao.guncelleHavuz(id, havuz_no, kategori, miktar, balikCins, balikSayisi, tarih);
                clearForm();
                mesaj_yazisi.setText("Balık basarıyla guncellendi");
            } else {
                mesaj_yazisi.setText("balık guncellenirken bir hata olustu ...lütfen tekrar deneyin..");
            }

            havuzGoruntule();
            bosalt();
        }
    }//GEN-LAST:event_guncelle_buttonActionPerformed

    private void sil_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_buttonActionPerformed
        // TODO add your handling code here:

        int selectedRow = table_alani.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Havuz tablosu suanda bos");
            } else {
                mesaj_yazisi.setText("lutfen silinecek bir Havuz seçiniz?");
            }

        } else {
            long id = (long) model.getValueAt(selectedRow, 0);
            if (true) {
                havuzDao.silHavuz(id);
                clearForm();
                mesaj_yazisi.setText("Havuz basarıyla silindi");
            } else {
                mesaj_yazisi.setText("Havuz silinirken bir hata olustu ...lütfen tekrar deneyin..");
            }

        }
        havuzGoruntule();
        bosalt();
    }//GEN-LAST:event_sil_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(HavuzEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HavuzEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HavuzEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HavuzEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HavuzEkrani dialog = new HavuzEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_alani;
    private javax.swing.JTextField balik_cinsi_alani;
    private javax.swing.JTextField balik_sayisi_alani;
    private javax.swing.JButton ekle_button;
    private javax.swing.JButton guncelle_button;
    private javax.swing.JTextField havuz_no_alani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kategori_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField miktar_alani;
    private javax.swing.JButton sil_button;
    private javax.swing.JTable table_alani;
    private javax.swing.JTextField tarih_alani;
    // End of variables declaration//GEN-END:variables

    public void clearForm() {
        this.havuz = new Havuz();
    }

    private void havuzGoruntule() {
        model.setRowCount(0);

        ArrayList<Havuz> havuzs = new ArrayList<>();

        havuzs = havuzDao.havuzList();

        if (havuzs != null) {
            for (Havuz havuz : havuzs) {
                Object[] eklenecek = {
                    havuz.getId(), havuz.getHavuzNo(), havuz.getYemKategori(), havuz.getYemMiktar(), havuz.getBalikCinsi(), havuz.getHavuzdakiBalikSayisi(), havuz.getGelmeTarihi()
                };
                model.addRow(eklenecek);
            }
        } else {
            System.err.println("hata");
        }
    }
}
