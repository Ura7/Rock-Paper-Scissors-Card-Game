package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JLabel;


public class oyun extends javax.swing.JFrame {

   
    public oyun() {
        initComponents();
        jTabbedPane1.setSelectedIndex(0);
        
        for(int r1 = 0; r1<15; r1++)
        {
        if(r1<5)
        {
        nesne3[r1].deger=tas.katilik; 
        nesne4[r1].deger=tas.katilik;
        nesne3[r1].resim="/resim_oyun/tas.png";
        nesne4[r1].resim="/resim_oyun/tas.png";
        
        }
        else if(r1<10 && r1>4)
        {
        nesne3[r1].deger=kagit.nufuz; 
        nesne4[r1].deger=kagit.nufuz;
        nesne3[r1].resim="/resim_oyun/kagit.png";
        nesne4[r1].resim="/resim_oyun/kagit.png";
        }
        else if(r1>9)
        {
        nesne3[r1].deger=makas.keskinlik;
        nesne4[r1].deger=makas.keskinlik;
        nesne3[r1].resim="/resim_oyun/makas.png";
        nesne4[r1].resim="/resim_oyun/makas.png";
        }
        }
        
        
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim_oyun/tas.png")));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim_oyun/kagit.png")));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim_oyun/makas.png")));
    }
 Tas tas = new Tas();
 Tas tas1 = new Tas();
 Tas tas2 = new Tas();
 Tas tas3 = new Tas();
 Tas tas4 = new Tas();
 Kagit kagit = new Kagit();
 Kagit kagit1 = new Kagit();
 Kagit kagit2 = new Kagit();
 Kagit kagit3 = new Kagit();
 Kagit kagit4 = new Kagit();
 Makas makas = new Makas();
 Makas makas1 = new Makas();
 Makas makas2 = new Makas();
 Makas makas3 = new Makas();
 Makas makas4 = new Makas();
 Tas btas = new Tas();
 Tas btas1 = new Tas();
 Tas btas2 = new Tas();
 Tas btas3 = new Tas();
 Tas btas4 = new Tas();
 Kagit bkagit = new Kagit();
 Kagit bkagit1 = new Kagit();
 Kagit bkagit2 = new Kagit();
 Kagit bkagit3 = new Kagit();
 Kagit bkagit4 = new Kagit();
 Makas bmakas = new Makas();
 Makas bmakas1 = new Makas();
 Makas bmakas2 = new Makas();
 Makas bmakas3 = new Makas();
 Makas bmakas4 = new Makas();
 AgirTas agirtas = new AgirTas();
 Kullanici kullanici = new Kullanici();
 Bilgisayar bilgisayar = new Bilgisayar("002","Bilgisayar",0);
 Bilgisayar bilgisayar1 = new Bilgisayar("001","Bilgisayar1",0);
 Nesne[] nesne1 = new Nesne[5];
 Nesne[] nesne2 = new Nesne[5];
 Nesne[] nesne5 = new Nesne[5];
 Nesne[] nesne3 = {tas,tas1,tas2,tas3,tas4,kagit,kagit1,kagit2,kagit3,kagit4,makas,makas1,makas2,makas3,makas4};
 Nesne[] nesne4 = {btas,btas1,btas2,btas3,btas4,bkagit,bkagit1,bkagit2,bkagit3,bkagit4,bmakas,bmakas1,bmakas2,bmakas3,bmakas4};
 Random rand1 = new Random();
 public int rand_sayi;
 public int rand_sayi1;
 public int rand_sayi2;
 ArrayList<Integer> randsayi = new ArrayList<Integer>();
 ArrayList<Integer> randsayi1 = new ArrayList<Integer>();
 public int rand_say=0;
 public int tur=0;
 public int tur1=0;
 public int i=0;
 public int s=0;
 public int tut=0;
 boolean name = true;
 public int tas_say=0;
 public int makas_say=10;
 public int kagit_say=5;
 public int say=0;
 public int btas_say=0;
 public int bmakas_say=10;
 public int bkagit_say=5;
 public int bsay=0;
 public boolean dur = true;
 int ii=0;
 int ia=0;
 int iaa=0;
 int nesnetut;
 

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel4.setBackground(new java.awt.Color(56, 62, 66));

        jButton18.setLabel("PLAYER VS PC");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton20.setLabel("PC VS PC");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setLabel("EXIT");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel4);

        jPanel1.setBackground(new java.awt.Color(56, 62, 66));

        jButton1.setText("TAŞ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Kağıt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Makas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Devam et");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("Kullanıcı Adı:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(357, 357, 357))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 310, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(299, 299, 299)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        jPanel3.setBackground(new java.awt.Color(56, 62, 66));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.setName(""); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dayaniklilik:20.0");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dayaniklilik:20.0");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dayaniklilik:20.0");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dayaniklilik:20.0");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dayaniklilik:20.0");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SeviyePuani:0");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SeviyePuani:0");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SeviyePuani:0");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SeviyePuani:0");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SeviyePuani:0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );

        jButton4.getAccessibleContext().setAccessibleDescription("");

        jPanel5.setBackground(new java.awt.Color(56, 62, 66));
        jPanel5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim_oyun/yugioh1.jpg"))); // NOI18N
        jButton12.setText("jButton12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim_oyun/yugioh1.jpg"))); // NOI18N
        jButton13.setText("jButton13");

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim_oyun/yugioh1.jpg"))); // NOI18N
        jButton14.setText("jButton14");

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim_oyun/yugioh1.jpg"))); // NOI18N
        jButton15.setText("jButton15");

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim_oyun/yugioh1.jpg"))); // NOI18N
        jButton16.setText("jButton16");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(56, 62, 66));
        jPanel6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton8İtemStateChanged(evt);
            }
        });

        jButton11.setLabel("Devam");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton19.setLabel("OYNA");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton19)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel2);

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));

        jPanel8.setBackground(new java.awt.Color(56, 62, 66));

        jButton28.setText("jButton28");

        jButton29.setText("jButton29");

        jButton30.setText("jButton30");

        jButton31.setText("jButton31");

        jButton32.setText("jButton32");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(65, 65, 65)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(65, 65, 65)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(65, 65, 65)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(65, 65, 65)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(56, 62, 66));

        jButton23.setText("jButton23");

        jButton24.setText("jButton24");

        jButton25.setText("jButton25");

        jButton26.setText("jButton26");

        jButton27.setText("jButton27");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(67, 67, 67)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(67, 67, 67)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(62, 62, 62)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(65, 65, 65)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(56, 62, 66));

        jButton22.setLabel("Oyna");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton35.setLabel("Devam");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));

        jLabel27.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("", jPanel7);

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
     while(dur)
     {
     nesne2[say]=nesne3[tas_say];
         System.out.println("Tas desteye eklendi.");
     tas_say++;
     say++;
     dur = false;
     }
     
   
     dur = true;   
     if(say==5)
     {
     jButton1.setEnabled(false);
     jButton2.setEnabled(false);
     jButton3.setEnabled(false);
     }
        
    //kullanici.nesneSec(nesne2);
    
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     while(dur)
     {
     nesne2[say]=nesne3[kagit_say];
         System.out.println("Kagit desteye eklendi");
     kagit_say++;
     say++;
     dur = false;
     
     }
     dur=true;
        if(say==5)
     {
     jButton1.setEnabled(false);
     jButton2.setEnabled(false);
     jButton3.setEnabled(false);
     }
        
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      while(dur)
      {
     nesne2[say]=nesne3[makas_say];
          System.out.println("Makas desteye eklendi");
     makas_say++;
     say++;
     dur = false;
      
      }
      dur=true;
       if(say==5)
     {
     jButton1.setEnabled(false);
     jButton2.setEnabled(false);
     jButton3.setEnabled(false);
     } 
        
        
      // kullanici.nesneSec(nesne2);
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        kullanici.NesneListesi(nesne2);
        
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(0).resim)));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(1).resim)));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(2).resim)));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(3).resim)));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(4).resim)));
        for( ii=0;ii<5;)
        {
        randsayi.add(ii);
        ii++;
        }
        Collections.shuffle(randsayi);
        System.out.println(randsayi.get(0)+"");
        System.out.println(randsayi.get(1)+"");
        System.out.println(randsayi.get(2)+"");
        System.out.println(randsayi.get(3)+"");
        System.out.println(randsayi.get(4)+"");
        
        Random rand = new Random();
        for(int aa=0;aa<5;aa++)
        {
        rand_sayi = rand.nextInt(3);
        System.out.println(rand_sayi+"");
        if(rand_sayi==0)
        {
        nesne1[bsay]=nesne4[btas_say];
        btas_say++;
        bsay++;
        }
        else if(rand_sayi==1)
        {
            nesne1[bsay]=nesne4[bkagit_say];
            bkagit_say++;
            bsay++;
        }
        
        else if(rand_sayi==2)
        {
        nesne1[bsay]=nesne4[bmakas_say];
        bmakas_say++;
        bsay++;
        }
        
        }
       
        
        bilgisayar.NesneListesi(nesne1);
        kullanici.oyuncuAdi=jTextField1.getText();
        jLabel12.setText(kullanici.oyuncuAdi);
        bilgisayar.oyuncuAdi = "Bilgisayar";
        jLabel11.setText(bilgisayar.oyuncuAdi);
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setEnabled(false);
        nesnetut=0;
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(0).resim)));
        tur++;
        
         
         
         
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton8İtemStateChanged
        
    }//GEN-LAST:event_jButton8İtemStateChanged

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        
      if(tur<20)
      {
       
      if(kullanici.nesneSec(0).dayaniklilik>0)
      {
      jButton4.setEnabled(true);
      }
      if(kullanici.nesneSec(1).dayaniklilik>0)
      {
      jButton5.setEnabled(true);
      }
      if(kullanici.nesneSec(2).dayaniklilik>0)
      {
      jButton6.setEnabled(true);
      }
      if(kullanici.nesneSec(3).dayaniklilik>0)
      {
      jButton9.setEnabled(true);
      }
      if(kullanici.nesneSec(4).dayaniklilik>0)
      {
      jButton10.setEnabled(true);
      }
      if(bilgisayar.nesneSec(0).dayaniklilik>0)
      {
      jButton12.setEnabled(true);
      }
      if(bilgisayar.nesneSec(1).dayaniklilik>0)
      {
      jButton13.setEnabled(true);
      }
      if(bilgisayar.nesneSec(2).dayaniklilik>0)
      {
      jButton14.setEnabled(true);
      }
      if(bilgisayar.nesneSec(3).dayaniklilik>0)
      {
      jButton15.setEnabled(true);
      }
      if(bilgisayar.nesneSec(4).dayaniklilik>0)
      {
      jButton16.setEnabled(true);
      }
       for(int ib =0;ib<5;ib++)
        {
        if(bilgisayar.nesneSec(ib).dayaniklilik<=0)
        {
         for(int ic =0;ic<randsayi.size();ic++)
         {
           if(randsayi.get(ic)==ib)
           {
           randsayi.remove(ic);
           }
         }
        }
        }
      
      }
      
      if(tur<20 && randsayi.size()==0)
      {
       jLabel14.setText(kullanici.oyuncuAdi+"Kazandi");
      }
      else if(tur<20 && kullanici.nesneSec(0).dayaniklilik<=0 && kullanici.nesneSec(1).dayaniklilik<=0&&kullanici.nesneSec(2).dayaniklilik<=0 && kullanici.nesneSec(3).dayaniklilik<=0 && kullanici.nesneSec(4).dayaniklilik<=0)
      {
      
      jLabel14.setText(bilgisayar.oyuncuAdi+"Kazandi");
      
      }
      
      else if(tur>=20&& kullanici.skor> bilgisayar.skor)
      {
      jLabel14.setText(kullanici.oyuncuAdi+"Kazandi");
      }
      else if(tur>=20 && bilgisayar.skor>kullanici.skor)
      {
       jLabel14.setText(bilgisayar.oyuncuAdi+"Kazandi");
      }
      else if(tur>=20 && bilgisayar.skor==kullanici.skor)
      {
       jLabel14.setText("Berabere");
      }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setEnabled(false);
        nesnetut=1;
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(1).resim)));
        tur++;
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTabbedPane1.setSelectedIndex(1);        

        
                
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.setEnabled(false);
       nesnetut=2;
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(2).resim)));
        tur++;
        
       
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setEnabled(false);
        nesnetut=3;
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(3).resim)));
        tur++;
       
        
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setEnabled(false);
       nesnetut=4;
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(kullanici.nesneSec(4).resim)));
        tur++;
        
        
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       
        
        if(ia>=randsayi.size())
        {
        Collections.shuffle(randsayi);
        ia=0;
        }
        for( ;ia<randsayi.size();)
        {
        rand_sayi1=randsayi.get(ia);
        ia++;
        break;
        }
        if(rand_sayi1==0&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton12.setEnabled(false);
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
        if(rand_sayi1==1&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton13.setEnabled(false);
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
        if(rand_sayi1==2&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton14.setEnabled(false);
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
        if(rand_sayi1==3&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton15.setEnabled(false);
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
        if(rand_sayi1==4&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton16.setEnabled(false);
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
        kullanici.nesneSec(nesnetut).etkiHesapla(kullanici.nesneSec(nesnetut),bilgisayar.nesneSec(rand_sayi1)  ,kullanici.nesneSec(nesnetut).deger, bilgisayar.nesneSec(rand_sayi1).deger);
        System.out.println("Oyuncu hasar:"+kullanici.nesneSec(nesnetut).etki+""); 
        bilgisayar.nesneSec(rand_sayi1).etkiHesapla(bilgisayar.nesneSec(rand_sayi1) ,kullanici.nesneSec(nesnetut),bilgisayar.nesneSec(rand_sayi1).deger,kullanici.nesneSec(nesnetut).deger );
        System.out.println("Bilgisayar hasar:"+bilgisayar.nesneSec(rand_sayi1).etki+"");
        kullanici.nesneSec(nesnetut).durumGuncelle(kullanici.nesneSec(nesnetut).dayaniklilik, bilgisayar.nesneSec(rand_sayi1).etki);
        System.out.println("Oyuncu kart"+kullanici.nesneSec(nesnetut).dayaniklilik+"dayaniklilik");
        bilgisayar.nesneSec(rand_sayi1).durumGuncelle(bilgisayar.nesneSec(rand_sayi1).dayaniklilik, kullanici.nesneSec(nesnetut).etki);
        System.out.println("Bilgisayar kart"+bilgisayar.nesneSec(rand_sayi1).dayaniklilik+"dayaniklilik");
        if(kullanici.nesneSec(nesnetut).etki>bilgisayar.nesneSec(rand_sayi1).etki)
        {
        kullanici.nesneSec(nesnetut).seviyePuani+=20;
        
        }
        else if(kullanici.nesneSec(nesnetut).etki<bilgisayar.nesneSec(rand_sayi1).etki)
        {
        bilgisayar.nesneSec(rand_sayi1).seviyePuani+=20;
       
        }
        
       
        
        
        if(nesnetut==0)
        {
        jLabel1.setText("Dayaniklilik:"+kullanici.nesneSec(nesnetut).dayaniklilik);
        jLabel6.setText("SeviyePuani:"+kullanici.nesneSec(nesnetut).seviyePuani);
        }
        else if(nesnetut==1)
        {
        jLabel2.setText("Dayaniklilik:"+kullanici.nesneSec(nesnetut).dayaniklilik);
        jLabel7.setText("SeviyePuani:"+kullanici.nesneSec(nesnetut).seviyePuani);
        }
        else if(nesnetut==2)
        {
        jLabel3.setText("Dayaniklilik:"+kullanici.nesneSec(nesnetut).dayaniklilik);
        jLabel8.setText("SeviyePuani:"+kullanici.nesneSec(nesnetut).seviyePuani);
        }
        else if(nesnetut==3)
        {
        jLabel4.setText("Dayaniklilik:"+kullanici.nesneSec(nesnetut).dayaniklilik);
        jLabel9.setText("SeviyePuani:"+kullanici.nesneSec(nesnetut).seviyePuani);
        }
        else if(nesnetut==4)
        {
        jLabel5.setText("Dayaniklilik:"+kullanici.nesneSec(nesnetut).dayaniklilik);
        jLabel10.setText("SeviyePuani:"+kullanici.nesneSec(nesnetut).seviyePuani);
        }
        if(kullanici.nesneSec(nesnetut).dayaniklilik<=0)
        {
        jButton4.setEnabled(false);
        }
        if(bilgisayar.nesneSec(rand_sayi1).dayaniklilik<=0)
        {
        jButton12.setEnabled(false);
        }
        
        jLabel12.setText(kullanici.oyuncuAdi + "" + kullanici.SkorGoster(kullanici.nesneSec(nesnetut).etki));
        jLabel11.setText("Bilgisayar"+""+bilgisayar.SkorGoster(bilgisayar.nesneSec(rand_sayi1).etki));
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
        for( ii=0;ii<5;)
        {
        randsayi.add(ii);
        ii++;
        }
        Collections.shuffle(randsayi);
        System.out.println(randsayi.get(0)+"");
        System.out.println(randsayi.get(1)+"");
        System.out.println(randsayi.get(2)+"");
        System.out.println(randsayi.get(3)+"");
        System.out.println(randsayi.get(4)+"");
        
        Random rand = new Random();
        for(int aa=0;aa<5;aa++)
        {
        rand_sayi = rand.nextInt(3);
        System.out.println(rand_sayi+"");
        if(rand_sayi==0)
        {
        nesne1[bsay]=nesne4[btas_say];
        btas_say++;
        bsay++;
        }
        else if(rand_sayi==1)
        {
            nesne1[bsay]=nesne4[bkagit_say];
            bkagit_say++;
            bsay++;
        }
        
        else if(rand_sayi==2)
        {
        nesne1[bsay]=nesne4[bmakas_say];
        bmakas_say++;
        bsay++;
        }
        
        }
       
        
        bilgisayar.NesneListesi(nesne1);
        
        
       bmakas_say=10;
       btas_say=0;
       bkagit_say=5;
       bsay=0;
        for(int iii=0;iii<5;)
        {
        randsayi1.add(iii);
        iii++;
        }
        Collections.shuffle(randsayi1);
        System.out.println(randsayi1.get(0)+"");
        System.out.println(randsayi1.get(1)+"");
        System.out.println(randsayi1.get(2)+"");
        System.out.println(randsayi1.get(3)+"");
        System.out.println(randsayi1.get(4)+"");
        
         Random rand2 = new Random();
        for(int aaa=0;aaa<5;aaa++)
        {
        rand_sayi2 = rand2.nextInt(3);
        System.out.println(rand_sayi2+"");
        if(rand_sayi2==0)
        {
        nesne5[bsay]=nesne3[btas_say];
        btas_say++;
        bsay++;
        }
        else if(rand_sayi2==1)
        {
            nesne5[bsay]=nesne3[bkagit_say];
            bkagit_say++;
            bsay++;
        }
        
        else if(rand_sayi2==2)
        {
        nesne5[bsay]=nesne3[bmakas_say];
        bmakas_say++;
        bsay++;
        }
        
        }
        bilgisayar1.NesneListesi(nesne5);
        
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(0).resim)));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(1).resim)));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(2).resim)));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(3).resim)));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(4).resim)));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(0).resim)));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(1).resim)));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(2).resim)));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(3).resim)));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(4).resim)));
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
          tur1++;
        if(ia>=randsayi.size())
        {
        Collections.shuffle(randsayi);
        ia=0;
        }
        for( ;ia<randsayi.size();)
        {
        rand_sayi1=randsayi.get(ia);
        ia++;
        break;
        }
        if(iaa>=randsayi1.size())
        {
        Collections.shuffle(randsayi1);
        iaa=0;
        }
        for(;iaa<randsayi1.size();)
        {
        rand_sayi2= randsayi1.get(iaa);
        iaa++;
        break;
        }
        
        if(rand_sayi1==0&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton23.setEnabled(false);
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
         if(rand_sayi2==0&& bilgisayar1.nesneSec(rand_sayi2).dayaniklilik>0)
        {
        jButton28.setEnabled(false);
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(rand_sayi2).resim)));
        }
        if(rand_sayi1==1&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton24.setEnabled(false);
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
         if(rand_sayi2==1&& bilgisayar1.nesneSec(rand_sayi2).dayaniklilik>0)
        {
        jButton29.setEnabled(false);
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(rand_sayi2).resim)));
        }
        if(rand_sayi1==2&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton25.setEnabled(false);
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
        if(rand_sayi2==2&& bilgisayar1.nesneSec(rand_sayi2).dayaniklilik>0)
        {
        jButton30.setEnabled(false);
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(rand_sayi2).resim)));
        }
        if(rand_sayi1==3&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton26.setEnabled(false);
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
        if(rand_sayi2==3&& bilgisayar1.nesneSec(rand_sayi2).dayaniklilik>0)
        {
        jButton31.setEnabled(false);
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(rand_sayi2).resim)));
        }
        if(rand_sayi1==4&& bilgisayar.nesneSec(rand_sayi1).dayaniklilik>0)
        {
        jButton27.setEnabled(false);
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar.nesneSec(rand_sayi1).resim)));
        }
        if(rand_sayi2==4&& bilgisayar1.nesneSec(rand_sayi2).dayaniklilik>0)
        {
        jButton32.setEnabled(false);
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource(bilgisayar1.nesneSec(rand_sayi2).resim)));
        }
        bilgisayar.nesneSec(rand_sayi1).etkiHesapla(bilgisayar.nesneSec(rand_sayi1),bilgisayar1.nesneSec(rand_sayi2)  ,bilgisayar.nesneSec(rand_sayi1).deger, bilgisayar1.nesneSec(rand_sayi2).deger);
        System.out.println("Bilgisayar Hasar:"+bilgisayar.nesneSec(rand_sayi1).etki+""); 
        bilgisayar1.nesneSec(rand_sayi2).etkiHesapla(bilgisayar1.nesneSec(rand_sayi2) ,bilgisayar.nesneSec(rand_sayi1),bilgisayar1.nesneSec(rand_sayi2).deger,bilgisayar.nesneSec(rand_sayi1).deger );
        System.out.println("Bilgisayar1 Hasar:"+bilgisayar1.nesneSec(rand_sayi2).etki+"");
        bilgisayar.nesneSec(rand_sayi1).durumGuncelle(bilgisayar.nesneSec(rand_sayi1).dayaniklilik, bilgisayar1.nesneSec(rand_sayi2).etki);
        System.out.println("Bilgisayar kart"+bilgisayar.nesneSec(rand_sayi1).dayaniklilik+"dayaniklilik");
        bilgisayar1.nesneSec(rand_sayi2).durumGuncelle(bilgisayar1.nesneSec(rand_sayi2).dayaniklilik, bilgisayar.nesneSec(rand_sayi1).etki);
        System.out.println("Bilgisayar1 kart"+bilgisayar1.nesneSec(rand_sayi2).dayaniklilik+"dayaniklilik");        
        if(bilgisayar.nesneSec(rand_sayi1).etki>bilgisayar1.nesneSec(rand_sayi2).etki)
        {
        bilgisayar.nesneSec(rand_sayi1).seviyePuani+=20;
        
        }
        else if(bilgisayar.nesneSec(rand_sayi1).etki<bilgisayar1.nesneSec(rand_sayi2).etki)
        {
        bilgisayar1.nesneSec(rand_sayi2).seviyePuani+=20;
        }
         ArrayList<JLabel> labelD = new ArrayList<JLabel>();
         labelD.add(jLabel15);
         labelD.add(jLabel16);
         labelD.add(jLabel17);
         labelD.add(jLabel18);
         labelD.add(jLabel19);
         labelD.add(jLabel20);
         labelD.add(jLabel21);
         labelD.add(jLabel22);
         labelD.add(jLabel23);
         labelD.add(jLabel24);
         
         for(int ij=0;ij<10;ij++)
         {
         if(ij<5)
         {
         labelD.get(ij).setText("D:"+bilgisayar.nesneSec(ij).dayaniklilik+" "+"SP:"+bilgisayar.nesneSec(ij).seviyePuani);
         
         }
         else if(ij>=5)    
           labelD.get(ij).setText("D:"+bilgisayar1.nesneSec(ij-5).dayaniklilik+" "+"SP:"+bilgisayar1.nesneSec(ij-5).seviyePuani);  
         }
         
        jLabel26.setText(bilgisayar.oyuncuAdi + ": " + bilgisayar.SkorGoster(bilgisayar.nesneSec(rand_sayi1).etki));
        jLabel25.setText(bilgisayar1.oyuncuAdi+": "+bilgisayar1.SkorGoster(bilgisayar1.nesneSec(rand_sayi2).etki));
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
         if(tur1<100)
      {
       
      if(bilgisayar1.nesneSec(0).dayaniklilik>0)
      {
      jButton28.setEnabled(true);
      }
      if(bilgisayar1.nesneSec(1).dayaniklilik>0)
      {
      jButton29.setEnabled(true);
      }
      if(bilgisayar1.nesneSec(2).dayaniklilik>0)
      {
      jButton30.setEnabled(true);
      }
      if(bilgisayar1.nesneSec(3).dayaniklilik>0)
      {
      jButton31.setEnabled(true);
      }
      if(bilgisayar1.nesneSec(4).dayaniklilik>0)
      {
      jButton32.setEnabled(true);
      }
      if(bilgisayar.nesneSec(0).dayaniklilik>0)
      {
      jButton23.setEnabled(true);
      }
      if(bilgisayar.nesneSec(1).dayaniklilik>0)
      {
      jButton24.setEnabled(true);
      }
      if(bilgisayar.nesneSec(2).dayaniklilik>0)
      {
      jButton25.setEnabled(true);
      }
      if(bilgisayar.nesneSec(3).dayaniklilik>0)
      {
      jButton26.setEnabled(true);
      }
      if(bilgisayar.nesneSec(4).dayaniklilik>0)
      {
      jButton27.setEnabled(true);
      }
      for(int ib =0;ib<5;ib++)
        {
        if(bilgisayar.nesneSec(ib).dayaniklilik<=0)
        {
         for(int ic =0;ic<randsayi.size();ic++)
         {
           if(randsayi.get(ic)==ib)
           {
           randsayi.remove(ic);
           }
         }
        }
        }
      for(int ix =0;ix<5;ix++)
        {
        if(bilgisayar1.nesneSec(ix).dayaniklilik<=0)
        {
         for(int iv =0;iv<randsayi1.size();iv++)
         {
           if(randsayi1.get(iv)==ix)
           {
           randsayi1.remove(iv);
           }
         }
        }
        }
        }
         
         if(tur1<100 && randsayi.size()==0)
      {
       jLabel27.setText(bilgisayar1.oyuncuAdi+"Kazandi");
      }
      else if(tur1<100 && randsayi1.size()==0)
      {
      
      jLabel27.setText(bilgisayar.oyuncuAdi+"Kazandi");
      
      }
      
      else if(tur1>=100&& bilgisayar1.skor> bilgisayar.skor)
      {
      jLabel27.setText(bilgisayar1.oyuncuAdi+"Kazandi");
      }
      else if(tur1>=100 && bilgisayar.skor>bilgisayar1.skor)
      {
       jLabel27.setText(bilgisayar.oyuncuAdi+"Kazandi");
      }
      else if(tur1>=100&& bilgisayar.skor==bilgisayar1.skor)
      {
       jLabel27.setText("Berabere");
      }
    }//GEN-LAST:event_jButton35ActionPerformed

    
    public static void main(String args[]) {
        
        
        
        
       
        
        
        
       
        
        
        
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oyun().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
