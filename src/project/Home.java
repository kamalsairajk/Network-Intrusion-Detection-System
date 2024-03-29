package project;
import java.awt.Toolkit;
import javax.swing.JFileChooser;

/**
 *
 */

/**
 *
 * @author arunkls
 */
public class Home extends javax.swing.JFrame   {

    /** Creates new form Home */
    public Home() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HEADING = new javax.swing.JLabel();
        TRAIN_FILE = new javax.swing.JLabel();
        TEST_FILE = new javax.swing.JLabel();
        BTN_TRAIN_BROWSE = new javax.swing.JButton();
        BTN_TEST_BROWSE = new javax.swing.JButton();
        TXT_FLD_TRAIN = new javax.swing.JTextField();
        TXT_FLD_TEST = new javax.swing.JTextField();
        BTN_JUNCTION_TREE = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jta2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jta3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        BTN_NB = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaNB = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        NB_RESULT = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NIDS");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ids-eye.png")));
        setResizable(false);

        HEADING.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        HEADING.setText("NETWORK INTRUSION DETECTION SYSTEM");

        TRAIN_FILE.setText("TRAINING DATSET");

        TEST_FILE.setText("TESTING DATASET");

        BTN_TRAIN_BROWSE.setText("BROWSE");
        BTN_TRAIN_BROWSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TRAIN_BROWSEActionPerformed(evt);
            }
        });

        BTN_TEST_BROWSE.setText("BROWSE");
        BTN_TEST_BROWSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TEST_BROWSEActionPerformed(evt);
            }
        });

        TXT_FLD_TRAIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_FLD_TRAINActionPerformed(evt);
            }
        });

        BTN_JUNCTION_TREE.setText("Junction Tree");
        BTN_JUNCTION_TREE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_JUNCTION_TREEActionPerformed(evt);
            }
        });

        jta2.setEditable(false);
        jta2.setColumns(20);
        jta2.setRows(5);
        jScrollPane3.setViewportView(jta2);

        jta3.setEditable(false);
        jta3.setColumns(20);
        jta3.setRows(5);
        jScrollPane4.setViewportView(jta3);

        jLabel1.setText("RESULTS SUMMARY");

        BTN_NB.setText("Naive Bayes");
        BTN_NB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NBActionPerformed(evt);
            }
        });

        jtaNB.setColumns(20);
        jtaNB.setRows(5);
        jScrollPane5.setViewportView(jtaNB);

        jLabel2.setText("RESULT SUMMARY");

        NB_RESULT.setColumns(20);
        NB_RESULT.setRows(5);
        jScrollPane6.setViewportView(NB_RESULT);

        jButton1.setText("Combined");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("RESULT SUMMARY");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Random Forest");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jLabel4.setText("RESULT SUMMARY");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TEST_FILE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TXT_FLD_TRAIN)
                                    .addComponent(TXT_FLD_TEST))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTN_TRAIN_BROWSE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTN_TEST_BROWSE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TRAIN_FILE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTN_JUNCTION_TREE)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(BTN_NB)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton3)
                                                    .addGap(215, 215, 215))
                                                .addComponent(jScrollPane7)))))))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(HEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRAIN_FILE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_FLD_TRAIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_TRAIN_BROWSE)
                    .addComponent(jButton2))
                .addGap(14, 14, 14)
                .addComponent(TEST_FILE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_FLD_TEST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_TEST_BROWSE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_JUNCTION_TREE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_NB)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane7))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane8))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_JUNCTION_TREEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_JUNCTION_TREEActionPerformed
        // TODO add your handling code here:
         try{
            JunTreeConn jc=new JunTreeConn();
            jc.init(trainpath, testpath, jta2, jta3);
            jc.run();
            BTN_JUNCTION_TREE.setEnabled(false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
         BTN_JUNCTION_TREE.setEnabled(false);
    }//GEN-LAST:event_BTN_JUNCTION_TREEActionPerformed

    private void BTN_TRAIN_BROWSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TRAIN_BROWSEActionPerformed
        // TODO add your handling code here:
        trainpath = browse();
        TXT_FLD_TRAIN.setText(trainpath);
        
        BTN_TRAIN_BROWSE.setEnabled(false);
    }//GEN-LAST:event_BTN_TRAIN_BROWSEActionPerformed

    private void BTN_TEST_BROWSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TEST_BROWSEActionPerformed
        // TODO add your handling code here:
        testpath=browse();
        TXT_FLD_TEST.setText(testpath);
        BTN_TEST_BROWSE.setEnabled(false);
    }//GEN-LAST:event_BTN_TEST_BROWSEActionPerformed

    private void BTN_NBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NBActionPerformed
        // TODO add your handling code here:
        try{
            NB nb=new NB();
            nb.init(trainpath, testpath, jtaNB, NB_RESULT);
            nb.run();
            BTN_NB.setEnabled(false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
         BTN_NB.setEnabled(false);
    }//GEN-LAST:event_BTN_NBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            CombinedClassifier1 rf=new CombinedClassifier1();
            rf.init(trainpath, testpath, jTextArea1, jTextArea2);
            rf.run();
            BTN_NB.setEnabled(false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TXT_FLD_TRAIN.setText("");
        TXT_FLD_TEST.setText("");
        jta2.setText("");
        jta3.setText("");
        jtaNB.setText("");
        NB_RESULT.setText("");
        jTextArea1.setText("");
        jTextArea2.setText("");
        BTN_TRAIN_BROWSE.setEnabled(true);
        BTN_TEST_BROWSE.setEnabled(true);
        BTN_JUNCTION_TREE.setEnabled(true);
        BTN_NB.setEnabled(true);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TXT_FLD_TRAINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_FLD_TRAINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_FLD_TRAINActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
            NewClass nc=new NewClass();
            nc.init(trainpath, testpath, jTextArea3, jTextArea4);
            nc.run();
            jButton3.setEnabled(false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
         jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private String browse(){
        String path=new String();
        JFileChooser jfr = new JFileChooser();
	int check = jfr.showOpenDialog(this);
        if(check==JFileChooser.APPROVE_OPTION){
            path=jfr.getSelectedFile().getPath();
        }
        return path;
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    String testpath;
    String trainpath;
    NB nb=new NB();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_JUNCTION_TREE;
    private javax.swing.JButton BTN_NB;
    private javax.swing.JButton BTN_TEST_BROWSE;
    private javax.swing.JButton BTN_TRAIN_BROWSE;
    private javax.swing.JLabel HEADING;
    private javax.swing.JTextArea NB_RESULT;
    private javax.swing.JLabel TEST_FILE;
    private javax.swing.JLabel TRAIN_FILE;
    private javax.swing.JTextField TXT_FLD_TEST;
    private javax.swing.JTextField TXT_FLD_TRAIN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jta2;
    private javax.swing.JTextArea jta3;
    private javax.swing.JTextArea jtaNB;
    // End of variables declaration//GEN-END:variables

}
