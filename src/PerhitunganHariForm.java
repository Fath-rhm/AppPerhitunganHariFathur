
public class PerhitunganHariForm extends javax.swing.JFrame {
    
    // Variabel untuk menyimpan dua tanggal yang diklik
    private java.time.LocalDate tanggalAwal = null;
    private java.time.LocalDate tanggalAkhir = null;
    
    public PerhitunganHariForm() {
        initComponents(); 

   
    // Listener untuk JCalendar
    calendar.addPropertyChangeListener("calendar", evt -> {
        java.util.Date selectedDate = calendar.getDate();
        java.time.LocalDate tglDipilih = selectedDate.toInstant()
                .atZone(java.time.ZoneId.systemDefault())
                .toLocalDate();

        if (tanggalAwal == null) {
            tanggalAwal = tglDipilih;
            lblTgl1.setText("Tanggal awal: " + tanggalAwal);
        } else {
            tanggalAkhir = tglDipilih;

            long selisihHari = Math.abs(
                    java.time.temporal.ChronoUnit.DAYS.between(tanggalAwal, tanggalAkhir)
            );

            lblTgl1.setText("Tanggal awal: " + tanggalAwal);
            lblTgl2.setText("Tanggal akhir: " + tanggalAkhir );      
            lblSelisih.setText("Selisih: " + selisihHari + " hari");     

            // Reset agar bisa pilih dua tanggal lagi
            tanggalAwal = null;
            tanggalAkhir = null;
        }
    });
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        comboBulan = new javax.swing.JComboBox<>();
        spinnerTahun = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        calendar = new com.toedter.calendar.JCalendar();
        jLabel4 = new javax.swing.JLabel();
        lblHasil = new javax.swing.JLabel();
        lblHariOne = new javax.swing.JLabel();
        lblHariTwo = new javax.swing.JLabel();
        lblTgl1 = new javax.swing.JLabel();
        lblSelisih = new javax.swing.JLabel();
        lblTgl2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Febuari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        comboBulan.setBorder(null);
        comboBulan.setName("comboBulan"); // NOI18N

        spinnerTahun.setModel(new javax.swing.SpinnerNumberModel(2025, 1, null, 1));
        spinnerTahun.setName("spinTahun"); // NOI18N
        spinnerTahun.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerTahunStateChanged(evt);
            }
        });

        jLabel2.setText("Pilih Bulan");

        jLabel3.setText("Pilih Tahun");

        btnHitung.setText("HITUNG HARI");
        btnHitung.setBorder(null);
        btnHitung.setName("btnHitung"); // NOI18N
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        calendar.setName("calendarTgl"); // NOI18N

        jLabel4.setText("Hasil");

        lblHasil.setText("-");

        lblHariOne.setText("-");

        lblHariTwo.setText("-");

        lblTgl1.setText("-");

        lblSelisih.setText("Pilih 2 tanggal pada calender untuk menentukan selisih");

        lblTgl2.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBulan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinnerTahun)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHariOne)
                                    .addComponent(lblHariTwo)
                                    .addComponent(lblTgl1)
                                    .addComponent(lblHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSelisih)
                                    .addComponent(lblTgl2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHasil)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHariOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHariTwo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTgl1)
                .addGap(7, 7, 7)
                .addComponent(lblTgl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelisih)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnHitung.getAccessibleContext().setAccessibleName("btnHitung");
        btnHitung.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("APLIKASI PERHITUNGAN HARI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
    int bulanIndex = comboBulan.getSelectedIndex() + 1;
    int tahun = (int) spinnerTahun.getValue();
    

    // Gunakan API modern untuk hitung jumlah hari
    java.time.YearMonth yearMonth = java.time.YearMonth.of(tahun, bulanIndex);
    int jumlahHari = yearMonth.lengthOfMonth();
    
    // Tentukan hari pertama dan terakhir
    java.time.LocalDate firstDay = yearMonth.atDay(1);
    java.time.LocalDate lastDay = yearMonth.atEndOfMonth();

    // Format nama hari
    java.time.format.TextStyle style = java.time.format.TextStyle.FULL;
    java.util.Locale locale = new java.util.Locale("id", "ID");

    String hariPertama = firstDay.getDayOfWeek().getDisplayName(style, locale);
    String hariTerakhir = lastDay.getDayOfWeek().getDisplayName(style, locale);

    lblHasil.setText("Jumlah Hari: " + jumlahHari + " hari");
    lblHariOne.setText("Hari pertama: " + hariPertama  + ", " + firstDay.getDayOfMonth() + " " + comboBulan.getSelectedItem());
    lblHariTwo.setText("Hari terakhir: " + hariTerakhir + ", " + lastDay.getDayOfMonth() + " " + comboBulan.getSelectedItem());
    
    
    }//GEN-LAST:event_btnHitungActionPerformed

    
    //Membuat fungsi untuk Jspinner ChanegeListener
    private void updateKalenderDariInput() {
    int bulanIndex = comboBulan.getSelectedIndex();
    int tahun = (int) spinnerTahun.getValue();

    java.util.Calendar cal = new java.util.GregorianCalendar(tahun, bulanIndex, 1);
    calendar.setCalendar(cal);
    }
    
    private void spinnerTahunStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerTahunStateChanged
       // Saat tahun berubah, sinkronkan kalender
    updateKalenderDariInput();
    }//GEN-LAST:event_spinnerTahunStateChanged

 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganHariForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JComboBox<String> comboBulan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHariOne;
    private javax.swing.JLabel lblHariTwo;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblSelisih;
    private javax.swing.JLabel lblTgl1;
    private javax.swing.JLabel lblTgl2;
    private javax.swing.JSpinner spinnerTahun;
    // End of variables declaration//GEN-END:variables
}
