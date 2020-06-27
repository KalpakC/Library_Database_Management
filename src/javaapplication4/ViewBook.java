package javaapplication4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class ViewBook extends javax.swing.JFrame {
    private Connection con;
    private Statement statment;
    private ResultSet rs;
    private String bid, query;
    private javax.swing.JButton bsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tsubmit;
    private javax.swing.JTextField tviewauthor;
    private javax.swing.JTextField tviewbid;
    private javax.swing.JTextField tviewisbn;
    private javax.swing.JTextField tviewpublisher;
    private javax.swing.JTextField tviewrack;
    private javax.swing.JTextField tviewstatus;
    private javax.swing.JTextField tviewtitle;
    public ViewBook() throws SQLException {
        initComponents();
        String url = "jdbc:mysql://localhost/db";
        String username = "root";
        String password = "123";
        //DriverManager.registerDriver("jdbc:mysql://3306/localhost/db","root","123");
        con = DriverManager.getConnection(url, username, password);
        statment = con.createStatement();
    }                         
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tviewbid = new javax.swing.JTextField();
        tviewtitle = new javax.swing.JTextField();
        tviewauthor = new javax.swing.JTextField();
        tviewpublisher = new javax.swing.JTextField();
        tviewrack = new javax.swing.JTextField();
        tviewisbn = new javax.swing.JTextField();
        tviewstatus = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bsubmit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tsubmit = new javax.swing.JTextField();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Book Details");
        jLabel2.setText("Book Id");
        jLabel3.setText("ISBN");
        jLabel4.setText("Title");
        jLabel5.setText("Author");
        jLabel6.setText("Publisher");
        jLabel7.setText("Rack No");
        jLabel8.setText("Status");
        tviewbid.setEditable(false);
        tviewtitle.setEditable(false);
        tviewauthor.setEditable(false);
        tviewpublisher.setEditable(false);
        tviewrack.setEditable(false);
        tviewisbn.setEditable(false);
        tviewstatus.setEditable(false);        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Enter id"));
        jPanel1.setForeground(new java.awt.Color(204, 0, 51));
        bsubmit.setText("Submit");
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });
        jLabel9.setText("Book Id :");
        tsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsubmitActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bsubmit)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(bsubmit)
                    .addComponent(tsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tviewauthor)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                                .addComponent(tviewbid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(tviewisbn))
                            .addComponent(tviewtitle)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                                .addComponent(tviewrack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel8)                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tviewstatus, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                            .addComponent(tviewpublisher)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tviewbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tviewisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tviewtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tviewauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tviewpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tviewrack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tviewstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pack();
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
    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        try {
            rs.close();
            con.close();
            statment.close();
        } catch (SQLException ex) {
        }
    }                                 
    void view() throws SQLException {
        query = "select count(*) as b from book where bid='" + tsubmit.getText() + "'";
        rs = statment.executeQuery(query);
        rs.next();
        int as = rs.getInt("b");
        if (as != 0) {
            query = "select * from book where bid='" + tsubmit.getText() + "'";
            rs = statment.executeQuery(query);
            while (rs.next()) {
                tviewbid.setText(rs.getString("bid"));
                tviewisbn.setText(rs.getString("isbn"));
                tviewtitle.setText(rs.getString("title"));
                tviewauthor.setText(rs.getString("author"));
                tviewpublisher.setText(rs.getString("publisher"));
                tviewrack.setText(rs.getString("rack"));
                tviewstatus.setText(rs.getString("status"));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please check Bid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   
}
