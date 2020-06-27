
package javaapplication4;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class OtherFunctions extends javax.swing.JFrame {
    private Connection con;
    private Statement s;
    private ResultSet rs;
    private String pass;
    private String query;
    private javax.swing.JButton badd;
    private javax.swing.JButton bsubmit;
    private javax.swing.JButton bview;
    private javax.swing.JButton change;
    private javax.swing.JDialog changepassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton madd;
    private javax.swing.JButton mdelet;
    private javax.swing.JButton mpay;
    private javax.swing.JButton mvview;
    private javax.swing.JPasswordField tconfirm;
    private javax.swing.JPasswordField tcurrent;
    private javax.swing.JPasswordField tnew;

    public OtherFunctions() {
    	initComponents();
    }                        
    private void initComponents() {
        changepassword = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tcurrent = new javax.swing.JPasswordField();
        tnew = new javax.swing.JPasswordField();
        tconfirm = new javax.swing.JPasswordField();
        bsubmit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        madd = new javax.swing.JButton();
        mvview = new javax.swing.JButton();
        mdelet = new javax.swing.JButton();
        mpay = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        badd = new javax.swing.JButton();
        bview = new javax.swing.JButton();
        change = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        changepassword.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        changepassword.setTitle("Change Password");
        changepassword.setAlwaysOnTop(true);
        changepassword.setMinimumSize(new java.awt.Dimension(320, 280));
        changepassword.setResizable(false);
        changepassword.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                changepasswordWindowClosed(evt);
            }
        });
        jLabel1.setText("Current Password");
        jLabel2.setText("New Password");
        jLabel3.setText("Confirm Password");
        tconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tconfirmActionPerformed(evt);
            }
        });
        bsubmit.setText("Submit");
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout changepasswordLayout = new javax.swing.GroupLayout(changepassword.getContentPane());
        changepassword.getContentPane().setLayout(changepasswordLayout);
        changepasswordLayout.setHorizontalGroup(
            changepasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changepasswordLayout.createSequentialGroup()
                .addGroup(changepasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changepasswordLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(changepasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(changepasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tnew, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(tconfirm)
                            .addComponent(tcurrent)))
                    .addGroup(changepasswordLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(bsubmit)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        changepasswordLayout.setVerticalGroup(
            changepasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changepasswordLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(changepasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(changepasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(changepasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(bsubmit)
                .addGap(21, 21, 21))
        );
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 330));
        setPreferredSize(new java.awt.Dimension(450, 330));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Member"));
        madd.setText("Add Member");
        madd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    maddActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(OtherFunctions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        mvview.setText("View Member");
        mvview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mvviewActionPerformed(evt);
            }
        });
        mdelet.setText("Delete Member");
        mdelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdeletActionPerformed(evt);
            }
        });
        mpay.setText("Pay Fine");
        mpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpayActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(madd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mdelet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mpay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mvview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(madd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mvview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdelet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mpay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Book"));

        badd.setText("Add Book");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    baddActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(OtherFunctions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        bview.setText("View Book");
        bview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviewActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(badd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(badd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        change.setText("Change Password");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("EXTRA FUNCTIONS");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(change, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(change)
                .addContainerGap())
        );
    }
    private void maddActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException {                                     
        try {
            new AddMember().setVisible(true);;
        } catch (SQLException ex) {
        }
    }                                    
    private void baddActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException {                                     
        try {
            new AddBook().setVisible(true);
        } catch (SQLException ex) {
        }
    }                                    
    private void mvviewActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            new ViewMember().setVisible(true);
        } catch (SQLException ex) {
        }
    }                                      
    private void bviewActionPerformed(java.awt.event.ActionEvent evt) {                                      
        try {
            new ViewBook().setVisible(true);
        } catch (SQLException ex) {
        }
    }                                     
    private void changeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        changepassword.setVisible(true);
    }                                      
    private void tconfirmActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            changepass();
        } catch (ClassNotFoundException ex) {
        }
    }                                        
    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try {
            changepass();
        } catch (ClassNotFoundException ex) {
        }
    }                                       
    private void mdeletActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            new ViewMember().setVisible(true);
        } catch (SQLException ex) {
        }
    }                                      
    private void mpayActionPerformed(java.awt.event.ActionEvent evt) {                                     
        try {
            new ViewMember().setVisible(true);
        } catch (SQLException ex) {
        }
    }                                    
    private void changepasswordWindowClosed(java.awt.event.WindowEvent evt) {                                            
        try {
            con.close();
            rs.close();
            s.close();
        } catch (SQLException ex) {
        }
    }                                           
    void changepass() throws ClassNotFoundException {
        String pcurr = new String(tcurrent.getPassword());
        String pnew = new String(tnew.getPassword());
        String pconfirm = new String(tconfirm.getPassword());
        if (!pnew.equals(pconfirm)) {
            tnew.setBackground(Color.red);
            tconfirm.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Passwords not match", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (pnew.length() > 6) {
            try {
                String url = "jdbc:mysql://localhost/db";
        String username = "root";
        String password = "123";
        //DriverManager.registerDriver("jdbc:mysql://3306/localhost/db","root","123");
                con = DriverManager.getConnection(url, username, password);
                s = con.createStatement();
                query = "select * from login";
                rs = s.executeQuery(query);
                while (rs.next()) {
                    pass = rs.getString("password");
                }
                if (pcurr.equals(pass)) {
                    query = "update login set password='" + pnew + "'";
                    s.executeUpdate(query);
                    JOptionPane.showMessageDialog(rootPane, "Password Changed", "Success", WIDTH, null);
                    changepassword.dispose();
                } else {
                    tcurrent.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Access Denied", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password length less than 6", "Failed", JOptionPane.ERROR_MESSAGE);
        }
    }                         
}
