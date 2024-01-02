/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Dell
 */


class mymodel1 extends javax.swing.table.AbstractTableModel
{
    ResultSet rs1;
    ResultSetMetaData rsmd;
    mymodel1(ResultSet rs)
    {
        try
        {
            rs1=rs;
            rsmd=rs1.getMetaData();
        }
        catch(SQLException e)
    {
        System.out.print(e);
    }
    }
    
    
    @Override
    public int getRowCount() {
        try
        {
            rs1.last();
            return rs1.getRow();
        }
        catch(SQLException e)
    {
        System.out.print(e);
        return -1;
    }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        try{
            return rsmd.getColumnCount();
        }
        catch(SQLException e)
    {
        System.out.print(e);
        return -1;
    }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try
        {
            rs1.absolute(rowIndex+1);
            return rs1.getObject(columnIndex+1);
        }
        catch(SQLException e)
        {
            return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getColumnName(int n)
    {
        try
        {
            return rsmd.getColumnName(n+1);
        }
        catch(SQLException e)
        {
          System.out.print(e);
            return null;
        }
    }
}







public class home6 extends javax.swing.JFrame {

    /**
     * Creates new form home6
     */
    int ayushi=0;
    int ayushi2=0;
    int ayushi3=0;
    int ayushi4=0;
    String ayushi5="";
    String name="";
    int new1=0;
    int total_amount=0;
    int total_discount=0;
    int total_initial=0;
    public home6() {
        initComponents();
          this.setBounds(160,100,1020,560);
          p1.setBounds(0,0,1020,560);
         p1.setVisible(true);
        
          p2.setBounds(0,0,1020,560);
          p2.setVisible(false);
         
          p4.setBounds(0,0,1020,560);
           p4.setVisible(false);
           p5.setBounds(0,0,1020,560);
           p5.setVisible(false);
            p6.setBounds(0,0,1020,560);
           p6.setVisible(false);
           p7.setBounds(0,0,1020,560);
           p7.setVisible(false);
           p8.setBounds(0,0,1020,560);
           p8.setVisible(false);
           p9.setBounds(0,0,1020,560);
           p9.setVisible(false);
           p10.setBounds(0,0,1020,560);
           p10.setVisible(false);
           p11.setBounds(0,0,1020,560);
           p11.setVisible(false);
           p12.setBounds(0,0,1020,560);
           p12.setVisible(false);
           p13.setBounds(0,0,1020,560);
           p13.setVisible(false);
           p14.setBounds(0,0,1020,560);
           p14.setVisible(false);
           b18.setVisible(false);
            b22.setVisible(false);
             b23.setVisible(false);
              try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from models");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt1.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
               try
       {
           cba.removeAllItems();
           cba.addItem("BRAND");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct Brand from models");
           while(rs.next())
           {
              cba.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
           
              try
       {
           cbd.removeAllItems();
           cbd.addItem("BRAND");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct Brand from models");
           while(rs.next())
           {
              cbd.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
          try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from dealerdetails");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt2.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }             
        
          try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from customerdetails");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt3.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }            
          try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from repair");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt4.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }    
        
//        if(ayushi4==1)
//        {
//              try
//       {
//           Class.forName("com.mysql.jdbc.Driver");
//           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
//           Statement st=c.createStatement();
//           ResultSet rs=st.executeQuery("select * from newmobile");
//           if(rs.next())
//           {
//              mymodel1 m1=new mymodel1(rs);
//              jt5.setModel(m1);
//              
//           }
//               
//            
//       }
//       catch(ClassNotFoundException | SQLException e)
//       {
//           System.out.print(e);
//       }   
//        }
//        
//         if(ayushi4==2)
//        {
//              try
//       {
//           Class.forName("com.mysql.jdbc.Driver");
//           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
//           Statement st=c.createStatement();
//           ResultSet rs=st.executeQuery("select * from oldmobile");
//           if(rs.next())
//           {
//              mymodel1 m1=new mymodel1(rs);
//              jt5.setModel(m1);
//              
//           }
//               
//            
//       }
//       catch(ClassNotFoundException | SQLException e)
//       {
//           System.out.print(e);
//       }   
//        }
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        p1 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        p2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        cba = new javax.swing.JComboBox<>();
        cbb = new javax.swing.JComboBox<>();
        cbc = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        t13 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        t14 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        t15 = new javax.swing.JTextField();
        t16 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        t17 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        p5 = new javax.swing.JPanel();
        cbd = new javax.swing.JComboBox<>();
        cbe = new javax.swing.JComboBox<>();
        cbf = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        t21 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        t22 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        t23 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        t24 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        t25 = new javax.swing.JTextField();
        t26 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        t27 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        p6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        b10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        p7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        t31 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        t32 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        t33 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        t34 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        t35 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        t36 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        t37 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        t38 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        t39 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel69 = new javax.swing.JLabel();
        t40 = new javax.swing.JTextField();
        p8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        t41 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        t42 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        t43 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        t44 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        t45 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        t46 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        t47 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        t48 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        t49 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        t50 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        r4 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        t53 = new javax.swing.JTextField();
        p9 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        t51 = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt2 = new javax.swing.JTable();
        jLabel83 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        p10 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        t52 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt3 = new javax.swing.JTable();
        jLabel85 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        p11 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        t61 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        t62 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        t66 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        t64 = new javax.swing.JTextArea();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        t63 = new javax.swing.JTextField();
        t65 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        check1 = new javax.swing.JCheckBox();
        b23 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        p12 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        t59 = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt4 = new javax.swing.JTable();
        jLabel96 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        p13 = new javax.swing.JPanel();
        cbg = new javax.swing.JComboBox<>();
        cbh = new javax.swing.JComboBox<>();
        cbi = new javax.swing.JComboBox<>();
        jLabel97 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jt5 = new javax.swing.JTable();
        jButton36 = new javax.swing.JButton();
        p14 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        cbj = new javax.swing.JComboBox<>();
        cbl = new javax.swing.JComboBox<>();
        cbm = new javax.swing.JComboBox<>();
        t60 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        t67 = new javax.swing.JTextField();
        t68 = new javax.swing.JTextField();
        cbk = new javax.swing.JComboBox<>();
        jLabel101 = new javax.swing.JLabel();
        t69 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jt6 = new javax.swing.JTable();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        t73 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        t74 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        t75 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        t70 = new javax.swing.JTextField();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        jPanel10.setBackground(new java.awt.Color(103, 0, 103));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setLayout(null);

        p3.setBackground(new java.awt.Color(103, 0, 103));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (2).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 30, 61, 90);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 20, 120, 110);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(103, 0, 103));
        jLabel3.setText("MOBILE");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 130, 70, 20);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (4).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6);
        jLabel6.setBounds(40, 30, 90, 90);

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 20, 120, 110);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(103, 0, 103));
        jLabel7.setText("BILL");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(60, 130, 70, 20);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (5).png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel8);
        jLabel8.setBounds(30, 30, 90, 90);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(103, 0, 103));
        jLabel10.setText("MOBILE REPAIR");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(10, 130, 130, 20);

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel5.add(jLabel9);
        jLabel9.setBounds(20, 20, 120, 110);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(103, 0, 103));
        jLabel11.setText("CUSTOMER");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(40, 130, 100, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (6).png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel12);
        jLabel12.setBounds(40, 30, 90, 90);

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel6.add(jLabel13);
        jLabel13.setBounds(30, 20, 110, 110);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(103, 0, 103));
        jLabel14.setText("DEALER");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(50, 130, 70, 20);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (6).png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel15);
        jLabel15.setBounds(40, 30, 90, 90);

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel7.add(jLabel16);
        jLabel16.setBounds(30, 20, 110, 110);

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        p1.add(p3);
        p3.setBounds(0, 150, 1040, 380);

        l4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\Group.png")); // NOI18N
        p1.add(l4);
        l4.setBounds(870, 10, 90, 90);

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/maclogo4.png"))); // NOI18N
        p1.add(l1);
        l1.setBounds(0, 0, 150, 150);

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profile", "Change Password", "Add Profile", "Log Out" }));
        p1.add(cb1);
        cb1.setBounds(850, 110, 130, 30);

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(103, 0, 103));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (2).png"))); // NOI18N
        jPanel9.add(jLabel17);
        jLabel17.setBounds(60, 30, 61, 90);

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel9.add(jLabel18);
        jLabel18.setBounds(20, 20, 140, 120);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(103, 0, 103));
        jLabel19.setText("MOBILE");
        jPanel9.add(jLabel19);
        jLabel19.setBounds(60, 150, 70, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(103, 0, 103));
        jButton1.setText("SELL NEW MOBILE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(103, 0, 103));
        jButton2.setText("BUY NEW MOBILE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(103, 0, 103));
        jButton3.setText("MOBILE STOCK");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(103, 0, 103));
        jButton4.setText("BUY OLD MOBILE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(103, 0, 103));
        jButton5.setText("ADD MODELS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(103, 0, 103));
        jButton6.setText("SELL OLD MOBILE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("<-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );

        p2.add(jPanel8);
        jPanel8.setBounds(0, 0, 410, 530);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/ezgif-5-8519e171c54e.gif"))); // NOI18N
        p2.add(jLabel1);
        jLabel1.setBounds(430, 0, 640, 520);

        p4.setBackground(new java.awt.Color(103, 0, 103));
        p4.setLayout(null);

        cba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRAND" }));
        cba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbaMouseClicked(evt);
            }
        });
        cba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbaActionPerformed(evt);
            }
        });
        p4.add(cba);
        cba.setBounds(80, 250, 180, 50);

        cbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MODEL" }));
        cbb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbMouseClicked(evt);
            }
        });
        cbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbActionPerformed(evt);
            }
        });
        p4.add(cbb);
        cbb.setBounds(80, 320, 180, 50);

        cbc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROM/Storage" }));
        p4.add(cbc);
        cbc.setBounds(80, 390, 180, 50);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(null);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (2).png"))); // NOI18N
        jPanel12.add(jLabel40);
        jLabel40.setBounds(60, 40, 61, 90);

        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel12.add(jLabel41);
        jLabel41.setBounds(30, 30, 120, 110);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(103, 0, 103));
        jLabel42.setText("OLD MOBILE");
        jPanel12.add(jLabel42);
        jLabel42.setBounds(30, 150, 120, 20);

        p4.add(jPanel12);
        jPanel12.setBounds(80, 30, 180, 190);

        jButton11.setBackground(new java.awt.Color(153, 0, 153));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("ADD OLD PURCHASES");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        p4.add(jButton11);
        jButton11.setBounds(780, 460, 190, 50);

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Customer Name");
        p4.add(jLabel43);
        jLabel43.setBounds(370, 20, 180, 30);

        t11.setBackground(new java.awt.Color(102, 0, 102));
        t11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t11.setForeground(new java.awt.Color(255, 255, 255));
        t11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t11.setSelectionColor(new java.awt.Color(255, 255, 255));
        p4.add(t11);
        t11.setBounds(370, 50, 310, 40);

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Customer Moblie/Phone");
        p4.add(jLabel44);
        jLabel44.setBounds(370, 90, 180, 30);

        t12.setBackground(new java.awt.Color(102, 0, 102));
        t12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t12.setForeground(new java.awt.Color(255, 255, 255));
        t12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t12.setSelectionColor(new java.awt.Color(255, 255, 255));
        t12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t12FocusLost(evt);
            }
        });
        p4.add(t12);
        t12.setBounds(370, 120, 310, 40);

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Quantity");
        p4.add(jLabel45);
        jLabel45.setBounds(370, 160, 180, 30);

        t13.setBackground(new java.awt.Color(102, 0, 102));
        t13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t13.setForeground(new java.awt.Color(255, 255, 255));
        t13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t13.setSelectionColor(new java.awt.Color(255, 255, 255));
        p4.add(t13);
        t13.setBounds(370, 190, 310, 40);

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Market Price");
        p4.add(jLabel46);
        jLabel46.setBounds(370, 230, 180, 30);

        t14.setBackground(new java.awt.Color(102, 0, 102));
        t14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t14.setForeground(new java.awt.Color(255, 255, 255));
        t14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t14.setSelectionColor(new java.awt.Color(255, 255, 255));
        p4.add(t14);
        t14.setBounds(370, 260, 310, 40);

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Purchase Price");
        p4.add(jLabel47);
        jLabel47.setBounds(370, 300, 180, 30);

        t15.setBackground(new java.awt.Color(102, 0, 102));
        t15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t15.setForeground(new java.awt.Color(255, 255, 255));
        t15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t15.setSelectionColor(new java.awt.Color(255, 255, 255));
        p4.add(t15);
        t15.setBounds(370, 330, 310, 40);

        t16.setBackground(new java.awt.Color(102, 0, 102));
        t16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t16.setForeground(new java.awt.Color(255, 255, 255));
        t16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t16.setSelectionColor(new java.awt.Color(255, 255, 255));
        p4.add(t16);
        t16.setBounds(370, 400, 310, 40);

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Purchasing Date");
        p4.add(jLabel48);
        jLabel48.setBounds(370, 370, 180, 30);

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Acessories");
        p4.add(jLabel49);
        jLabel49.setBounds(370, 440, 180, 30);

        t17.setBackground(new java.awt.Color(102, 0, 102));
        t17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t17.setForeground(new java.awt.Color(255, 255, 255));
        t17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t17.setSelectionColor(new java.awt.Color(255, 255, 255));
        p4.add(t17);
        t17.setBounds(370, 470, 310, 40);

        jButton12.setBackground(new java.awt.Color(153, 0, 153));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Add New Brand/Model/Ram");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        p4.add(jButton12);
        jButton12.setBounds(80, 460, 180, 50);

        jButton7.setText("<-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        p4.add(jButton7);
        jButton7.setBounds(0, 0, 50, 30);

        p5.setBackground(new java.awt.Color(103, 0, 103));
        p5.setLayout(null);

        cbd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRAND" }));
        cbd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbdMouseClicked(evt);
            }
        });
        cbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdActionPerformed(evt);
            }
        });
        p5.add(cbd);
        cbd.setBounds(80, 250, 180, 50);

        cbe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MODEL" }));
        cbe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbeMouseClicked(evt);
            }
        });
        cbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbeActionPerformed(evt);
            }
        });
        p5.add(cbe);
        cbe.setBounds(80, 320, 180, 50);

        cbf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROM/Storage" }));
        p5.add(cbf);
        cbf.setBounds(80, 390, 180, 50);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(null);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (2).png"))); // NOI18N
        jPanel13.add(jLabel50);
        jLabel50.setBounds(60, 40, 61, 90);

        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel13.add(jLabel51);
        jLabel51.setBounds(30, 30, 120, 110);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(103, 0, 103));
        jLabel52.setText("NEW MOBILE");
        jPanel13.add(jLabel52);
        jLabel52.setBounds(40, 150, 120, 20);

        p5.add(jPanel13);
        jPanel13.setBounds(80, 30, 180, 190);

        jButton13.setBackground(new java.awt.Color(153, 0, 153));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("ADD OLD PURCHASES");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        p5.add(jButton13);
        jButton13.setBounds(780, 460, 190, 50);

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Dealer Name");
        p5.add(jLabel53);
        jLabel53.setBounds(370, 20, 180, 30);

        t21.setBackground(new java.awt.Color(102, 0, 102));
        t21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t21.setForeground(new java.awt.Color(255, 255, 255));
        t21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t21.setSelectionColor(new java.awt.Color(255, 255, 255));
        p5.add(t21);
        t21.setBounds(370, 50, 310, 40);

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Dealer Moblie/Phone");
        p5.add(jLabel54);
        jLabel54.setBounds(370, 90, 180, 30);

        t22.setBackground(new java.awt.Color(102, 0, 102));
        t22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t22.setForeground(new java.awt.Color(255, 255, 255));
        t22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t22.setSelectionColor(new java.awt.Color(255, 255, 255));
        t22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t22FocusLost(evt);
            }
        });
        t22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t22KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t22KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t22KeyTyped(evt);
            }
        });
        p5.add(t22);
        t22.setBounds(370, 120, 310, 40);

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Quantity");
        p5.add(jLabel55);
        jLabel55.setBounds(370, 160, 180, 30);

        t23.setBackground(new java.awt.Color(102, 0, 102));
        t23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t23.setForeground(new java.awt.Color(255, 255, 255));
        t23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t23.setSelectionColor(new java.awt.Color(255, 255, 255));
        p5.add(t23);
        t23.setBounds(370, 190, 310, 40);

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Market Price");
        p5.add(jLabel56);
        jLabel56.setBounds(370, 230, 180, 30);

        t24.setBackground(new java.awt.Color(102, 0, 102));
        t24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t24.setForeground(new java.awt.Color(255, 255, 255));
        t24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t24.setSelectionColor(new java.awt.Color(255, 255, 255));
        p5.add(t24);
        t24.setBounds(370, 260, 310, 40);

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Purchase Price");
        p5.add(jLabel57);
        jLabel57.setBounds(370, 300, 180, 30);

        t25.setBackground(new java.awt.Color(102, 0, 102));
        t25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t25.setForeground(new java.awt.Color(255, 255, 255));
        t25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t25.setSelectionColor(new java.awt.Color(255, 255, 255));
        p5.add(t25);
        t25.setBounds(370, 330, 310, 40);

        t26.setBackground(new java.awt.Color(102, 0, 102));
        t26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t26.setForeground(new java.awt.Color(255, 255, 255));
        t26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t26.setSelectionColor(new java.awt.Color(255, 255, 255));
        p5.add(t26);
        t26.setBounds(370, 400, 310, 40);

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Purchasing Date");
        p5.add(jLabel58);
        jLabel58.setBounds(370, 370, 180, 30);

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Acessories");
        p5.add(jLabel59);
        jLabel59.setBounds(370, 440, 180, 30);

        t27.setBackground(new java.awt.Color(102, 0, 102));
        t27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t27.setForeground(new java.awt.Color(255, 255, 255));
        t27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t27.setSelectionColor(new java.awt.Color(255, 255, 255));
        p5.add(t27);
        t27.setBounds(370, 470, 310, 40);

        jButton14.setBackground(new java.awt.Color(153, 0, 153));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Add New Brand/Model/Ram");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        p5.add(jButton14);
        jButton14.setBounds(80, 460, 180, 50);

        jButton8.setText("<-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        p5.add(jButton8);
        jButton8.setBounds(0, 0, 50, 30);

        p6.setBackground(new java.awt.Color(103, 0, 103));
        p6.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (2).png"))); // NOI18N
        jPanel11.add(jLabel22);
        jLabel22.setBounds(60, 40, 61, 90);

        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel11.add(jLabel23);
        jLabel23.setBounds(30, 30, 120, 110);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(103, 0, 103));
        jLabel24.setText("ADD NEW MODELS");
        jPanel11.add(jLabel24);
        jLabel24.setBounds(10, 150, 170, 20);

        p6.add(jPanel11);
        jPanel11.setBounds(80, 50, 180, 190);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Brand");
        p6.add(jLabel25);
        jLabel25.setBounds(370, 20, 180, 30);

        t1.setBackground(new java.awt.Color(102, 0, 102));
        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t1.setSelectionColor(new java.awt.Color(255, 255, 255));
        p6.add(t1);
        t1.setBounds(370, 50, 310, 40);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Model");
        p6.add(jLabel26);
        jLabel26.setBounds(370, 90, 180, 30);

        t2.setBackground(new java.awt.Color(102, 0, 102));
        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t2.setSelectionColor(new java.awt.Color(255, 255, 255));
        p6.add(t2);
        t2.setBounds(370, 120, 310, 40);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ROM/ Storage");
        p6.add(jLabel27);
        jLabel27.setBounds(370, 160, 180, 30);

        t3.setBackground(new java.awt.Color(102, 0, 102));
        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t3.setSelectionColor(new java.awt.Color(255, 255, 255));
        p6.add(t3);
        t3.setBounds(370, 190, 310, 40);

        b10.setBackground(new java.awt.Color(153, 0, 153));
        b10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b10.setForeground(new java.awt.Color(255, 255, 255));
        b10.setText("ADD");
        b10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        p6.add(b10);
        b10.setBounds(820, 190, 130, 40);

        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model", "RAM"
            }
        ));
        jScrollPane1.setViewportView(jt1);

        p6.add(jScrollPane1);
        jScrollPane1.setBounds(90, 280, 830, 210);

        jButton15.setText("<-");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        p6.add(jButton15);
        jButton15.setBounds(0, 0, 50, 30);

        jButton18.setBackground(new java.awt.Color(153, 0, 153));
        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("DELETE");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        p6.add(jButton18);
        jButton18.setBounds(820, 130, 130, 40);

        p7.setBackground(new java.awt.Color(103, 0, 103));
        p7.setLayout(null);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(103, 0, 103));
        jLabel20.setText("DEALER DETAILS");
        jPanel14.add(jLabel20);
        jLabel20.setBounds(20, 130, 150, 20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (6).png"))); // NOI18N
        jPanel14.add(jLabel21);
        jLabel21.setBounds(50, 30, 90, 90);

        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel14.add(jLabel28);
        jLabel28.setBounds(40, 20, 110, 110);

        p7.add(jPanel14);
        jPanel14.setBounds(50, 40, 190, 170);

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Dealer ID");
        p7.add(jLabel60);
        jLabel60.setBounds(310, 10, 180, 30);

        t31.setBackground(new java.awt.Color(102, 0, 102));
        t31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t31.setForeground(new java.awt.Color(255, 255, 255));
        t31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t31.setSelectionColor(new java.awt.Color(255, 255, 255));
        p7.add(t31);
        t31.setBounds(310, 40, 310, 40);

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Dealer Name");
        p7.add(jLabel61);
        jLabel61.setBounds(310, 80, 180, 30);

        t32.setBackground(new java.awt.Color(102, 0, 102));
        t32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t32.setForeground(new java.awt.Color(255, 255, 255));
        t32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t32.setSelectionColor(new java.awt.Color(255, 255, 255));
        p7.add(t32);
        t32.setBounds(310, 110, 640, 40);

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Address");
        p7.add(jLabel62);
        jLabel62.setBounds(310, 150, 180, 30);

        t33.setBackground(new java.awt.Color(102, 0, 102));
        t33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t33.setForeground(new java.awt.Color(255, 255, 255));
        t33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t33.setSelectionColor(new java.awt.Color(255, 255, 255));
        p7.add(t33);
        t33.setBounds(310, 180, 640, 40);

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Email");
        p7.add(jLabel63);
        jLabel63.setBounds(310, 220, 180, 30);

        t34.setBackground(new java.awt.Color(102, 0, 102));
        t34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t34.setForeground(new java.awt.Color(255, 255, 255));
        t34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t34.setSelectionColor(new java.awt.Color(255, 255, 255));
        p7.add(t34);
        t34.setBounds(310, 250, 310, 40);

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("City");
        p7.add(jLabel64);
        jLabel64.setBounds(310, 290, 180, 30);

        t35.setBackground(new java.awt.Color(102, 0, 102));
        t35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t35.setForeground(new java.awt.Color(255, 255, 255));
        t35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t35.setSelectionColor(new java.awt.Color(255, 255, 255));
        p7.add(t35);
        t35.setBounds(310, 320, 310, 40);

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Mobile/Phone");
        p7.add(jLabel65);
        jLabel65.setBounds(310, 360, 180, 30);

        t36.setBackground(new java.awt.Color(102, 0, 102));
        t36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t36.setForeground(new java.awt.Color(255, 255, 255));
        t36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t36.setSelectionColor(new java.awt.Color(255, 255, 255));
        t36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t36ActionPerformed(evt);
            }
        });
        p7.add(t36);
        t36.setBounds(310, 390, 310, 40);

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Date Of Birth");
        p7.add(jLabel66);
        jLabel66.setBounds(310, 430, 180, 20);

        t37.setBackground(new java.awt.Color(102, 0, 102));
        t37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t37.setForeground(new java.awt.Color(255, 255, 255));
        t37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t37.setSelectionColor(new java.awt.Color(255, 255, 255));
        p7.add(t37);
        t37.setBounds(310, 460, 310, 40);

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("State");
        p7.add(jLabel67);
        jLabel67.setBounds(640, 290, 180, 30);

        t38.setBackground(new java.awt.Color(102, 0, 102));
        t38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t38.setForeground(new java.awt.Color(255, 255, 255));
        t38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t38.setSelectionColor(new java.awt.Color(255, 255, 255));
        p7.add(t38);
        t38.setBounds(640, 320, 310, 40);

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Pincode");
        p7.add(jLabel68);
        jLabel68.setBounds(640, 360, 180, 30);

        t39.setBackground(new java.awt.Color(102, 0, 102));
        t39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t39.setForeground(new java.awt.Color(255, 255, 255));
        t39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t39.setSelectionColor(new java.awt.Color(255, 255, 255));
        p7.add(t39);
        t39.setBounds(640, 390, 310, 40);

        jButton16.setBackground(new java.awt.Color(153, 0, 153));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("CLEAR");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        p7.add(jButton16);
        jButton16.setBounds(50, 380, 190, 50);

        jButton17.setBackground(new java.awt.Color(153, 0, 153));
        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("SEARCH");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        p7.add(jButton17);
        jButton17.setBounds(50, 310, 190, 50);

        b18.setBackground(new java.awt.Color(153, 0, 153));
        b18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b18.setForeground(new java.awt.Color(255, 255, 255));
        b18.setText("UPDATE");
        b18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        p7.add(b18);
        b18.setBounds(50, 240, 190, 50);

        jButton19.setBackground(new java.awt.Color(153, 0, 153));
        jButton19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("SAVE");
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        p7.add(jButton19);
        jButton19.setBounds(50, 450, 190, 50);

        jButton24.setText("<-");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        p7.add(jButton24);
        jButton24.setBounds(0, 0, 45, 23);

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Gender");
        p7.add(jLabel70);
        jLabel70.setBounds(640, 440, 70, 20);

        buttonGroup2.add(r1);
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("MALE");
        p7.add(r1);
        r1.setBounds(640, 470, 80, 30);

        buttonGroup2.add(r2);
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("FEMALE");
        p7.add(r2);
        r2.setBounds(740, 470, 70, 30);

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("GST Number");
        p7.add(jLabel69);
        jLabel69.setBounds(640, 220, 110, 30);

        t40.setBackground(new java.awt.Color(102, 0, 102));
        t40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t40.setForeground(new java.awt.Color(255, 255, 255));
        t40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t40.setSelectionColor(new java.awt.Color(255, 255, 255));
        p7.add(t40);
        t40.setBounds(640, 250, 310, 40);

        p8.setBackground(new java.awt.Color(103, 0, 103));
        p8.setLayout(null);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(null);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(103, 0, 103));
        jLabel29.setText("CUSTOMER DETAILS");
        jPanel15.add(jLabel29);
        jLabel29.setBounds(10, 140, 170, 20);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (6).png"))); // NOI18N
        jPanel15.add(jLabel30);
        jLabel30.setBounds(50, 30, 90, 90);

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel15.add(jLabel31);
        jLabel31.setBounds(40, 20, 110, 110);

        p8.add(jPanel15);
        jPanel15.setBounds(50, 40, 190, 170);

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Customer ID");
        p8.add(jLabel71);
        jLabel71.setBounds(310, 10, 180, 30);

        t41.setBackground(new java.awt.Color(102, 0, 102));
        t41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t41.setForeground(new java.awt.Color(255, 255, 255));
        t41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t41.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t41);
        t41.setBounds(310, 40, 310, 40);

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Customer Name");
        p8.add(jLabel72);
        jLabel72.setBounds(310, 80, 180, 30);

        t42.setBackground(new java.awt.Color(102, 0, 102));
        t42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t42.setForeground(new java.awt.Color(255, 255, 255));
        t42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t42.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t42);
        t42.setBounds(310, 110, 640, 40);

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Address");
        p8.add(jLabel73);
        jLabel73.setBounds(310, 150, 180, 30);

        t43.setBackground(new java.awt.Color(102, 0, 102));
        t43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t43.setForeground(new java.awt.Color(255, 255, 255));
        t43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t43.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t43);
        t43.setBounds(310, 180, 640, 40);

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Email");
        p8.add(jLabel74);
        jLabel74.setBounds(310, 290, 180, 30);

        t44.setBackground(new java.awt.Color(102, 0, 102));
        t44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t44.setForeground(new java.awt.Color(255, 255, 255));
        t44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t44.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t44);
        t44.setBounds(310, 250, 310, 40);

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("City");
        p8.add(jLabel75);
        jLabel75.setBounds(310, 220, 180, 30);

        t45.setBackground(new java.awt.Color(102, 0, 102));
        t45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t45.setForeground(new java.awt.Color(255, 255, 255));
        t45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t45.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t45);
        t45.setBounds(310, 320, 310, 40);

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Mobile/Phone");
        p8.add(jLabel76);
        jLabel76.setBounds(310, 360, 180, 30);

        t46.setBackground(new java.awt.Color(102, 0, 102));
        t46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t46.setForeground(new java.awt.Color(255, 255, 255));
        t46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t46.setSelectionColor(new java.awt.Color(255, 255, 255));
        t46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t46ActionPerformed(evt);
            }
        });
        p8.add(t46);
        t46.setBounds(310, 390, 310, 40);

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Date Of Birth");
        p8.add(jLabel77);
        jLabel77.setBounds(310, 430, 180, 20);

        t47.setBackground(new java.awt.Color(102, 0, 102));
        t47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t47.setForeground(new java.awt.Color(255, 255, 255));
        t47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t47.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t47);
        t47.setBounds(310, 460, 310, 40);

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("State");
        p8.add(jLabel78);
        jLabel78.setBounds(640, 220, 180, 30);

        t48.setBackground(new java.awt.Color(102, 0, 102));
        t48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t48.setForeground(new java.awt.Color(255, 255, 255));
        t48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t48.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t48);
        t48.setBounds(640, 250, 310, 40);

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Pincode");
        p8.add(jLabel79);
        jLabel79.setBounds(640, 290, 180, 30);

        t49.setBackground(new java.awt.Color(102, 0, 102));
        t49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t49.setForeground(new java.awt.Color(255, 255, 255));
        t49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t49.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t49);
        t49.setBounds(640, 320, 310, 40);

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Reference");
        p8.add(jLabel80);
        jLabel80.setBounds(640, 430, 180, 30);

        t50.setBackground(new java.awt.Color(102, 0, 102));
        t50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t50.setForeground(new java.awt.Color(255, 255, 255));
        t50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t50.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t50);
        t50.setBounds(640, 460, 310, 40);

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Gender");
        p8.add(jLabel81);
        jLabel81.setBounds(640, 370, 70, 20);

        buttonGroup1.add(r4);
        r4.setText("FEMALE");
        p8.add(r4);
        r4.setBounds(740, 400, 110, 23);

        buttonGroup1.add(r3);
        r3.setText("MALE");
        p8.add(r3);
        r3.setBounds(640, 400, 80, 23);

        jButton20.setBackground(new java.awt.Color(153, 0, 153));
        jButton20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("CLEAR");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        p8.add(jButton20);
        jButton20.setBounds(50, 380, 190, 50);

        jButton21.setBackground(new java.awt.Color(153, 0, 153));
        jButton21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("SEARCH");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        p8.add(jButton21);
        jButton21.setBounds(50, 310, 190, 50);

        b22.setBackground(new java.awt.Color(153, 0, 153));
        b22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b22.setForeground(new java.awt.Color(255, 255, 255));
        b22.setText("UPDATE");
        b22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        p8.add(b22);
        b22.setBounds(50, 240, 190, 50);

        jButton23.setBackground(new java.awt.Color(153, 0, 153));
        jButton23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("SAVE");
        jButton23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        p8.add(jButton23);
        jButton23.setBounds(50, 450, 190, 50);

        jButton25.setText("<-");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        p8.add(jButton25);
        jButton25.setBounds(0, 0, 45, 23);

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Aadhar Number");
        p8.add(jLabel86);
        jLabel86.setBounds(640, 10, 180, 30);

        t53.setBackground(new java.awt.Color(102, 0, 102));
        t53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t53.setForeground(new java.awt.Color(255, 255, 255));
        t53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t53.setSelectionColor(new java.awt.Color(255, 255, 255));
        p8.add(t53);
        t53.setBounds(640, 40, 310, 40);

        p9.setBackground(new java.awt.Color(103, 0, 103));
        p9.setLayout(null);

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("ALL DEALERS");
        p9.add(jLabel82);
        jLabel82.setBounds(430, 110, 130, 30);

        t51.setBackground(new java.awt.Color(102, 0, 102));
        t51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t51.setForeground(new java.awt.Color(255, 255, 255));
        t51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t51.setSelectionColor(new java.awt.Color(255, 255, 255));
        p9.add(t51);
        t51.setBounds(360, 40, 310, 40);

        jButton26.setBackground(new java.awt.Color(153, 0, 153));
        jButton26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("SEARCH");
        jButton26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        p9.add(jButton26);
        jButton26.setBounds(740, 40, 190, 40);

        jt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt2);

        p9.add(jScrollPane2);
        jScrollPane2.setBounds(40, 180, 930, 280);

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Search By Mobile Number ");
        p9.add(jLabel83);
        jLabel83.setBounds(70, 40, 230, 30);

        jButton27.setText("<-");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        p9.add(jButton27);
        jButton27.setBounds(0, 0, 45, 23);

        p10.setBackground(new java.awt.Color(103, 0, 103));
        p10.setLayout(null);

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("ALL CUSTOMERS");
        p10.add(jLabel84);
        jLabel84.setBounds(430, 110, 160, 30);

        t52.setBackground(new java.awt.Color(102, 0, 102));
        t52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t52.setForeground(new java.awt.Color(255, 255, 255));
        t52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t52.setSelectionColor(new java.awt.Color(255, 255, 255));
        p10.add(t52);
        t52.setBounds(360, 40, 310, 40);

        jButton28.setBackground(new java.awt.Color(153, 0, 153));
        jButton28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("SEARCH");
        jButton28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        p10.add(jButton28);
        jButton28.setBounds(740, 40, 190, 40);

        jt3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt3);

        p10.add(jScrollPane3);
        jScrollPane3.setBounds(40, 180, 930, 280);

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Search By Mobile Number ");
        p10.add(jLabel85);
        jLabel85.setBounds(70, 40, 230, 30);

        jButton29.setText("<-");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        p10.add(jButton29);
        jButton29.setBounds(0, 0, 45, 23);

        p11.setBackground(new java.awt.Color(103, 0, 103));
        p11.setLayout(null);

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Name");
        p11.add(jLabel87);
        jLabel87.setBounds(310, 10, 180, 30);

        t61.setBackground(new java.awt.Color(102, 0, 102));
        t61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t61.setForeground(new java.awt.Color(255, 255, 255));
        t61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t61.setSelectionColor(new java.awt.Color(255, 255, 255));
        p11.add(t61);
        t61.setBounds(310, 40, 380, 40);

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Mobile/Phone");
        p11.add(jLabel88);
        jLabel88.setBounds(310, 80, 180, 30);

        t62.setBackground(new java.awt.Color(102, 0, 102));
        t62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t62.setForeground(new java.awt.Color(255, 255, 255));
        t62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t62.setSelectionColor(new java.awt.Color(255, 255, 255));
        p11.add(t62);
        t62.setBounds(310, 110, 380, 40);

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("Mobile Details");
        p11.add(jLabel89);
        jLabel89.setBounds(310, 150, 180, 30);

        t66.setBackground(new java.awt.Color(102, 0, 102));
        t66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t66.setForeground(new java.awt.Color(255, 255, 255));
        t66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t66.setSelectionColor(new java.awt.Color(255, 255, 255));
        p11.add(t66);
        t66.setBounds(520, 400, 170, 40);

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("Return Date");
        p11.add(jLabel90);
        jLabel90.setBounds(520, 370, 100, 30);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(null);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile/Group (5).png"))); // NOI18N
        jPanel16.add(jLabel32);
        jLabel32.setBounds(50, 30, 90, 90);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(103, 0, 103));
        jLabel33.setText("MOBILE REPAIR");
        jPanel16.add(jLabel33);
        jLabel33.setBounds(30, 130, 130, 20);

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 0, 103), 2));
        jPanel16.add(jLabel34);
        jLabel34.setBounds(30, 20, 120, 110);

        p11.add(jPanel16);
        jPanel16.setBounds(40, 40, 180, 170);

        t64.setBackground(new java.awt.Color(102, 0, 102));
        t64.setColumns(20);
        t64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t64.setForeground(new java.awt.Color(255, 255, 255));
        t64.setRows(5);
        t64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jScrollPane4.setViewportView(t64);

        p11.add(jScrollPane4);
        jScrollPane4.setBounds(310, 250, 380, 120);

        jLabel91.setBackground(new java.awt.Color(255, 255, 255));
        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("What to Repair?");
        p11.add(jLabel91);
        jLabel91.setBounds(310, 220, 180, 30);

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Return Status");
        p11.add(jLabel92);
        jLabel92.setBounds(310, 490, 130, 20);

        t63.setBackground(new java.awt.Color(102, 0, 102));
        t63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t63.setForeground(new java.awt.Color(255, 255, 255));
        t63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t63.setSelectionColor(new java.awt.Color(255, 255, 255));
        p11.add(t63);
        t63.setBounds(310, 180, 380, 40);

        t65.setBackground(new java.awt.Color(102, 0, 102));
        t65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t65.setForeground(new java.awt.Color(255, 255, 255));
        t65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t65.setSelectionColor(new java.awt.Color(255, 255, 255));
        p11.add(t65);
        t65.setBounds(310, 400, 180, 40);

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Arrival Date");
        p11.add(jLabel93);
        jLabel93.setBounds(310, 370, 180, 30);

        buttonGroup3.add(r5);
        r5.setText("REPAIRED");
        p11.add(r5);
        r5.setBounds(460, 450, 110, 23);

        buttonGroup3.add(r6);
        r6.setSelected(true);
        r6.setText("NOT REPAIRED");
        p11.add(r6);
        r6.setBounds(580, 450, 130, 23);
        p11.add(check1);
        check1.setBounds(460, 490, 20, 21);

        b23.setBackground(new java.awt.Color(153, 0, 153));
        b23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b23.setForeground(new java.awt.Color(255, 255, 255));
        b23.setText("UPDATE");
        b23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        p11.add(b23);
        b23.setBounds(50, 240, 190, 50);

        jButton22.setBackground(new java.awt.Color(153, 0, 153));
        jButton22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("SEARCH");
        jButton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        p11.add(jButton22);
        jButton22.setBounds(50, 310, 190, 50);

        jButton31.setBackground(new java.awt.Color(153, 0, 153));
        jButton31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("CLEAR");
        jButton31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        p11.add(jButton31);
        jButton31.setBounds(50, 380, 190, 50);

        jButton32.setBackground(new java.awt.Color(153, 0, 153));
        jButton32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("SAVE");
        jButton32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        p11.add(jButton32);
        jButton32.setBounds(50, 450, 190, 50);

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Repaired Status");
        p11.add(jLabel94);
        jLabel94.setBounds(310, 450, 130, 30);

        jButton34.setText("<-");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        p11.add(jButton34);
        jButton34.setBounds(0, 0, 45, 23);

        p12.setBackground(new java.awt.Color(103, 0, 103));
        p12.setLayout(null);

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("REPAIRING DETAILS");
        p12.add(jLabel95);
        jLabel95.setBounds(420, 120, 190, 30);

        t59.setBackground(new java.awt.Color(102, 0, 102));
        t59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t59.setForeground(new java.awt.Color(255, 255, 255));
        t59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t59.setSelectionColor(new java.awt.Color(255, 255, 255));
        p12.add(t59);
        t59.setBounds(360, 40, 310, 40);

        jButton30.setBackground(new java.awt.Color(153, 0, 153));
        jButton30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("SEARCH");
        jButton30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        p12.add(jButton30);
        jButton30.setBounds(740, 40, 190, 40);

        jt4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jt4);

        p12.add(jScrollPane5);
        jScrollPane5.setBounds(50, 180, 930, 280);

        jLabel96.setBackground(new java.awt.Color(255, 255, 255));
        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("Search By Mobile Number ");
        p12.add(jLabel96);
        jLabel96.setBounds(70, 40, 230, 30);

        jButton33.setText("<-");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        p12.add(jButton33);
        jButton33.setBounds(0, 0, 45, 23);

        p13.setBackground(new java.awt.Color(103, 0, 103));
        p13.setLayout(null);

        cbg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRAND" }));
        cbg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbgMouseClicked(evt);
            }
        });
        cbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbgActionPerformed(evt);
            }
        });
        p13.add(cbg);
        cbg.setBounds(60, 80, 180, 40);

        cbh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MODEL" }));
        cbh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbhMouseClicked(evt);
            }
        });
        cbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhActionPerformed(evt);
            }
        });
        p13.add(cbh);
        cbh.setBounds(300, 80, 180, 40);

        cbi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROM/Storage" }));
        p13.add(cbi);
        cbi.setBounds(550, 80, 180, 40);

        jLabel97.setBackground(new java.awt.Color(255, 255, 255));
        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("MOBILE SELL");
        p13.add(jLabel97);
        jLabel97.setBounds(400, 30, 120, 30);

        jButton35.setBackground(new java.awt.Color(153, 0, 153));
        jButton35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("SEARCH");
        jButton35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        p13.add(jButton35);
        jButton35.setBounds(780, 80, 190, 40);

        jt5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt5MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jt5);

        p13.add(jScrollPane6);
        jScrollPane6.setBounds(60, 160, 910, 280);

        jButton36.setText("<-");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        p13.add(jButton36);
        jButton36.setBounds(0, 0, 45, 23);

        p14.setBackground(new java.awt.Color(103, 0, 103));
        p14.setLayout(null);

        jLabel98.setBackground(new java.awt.Color(255, 255, 255));
        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("BILL");
        p14.add(jLabel98);
        jLabel98.setBounds(400, 30, 60, 30);

        cbj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OLD", "NEW" }));
        cbj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbjMouseClicked(evt);
            }
        });
        cbj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjActionPerformed(evt);
            }
        });
        p14.add(cbj);
        cbj.setBounds(30, 70, 180, 40);

        cbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MODEL" }));
        cbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cblMouseClicked(evt);
            }
        });
        cbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblActionPerformed(evt);
            }
        });
        p14.add(cbl);
        cbl.setBounds(30, 190, 180, 40);

        cbm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROM" }));
        cbm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmActionPerformed(evt);
            }
        });
        p14.add(cbm);
        cbm.setBounds(30, 250, 180, 40);

        t60.setBackground(new java.awt.Color(102, 0, 102));
        t60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t60.setForeground(new java.awt.Color(255, 255, 255));
        t60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t60.setSelectionColor(new java.awt.Color(255, 255, 255));
        p14.add(t60);
        t60.setBounds(240, 80, 230, 40);

        jLabel99.setBackground(new java.awt.Color(255, 255, 255));
        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Name");
        p14.add(jLabel99);
        jLabel99.setBounds(240, 60, 100, 20);

        jLabel100.setBackground(new java.awt.Color(255, 255, 255));
        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("Bill Number");
        p14.add(jLabel100);
        jLabel100.setBounds(700, 60, 100, 20);

        t67.setBackground(new java.awt.Color(102, 0, 102));
        t67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t67.setForeground(new java.awt.Color(255, 255, 255));
        t67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t67.setSelectionColor(new java.awt.Color(255, 255, 255));
        p14.add(t67);
        t67.setBounds(30, 310, 180, 40);

        t68.setBackground(new java.awt.Color(102, 0, 102));
        t68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t68.setForeground(new java.awt.Color(255, 255, 255));
        t68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t68.setSelectionColor(new java.awt.Color(255, 255, 255));
        p14.add(t68);
        t68.setBounds(700, 80, 180, 40);

        cbk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRAND" }));
        cbk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbkMouseClicked(evt);
            }
        });
        cbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkActionPerformed(evt);
            }
        });
        p14.add(cbk);
        cbk.setBounds(30, 130, 180, 40);

        jLabel101.setBackground(new java.awt.Color(255, 255, 255));
        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("Mobile");
        p14.add(jLabel101);
        jLabel101.setBounds(490, 60, 100, 20);

        t69.setBackground(new java.awt.Color(102, 0, 102));
        t69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t69.setForeground(new java.awt.Color(255, 255, 255));
        t69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t69.setSelectionColor(new java.awt.Color(255, 255, 255));
        t69.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t69FocusLost(evt);
            }
        });
        t69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t69ActionPerformed(evt);
            }
        });
        p14.add(t69);
        t69.setBounds(490, 80, 190, 40);

        jt6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OLD/NEW", "Brand", "Model", "Storage", "Price", "Discount"
            }
        ));
        jt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt6MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jt6);

        p14.add(jScrollPane7);
        jScrollPane7.setBounds(240, 130, 740, 270);

        jButton38.setBackground(new java.awt.Color(153, 0, 153));
        jButton38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setText("DISCOUNT");
        jButton38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        p14.add(jButton38);
        jButton38.setBounds(30, 370, 180, 40);

        jButton39.setBackground(new java.awt.Color(153, 0, 153));
        jButton39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("DELETE");
        jButton39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        p14.add(jButton39);
        jButton39.setBounds(900, 80, 80, 40);

        jLabel104.setBackground(new java.awt.Color(255, 255, 255));
        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("Discount");
        p14.add(jLabel104);
        jLabel104.setBounds(650, 410, 100, 20);

        t73.setBackground(new java.awt.Color(102, 0, 102));
        t73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t73.setForeground(new java.awt.Color(255, 255, 255));
        t73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t73.setSelectionColor(new java.awt.Color(255, 255, 255));
        p14.add(t73);
        t73.setBounds(650, 430, 160, 40);

        jLabel105.setBackground(new java.awt.Color(255, 255, 255));
        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("Grand Total");
        p14.add(jLabel105);
        jLabel105.setBounds(820, 410, 100, 20);

        t74.setBackground(new java.awt.Color(102, 0, 102));
        t74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t74.setForeground(new java.awt.Color(255, 255, 255));
        t74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t74.setSelectionColor(new java.awt.Color(255, 255, 255));
        t74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t74ActionPerformed(evt);
            }
        });
        p14.add(t74);
        t74.setBounds(820, 430, 160, 40);

        jLabel106.setBackground(new java.awt.Color(255, 255, 255));
        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("Total Amount");
        p14.add(jLabel106);
        jLabel106.setBounds(480, 410, 100, 20);

        t75.setBackground(new java.awt.Color(102, 0, 102));
        t75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t75.setForeground(new java.awt.Color(255, 255, 255));
        t75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t75.setSelectionColor(new java.awt.Color(255, 255, 255));
        p14.add(t75);
        t75.setBounds(480, 430, 160, 40);

        jLabel102.setBackground(new java.awt.Color(255, 255, 255));
        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("Date");
        p14.add(jLabel102);
        jLabel102.setBounds(820, 10, 40, 20);

        t70.setBackground(new java.awt.Color(102, 0, 102));
        t70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t70.setForeground(new java.awt.Color(255, 255, 255));
        t70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        t70.setSelectionColor(new java.awt.Color(255, 255, 255));
        p14.add(t70);
        t70.setBounds(860, 10, 120, 20);

        jButton40.setBackground(new java.awt.Color(153, 0, 153));
        jButton40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("PRINT");
        jButton40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        p14.add(jButton40);
        jButton40.setBounds(880, 480, 100, 30);

        jButton41.setBackground(new java.awt.Color(153, 0, 153));
        jButton41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("ADD TO CART");
        jButton41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        p14.add(jButton41);
        jButton41.setBounds(30, 430, 180, 40);

        jButton10.setText("<-");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        p14.add(jButton10);
        jButton10.setBounds(0, 0, 45, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(p14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        p1.setVisible(false);
        p2.setVisible(true);
   
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        p2.setVisible(false);
        p4.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        p2.setVisible(false);
//        p5.setVisible(true);
         p2.setVisible(false);
         p5.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbaMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_cbaMouseClicked

    private void cbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbaActionPerformed
        // TODO add your handling code here:
             String s1=(String) cba.getSelectedItem();
              try
       {
           cbb.removeAllItems();
           cbb.addItem("MODEL");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct Model from models where Brand='"+s1+"'");
           while(rs.next())
           {
              cbb.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
        
    }//GEN-LAST:event_cbaActionPerformed

    private void cbbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMouseClicked

    private void cbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbActionPerformed
        // TODO add your handling code here:
             String s1=(String) cbb.getSelectedItem();
              try
       {
           cbc.removeAllItems();
           cbc.addItem("ROM/Storage");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct ROM from models where Model='"+s1+"'");
           while(rs.next())
           {
              cbc.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
    }//GEN-LAST:event_cbbActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String s1=(String) cba.getSelectedItem(); 
        String s2=(String) cbb.getSelectedItem(); 
        String s3=(String) cbc.getSelectedItem(); 
          if(t11.getText()=="" || t12.getText()=="" || t13.getText()=="" || t14.getText()=="" || t15.getText()=="" || t16.getText()=="" )
        {
            JOptionPane.showMessageDialog(this,"Please add information");
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
                Statement st=c.createStatement();
                int i=st.executeUpdate("insert into oldmobile values ('"+t11.getText()+"','"+t12.getText()+"','"+t13.getText()+"','"+t14.getText()+"','"+t15.getText()+"','"+t16.getText()+"','"+t17.getText()+"','"+s1+"','"+s2+"','"+s3+"')");
                // System.out.print("check");
                if(i==1)
                {
                    t11.setText("");
                    t12.setText("");
                    t13.setText("");
                    t14.setText("");
                    t15.setText("");
                    t16.setText("");
                     t17.setText("");

                    JOptionPane.showMessageDialog(this,"Old Mobile added sucessfully");

                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                System.out.print(e);
            }
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        ayushi=1;
        p4.setVisible(false);
        p6.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void cbdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdMouseClicked

    private void cbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdActionPerformed
        // TODO add your handling code here:
             String s1=(String) cbd.getSelectedItem();
              try
       {
           cbe.removeAllItems();
           cbe.addItem("MODEL");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct Model from models where Brand='"+s1+"'");
           while(rs.next())
           {
              cbe.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
    }//GEN-LAST:event_cbdActionPerformed

    private void cbeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbeMouseClicked

    private void cbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbeActionPerformed
        // TODO add your handling code here:
             String s1=(String) cbe.getSelectedItem();
              try
       {
           cbf.removeAllItems();
           cbf.addItem("ROM/Storage");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct ROM from models where Model='"+s1+"'");
           while(rs.next())
           {
              cbf.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
    }//GEN-LAST:event_cbeActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String s1=(String) cbd.getSelectedItem(); 
        String s2=(String) cbe.getSelectedItem(); 
        String s3=(String) cbf.getSelectedItem(); 
          if(t21.getText()=="" || t22.getText()=="" || t23.getText()=="" || t24.getText()=="" || t25.getText()=="" || t26.getText()=="")
        {
            JOptionPane.showMessageDialog(this,"Please add information");
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
                Statement st=c.createStatement();
                int i=st.executeUpdate("insert into newmobile values ('"+t21.getText()+"','"+t22.getText()+"','"+t23.getText()+"','"+t24.getText()+"','"+t25.getText()+"','"+t26.getText()+"','"+t27.getText()+"','"+s1+"','"+s2+"','"+s3+"')");
                // System.out.print("check");
                if(i==1)
                {
                    t21.setText("");
                    t22.setText("");
                    t23.setText("");
                    t24.setText("");
                    t25.setText("");
                    t26.setText("");
                     t27.setText("");

                    JOptionPane.showMessageDialog(this,"New Mobile added sucessfully");

                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        ayushi=2;
         p5.setVisible(false);
        p6.setVisible(true);
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        p4.setVisible(false);
        p2.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          p5.setVisible(false);
        p2.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         p2.setVisible(false);
        p1.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
        if("".equals(t1.getText()) || t2.getText()=="" || t3.getText()=="")
        {
            JOptionPane.showMessageDialog(this,"Please add information");
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
                Statement st=c.createStatement();
                int i=st.executeUpdate("insert into models values ('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"')");
                // System.out.print("check");
                if(i==1)
                {
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");

                    JOptionPane.showMessageDialog(this,"Model added sucessfully");

                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                System.out.print(e);
            }
        }

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from models");
            if(rs.next())
            {
                mymodel1 m1=new mymodel1(rs);
                jt1.setModel(m1);

            }

        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.print(e);
        }
    }//GEN-LAST:event_b10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if(ayushi==1)
        {
        p6.setVisible(false);
        p4.setVisible(true);
        }
        if(ayushi==2)
        {
        p6.setVisible(false);
        p5.setVisible(true);
        }
        if(ayushi==0)
        {
            p2.setVisible(true);
            p6.setVisible(false);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        p2.setVisible(false);
        p6.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t36ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        t31.setText("");
                    t32.setText("");
                    t33.setText("");
                    t34.setText("");
                    t35.setText("");
                    t36.setText("");
                     t37.setText("");
                      t38.setText("");
                       t39.setText("");
                        t40.setText("");
                    JOptionPane.showMessageDialog(this,"All Dealer Details are cleared");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        p7.setVisible(false);
        p9.setVisible(true);
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        // TODO add your handling code here:
        String s1=t31.getText();
        String s4=t36.getText();
          try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           
           //System.out.print("check");
           int a= JOptionPane.showConfirmDialog(this,"Are you sure You want to update", "choose",JOptionPane.YES_NO_CANCEL_OPTION);
           if(a==JOptionPane.YES_OPTION)
            {
               int i=st.executeUpdate("update dealerdetails set address='"+t33.getText()+"', city='"+t35.getText()+"',email='"+t34.getText()+"',DOB='"+t37.getText()+"',state='"+t38.getText()+"',pincode='"+t39.getText()+"',GST='"+t40.getText()+"' where dealerId='"+s1+"' and   mobile='"+s4+"'");
               if(i==1)
               {
                    JOptionPane.showMessageDialog(this,"Your record updated successfully");
                     t31.setText(""); t32.setText(""); t33.setText(""); t34.setText(""); t35.setText("");
                     t36.setText(""); t37.setText(""); t38.setText(""); t39.setText(""); t40.setText("");
               }
            }
               
         //  dealerId='"+t31.getText()+"' and   
            
       }
       catch(HeadlessException | ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
        
           try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from dealerdetails");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt2.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }      
        
        
    }//GEN-LAST:event_b18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
          String s1;
          if(r1.isSelected())
              s1="Male";
          else{
              s1="Female";
          }
//        String s2=(String) cbe.getSelectedItem(); 
//        String s3=(String) cbf.getSelectedItem(); 
          if(t31.getText()=="" || t32.getText()=="" || t33.getText()=="" || t34.getText()=="" || t35.getText()=="" || t36.getText()=="" || t37.getText()=="" || t38.getText()=="" || t39.getText()=="" || t40.getText()=="")
        {
            JOptionPane.showMessageDialog(this,"Please add information");
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
                Statement st=c.createStatement();
                int i=st.executeUpdate("insert into dealerdetails values ('"+t31.getText()+"','"+t32.getText()+"','"+t33.getText()+"','"+t34.getText()+"','"+t35.getText()+"','"+t36.getText()+"','"+t37.getText()+"','"+t38.getText()+"','"+t39.getText()+"','"+s1+"','"+t40.getText()+"')");
                // System.out.print("check");
                if(i==1)
                {
                    t31.setText("");
                    t32.setText("");
                    t33.setText("");
                    t34.setText("");
                    t35.setText("");
                    t36.setText("");
                     t37.setText("");
                      t38.setText("");
                       t39.setText("");
                       t40.setText("");

                    JOptionPane.showMessageDialog(this,"Dealer Details Added sucessfully");

                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                System.out.print(e);
            }
        }
         
          
              try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from dealerdetails");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt2.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }     
    }//GEN-LAST:event_jButton19ActionPerformed

    private void t46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t46ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
         t41.setText("");
                    t42.setText("");
                    t43.setText("");
                    t44.setText("");
                    t45.setText("");
                    t46.setText("");
                    t47.setText("");
                    t48.setText("");
                    t49.setText("");
                     t50.setText("");
                    t53.setText("");
                    JOptionPane.showMessageDialog(this,"All details cleared sucessfully");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        p10.setVisible(true);
        p8.setVisible(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        // TODO add your handling code here:
        String s1=t41.getText();
        String s2=t46.getText();
            try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           
           //System.out.print("check");
           int a= JOptionPane.showConfirmDialog(this,"Are you sure You want to update", "choose",JOptionPane.YES_NO_CANCEL_OPTION);
           if(a==JOptionPane.YES_OPTION)
            {
               int i=st.executeUpdate("update customerdetails set address='"+t43.getText()+"', city='"+t44.getText()+"',email='"+t45.getText()+"',mobile='"+t46.getText()+"',DOB='"+t47.getText()+"',state='"+t48.getText()+"',pincode='"+t49.getText()+"',reference='"+t50.getText()+"' ,aadhar='"+t53.getText()+"' where customerId='"+s1+"' and   mobile='"+s2+"'");
               if(i==1)
               {
                    JOptionPane.showMessageDialog(this,"Your record updated successfully");
                     t41.setText(""); t42.setText(""); t43.setText(""); t44.setText(""); t45.setText("");
                     t46.setText(""); t47.setText(""); t48.setText(""); t49.setText(""); t50.setText(""); t53.setText("");
               }
            }
               
         //  dealerId='"+t31.getText()+"' and   
            
       }
       catch(HeadlessException | ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
        
           try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from customerdetails");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt3.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }      
        
    }//GEN-LAST:event_b22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
         String s1 = new String();
         
          if(r3.isSelected())
              s1="Male";
           if(r4.isSelected())
              s1="Female";
//        String s2=(String) cbe.getSelectedItem(); 
//        String s3=(String) cbf.getSelectedItem(); 
          if(t41.getText()=="" || t42.getText()=="" || t43.getText()=="" || t44.getText()=="" || t45.getText()=="" || t46.getText()=="" || t47.getText()=="" || t48.getText()=="" || t49.getText()=="" || t50.getText()=="" || t53.getText()=="" )
        {
            JOptionPane.showMessageDialog(this,"Please add information");
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
                Statement st=c.createStatement();
                int i=st.executeUpdate("insert into customerdetails values ('"+t41.getText()+"','"+t42.getText()+"','"+t43.getText()+"','"+t44.getText()+"','"+t45.getText()+"','"+t46.getText()+"','"+t47.getText()+"','"+t48.getText()+"','"+t49.getText()+"','"+s1+"','"+t50.getText()+"','"+t53.getText()+"')");
                // System.out.print("check");
                if(i==1)
                {
                    t41.setText("");
                    t42.setText("");
                    t43.setText("");
                    t44.setText("");
                    t45.setText("");
                    t46.setText("");
                    t47.setText("");
                    t48.setText("");
                    t49.setText("");
                     t50.setText("");
                    t53.setText("");
                    JOptionPane.showMessageDialog(this,"Customer Details Added sucessfully");

                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                System.out.print(e);
            }
        }
          
             try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from customerdetails");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt3.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }      
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        ayushi3=2;
         p1.setVisible(false);
        p7.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        ayushi2=2;
        new1=2;
          p1.setVisible(false);
        p8.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        if(ayushi3==2)
        {
           p7.setVisible(false);
        p1.setVisible(true);
        }
        if(ayushi3==1)
        {
           p7.setVisible(false);
        p5.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if(new1==2)
        {
          p8.setVisible(false);
        p1.setVisible(true);
        }
        if(new1==1)
        {
          p8.setVisible(false);
        p4.setVisible(true);
        }
        if(new1==3)
        {
          p8.setVisible(false);
        p14.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        String s1=t51.getText();
         try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select *from dealerdetails where mobile='"+s1+"'");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt2.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }    
        
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        p9.setVisible(false);
        p7.setVisible(true);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt2MouseClicked
        // TODO add your handling code here:
        int r=jt2.getSelectedRow();
        TableModel model=jt2.getModel();
        t31.setText(model.getValueAt(r, 0).toString());
        t32.setText(model.getValueAt(r, 1).toString());
        t33.setText(model.getValueAt(r, 2).toString());
        t34.setText(model.getValueAt(r, 3).toString());
        t35.setText(model.getValueAt(r, 4).toString());
        t36.setText(model.getValueAt(r, 5).toString());
        t37.setText(model.getValueAt(r, 6).toString()); 
        t38.setText(model.getValueAt(r, 7).toString());
        t39.setText(model.getValueAt(r, 8).toString());
        t40.setText(model.getValueAt(r, 10).toString());
        String s1=model.getValueAt(r, 9).toString();
        if(s1.equals("Male"))
        {
            r1.setSelected(true);
        }
        else{
             r2.setSelected(true);
        }
        p9.setVisible(false);
        p7.setVisible(true);
        b18.setVisible(true);
    }//GEN-LAST:event_jt2MouseClicked

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        String s1=t52.getText();
          try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select *from customerdetails where mobile='"+s1+"'");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt3.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }  
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt3MouseClicked
        // TODO add your handling code here:
        int r=jt3.getSelectedRow();
        TableModel model=jt3.getModel();
        t41.setText(model.getValueAt(r, 0).toString());
        t42.setText(model.getValueAt(r, 1).toString());
        t43.setText(model.getValueAt(r, 2).toString());
        t44.setText(model.getValueAt(r, 3).toString());
        t45.setText(model.getValueAt(r, 4).toString());
        t46.setText(model.getValueAt(r, 5).toString());
        t47.setText(model.getValueAt(r, 6).toString()); 
        t48.setText(model.getValueAt(r, 7).toString());
        t49.setText(model.getValueAt(r, 8).toString());
        t50.setText(model.getValueAt(r, 10).toString());
        t53.setText(model.getValueAt(r, 11).toString());
        String s1=model.getValueAt(r, 9).toString();
        if(s1.equals("Male"))
        {
            r3.setSelected(true);
        }
        else{
             r4.setSelected(true);
        }
        p10.setVisible(false);
        p8.setVisible(true);
        b22.setVisible(true);
    }//GEN-LAST:event_jt3MouseClicked

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        p10.setVisible(false);
        p7.setVisible(true);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
       int r=jt1.getSelectedRow();
       TableModel model=jt1.getModel();
       String s1=model.getValueAt(r, 0).toString();
       String s2=model.getValueAt(r, 1).toString();
       String s3=model.getValueAt(r, 2).toString();
       
       
        int a= JOptionPane.showConfirmDialog(this,"Are you sure You want to update", "choose",JOptionPane.YES_NO_CANCEL_OPTION);
           if(a==JOptionPane.YES_OPTION)
            {
                  try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           int i=st.executeUpdate("delete from models where Brand='"+s1+"' and Model='"+s2+"' and ROM='"+s3+"'");
           if(i==1)
           {
              JOptionPane.showMessageDialog(this,"Models Deleted sucessfully");
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }  
            }
       
           
           
               try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from models");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt1.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }   
    }//GEN-LAST:event_jButton18ActionPerformed

    private void t22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t22KeyReleased
        // TODO add your handling code here:
//   
        
    }//GEN-LAST:event_t22KeyReleased

    private void t22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t22KeyTyped
        // TODO add your handling code here:
//
    }//GEN-LAST:event_t22KeyTyped

    private void t22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t22KeyPressed
        // TODO add your handling code here:
//    
    }//GEN-LAST:event_t22KeyPressed

    private void t22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t22FocusLost
        // TODO add your handling code here:
                String s1=t21.getText();
        String s2=t22.getText();
        if(s1=="" || s2=="")
        {
            JOptionPane.showMessageDialog(this,"Please enter name and mobile number.");
        }
        else{
           try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select *from dealerdetails where dealerName='"+s1+"' and mobile='"+s2+"' ");
           if(rs.next())
           {
             
           }
           else{
               int a= JOptionPane.showConfirmDialog(this,"This is new dealer !!! '\n' You need to register this Dealer '\n' Would you like to register?", "choose",JOptionPane.YES_NO_CANCEL_OPTION);
           if(a==JOptionPane.YES_OPTION)
           {
               ayushi3=1;
               p7.setVisible(true);
               p5.setVisible(false);
           }
//           if(a==JOptionPane.NO_OPTION)
//           {
//               p7.setVisible(false);
//               p5.setVisible(false);
//           }
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       } 
        }
    }//GEN-LAST:event_t22FocusLost

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        // TODO add your handling code here:
        String s3=t62.getText();
          String s1 = new String();
         String s2 = new String();
          if(r5.isSelected())
              s1="Repaired";
           if(r6.isSelected())
              s1="NotRepaired";
           
           if(check1.isSelected())
               s2="yes";
           else{
               s2="not";
           }
             try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           
           //System.out.print("check");
           int a= JOptionPane.showConfirmDialog(this,"Are you sure You want to update", "choose",JOptionPane.YES_NO_CANCEL_OPTION);
           if(a==JOptionPane.YES_OPTION)
            {
               int i=st.executeUpdate("update repair set name='"+t61.getText()+"', mobileDetails='"+t63.getText()+"',repair='"+t64.getText()+"',returnDate='"+t66.getText()+"',repairStatus='"+s1+"',returnStatus='"+s2+"' where mobile='"+s3+"'");
               if(i==1)
               {
                    JOptionPane.showMessageDialog(this,"Your record updated successfully");
                     t61.setText(""); t62.setText(""); t63.setText(""); t64.setText(""); t65.setText("");
                     t66.setText(""); 
               }
            }
               
         //  dealerId='"+t31.getText()+"' and   
            
       }
       catch(HeadlessException | ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
             
         try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select * from repair");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt4.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }       
    }//GEN-LAST:event_b23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        p12.setVisible(true);
        p11.setVisible(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        
                  int a= JOptionPane.showConfirmDialog(this,"Are you sure You want to update", "choose",JOptionPane.YES_NO_CANCEL_OPTION);
           if(a==JOptionPane.YES_OPTION)
           {
               t61.setText("");
                    t62.setText("");
                    t63.setText("");
                    t64.setText("");
                    t65.setText("");
                    t66.setText("");
                    //check1.setEnabled(false);
           }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
          String s1 = new String();
         String s2 = new String();
          if(r5.isSelected())
              s1="Repaired";
           if(r6.isSelected())
              s1="NotRepaired";
           
           if(check1.isSelected())
               s2="yes";
           else{
               s2="not";
           }
//        String s2=(String) cbe.getSelectedItem(); 
//        String s3=(String) cbf.getSelectedItem(); 
          if(t61.getText()=="" || t62.getText()=="" || t63.getText()=="" || t64.getText()=="" || t65.getText()==""   )
        {
            JOptionPane.showMessageDialog(this,"Please add information");
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
                Statement st=c.createStatement();
                int i=st.executeUpdate("insert into repair values ('"+t61.getText()+"','"+t62.getText()+"','"+t63.getText()+"','"+t64.getText()+"','"+t65.getText()+"','"+t66.getText()+"','"+s1+"','"+s2+"')");
                // System.out.print("check");
                if(i==1)
                {
                    t61.setText("");
                    t62.setText("");
                    t63.setText("");
                    t64.setText("");
                    t65.setText("");
                    t66.setText("");
                                        //check1.setEnabled(false);

                    JOptionPane.showMessageDialog(this,"Customer Repairing Details Added sucessfully");

                }
            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        String s1=t59.getText();
           try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select *from repair where mobile='"+s1+"'");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt4.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }  
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt4MouseClicked
        // TODO add your handling code here:
         int r=jt4.getSelectedRow();
        TableModel model=jt4.getModel();
        t61.setText(model.getValueAt(r, 0).toString());
        t62.setText(model.getValueAt(r, 1).toString());
        t63.setText(model.getValueAt(r, 2).toString());
        t64.setText(model.getValueAt(r, 3).toString());
        t65.setText(model.getValueAt(r, 4).toString());
        t66.setText(model.getValueAt(r, 5).toString());
        
        String s1=model.getValueAt(r, 6).toString();
        if(s1.equals("Repaired"))
        {
            r5.setSelected(true);
        }
        else{
             r6.setSelected(true);
        }
        String s2=model.getValueAt(r, 7).toString();
        if(s2.equals("yes"))
        {
            check1.setEnabled(true);
        }
        else{
             check1.setEnabled(false);
        }
        p12.setVisible(false);
        p11.setVisible(true);
        b23.setVisible(true);
    }//GEN-LAST:event_jt4MouseClicked

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        p11.setVisible(true);
        p12.setVisible(false);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        p11.setVisible(false);
        p1.setVisible(true);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        p11.setVisible(true);
        p1.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void cbgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbgMouseClicked
        // TODO add your handling code here:
//                 String s1=(String) cbg.getSelectedItem();
//              try
//       {
//           Class.forName("com.mysql.jdbc.Driver");
//           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
//           Statement st=c.createStatement();
//           ResultSet rs=st.executeQuery("select Model from models where Brand='"+s1+"'");
//           while(rs.next())
//           {
//              cbh.addItem(rs.getString(1));
//              
//           }
//        
//            
//       }
//       catch(ClassNotFoundException | SQLException e)
//       {
//           System.out.print(e);
//       }
    }//GEN-LAST:event_cbgMouseClicked

    private void cbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbgActionPerformed
        // TODO add your handling code here:
                        String s1=(String) cbg.getSelectedItem();
              try
       {
            cbh.removeAllItems();
           cbh.addItem("MODEL");
           //cbh.removeAllItems();
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct Model from models where Brand='"+s1+"'");
           while(rs.next())
           {
              cbh.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
    }//GEN-LAST:event_cbgActionPerformed

    private void cbhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbhMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbhMouseClicked

    private void cbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhActionPerformed
        // TODO add your handling code here:
            String s1=(String) cbh.getSelectedItem();
              try
       {
           cbi.removeAllItems();
           cbi.addItem("ROM/Storage");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct ROM from models where Model='"+s1+"'");
           while(rs.next())
           {
              cbi.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }
    }//GEN-LAST:event_cbhActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
         String s1=(String) cbg.getSelectedItem(); 
        String s2=(String) cbh.getSelectedItem(); 
        String s3=(String) cbi.getSelectedItem(); 
              try
       {
           cbh.addItem("Brand");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select brand,model,ROM,quantity,marketPrice,purchasePrice from newmobile where brand='"+s1+"' or model='"+s2+"' or ROM='"+s3+"'");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt5.setModel(m1);
              
           }
            //System.out.print("check");s q   
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }   
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jt5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //ayushi4=1;
        p13.setVisible(true);
        p2.setVisible(false);
              try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select brand,model,ROM,quantity,marketPrice,purchasePrice from newmobile");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt5.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }   
              
                try
       {
           cbg.removeAllItems();
           cbg.addItem("BRAND");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct brand from newmobile");
           while(rs.next())
           {
              cbg.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ayushi4=2;
        p13.setVisible(true);
        p2.setVisible(false);
               try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select brand,model,ROM,quantity,marketPrice,purchasePrice from oldmobile");
           if(rs.next())
           {
              mymodel1 m1=new mymodel1(rs);
              jt5.setModel(m1);
              
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }   
               
                 try
       {
           cbg.removeAllItems();
           cbg.addItem("BRAND");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct Brand from oldmobile");
           while(rs.next())
           {
              cbg.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }             
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        p13.setVisible(false);
        p2.setVisible(true);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void cbjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbjMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjMouseClicked

    private void cbjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjActionPerformed
        // TODO add your handling code here:
        t67.setText("");
        ayushi5=(String) cbj.getSelectedItem();
        if(ayushi5.equals("OLD"))
        {
                      try
       {
           cbk.removeAllItems();
           cbk.addItem("BRAND");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct Brand from oldmobile");
           while(rs.next())
           {
              cbk.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }     
        }
         if(ayushi5.equals("NEW"))
        {
                      try
       {
           cbk.removeAllItems();
           cbk.addItem("BRAND");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct Brand from newmobile");
           while(rs.next())
           {
              cbk.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }     
        }
      
    }//GEN-LAST:event_cbjActionPerformed

    private void cblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cblMouseClicked

    private void cblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cblActionPerformed
        // TODO add your handling code here:
        String s1=(String) cbl.getSelectedItem();
         if(ayushi5.equals("OLD"))
        {
                      try
       {
           cbm.removeAllItems();
           cbm.addItem("ROM");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct ROM from oldmobile where model='"+s1+"'");
           while(rs.next())
           {
              cbm.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }     
        }
         if(ayushi5.equals("NEW"))
        {
                      try
       {
           cbm.removeAllItems();
           cbm.addItem("ROM");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct ROM from newmobile where model='"+s1+"'");
           while(rs.next())
           {
              cbm.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }     
        }
    }//GEN-LAST:event_cblActionPerformed

    private void cbkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbkMouseClicked

    private void cbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkActionPerformed
        // TODO add your handling code here:
       String s1=(String) cbk.getSelectedItem();
         if(ayushi5.equals("OLD"))
        {
                      try
       {
           cbl.removeAllItems();
           cbl.addItem("MODEL");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct model from oldmobile where brand='"+s1+"'");
           while(rs.next())
           {
              cbl.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }     
        }
         if(ayushi5.equals("NEW"))
        {
                      try
       {
           cbl.removeAllItems();
           cbl.addItem("MODEL");
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select distinct model from newmobile where brand='"+s1+"'");
           while(rs.next())
           {
              cbl.addItem(rs.getString(1));
              
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }     
        }
    }//GEN-LAST:event_cbkActionPerformed

    private void jt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jt6MouseClicked

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
          name=JOptionPane.showInputDialog(this,"Enter Discount in rupee:");
         
        //System.out.print(name);
        
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
//        int j=Integer.parseInt(name);
//         String k=t67.getText();
//         int m=Integer.parseInt(k);
//         int n=m-j;
//         t67.setText(n+"");
         int r=jt6.getSelectedRow();
       TableModel model=jt6.getModel();
//       String s1=model.getValueAt(r, 0).toString();
//       String s2=model.getValueAt(r, 1).toString();
//       String s3=model.getValueAt(r, 2).toString();
//       String s4=model.getValueAt(r, 3).toString();
       String s1=model.getValueAt(r, 4).toString();
       String s2=model.getValueAt(r, 5).toString();
       
        
               DefaultTableModel df=(DefaultTableModel)jt6.getModel();
                df.removeRow(jt6.getSelectedRow());
                int i=Integer.parseInt(s1);
           int j=Integer.parseInt(s2);
           total_initial-=i;
           total_discount-=j;
           total_amount+=j-i;
           t74.setText(total_amount+"");
           t73.setText(total_discount+"");
           t75.setText(total_initial+"");
           
         
    }//GEN-LAST:event_jButton39ActionPerformed

    private void cbmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmActionPerformed
        // TODO add your handling code here:
        String s1=(String) cbk.getSelectedItem();
         String s2=(String) cbl.getSelectedItem();
          String s3=(String) cbm.getSelectedItem();
         if(ayushi5.equals("OLD"))
        {
                      try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select purchasePrice from oldmobile where brand='"+s1+"' and model='"+s2+"' and ROM='"+s3+"'");
           if(rs.next())
           {
               String i=rs.getString(1);
              int j=Integer.parseInt(i);
              int k=(int) (j+(float) (j*0.3));
              t67.setText(""+k);
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }     
        }
         if(ayushi5.equals("NEW"))
        {
                      try
       {
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select marketPrice from newmobile where brand='"+s1+"' and model='"+s2+"' and ROM='"+s3+"'");
           if(rs.next())
           {
               String i=rs.getString(1);
              int j=Integer.parseInt(i);
            
              t67.setText(""+j);
           }
        
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       }     
        }
        
    }//GEN-LAST:event_cbmActionPerformed

    private void t69FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t69FocusLost
        // TODO add your handling code here:
        
                String s1=t60.getText();
        String s2=t69.getText();
        if(s1=="" || s2=="")
        {
            JOptionPane.showMessageDialog(this,"Please enter name and mobile number.");
        }
        else{
           try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select *from customerdetails where customerName='"+s1+"' and mobile='"+s2+"' ");
           if(rs.next())
           {
             
           }
           else{
               int a= JOptionPane.showConfirmDialog(this,"This is new customer !!! '\n' You need to register this Customer '\n' Would you like to register?", "choose",JOptionPane.YES_NO_CANCEL_OPTION);
           if(a==JOptionPane.YES_OPTION)
           {
               new1=3;
               p8.setVisible(true);
               p14.setVisible(false);
           }
//           if(a==JOptionPane.NO_OPTION)
//           {
//               p7.setVisible(false);
//               p5.setVisible(false);
//           }
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       } 
        }
    }//GEN-LAST:event_t69FocusLost

    private void t12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t12FocusLost
        // TODO add your handling code here:
                String s1=t11.getText();
        String s2=t12.getText();
        if(s1=="" || s2=="")
        {
            JOptionPane.showMessageDialog(this,"Please enter name and mobile number.");
        }
        else{
           try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
           Statement st=c.createStatement();
           ResultSet rs=st.executeQuery("select *from customerdetails where customerName='"+s1+"' and mobile='"+s2+"' ");
           if(rs.next())
           {
             
           }
           else{
               int a= JOptionPane.showConfirmDialog(this,"This is new customer !!! '\n' You need to register this Customer '\n' Would you like to register?", "choose",JOptionPane.YES_NO_CANCEL_OPTION);
           if(a==JOptionPane.YES_OPTION)
           {
               new1=1;
               p8.setVisible(true);
               p4.setVisible(false);
           }
//           if(a==JOptionPane.NO_OPTION)
//           {
//               p7.setVisible(false);
//               p5.setVisible(false);
//           }
           }
               
            
       }
       catch(ClassNotFoundException | SQLException e)
       {
           System.out.print(e);
       } 
        }
        
    }//GEN-LAST:event_t12FocusLost

    private void t74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t74ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
//        String s=(String)cbj.getSelectedItem();
//         String s1=(String)cbk.getSelectedItem();
//          String s2=(String)cbl.getSelectedItem();
//           String s3=(String)cbm.getSelectedItem();
//           String s4=t67.getText();
//           DefaultTableModel df=(DefaultTableModel)jt6.getModel();
//           Object obj[]={s,s1,s2,s3,s4,name};
//           df.addRow(obj);
//           int i=Integer.parseInt(s4);
//           int j=Integer.parseInt(name);
//           total_initial+=i;
//           total_discount+=j;
//           total_amount+=i-j;
//           t74.setText(total_amount+"");
//           t73.setText(total_discount+"");
//           t75.setText(total_initial+"");
             

    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        String s=(String)cbj.getSelectedItem();
         String s1=(String)cbk.getSelectedItem();
          String s2=(String)cbl.getSelectedItem();
           String s3=(String)cbm.getSelectedItem();
           String s4=t67.getText();
           DefaultTableModel df=(DefaultTableModel)jt6.getModel();
           Object obj[]={s,s1,s2,s3,s4,name};
           df.addRow(obj);
           int i=Integer.parseInt(s4);
           int j=Integer.parseInt(name);
           total_initial+=i;
           total_discount+=j;
           total_amount+=i-j;
           t74.setText(total_amount+"");
           t73.setText(total_discount+"");
           t75.setText(total_initial+"");
    }//GEN-LAST:event_jButton41ActionPerformed

    private void t69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t69ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        p14.setVisible(false);
        p1.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        p14.setVisible(true);
        p1.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(home6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home6().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b10;
    private javax.swing.JButton b18;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cba;
    private javax.swing.JComboBox<String> cbb;
    private javax.swing.JComboBox<String> cbc;
    private javax.swing.JComboBox<String> cbd;
    private javax.swing.JComboBox<String> cbe;
    private javax.swing.JComboBox<String> cbf;
    private javax.swing.JComboBox<String> cbg;
    private javax.swing.JComboBox<String> cbh;
    private javax.swing.JComboBox<String> cbi;
    private javax.swing.JComboBox<String> cbj;
    private javax.swing.JComboBox<String> cbk;
    private javax.swing.JComboBox<String> cbl;
    private javax.swing.JComboBox<String> cbm;
    private javax.swing.JCheckBox check1;
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
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jt1;
    private javax.swing.JTable jt2;
    private javax.swing.JTable jt3;
    private javax.swing.JTable jt4;
    private javax.swing.JTable jt5;
    private javax.swing.JTable jt6;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l4;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel p12;
    private javax.swing.JPanel p13;
    private javax.swing.JPanel p14;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t21;
    private javax.swing.JTextField t22;
    private javax.swing.JTextField t23;
    private javax.swing.JTextField t24;
    private javax.swing.JTextField t25;
    private javax.swing.JTextField t26;
    private javax.swing.JTextField t27;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t31;
    private javax.swing.JTextField t32;
    private javax.swing.JTextField t33;
    private javax.swing.JTextField t34;
    private javax.swing.JTextField t35;
    private javax.swing.JTextField t36;
    private javax.swing.JTextField t37;
    private javax.swing.JTextField t38;
    private javax.swing.JTextField t39;
    private javax.swing.JTextField t40;
    private javax.swing.JTextField t41;
    private javax.swing.JTextField t42;
    private javax.swing.JTextField t43;
    private javax.swing.JTextField t44;
    private javax.swing.JTextField t45;
    private javax.swing.JTextField t46;
    private javax.swing.JTextField t47;
    private javax.swing.JTextField t48;
    private javax.swing.JTextField t49;
    private javax.swing.JTextField t50;
    private javax.swing.JTextField t51;
    private javax.swing.JTextField t52;
    private javax.swing.JTextField t53;
    private javax.swing.JTextField t59;
    private javax.swing.JTextField t60;
    private javax.swing.JTextField t61;
    private javax.swing.JTextField t62;
    private javax.swing.JTextField t63;
    private javax.swing.JTextArea t64;
    private javax.swing.JTextField t65;
    private javax.swing.JTextField t66;
    private javax.swing.JTextField t67;
    private javax.swing.JTextField t68;
    private javax.swing.JTextField t69;
    private javax.swing.JTextField t70;
    private javax.swing.JTextField t73;
    private javax.swing.JTextField t74;
    private javax.swing.JTextField t75;
    // End of variables declaration//GEN-END:variables
}
