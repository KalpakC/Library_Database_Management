package javaapplication4;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Search extends javax.swing.JFrame {
    private Connection con;
    private Statement statment;
    private String query;
    private ResultSet rs;
    private javax.swing.JButton bsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable stable;
    private javax.swing.JTextField tsearch;
    private String columnNames[];
    private String dataValues[][];

    public Search() throws SQLException {
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
        tsearch = new javax.swing.JTextField();
        bsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stable = new javax.swing.JTable();
        columnNames = new String[]{"Si No", "Book id", " Title ", " Author ", " Publisher ", " Status ", " Rack No: "};
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search");
        jLabel1.setText("Keyword  : ");
        tsearch.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchActionPerformed(evt);
            }
        });
        bsearch.setText("Search");
        bsearch.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearchActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(bsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap()));
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bsearch))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(133, 133, 133)));
        pack();
    }// </editor-fold>                        
    private void bsearchActionPerformed(java.awt.event.ActionEvent evt) {
        search();
    }
    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {
        search();
    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {
        try {
            rs.close();
            con.close();
            statment.close();
        } catch (SQLException ex) {
        }
    }
    private void search() {
        dataValues = new String[100][8];
        int j, i = 0, sino = 1;
        query = "Select bid,title,author,publisher,rack,status from book where title like '%" + tsearch.getText() + "%' or author like '%" + tsearch.getText() + "%'";
        try {
            rs = statment.executeQuery(query);
            while (rs.next()) {
                j = 0;
                dataValues[i][j++] = String.valueOf(sino);
                dataValues[i][j++] = rs.getString("bid");
                dataValues[i][j++] = rs.getString("title");
                dataValues[i][j++] = rs.getString("author");
                dataValues[i][j++] = rs.getString("publisher");
                dataValues[i][j++] = rs.getString("rack");
                dataValues[i][j++] = rs.getString("status");
                i++;
                sino++;
            }
            if (i != 0) {
                stable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                stable.setSelectionForeground(Color.red);
                stable.setSelectionBackground(Color.black);
                stable.setModel(new javax.swing.table.DefaultTableModel(dataValues, columnNames));
                jScrollPane1.setViewportView(stable);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
