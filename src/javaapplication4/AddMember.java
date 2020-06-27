package javaapplication4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class AddMember extends javax.swing.JFrame {
    private Connection con;
    private Statement statment;
    private String mid, query;
    private javax.swing.JButton addsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField taddaddress;
    private javax.swing.JTextField taddadmnno;
    private javax.swing.JTextField taddemail;
    private javax.swing.JTextField taddmid;
    private javax.swing.JTextField taddname;
    private javax.swing.JTextField taddphno;
    private javax.swing.JButton taddreset;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox taddsex;
    public AddMember() throws SQLException, ClassNotFoundException {
        initComponents();
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db","root","123");
        statment = con.createStatement();
    }
     @SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        taddmid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        taddname = new javax.swing.JTextField();
        taddadmnno = new javax.swing.JTextField();
        taddphno = new javax.swing.JTextField();
        taddemail = new javax.swing.JTextField();
        taddaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        taddsex = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        addsubmit = new javax.swing.JButton();
        taddreset = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Member");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        jLabel1.setText("Id :");
        jLabel2.setText("Name : ");
        jLabel3.setText("Admission No: ");
        jLabel4.setText("Phone : ");
        jLabel5.setText("Email : ");
        jLabel6.setText("Address : ");
        jLabel7.setText("Sex :");
        taddsex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Enter the Member details");
        addsubmit.setText("Submit");
        addsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubmitActionPerformed(evt);
            }
        });
        taddreset.setText("Reset");
        taddreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taddresetActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taddmid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(taddsex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(taddphno)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(54, 54, 54)
                                    .addComponent(taddemail, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(taddadmnno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(taddname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taddaddress))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(addsubmit)
                        .addGap(26, 26, 26)
                        .addComponent(taddreset)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taddmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(taddname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taddsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(taddadmnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(taddphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(taddemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taddaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addsubmit)
                    .addComponent(taddreset))
                .addGap(25, 25, 25))
        );
        pack();
    }                      
    private void taddresetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        reset();
    }                                         
    void reset() {
        taddmid.setText("");
        taddname.setText("");
        taddadmnno.setText("");
        taddphno.setText("");
        taddemail.setText("");
        taddaddress.setText("");
    }
    private void addsubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int n = 0;
        mid = taddmid.getText();
        try {
            String mname = taddname.getText();
            String admnno = taddadmnno.getText();
            Long phoneno = Long.valueOf(taddphno.getText());
            String email = taddemail.getText();
            String address = taddaddress.getText();
            String sex = (String) taddsex.getSelectedItem();
            int fine = 0;
            query = "insert into person values('" + mid + "','" + mname + "','" + admnno + "'," + phoneno + ",'" + email + "','" + address + "'," + n + ",'" + sex + "'," + fine + ")";
            statment.execute(query);
            reset();
            JOptionPane.showMessageDialog(rootPane, "Member Added Succesfully", "Success", WIDTH, null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Check all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                         
    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        try {
            con.close();
            statment.close();
        } catch (SQLException ex) {
        }
    }  
    public static void main(String args[]) throws ClassNotFoundException
    {
        try {
            new AddMember().setVisible(true);
        } catch (SQLException ex) {
        }
    }
}
