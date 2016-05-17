
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSrc1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtRes1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtRes21 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbBln = new javax.swing.JComboBox();
        btnLoad = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSrc = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRes2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EF-NR COPAS TOOL");
        setResizable(false);

        txtSrc1.setColumns(20);
        txtSrc1.setRows(5);
        txtSrc1.setText("PT. ENSEVAL PUTERA MEGATRADING TBK                                  REGISTER PENJUALAN RUTIN (CREDIT MEMO) APR-2016 *                           USER : PTK_AKS_01\nBCustome PONTIANAK                                                                 Masa Pajak : APR-16                                          PRINT DATE : 13-MAY-2016 02:01:29\n                                                                                  Jenis Faktur Pajak :                                          PAGE : 1 OF 38\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nNomor    Tgl Faktur   No          No                                                               -------------------------------- N   i   l   a   i----------------------------  No. Ex               Tgl. Ex\nSeri     Pajak        Invoice     Customer  NPWP                  Langganan                                   Jual         Potongan           D.P.P           P.P.N      Dokumen   Faktur Pajak         Fakt Pajak\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n173/NR/H 11-APR-16    416002295  916295    03.208.337.0-701.000  RS. MITRA MEDIKA                       -6,945,000                0      -6,945,000        -694,500    -7,639,500 010.000-16.89900969     01-APR-16\nDM/IV/20\n16\n                                                                                                   ------------------------------------------------------------------------------\n** Grand Total **                                                                                       -6,945,000                0      -6,945,000        -694,500    -7,639,500\n");
        jScrollPane4.setViewportView(txtSrc1);

        txtRes1.setColumns(2);
        txtRes1.setRows(5);
        jScrollPane5.setViewportView(txtRes1);

        txtRes21.setColumns(2);
        txtRes21.setRows(5);
        jScrollPane6.setViewportView(txtRes21);

        jButton4.setText("SUBMIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Source");

        jLabel2.setText("Count");

        jLabel3.setText("DPP+PPN");

        btnLoad.setText("LOAD");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbBln, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLoad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(btnLoad)
                            .addComponent(cmbBln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("REGISTER PENJUALAN CREDIT MEMO", jPanel2);

        txtSrc.setColumns(20);
        txtSrc.setRows(5);
        jScrollPane1.setViewportView(txtSrc);

        txtRes.setColumns(2);
        txtRes.setRows(5);
        jScrollPane2.setViewportView(txtRes);

        txtRes2.setColumns(2);
        txtRes2.setRows(5);
        jScrollPane3.setViewportView(txtRes2);

        jButton1.setText("REJECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Source");

        jLabel5.setText("Count");

        jLabel6.setText("DPP+PPN");

        jButton3.setText("SUCCESS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("BUKAN ETAX");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("EFAKTUR", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        for (String line : txtSrc.getText().split("\\n")) {
//            if(line.contains("Reject")){
//                System.out.println(line.split("	")[5].split(" ")[2]);
//                System.out.println(line.split("	")[8]);
//                System.out.println(line.split("	")[9]);
//            }
//        }
//        
        txtRes.setText("");
        txtRes2.setText("");
        Map<Integer, List<Data>> m = new HashMap<Integer, List<Data>>();
        List<Data> listEF = new ArrayList<Data>();
        for (String line : txtSrc.getText().split("\\n")) {
            if (line.contains("Reject")) {
                try {

                    Data efk = new Data();
                    efk.setTanggal(line.split("	")[5].split(" ")[2]);
                    efk.setNilaiDPP(Long.valueOf(line.split("	")[8]));
                    efk.setNilaiPPN(Long.valueOf(line.split("	")[9]));
                    listEF.add(efk);
                } catch (Exception exception) {
                }
            }

        }

        for (Data efk : listEF) {
            List<Data> lst = m.get(Integer.valueOf(efk.getTanggal()));
            if (lst == null) {

                lst = new ArrayList<Data>();
            }
            lst.add(efk);
            m.put(Integer.valueOf(efk.getTanggal()), lst);
        }

        StringBuilder sbJml = new StringBuilder();
        StringBuilder sbNilai = new StringBuilder();
        for (int i = 1; i <= 31; i++) {
            if (m.get(i) != null) {
                sbJml.append(m.get(i).size()).append("\n");

                long nilai = 0L;
                for (Data ef : m.get(i)) {
                    nilai += (ef.getNilaiPPN() + ef.getNilaiDPP());
                }
                sbNilai.append(Long.toString(nilai)).append("\n");
            } else {
                sbJml.append("\n");
                sbNilai.append("\n");
            }
        }

        txtRes.setText(sbJml.toString());
        txtRes2.setText(sbNilai.toString());
        txtRes.setCaretPosition(0);
        txtRes2.setCaretPosition(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        txtRes2.setText("");
        txtRes21.setText("");
        Map<Integer, List<Data>> m = new HashMap<Integer, List<Data>>();
        List<Data> listEF = new ArrayList<Data>();
        for (String line : txtSrc1.getText().split("\\n")) {

            //  System.out.println(line.substring(9, 15));
            try {
                Data efk = new Data();
                efk.setTanggal(line.substring(9, 15));
                efk.setNilaiDPP(Long.valueOf(line.substring(132, 148)
                        .trim()
                        .replace("-", "")
                        .replace(",", "")));
                efk.setNilaiPPN(Long.valueOf(line.substring(148, 164)
                        .trim()
                        .replace("-", "")
                        .replace(",", "")));

                if (Character.isDigit(efk.getTanggal().charAt(0))) {
                    listEF.add(efk);
                }

            } catch (Exception exception) {
            }

        }

        for (Data efk : listEF) {

            //System.out.println(efk.getTanggal().substring(0, 2));
            try {
                if (efk.getTanggal().split("-")[1].equals(cmbBln.getSelectedItem().toString())) {
                    List<Data> lst = m.get(Integer.valueOf(efk.getTanggal().split("-")[0]));
                    if (lst == null) {
                        lst = new ArrayList<Data>();
                    }
                    lst.add(efk);
                    m.put(Integer.valueOf(efk.getTanggal().split("-")[0]), lst);
                }
            } catch (Exception e) {
            }

        }

        StringBuilder sbJml = new StringBuilder();
        StringBuilder sbNilai = new StringBuilder();
        for (int i = 1; i <= 31; i++) {
            if (m.get(i) != null) {
                //System.out.println(i + " : " + m.get(i).size());
                sbJml.append(m.get(i).size()).append("\n");

                long nilai = 0L;
                for (Data ef : m.get(i)) {
                    nilai += (ef.getNilaiPPN() + ef.getNilaiDPP());
                }
                sbNilai.append(Long.toString(nilai)).append("\n");
            } else {
                //System.out.println(i);
                sbJml.append("\n");
                sbNilai.append("\n");
            }
        }
        txtRes1.setText(sbJml.toString());
        txtRes21.setText(sbNilai.toString());
        txtRes1.setCaretPosition(0);
        txtRes21.setCaretPosition(0);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        List<String> s = new ArrayList<String>();
        cmbBln.removeAllItems();
        for (String line : txtSrc1.getText().split("\\n")) {
            try {
                if (Character.isDigit(line.substring(9, 15).charAt(0))) {
                    //System.out.println(line.substring(9, 15).split("-")[1]);
                    s.add(line.substring(9, 15).split("-")[1]);
                }
            } catch (Exception e) {

            }
        }

        Set setItems = new LinkedHashSet(s);
        s.clear();
        s.addAll(setItems);

        for (String ss : s) {
            cmbBln.addItem(ss);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

//        for (String line : txtSrc.getText().split("\\n")) {
//            if(line.contains("Approval Sukses")){
//                System.out.println(line.split("	")[5].split(" ")[2]);
//                System.out.println(line.split("	")[8]);
//                System.out.println(line.split("	")[9]);
//            }
//        }
        txtRes.setText("");
        txtRes2.setText("");
        Map<Integer, List<Data>> m = new HashMap<Integer, List<Data>>();
        List<Data> listEF = new ArrayList<Data>();
        for (String line : txtSrc.getText().split("\\n")) {
            if (line.contains("Approval Sukses")) {
                try {

                    Data efk = new Data();
                    efk.setTanggal(line.split("	")[5].split(" ")[2]);
                    efk.setNilaiDPP(Long.valueOf(line.split("	")[8]));
                    efk.setNilaiPPN(Long.valueOf(line.split("	")[9]));
                    listEF.add(efk);
                } catch (Exception exception) {
                }
            }

        }

        for (Data efk : listEF) {
            List<Data> lst = m.get(Integer.valueOf(efk.getTanggal()));
            if (lst == null) {

                lst = new ArrayList<Data>();
            }
            lst.add(efk);
            m.put(Integer.valueOf(efk.getTanggal()), lst);

        }

        StringBuilder sbJml = new StringBuilder();
        StringBuilder sbNilai = new StringBuilder();
        for (int i = 1; i <= 31; i++) {
            if (m.get(i) != null) {
                sbJml.append(m.get(i).size()).append("\n");

                long nilai = 0L;
                for (Data ef : m.get(i)) {
                    nilai += (ef.getNilaiPPN() + ef.getNilaiDPP());
                }
                sbNilai.append(Long.toString(nilai)).append("\n");
            } else {
                sbJml.append("\n");
                sbNilai.append("\n");
            }
        }

        txtRes.setText(sbJml.toString());
        txtRes2.setText(sbNilai.toString());
        txtRes.setCaretPosition(0);
        txtRes2.setCaretPosition(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
//        for (String line : txtSrc.getText().split("\\n")) {
//            if(line.contains("Approval Sukses")){
//                System.out.println(line.split("	")[5].split(" ")[2]);
//                System.out.println(line.split("	")[8]);
//                System.out.println(line.split("	")[9]);
//            }
//        }
        txtRes.setText("");
        txtRes2.setText("");
        Map<Integer, List<Data>> m = new HashMap<Integer, List<Data>>();
        List<Data> listEF = new ArrayList<Data>();
        for (String line : txtSrc.getText().split("\\n")) {
            if (line.contains("Bukan Faktur ETax")) {
                try {
                    Data efk = new Data();
                    efk.setTanggal(line.split("	")[5].split(" ")[2]);
                    efk.setNilaiDPP(Long.valueOf(line.split("	")[8]));
                    efk.setNilaiPPN(Long.valueOf(line.split("	")[9]));
                    listEF.add(efk);
                } catch (Exception exception) {
                }
            }

        }

        for (Data efk : listEF) {
           List<Data> lst = m.get(Integer.valueOf(efk.getTanggal()));
            if (lst == null) {

                lst = new ArrayList<Data>();
            }
            lst.add(efk);
            m.put(Integer.valueOf(efk.getTanggal()), lst);

        }

        StringBuilder sbJml = new StringBuilder();
        StringBuilder sbNilai = new StringBuilder();
        for (int i = 1; i <= 31; i++) {
            if (m.get(i) != null) {
                sbJml.append(m.get(i).size()).append("\n");

                long nilai = 0L;
                for (Data ef : m.get(i)) {
                    nilai += (ef.getNilaiPPN() + ef.getNilaiDPP());
                }
                sbNilai.append(Long.toString(nilai)).append("\n");
            } else {
                sbJml.append("\n");
                sbNilai.append("\n");
            }
        }

        txtRes.setText(sbJml.toString());
        txtRes2.setText(sbNilai.toString());
        txtRes.setCaretPosition(0);
        txtRes2.setCaretPosition(0);

    }//GEN-LAST:event_jButton5ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainForm mf = new MainForm();
                mf.setLocationRelativeTo(null);
                mf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JComboBox cmbBln;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtRes;
    private javax.swing.JTextArea txtRes1;
    private javax.swing.JTextArea txtRes2;
    private javax.swing.JTextArea txtRes21;
    private javax.swing.JTextArea txtSrc;
    private javax.swing.JTextArea txtSrc1;
    // End of variables declaration//GEN-END:variables
}