/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entitas.Group;
import entitas.IterationTableData;
import entitas.Nilai;
import java.awt.GraphicsConfiguration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yanlyan
 */
public class Clustering extends javax.swing.JFrame {

    private Object textarea;
    private BufferedReader br;
    private String line = "";
    private final String cvsSplitBy = ",";
    private HashMap allNilai;
    public HashMap iterationTableData;
    public Group before = new Group();
    public Group after = new Group();
    public double[][] m = new double[3][4];
    String[] tbHeaderMentah = {"No.", "Nama Karyawan", "Jenis Kelamin", "Nilai Kedisplinan","Nilai Ketekunan", "Profesionalitas"};
    String[] tbHeaderHasil = {"No.", "Nama Karyawan", "Kelompok"};
    List<String[]> dataMentah = new ArrayList<>();
    
    public Clustering(GraphicsConfiguration gc) {
        super(gc);
        this.allNilai = new HashMap();
        this.iterationTableData = new HashMap();
    }

    /**
     * Creates new form Clustering
     */
    public Clustering() {
        DecimalFormat df = new DecimalFormat("#.00");
        this.allNilai = new HashMap();
        this.iterationTableData = new HashMap();
        initComponents();
        setTitle("Clustering");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblFile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMentah = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHasil = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnAbout = new javax.swing.JMenuItem();
        mnQuit = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("This is my open dialog");
        fileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pilih FIle"));

        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblFile.setText("Pilih File (*.csv)..........");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(lblFile, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lblFile))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblMentah.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMentah);

        jLabel3.setText("Data Mentah");

        tblHasil.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblHasil);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("HASIL");

        mnFile.setText("File");

        mnAbout.setText("About");
        mnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAboutActionPerformed(evt);
            }
        });
        mnFile.add(mnAbout);

        mnQuit.setText("Quit");
        mnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQuitActionPerformed(evt);
            }
        });
        mnFile.add(mnQuit);

        jMenuBar1.add(mnFile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 285, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            lblFile.setText(file.getName());
            try {
                // What to do with the file, e.g. display it in a TextArea
                br = new BufferedReader(new FileReader(file));
                int i = 1;
                int iterasi = 0;
                boolean status = true;
                while ((line = br.readLine()) != null) {

                    String[] rowNilai = line.split(cvsSplitBy);

                    Nilai nilai = new Nilai();

                    nilai.setNama(rowNilai[0]);
                    nilai.setJk(rowNilai[1]);
                    nilai.setKedisiplinan(rowNilai[2]);
                    nilai.setKetekunan(rowNilai[3]);
                    nilai.setMinat(rowNilai[4]);
                    // System.out.println(nilai.getNama()+", "+nilai.getJk()+", "+nilai.getKedisiplinan()+", "+nilai.getKetekunan()+", "+nilai.getMinat());
                    allNilai.put(i, nilai);
                    dataMentah.add(rowNilai);
                    i++;
                }
                setupTabelMentah();
                while (status) {
                    if (iterasi == 0) {
                        // index pertama random
                        int[] index = getIndexRandomGuessedM();
                        double[][] means = new double[3][4];

                        for (int j = 0; j < means.length; j++) {
                            Nilai mFromNilai = (Nilai) allNilai.get(index[j]);
                            means[j][0] = mFromNilai.getJk();
                            means[j][1] = mFromNilai.getKedisiplinan();
                            means[j][2] = mFromNilai.getKetekunan();
                            means[j][3] = mFromNilai.getMinat();
                        }
                        generateIterationTable(means, allNilai);

                        status = true;
                        before = checkGroupOfTableIteration();
                    } else {
                        m = updateM();
                        generateIterationTable(m, allNilai);

                        after = checkGroupOfTableIteration();
                        status = isGroupSame(before, after);
                        before = after;
                    }

                    iterasi++;
                }
                System.out.println(after.getGrup1().toString());
                System.out.println(after.getGrup2().toString());
                System.out.println(after.getGrup3().toString());
                System.out.println("iterasi = " + iterasi);
                setupTabelHasil();
            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQuitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_mnQuitActionPerformed

    private void mnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAboutActionPerformed
        About about = new About();
    }//GEN-LAST:event_mnAboutActionPerformed

    private int[] getIndexRandomGuessedM() {
        Random generator = new Random();
        int[] index = new int[3];
        while (index[0] == index[1] || index[0] == index[2] || index[1] == index[2]) {
            index[0] = generator.nextInt(10) + 1;
            index[1] = generator.nextInt(10) + 1;
            index[2] = generator.nextInt(10) + 1;
        }
        return index;
    }

    private void setupTabelMentah() {
        Object[][] data = new Object[dataMentah.size()][6];
        int i = 0;
        for (String[] baris : dataMentah) {
            data[i][0] = i+1;
            data[i][1] = baris[0];
            data[i][2] = baris[1];
            data[i][3] = baris[2];
            data[i][4] = baris[3];
            data[i][5] = baris[4];
            i++;
        }
        DefaultTableModel tableModel = new DefaultTableModel(data, tbHeaderMentah);
        tblMentah.setModel(tableModel);
    }
    
    private void setupTabelHasil(){
        Object[][] data = new Object[dataMentah.size()][3];
        int i = 0;
        for (Object[] baris : dataMentah) {
            data[i][0] = i+1;
            data[i][1] = baris[0];
            if(after.getGrup1().contains(i+1)){
                data[i][2] = "Kelompok 1";
            }else if(after.getGrup2().contains(i+1)){
                data[i][2] = "Kelompok 2";
            }else if(after.getGrup3().contains(i+1)){
                data[i][2] = "Kelompok 3";
            }
            i++;
        }
        DefaultTableModel tableModel = new DefaultTableModel(data, tbHeaderHasil);
        tblHasil.setModel(tableModel);
    }

    private double[][] updateM() {
        double[][] means = new double[3][4];

        double sumJk = 0, sumKd = 0, sumTk = 0, sumMn = 0;
        for (int j = 0; j < before.getGrup1().size(); j++) {
            sumJk += ((Nilai) allNilai.get(before.getGrup1().get(j))).getJk();
            sumKd += ((Nilai) allNilai.get(before.getGrup1().get(j))).getKedisiplinan();
            sumTk += ((Nilai) allNilai.get(before.getGrup1().get(j))).getKetekunan();
            sumMn += ((Nilai) allNilai.get(before.getGrup1().get(j))).getMinat();
        }
        means[0][0] = sumJk / before.getGrup1().size();
        means[0][1] = sumKd / before.getGrup1().size();
        means[0][2] = sumTk / before.getGrup1().size();
        means[0][3] = sumMn / before.getGrup1().size();

        sumJk = 0;
        sumKd = 0;
        sumTk = 0;
        sumMn = 0;
        for (int j = 0; j < before.getGrup2().size(); j++) {
            sumJk += ((Nilai) allNilai.get(before.getGrup2().get(j))).getJk();
            sumKd += ((Nilai) allNilai.get(before.getGrup2().get(j))).getKedisiplinan();
            sumTk += ((Nilai) allNilai.get(before.getGrup2().get(j))).getKetekunan();
            sumMn += ((Nilai) allNilai.get(before.getGrup2().get(j))).getMinat();
        }
        means[1][0] = sumJk / before.getGrup2().size();
        means[1][1] = sumKd / before.getGrup2().size();
        means[1][2] = sumTk / before.getGrup2().size();
        means[1][3] = sumMn / before.getGrup2().size();

        sumJk = 0;
        sumKd = 0;
        sumTk = 0;
        sumMn = 0;

        for (int j = 0; j < before.getGrup3().size(); j++) {
            sumJk += ((Nilai) allNilai.get(before.getGrup3().get(j))).getJk();
            sumKd += ((Nilai) allNilai.get(before.getGrup3().get(j))).getKedisiplinan();
            sumTk += ((Nilai) allNilai.get(before.getGrup3().get(j))).getKetekunan();
            sumMn += ((Nilai) allNilai.get(before.getGrup3().get(j))).getMinat();
        }
        means[2][0] = sumJk / before.getGrup3().size();
        means[2][1] = sumKd / before.getGrup3().size();
        means[2][2] = sumTk / before.getGrup3().size();
        means[2][3] = sumMn / before.getGrup3().size();

        System.out.println("m1 = " + means[0][0] + ", " + means[0][1] + ", " + means[0][2] + ", " + means[0][3]);
        System.out.println("m2 = " + means[1][0] + ", " + means[1][1] + ", " + means[1][2] + ", " + means[1][3]);
        System.out.println("m3 = " + means[2][0] + ", " + means[2][1] + ", " + means[2][2] + ", " + means[2][3]);
        return means;
    }

    private void generateIterationTable(double[][] m, HashMap allNilai) {
        Iterator it = allNilai.entrySet().iterator();
        while (it.hasNext()) {
            double d;
            double sum;
            Map.Entry pairsNilai = (Map.Entry) it.next();
            Nilai nilai = (Nilai) pairsNilai.getValue();
            IterationTableData barisIterasiTable = new IterationTableData();

            for (int i = 1; i <= 3; i++) {
                sum = Math.pow((m[i - 1][0] - nilai.getJk()), 2);
                sum += Math.pow((m[i - 1][1] - nilai.getKedisiplinan()), 2);
                sum += Math.pow((m[i - 1][2] - nilai.getKetekunan()), 2);
                sum += Math.pow((m[i - 1][3] - nilai.getMinat()), 2);
                d = Math.sqrt(sum);
                switch (i) {
                    case 1:
                        barisIterasiTable.setM1(d);
                        break;
                    case 2:
                        barisIterasiTable.setM2(d);
                        break;
                    case 3:
                        barisIterasiTable.setM3(d);
                        break;
                }
            }
            iterationTableData.put(pairsNilai.getKey(), barisIterasiTable);
        }
    }

    private Group checkGroupOfTableIteration() {
        Group group = new Group();
        List<Integer> group1 = new ArrayList<>();
        List<Integer> group2 = new ArrayList<>();
        List<Integer> group3 = new ArrayList<>();
        Iterator it = iterationTableData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairsNilai = (Map.Entry) it.next();
            IterationTableData barisIterasi = (IterationTableData) pairsNilai.getValue();
            double min = Math.min(Math.min(barisIterasi.getM1(), barisIterasi.getM2()), barisIterasi.getM3());
//            System.out.println("M1 : "+barisIterasi.getM1()+" M2 : "+barisIterasi.getM2()+ "M3 : "+barisIterasi.getM3());
            if (min == barisIterasi.getM1()) {
                group1.add((Integer) pairsNilai.getKey());
//                System.out.println("Group 1 : " + pairsNilai.getKey());
            } else if (min == barisIterasi.getM2()) {
                group2.add((Integer) pairsNilai.getKey());
//                System.out.println("Group 2 : " + pairsNilai.getKey());

            } else if (min == barisIterasi.getM3()) {
                group3.add((Integer) pairsNilai.getKey());
//                System.out.println("Group 3 : " + pairsNilai.getKey());

            }
        }
        group.setGrup1(group1);
        group.setGrup2(group2);
        group.setGrup3(group3);
        return group;
    }

    private boolean isGroupSame(Group before, Group after) {
        if (before.getGrup1().size() != after.getGrup1().size()
                || before.getGrup2().size() != after.getGrup2().size()
                || before.getGrup3().size() != after.getGrup3().size()) {
            return true;
        } else {
            for (int i = 0; i < before.getGrup1().size(); i++) {
                if (before.getGrup1().get(i) != after.getGrup1().get(i)) {
                    return true;
                }
            }
            for (int i = 0; i < before.getGrup2().size(); i++) {
                if (before.getGrup2().get(i) != after.getGrup2().get(i)) {
                    return true;
                }
            }
            for (int i = 0; i < before.getGrup3().size(); i++) {
                if (before.getGrup3().get(i) != after.getGrup3().get(i)) {
                    return true;
                }
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(Clustering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clustering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clustering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clustering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clustering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFile;
    private javax.swing.JMenuItem mnAbout;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mnQuit;
    private javax.swing.JTable tblHasil;
    private javax.swing.JTable tblMentah;
    // End of variables declaration//GEN-END:variables
}
