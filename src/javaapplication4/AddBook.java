package javaapplication4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class AddBook extends javax.swing.JFrame {
    public Connection con;
    public Statement statment;
    private String query;
    private javax.swing.JButton baddreset;
    private javax.swing.JButton baddsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField taddauthor;
    private javax.swing.JTextField taddbid;
    private javax.swing.JTextField taddisbn;
    private javax.swing.JTextField taddpublisher;
    private javax.swing.JTextField taddrackno;
    private javax.swing.JTextField taddtitle;  
    public AddBook() throws SQLException, ClassNotFoundException {
        initComponents();
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/db","root","123");
        statment = con.createStatement();
    }
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        baddsubmit = new javax.swing.JButton();
        baddreset = new javax.swing.JButton();
        taddbid = new javax.swing.JTextField();
        taddtitle = new javax.swing.JTextField();
        taddauthor = new javax.swing.JTextField();
        taddpublisher = new javax.swing.JTextField();
        taddisbn = new javax.swing.JTextField();
        taddrackno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Book");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        jLabel1.setText("Book id ");
        jLabel2.setText("Title");
        jLabel3.setText("Author");
        jLabel4.setText("Publisher");
        jLabel5.setText("ISBN");
        jLabel6.setText("Rack No:");
        baddsubmit.setText("Submit");
        baddsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddsubmitActionPerformed(evt);
            }
        });
        baddreset.setText("Reset");
        baddreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddresetActionPerformed(evt);
            }
        });
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Enter Book Details");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(taddbid, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(taddauthor)
                                    .addComponent(taddisbn))
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(145, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(baddsubmit)
                        .addGap(18, 18, 18)
                        .addComponent(baddreset)
                        .addGap(32, 32, 32)))
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(taddpublisher, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(taddrackno)
                    .addComponent(taddtitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(taddbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(taddtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(taddauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(taddpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(taddisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(taddrackno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baddsubmit)
                    .addComponent(baddreset))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pack();
    }                      
    private void baddresetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        reset();
    }                                         
    private void baddsubmitActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String bid = taddbid.getText();
        String title = taddtitle.getText();
        String author = taddauthor.getText();
        String publisher = taddpublisher.getText();
        String isbn = taddisbn.getText();
        String rackno = taddrackno.getText();
        query = "insert into book values ('" + bid + "','" + title + "','" + author + "','" + publisher + "','" + isbn + "','" + rackno + "','IN')";
        try {
            statment.execute(query);
            JOptionPane.showMessageDialog(rootPane, "Book Added Succesfully", "Success", WIDTH, null);
            reset();

        } catch (SQLException ex) {
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
    void reset() {
        taddbid.setText("");
        taddtitle.setText("");
        taddauthor.setText("");
        taddpublisher.setText("");
        taddisbn.setText("");
        taddrackno.setText("");
    }
    public static void main(String args[]) throws ClassNotFoundException
    {
        try {
            new AddBook().setVisible(true);
        } catch (SQLException ex) {
        }
    }
}
