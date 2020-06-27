package javaapplication4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    private Connection con;
    private Statement statment;
    private String mid;
    private String bid;
    private String query;
    private ResultSet rs;
    private String fineid;
    private int ndays, status;
    private Date date;
    private javax.swing.JButton bcheck;
    private javax.swing.JButton botherfunction;
    private javax.swing.JButton bpaylater;
    private javax.swing.JButton brenew;
    private javax.swing.JButton breturn;
    private javax.swing.JButton bsearch;
    private javax.swing.JDialog fine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbid1;
    private javax.swing.JPanel lbid2;
    private javax.swing.JLabel lbid3;
    private javax.swing.JLabel lmid;
    private javax.swing.JButton paynow;
    private javax.swing.JTextField tbid1;
    private javax.swing.JTextField tbid2;
    private javax.swing.JTextField tbid3;
    private javax.swing.JTextField tfine;
    private javax.swing.JTextField tmid;

    
    public Home() throws SQLException {
        initComponents();
        String url = "jdbc:mysql://localhost/db";
        String username = "root";
        String password = "123";
        //DriverManager.registerDriver("jdbc:mysql://3306/localhost/db","root","123");
        con = DriverManager.getConnection(url, username, password);
        statment = con.createStatement();
    }

                           
    private void initComponents() {

        fine = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tfine = new javax.swing.JTextField();
        paynow = new javax.swing.JButton();
        bpaylater = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbid1 = new javax.swing.JLabel();
        lmid = new javax.swing.JLabel();
        tbid1 = new javax.swing.JTextField();
        tmid = new javax.swing.JTextField();
        bcheck = new javax.swing.JButton();
        lbid2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        breturn = new javax.swing.JButton();
        tbid2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lbid3 = new javax.swing.JLabel();
        tbid3 = new javax.swing.JTextField();
        brenew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botherfunction = new javax.swing.JButton();
        bsearch = new javax.swing.JButton();

       // fine.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        fine.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        fine.setTitle("Fine");
        fine.setAlwaysOnTop(true);
        fine.setLocationByPlatform(true);
        fine.setMinimumSize(new java.awt.Dimension(280, 150));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Fine Amount :               RS");

        tfine.setEditable(false);
        tfine.setBackground(new java.awt.Color(255, 0, 0));

        paynow.setText("Pay now");
        paynow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paynowActionPerformed(evt);
            }
        });

        bpaylater.setText("Pay Later");
        bpaylater.addActionListener(new java.awt.event.ActionListener() {
           
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 
           // JOptionPane.showMessageDialog(null, "Enter all fields", "Error", JOptionPane.ERROR_MESSAGE);  
            
                bpaylaterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fineLayout = new javax.swing.GroupLayout(fine.getContentPane());
        fine.getContentPane().setLayout(fineLayout);
        fineLayout.setHorizontalGroup(
            fineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fineLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(fineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fineLayout.createSequentialGroup()
                        .addComponent(paynow)
                        .addGap(32, 32, 32)
                        .addComponent(bpaylater))
                    .addGroup(fineLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfine, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        fineLayout.setVerticalGroup(
            fineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fineLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(fineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpaylater)
                    .addComponent(paynow))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY APP-2015");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Checkout"));

        lbid1.setText("Book id :");

        lmid.setText("Member id :");

        bcheck.setText("Checkout");
        bcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lmid, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbid1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(tmid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bcheck)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbid1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lmid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(bcheck)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbid2.setBorder(javax.swing.BorderFactory.createTitledBorder("Return"));

        jLabel3.setText("Book id :");

        breturn.setText("Return");
        breturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breturnActionPerformed(evt);
            }
        });

        tbid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbid2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbid2Layout = new javax.swing.GroupLayout(lbid2);
        lbid2.setLayout(lbid2Layout);
        lbid2Layout.setHorizontalGroup(
            lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbid2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(tbid2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(breturn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        lbid2Layout.setVerticalGroup(
            lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbid2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(breturn)
                    .addComponent(tbid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Renewal"));

        lbid3.setText("Book id :");

        tbid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbid3ActionPerformed(evt);
            }
        });

        brenew.setText("Renew");
        brenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brenewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbid3)
                .addGap(72, 72, 72)
                .addComponent(tbid3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(brenew, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbid3)
                    .addComponent(tbid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brenew))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 0, 0));
        jLabel2.setText("HOME");

        botherfunction.setText("EXTRA FUNCTIONS");
        botherfunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botherfunctionActionPerformed(evt);
            }
        });

        bsearch.setText("SEARCH BOOKS");
        bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(botherfunction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bsearch)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botherfunction)
                    .addComponent(bsearch))
                .addGap(26, 26, 26))
        );

        pack();
    }
    private void bcheckActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int n = 0;
        bid = tbid1.getText();
        mid = tmid.getText();
        if ("".equals(bid) || "".equals(mid)) {
            JOptionPane.showMessageDialog(null, "Enter all fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            tbid1.setText("");
            tmid.setText("");
            query = "select book from person where mid='" + mid + "'";
            try {
                rs = statment.executeQuery(query);

                while (rs.next()) {
                    n = rs.getInt("book");
                }
                if (n < 3) {

                    query = "insert into checkout values('" + mid + "','" + bid + "',sysdate(),date_add(sysdate(),interval 15 day))";
                    statment.execute(query);

                    query = "update book set status='OUT' where bid='" + bid + "'";
                    statment.executeUpdate(query);
                    query = "update person set book=book+1 where mid='" + mid + "'";
                    statment.executeUpdate(query);
                    rs = statment.executeQuery("select date_add(sysdate(),interval 15 day) as n from dual");
                    rs.next();
                    date = rs.getDate("n");
                    JOptionPane.showMessageDialog(rootPane, "Success. Return date: " + date, "Success", WIDTH, null);
                } else {
                    JOptionPane.showMessageDialog(null, mid + " already have 3 books", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Check mid or bid ", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Oops. Someting is not right", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }                                      

    private void brenewActionPerformed(java.awt.event.ActionEvent evt) {                                       
        ren();
    }                                      

    private void breturnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        ret();
    }                                       

    private void paynowActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (status == 0) {
            JOptionPane.showMessageDialog(rootPane, "Fine paid. New return date: " + date, "Success", WIDTH, null);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Fine paid.Book Returned", "Success", WIDTH, null);
        }
    }                                      

    private void tbid2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        ret();
    }                                     

    private void tbid3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        ren();
    }                                     

    private void bsearchActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try {
            new Search().setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops. Someting is not right", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                       

    private void botherfunctionActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new OtherFunctions().setVisible(true);
    }                                              

    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        try {
            con.close();
            rs.close();
            statment.close();
        } catch (SQLException ex) {
        }
    }                                 

    private void bpaylaterActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
             
          //  JOptionPane.showMessageDialog(null, "Enter all fields", "Error", JOptionPane.ERROR_MESSAGE);  
            
        //    query = "update person set fine=fine+" + ndays + "where mid='" + fineid + "'";
        //    String string1 = fineid;
            
            query = "update person set fine=fine+"+ ndays +" where mid='"+fineid+"'"; 

           
           
            statment.execute(query);
            if (status == 0) {
                JOptionPane.showMessageDialog(rootPane, "Added to account.New return date: " + date, "Success", WIDTH, null);
            //formWindowClosed(evt);
                //formWindowClosed(evt);
                fine.dispose();
                new Home().setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Added to account and Book Returned", "Success", WIDTH, null);
             fine.dispose();
                new Home().setVisible(true);
                
            }
        } catch (SQLException ex) {
        }
    }                                         

    private void ren() {

        int fi;
        bid = tbid3.getText();
        if ("".equals(bid)) {
            JOptionPane.showMessageDialog(null, "Please enter bid ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {

                fi = checkfine(bid);
                query = "select count(*) as b from checkout where bid='" + bid + "'";
                rs = statment.executeQuery(query);
                rs.next();
                int as = rs.getInt("b");
                if (as != 0) {
                    query = "update checkout set dor=date_add(sysdate(),interval 15 day) where bid='" + bid + "'";
                    statment.executeUpdate(query);
                    tbid3.setText("");
                    rs = statment.executeQuery("select date_add(sysdate(),interval 15 day) as n from dual");
                    rs.next();
                    date = rs.getDate("n");
                    if (fi > 0) {
                        fine.setVisible(true);
                        status = 0;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "New return date: " + date, "Success", WIDTH, null);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please check bid ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Oops. Someting is not right", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void ret() {
        bid = tbid2.getText();

        if ("".equals(bid)){
            JOptionPane.showMessageDialog(null, "Please enter bid ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                int fi = checkfine(bid);
                query = "select count(*) as b,mid as c from checkout where bid='" + bid + "'";
                rs = statment.executeQuery(query);
                rs.next();
                int as = rs.getInt("b");
                int e;
                e = rs.getInt("c");
                        if (as != 0) {
                    query = "delete from checkout where bid='" + bid + "'";
                    statment.executeUpdate(query);
                    query = "update book set status='IN' where bid='" + bid + "'";
                    statment.executeUpdate(query);
                    query = "update person set book=book-1 where mid='" +e+ "'";
                    statment.executeUpdate(query);
                    tbid2.setText("");
                    if (fi > 0) {
                        fine.setVisible(true);
                        status = 1;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Returned Succesfully", "Success", WIDTH, null);
                    }

                } 
                else {
                    JOptionPane.showMessageDialog(null, "Please check bid ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Oops. Someting is not right", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private int checkfine(String id) {
        query = "select datediff(sysdate(),dor) as n from checkout where bid='" + id + "'";
        String query2 = "select mid from checkout where bid='" + id + "'";
        try {

            rs = statment.executeQuery(query);
            rs.next();
            ndays = rs.getInt("n");
            tfine.setText(String.valueOf(ndays));
            rs = statment.executeQuery(query2);
            rs.next();
            fineid = rs.getString("mid");

            return ndays;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Please check bid ", "Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
    
}

