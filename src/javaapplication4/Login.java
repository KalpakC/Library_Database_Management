package javaapplication4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    private Statement statment;
    private Connection con;
    private ResultSet rs;
    private int n;
    private javax.swing.JButton blogin;
    private javax.swing.JButton breset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField tpassword;
    private javax.swing.JTextField tusername; 

   
    public Login() {
        n = 0;
        initComponents();
    }                       
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        tusername = new javax.swing.JTextField();
        blogin = new javax.swing.JButton();
        breset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(350, 300));
        setPreferredSize(new java.awt.Dimension(350, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        jLabel1.setText("Username");
        blogin.setText("Login");
        blogin.addActionListener(this::bloginActionPerformed);
        breset.setText("Reset");
        breset.addActionListener(this::bresetActionPerformed);
        jLabel2.setText("Password");
        tpassword.addActionListener(this::tpasswordActionPerformed);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(208, 0, 0));
        jLabel3.setText("Welcome");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 208));
        jLabel4.setText("Please Login to Continue");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(blogin)
                                .addGap(57, 57, 57)
                                .addComponent(breset))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(37, 37, 37)                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tusername, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(tpassword)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blogin)
                    .addComponent(breset))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        setSize(new java.awt.Dimension(330, 303));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void tpasswordActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            check();
        } catch (ClassNotFoundException ex) {
        }
    }                                         
    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            check();
        } catch (ClassNotFoundException ex) {
        }
    }                                      
    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {                                       
        clear();
    }                                      
    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        try {
            rs.close();
            con.close();
            statment.close();
        } catch (SQLException ex) {
        }
    }                                 
    private void check() throws ClassNotFoundException {
        String username = tusername.getText();
        blogin.setEnabled(false);
        String password = new String(tpassword.getPassword());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db","root","123");
            statment = con.createStatement();
            String query = "select * from login";
            rs = statment.executeQuery(query);
            rs.next();
            String use = rs.getString("username");
            String pass = rs.getString("password");
            if (use.equals(username) && (pass.equals(password))) {
                rs.close();
                statment.close();
                con.close();
                new Home().setVisible(true);
                dispose();
            } else {
                n++;
                JOptionPane.showMessageDialog(null, "Access Denied", "Error", JOptionPane.ERROR_MESSAGE);
                clear();
                if (n >= 3) {
                    rs.close();
                    statment.close();
                    con.close();
                    System.exit(0);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "OOps.. Something is not right", "Error", JOptionPane.ERROR_MESSAGE);
        }
        blogin.setEnabled(true);
    }
    private void clear() {
        tusername.setText("");
        tpassword.setText("");
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }                                
}

