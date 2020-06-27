package javaapplication4;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ViewMember extends javax.swing.JFrame {

    private Connection con;
    private Statement statment;
    private String mid, query;
    private ResultSet rs;
    private javax.swing.JButton bpayfine;
    private javax.swing.JButton bsubmit;
    private javax.swing.JButton bviewdelet;
    public javax.swing.JLabel disp;
    private javax.swing.JButton done;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mtable;
    public javax.swing.JDialog status;
    private javax.swing.JTextField tsubmit;
    private javax.swing.JTextField tviewaddress;
    private javax.swing.JTextField tviewadmnno;
    private javax.swing.JTextField tviewbooks;
    private javax.swing.JTextField tviewemail;
    private javax.swing.JTextField tviewfine;
    private javax.swing.JTextField tviewmid;
    private javax.swing.JTextField tviewname;
    private javax.swing.JTextField tviewphno;
    private javax.swing.JTextField tviewsex;
    private String columnNames[];
    private String dataValues[][];


    public ViewMember() throws SQLException {
        initComponents();
        String url = "jdbc:mysql://localhost/db";
        String username = "root";
        String password = "123";
        //DriverManager.registerDriver("jdbc:mysql://3306/localhost/db","root","123");
        con = DriverManager.getConnection(url, username, password);
        statment = con.createStatement();

    }
                         
    private void initComponents() {

        status = new javax.swing.JDialog();
        disp = new javax.swing.JLabel();
        done = new javax.swing.JButton();
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
        tviewname = new javax.swing.JTextField();
        tviewmid = new javax.swing.JTextField();
        tviewsex = new javax.swing.JTextField();
        tviewadmnno = new javax.swing.JTextField();
        tviewphno = new javax.swing.JTextField();
        tviewemail = new javax.swing.JTextField();
        tviewaddress = new javax.swing.JTextField();
        tviewbooks = new javax.swing.JTextField();
        tviewfine = new javax.swing.JTextField();
        bviewdelet = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bsubmit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tsubmit = new javax.swing.JTextField();
        bpayfine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtable = new javax.swing.JTable();
        columnNames = new String[]{"Si No", "Book id", " Title ", " Author ", " Publisher ", "Return Date"};

        status.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        status.setTitle("Status Window");
        status.setAlwaysOnTop(true);
        status.setBounds(new java.awt.Rectangle(10, 100, 10, 10));
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        status.setLocationByPlatform(true);
        status.setMinimumSize(new java.awt.Dimension(220, 150));

        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusLayout = new javax.swing.GroupLayout(status.getContentPane());
        status.getContentPane().setLayout(statusLayout);
        statusLayout.setHorizontalGroup(
                statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(statusLayout.createSequentialGroup()
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(statusLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(statusLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(done)))
                .addContainerGap(36, Short.MAX_VALUE)));
        statusLayout.setVerticalGroup(
                statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(statusLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(done)
                .addContainerGap(40, Short.MAX_VALUE)));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Member");
        setMinimumSize(new java.awt.Dimension(550, 522));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Member Details");

        jLabel2.setText("Member id");

        jLabel3.setText("Name");

        jLabel4.setText("Sex");

        jLabel5.setText("Admission No:");

        jLabel6.setText("Phone");

        jLabel7.setText("Email");

        jLabel8.setText("Address");

        jLabel9.setText("No: of Books");

        jLabel10.setText("Fine    Rs");

        tviewname.setEditable(false);

        tviewmid.setEditable(false);

        tviewsex.setEditable(false);

        tviewadmnno.setEditable(false);

        tviewphno.setEditable(false);

        tviewemail.setEditable(false);

        tviewaddress.setEditable(false);

        tviewbooks.setEditable(false);

        tviewfine.setEditable(false);

        bviewdelet.setText("Delete");
        bviewdelet.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviewdeletActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Enter id"));
        jPanel1.setForeground(new java.awt.Color(204, 0, 51));

        bsubmit.setText("Submit");
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });

        jLabel12.setText("Member Id :");

        tsubmit.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(bsubmit)
                .addContainerGap(32, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel12)
                .addComponent(bsubmit)
                .addComponent(tsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap()));

        bpayfine.setText("Pay Fine");
        bpayfine.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpayfineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel1)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tviewname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tviewsex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(tviewphno, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7)
                .addComponent(jLabel2)
                .addComponent(jLabel5))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(tviewadmnno, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tviewmid, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tviewemail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8)
                .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(tviewaddress)
                .addGroup(layout.createSequentialGroup()
                .addComponent(tviewfine, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tviewbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(bviewdelet, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(bpayfine)))
                .addContainerGap(60, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(tviewname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(tviewmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tviewsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(jLabel5)
                .addComponent(tviewadmnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(tviewphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7)
                .addComponent(tviewemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(tviewaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(tviewfine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9)
                .addComponent(tviewbooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bviewdelet)
                .addComponent(bpayfine))
                .addGap(23, 23, 23)));
    }// </editor-fold>                        

    private void bviewdeletActionPerformed(java.awt.event.ActionEvent evt) {
        query = "delete from person where mid='" + tsubmit.getText() + "'";
        try {
            statment.executeUpdate(query);
            status.setTitle("success");
            disp.setText("member deleted succesfully");
            status.setVisible(true);
        } catch (SQLException ex) {
        }
    }

    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            view();
        } catch (SQLException ex) {
        }
    }

    private void tsubmitActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            view();
        } catch (SQLException ex) {
        }
    }

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {
        status.dispose();
    }

    private void bpayfineActionPerformed(java.awt.event.ActionEvent evt) {
       
        try {
             query = "update person set fine=0 where mid='" + tsubmit.getText() + "'";
            statment.executeUpdate(query);
            status.setTitle("success");
            disp.setText("   Fine paid  ");
            status.setVisible(true);
        } catch (SQLException ex) {
        }
    }

    void view() throws SQLException {
        bpayfine.setEnabled(false);
        query = "select count(*) as b from person where mid='" + tsubmit.getText() + "'";
        rs = statment.executeQuery(query);
        rs.next();
        int as = rs.getInt("b");
        if (as != 0) {
            query = "select * from person where mid='" + tsubmit.getText() + "'";
            rs = statment.executeQuery(query);
            while (rs.next()) {
                bviewdelet.setEnabled(true);
                int a = rs.getInt("fine");
                int b = rs.getInt("book");
                if (a > 0 || b > 0) {
                    bviewdelet.setEnabled(false);
                }
                if (a > 0) {
                    bpayfine.setEnabled(true);
                }
                //String ph = String.valueOf(rs.getString("phno"));
                //String bo = String.valueOf(rs.getString("book"));
                //String fn = String.valueOf(rs.getString("fine"));
                query = "select * from person where mid='" + tsubmit.getText() + "'";
            rs = statment.executeQuery(query);
            while(rs.next())
            {tviewmid.setText(rs.getString("mid"));
                tviewname.setText(rs.getString("mname"));
                tviewadmnno.setText(rs.getString("admnno"));
                tviewphno.setText(rs.getString("phno"));
                tviewemail.setText(rs.getString("email"));
                tviewaddress.setText(rs.getString("addr"));
                tviewbooks.setText(rs.getString("book"));
                tviewsex.setText(rs.getString("sex"));
                tviewfine.setText(rs.getString("fine"));
            }
                if (b > 0) {
                    bookonhand(mid);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please check Mid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bookonhand(String id) {
        dataValues = new String[10][10];
        int j = 0, i = 0, sino = 1;
        query = "select * from book where bid= (select bid from checkout where mid='" + id + "')";
        String query2 = "select dor from checkout where mid ='" + id + "'";
        try {
            rs = statment.executeQuery(query);
            while (rs.next()) {
                j = 0;
                dataValues[i][j++] = String.valueOf(sino);
                dataValues[i][j++] = rs.getString("bid");
                dataValues[i][j++] = rs.getString("title");
                dataValues[i][j++] = rs.getString("author");
                dataValues[i][j++] = rs.getString("publisher");
                i++;
                sino++;
            }
            rs = statment.executeQuery(query2);
            while (rs.next()) {
                i = 0;
                dataValues[i][j] = String.valueOf(rs.getString("dor"));
                i++;
            }

            mtable.setSelectionForeground(Color.red);
            mtable.setSelectionBackground(Color.black);
            mtable.setModel(new javax.swing.table.DefaultTableModel(dataValues, columnNames));
            jScrollPane1.setViewportView(mtable);
        } catch (SQLException e) {
        }


    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {

        try {
            rs.close();
            con.close();
            statment.close();
        } catch (SQLException ex) {
        }
    }
                  
}
