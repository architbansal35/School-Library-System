
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranshu Pranjal
 */
public class Book_Issue extends javax.swing.JFrame {

    /**
     * Creates new form Book_Issue
     */
    public Book_Issue() {
        initComponents();
       String s=new java.util.Date().toString();
       Date.setText(s.substring(8,10)+" "+s.substring(4,7)+" "+s.substring(24,28));
        this.setResizable(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize-43);
    }

        private void resetting()
{
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jTextField8.setText("");
jTextField9.setText("");
jTextField10.setText("");
jTextField11.setText("");
jSlider1.setValue(7);
}
        public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Date = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Star = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Star1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFile = new javax.swing.JMenu();
        Start_Page = new javax.swing.JMenuItem();
        Log_Out = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMasters = new javax.swing.JMenu();
        jAuthor = new javax.swing.JMenuItem();
        jGenre = new javax.swing.JMenuItem();
        jPublisher = new javax.swing.JMenuItem();
        jStudent = new javax.swing.JMenuItem();
        jBooks = new javax.swing.JMenu();
        jNewBook = new javax.swing.JMenuItem();
        jIssueBooks = new javax.swing.JMenuItem();
        jBookWanted = new javax.swing.JMenuItem();
        jReturnBooks = new javax.swing.JMenuItem();
        jSearch = new javax.swing.JMenu();
        jSAuthor = new javax.swing.JMenuItem();
        jSBook = new javax.swing.JMenuItem();
        jSPublisher = new javax.swing.JMenuItem();
        jSStudent = new javax.swing.JMenuItem();
        jHelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Olympus Library");

        Date.setText("Date");

        jLabel9.setFont(new java.awt.Font("Parchment", 0, 48)); // NOI18N
        jLabel9.setText("The   Olympus   Library ");

        jLabel4.setText("© 2017 -2018               All Rights Reserved");

        jLabel11.setText("The Olympus Library");

        jLabel12.setText("Patron :        Athena");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Accession Number :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name of Book      :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Author                :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Publisher               :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Year Published        :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Genre                 :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Subject (If any)    :");

        Star.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Star.setForeground(new java.awt.Color(204, 0, 51));
        Star.setText("*");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Admission Number:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Name Of Student    :");

        Star1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Star1.setForeground(new java.awt.Color(204, 0, 51));
        Star1.setText("*");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Class :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Section :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Time Period Of Issue :");

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setForeground(new java.awt.Color(0, 0, 255));
        jSlider1.setMajorTickSpacing(7);
        jSlider1.setMaximum(28);
        jSlider1.setMinimum(7);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("Days");
        jSlider1.setValue(7);

        jButton1.setText("Issue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jFile.setText("File");

        Start_Page.setText("Start Page");
        Start_Page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_PageActionPerformed(evt);
            }
        });
        jFile.add(Start_Page);

        Log_Out.setText("Log Out");
        Log_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_OutActionPerformed(evt);
            }
        });
        jFile.add(Log_Out);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jFile.add(Exit);

        jMenuBar1.add(jFile);

        jMasters.setText("Masters");

        jAuthor.setText("Author Master");
        jAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAuthorActionPerformed(evt);
            }
        });
        jMasters.add(jAuthor);

        jGenre.setText("Genre Master");
        jGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenreActionPerformed(evt);
            }
        });
        jMasters.add(jGenre);

        jPublisher.setText("Publisher Master");
        jPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPublisherActionPerformed(evt);
            }
        });
        jMasters.add(jPublisher);

        jStudent.setText("Student Master");
        jStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStudentActionPerformed(evt);
            }
        });
        jMasters.add(jStudent);

        jMenuBar1.add(jMasters);

        jBooks.setText("Books");

        jNewBook.setText("Add New Book");
        jNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewBookActionPerformed(evt);
            }
        });
        jBooks.add(jNewBook);

        jIssueBooks.setText("Issue Books");
        jIssueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIssueBooksActionPerformed(evt);
            }
        });
        jBooks.add(jIssueBooks);

        jBookWanted.setText("Remove Book");
        jBookWanted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBookWantedActionPerformed(evt);
            }
        });
        jBooks.add(jBookWanted);

        jReturnBooks.setText("Return Books");
        jReturnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturnBooksActionPerformed(evt);
            }
        });
        jBooks.add(jReturnBooks);

        jMenuBar1.add(jBooks);

        jSearch.setText("Search");

        jSAuthor.setText("Search Author");
        jSAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSAuthorActionPerformed(evt);
            }
        });
        jSearch.add(jSAuthor);

        jSBook.setText("Search Books");
        jSBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSBookActionPerformed(evt);
            }
        });
        jSearch.add(jSBook);

        jSPublisher.setText("Search Publisher");
        jSPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSPublisherActionPerformed(evt);
            }
        });
        jSearch.add(jSPublisher);

        jSStudent.setText("Search Student");
        jSStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSStudentActionPerformed(evt);
            }
        });
        jSearch.add(jSStudent);

        jMenuBar1.add(jSearch);

        jHelp.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jHelp.add(jMenuItem1);

        jMenuBar1.add(jHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(281, 281, 281)
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(318, 318, 318)
                                .addComponent(jLabel4)
                                .addGap(80, 80, 80))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Star, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Star1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField11)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(179, 179, 179)
                .addComponent(jButton1)
                .addGap(489, 489, 489))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel17, jLabel2, jLabel3, jLabel6});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel16, jLabel7, jLabel8});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField4, jTextField5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Star))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Star1))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(65, 65, 65)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection c;
Statement s;
ResultSet rs;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String accno=jTextField1.getText();
String Admisno=jTextField6.getText();
int time=jSlider1.getValue();
try
{
DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
s= c.createStatement();
String query="insert into book_issued values("+accno+","+Admisno+",date(sysdate()),"+time+");";
s.executeUpdate(query);
}
catch(Exception e)
{
    System.out.println(e);
}
JOptionPane.showMessageDialog(this, "Successfully Issued");
resetting();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
int accno=Integer.parseInt(jTextField1.getText());
try
{
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
s= c.createStatement();
String query="select name_book,First_name,middle_name,last_name,genere,subject,publisher_name,publish_year from book,author,publisher,genere where book.author_no=author.author_no and book.publisher_no=publisher.publisher_no and book.genre_no=genere.genere_no and accession_no="+accno+";";
rs=s.executeQuery(query);
rs.next();
jTextField2.setText(rs.getString(1));
jTextField3.setText(rs.getString(2)+rs.getString(3)+rs.getString(4));
jTextField4.setText(rs.getString(5));
jTextField5.setText(rs.getString(6));
jTextField9.setText(rs.getString(7));
jTextField10.setText(rs.getString(8));
}
catch(Exception e)
{
JOptionPane.showMessageDialog(this,"Have you given the correct input for Accession Number : "+accno);
    System.out.println(e);
}
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
String admno=jTextField6.getText();
try
{
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
s= c.createStatement();
String query="select name,class,section from student where Admission_no="+admno+";";
rs=s.executeQuery(query);
rs.next();
jTextField11.setText(rs.getString(1));
jTextField7.setText(rs.getString(2));
jTextField8.setText(rs.getString(3));
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this,"Have you given the correct input for Admission Number:"+admno);
}
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
resetting();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Start_PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_PageActionPerformed
        close();
        Home_Screen s= new Home_Screen();
        s.setVisible(true);
    }//GEN-LAST:event_Start_PageActionPerformed

    private void Log_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_OutActionPerformed
        JOptionPane.showMessageDialog(this,"Please wait a few moments while we tidy up your workstation !!");
        close();
        Security_Screen s= new Security_Screen();
        s.setVisible(true);
    }//GEN-LAST:event_Log_OutActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAuthorActionPerformed
        close();
        Author_Master s= new Author_Master();
        s.setVisible(true);
    }//GEN-LAST:event_jAuthorActionPerformed

    private void jGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenreActionPerformed
        close();
        Genre_Master s= new Genre_Master();
        s.setVisible(true);
    }//GEN-LAST:event_jGenreActionPerformed

    private void jPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPublisherActionPerformed
        close();
        Publisher_Master s= new Publisher_Master();
        s.setVisible(true);
    }//GEN-LAST:event_jPublisherActionPerformed

    private void jStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStudentActionPerformed

    }//GEN-LAST:event_jStudentActionPerformed

    private void jNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewBookActionPerformed
        close();
        File_in_a_new_book s= new File_in_a_new_book();
        s.setVisible(true);
    }//GEN-LAST:event_jNewBookActionPerformed

    private void jIssueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIssueBooksActionPerformed
        close();
        Book_Issue s= new Book_Issue();
        s.setVisible(true);
    }//GEN-LAST:event_jIssueBooksActionPerformed

    private void jBookWantedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBookWantedActionPerformed
        close();
        Book_Remove s= new Book_Remove();
        s.setVisible(true);
    }//GEN-LAST:event_jBookWantedActionPerformed

    private void jReturnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturnBooksActionPerformed
        close();
        Book_Return s= new Book_Return();
        s.setVisible(true);
    }//GEN-LAST:event_jReturnBooksActionPerformed

    private void jSAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSAuthorActionPerformed
        close();
        Author_Search s= new Author_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSAuthorActionPerformed

    private void jSBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSBookActionPerformed
        close();
        Book_Search s= new Book_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSBookActionPerformed

    private void jSPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSPublisherActionPerformed
        close();
        Publisher_Search s= new Publisher_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSPublisherActionPerformed

    private void jSStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSStudentActionPerformed
        close();
        Student_Search s= new Student_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSStudentActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        About s= new About();
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Book_Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Log_Out;
    private javax.swing.JLabel Star;
    private javax.swing.JLabel Star1;
    private javax.swing.JMenuItem Start_Page;
    private javax.swing.JMenuItem jAuthor;
    private javax.swing.JMenuItem jBookWanted;
    private javax.swing.JMenu jBooks;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jFile;
    private javax.swing.JMenuItem jGenre;
    private javax.swing.JMenu jHelp;
    private javax.swing.JMenuItem jIssueBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMasters;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jNewBook;
    private javax.swing.JMenuItem jPublisher;
    private javax.swing.JMenuItem jReturnBooks;
    private javax.swing.JMenuItem jSAuthor;
    private javax.swing.JMenuItem jSBook;
    private javax.swing.JMenuItem jSPublisher;
    private javax.swing.JMenuItem jSStudent;
    private javax.swing.JMenu jSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JMenuItem jStudent;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
