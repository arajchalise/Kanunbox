
package kanunbox;

import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdvocateDashboard extends javax.swing.JFrame {
    private String userName;
   
    public AdvocateDashboard(String Name) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.userName = Name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        leftSidePanel = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnCases = new javax.swing.JButton();
        btnAppointmentRequest = new javax.swing.JButton();
        btnPendingCases = new javax.swing.JButton();
        btnAppoinment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        casesPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCase = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bntDetailView = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        pendingCasesPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPendingCase = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        appoinmentPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAppointment = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        appointmentRequestPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointmentRequest = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 750));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setMinimumSize(new java.awt.Dimension(650, 650));

        topPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Company Name");

        jLabel2.setText("अधिवक्ता ");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        leftSidePanel.setBackground(new java.awt.Color(255, 255, 255));

        btnHome.setBackground(new java.awt.Color(0, 0, 204));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("गृहपृष्ठ");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnCases.setBackground(new java.awt.Color(0, 0, 204));
        btnCases.setForeground(new java.awt.Color(255, 255, 255));
        btnCases.setText("तपाँइ का मुद्दाहरु");
        btnCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasesActionPerformed(evt);
            }
        });

        btnAppointmentRequest.setBackground(new java.awt.Color(0, 0, 204));
        btnAppointmentRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnAppointmentRequest.setText("Appointment Requests");
        btnAppointmentRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentRequestActionPerformed(evt);
            }
        });

        btnPendingCases.setBackground(new java.awt.Color(0, 0, 204));
        btnPendingCases.setForeground(new java.awt.Color(255, 255, 255));
        btnPendingCases.setText("बाँकि मुद्दाहरु");
        btnPendingCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingCasesActionPerformed(evt);
            }
        });

        btnAppoinment.setBackground(new java.awt.Color(0, 0, 204));
        btnAppoinment.setForeground(new java.awt.Color(255, 255, 255));
        btnAppoinment.setText("Appoinment ");
        btnAppoinment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppoinmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftSidePanelLayout = new javax.swing.GroupLayout(leftSidePanel);
        leftSidePanel.setLayout(leftSidePanelLayout);
        leftSidePanelLayout.setHorizontalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPendingCases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAppoinment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAppointmentRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftSidePanelLayout.setVerticalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPendingCases, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAppoinment, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAppointmentRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        centerPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        lblWelcome.setText("Welcome Back, Mr. Someone ");

        jLabel7.setText("You have following Tasks to do... ");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Tasks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setRowHeight(25);
        jTable5.setShowHorizontalLines(false);
        jTable5.setShowVerticalLines(false);
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(lblWelcome))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblWelcome)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        centerPanel.add(homePanel, "card2");

        casesPanel.setBackground(new java.awt.Color(255, 255, 255));

        tblCase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case ID", "Client Name", "Subject of Case", "Status of Case"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCase.setRowHeight(25);
        tblCase.setShowHorizontalLines(false);
        tblCase.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tblCase);

        jButton1.setText("Search Case");

        jLabel8.setText("Your Cases");

        bntDetailView.setText("View Detail");
        bntDetailView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDetailViewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout casesPanelLayout = new javax.swing.GroupLayout(casesPanel);
        casesPanel.setLayout(casesPanelLayout);
        casesPanelLayout.setHorizontalGroup(
            casesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, casesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntDetailView)
                .addGap(37, 37, 37)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(casesPanelLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        casesPanelLayout.setVerticalGroup(
            casesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casesPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(casesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(casesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntDetailView)
                        .addComponent(btnEdit))
                    .addGroup(casesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );

        centerPanel.add(casesPanel, "card3");

        pendingCasesPanel.setBackground(new java.awt.Color(255, 255, 255));

        tblPendingCase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Case ID", "Clients Name", "Subject of Cases", "Next Hearing "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPendingCase.setRowHeight(25);
        tblPendingCase.setShowHorizontalLines(false);
        tblPendingCase.setShowVerticalLines(false);
        jScrollPane3.setViewportView(tblPendingCase);

        jLabel5.setText("Pending Cases");

        javax.swing.GroupLayout pendingCasesPanelLayout = new javax.swing.GroupLayout(pendingCasesPanel);
        pendingCasesPanel.setLayout(pendingCasesPanelLayout);
        pendingCasesPanelLayout.setHorizontalGroup(
            pendingCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
            .addGroup(pendingCasesPanelLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pendingCasesPanelLayout.setVerticalGroup(
            pendingCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingCasesPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerPanel.add(pendingCasesPanel, "card4");

        appoinmentPanel.setBackground(new java.awt.Color(255, 255, 255));

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Appointment Id", "Clients Name", "Purpose of Appointment", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAppointment.setRowHeight(25);
        tblAppointment.setShowHorizontalLines(false);
        tblAppointment.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblAppointment);

        jLabel4.setText("Todays Appointment ");

        javax.swing.GroupLayout appoinmentPanelLayout = new javax.swing.GroupLayout(appoinmentPanel);
        appoinmentPanel.setLayout(appoinmentPanelLayout);
        appoinmentPanelLayout.setHorizontalGroup(
            appoinmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
            .addGroup(appoinmentPanelLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        appoinmentPanelLayout.setVerticalGroup(
            appoinmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appoinmentPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        centerPanel.add(appoinmentPanel, "card5");

        tblAppointmentRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment No", "Client Name", "Porpose of Appointment", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAppointmentRequest.setRowHeight(25);
        tblAppointmentRequest.setShowHorizontalLines(false);
        tblAppointmentRequest.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblAppointmentRequest);

        btnApprove.setText("Approve ");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appointmentRequestPanelLayout = new javax.swing.GroupLayout(appointmentRequestPanel);
        appointmentRequestPanel.setLayout(appointmentRequestPanelLayout);
        appointmentRequestPanelLayout.setHorizontalGroup(
            appointmentRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentRequestPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnApprove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDecline)
                .addGap(88, 88, 88))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        appointmentRequestPanelLayout.setVerticalGroup(
            appointmentRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentRequestPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(appointmentRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnDecline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerPanel.add(appointmentRequestPanel, "card6");

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(leftSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(centerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(leftSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        centerPanel.removeAll();
        centerPanel.repaint();
        centerPanel.revalidate();
        
        centerPanel.add(homePanel);
        centerPanel.repaint();
        centerPanel.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasesActionPerformed
        centerPanel.removeAll();
        centerPanel.repaint();
        centerPanel.revalidate();
        
        DBHelper db = new DBHelper();
        DefaultTableModel model = (DefaultTableModel) tblCase.getModel();
        model.setRowCount(0);
       if(db.isConnected() && userName != null){
           ResultSet rs = db.fetchCase(userName);
            try {
                while(rs.next()){
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
                }} catch (SQLException ex) {
                Logger.getLogger(AdvocateDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        
        centerPanel.add(casesPanel);
        centerPanel.repaint();
        centerPanel.revalidate();
    }//GEN-LAST:event_btnCasesActionPerformed

    private void btnPendingCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingCasesActionPerformed
        try {
            loadPendingCases();
        } catch (SQLException ex) {
            Logger.getLogger(AdvocateDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPendingCasesActionPerformed

    private void btnAppoinmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppoinmentActionPerformed
        centerPanel.removeAll();
        centerPanel.repaint();
        centerPanel.revalidate();
        
         DBHelper db = new DBHelper();
        DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel();
        model.setRowCount(0);
       if(db.isConnected()){
           try{
               //System.out.println(userName);
               ResultSet rs = db.fetchAppointment(userName, 1);
               
                while(rs.next()){
               ResultSet crs = db.fetchClients(rs.getInt("clientId"));
               if(crs.next()){
                   model.addRow(new Object[] {rs.getInt(1), crs.getString("name"), rs.getString("purpose"), rs.getDate("date"), rs.getTime("time")});
               }
           } 
       }catch(Exception e){}
       }
        centerPanel.add(appoinmentPanel);
        centerPanel.repaint();
        centerPanel.revalidate();
    }//GEN-LAST:event_btnAppoinmentActionPerformed

    private void btnAppointmentRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentRequestActionPerformed
        loadAppointmentRequestPanel();
    }//GEN-LAST:event_btnAppointmentRequestActionPerformed

    private void bntDetailViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDetailViewActionPerformed
        if (tblCase.getSelectedRowCount() >1){
            JOptionPane.showMessageDialog(this, "Please Select Only one case at a time");
        } else if(tblCase.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Please Select one case to proceed");
        } else {
           int i = 0;
           int row = tblCase.getSelectedRow();
           String id = tblCase.getModel().getValueAt(row, i).toString();
           DetailedCase dc = new DetailedCase(id);
            try {
                dc.run();
            } catch (SQLException ex) {
                Logger.getLogger(AdvocateDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
    }//GEN-LAST:event_bntDetailViewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       if (tblCase.getSelectedRowCount() >1){
            JOptionPane.showMessageDialog(this, "Please Select Only one case at a time");
        } else if(tblCase.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Please Select one case to proceed");
        } else {
           int i = 0;
           int row = tblCase.getSelectedRow();
           String id = tblCase.getModel().getValueAt(row, i).toString();
           EditCases ec = new EditCases(id);
           ec.run();
          
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        if (tblAppointmentRequest.getSelectedRowCount() >1){
            JOptionPane.showMessageDialog(this, "Please Select Only one case at a time");
        } else if(tblAppointmentRequest.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Please Select one case to proceed");
        } else {
           int i = 0;
           int row = tblAppointmentRequest.getSelectedRow();
           String id = tblAppointmentRequest.getModel().getValueAt(row, i).toString();
           int ids = Integer.valueOf(id);
           DBHelper db = new DBHelper();
           if(db.isConnected()){
               db.doApprove(ids, 1);
               loadAppointmentRequestPanel();
               
           }
          
        }
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        if (tblAppointmentRequest.getSelectedRowCount() >1){
            JOptionPane.showMessageDialog(this, "Please Select Only one case at a time");
        } else if(tblAppointmentRequest.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Please Select one case to proceed");
        } else {
           int i = 0;
           int row = tblAppointmentRequest.getSelectedRow();
           String id = tblAppointmentRequest.getModel().getValueAt(row, i).toString();
           int ids = Integer.valueOf(id);
           DBHelper db = new DBHelper();
           if(db.isConnected()){
               db.doApprove(ids, -1);
               loadAppointmentRequestPanel();
           }
          
        }
    }//GEN-LAST:event_btnDeclineActionPerformed

   
   public void run() throws SQLException{
       this.setVisible(true);
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
       lblWelcome.setText("Welcome Back "+ userName);
   }
   
   public void loadAppointmentRequestPanel(){
       centerPanel.removeAll();
        centerPanel.repaint();
        centerPanel.revalidate();
        
        DBHelper db = new DBHelper();
        DefaultTableModel model = (DefaultTableModel) tblAppointmentRequest.getModel();
        model.setRowCount(0);
       if(db.isConnected()){
           try{
               //System.out.println(userName);
               ResultSet rs = db.fetchAppointment(userName, 0);
               
                while(rs.next()){
               ResultSet crs = db.fetchClients(rs.getInt("clientId"));
               if(crs.next()){
                   model.addRow(new Object[] {rs.getInt(1), crs.getString("name"), rs.getString("purpose"), rs.getDate("date"), rs.getTime("time")});
               }
           } 
       }catch(Exception e){}
       }
        centerPanel.add(appointmentRequestPanel);
        centerPanel.repaint();
        centerPanel.revalidate();
   }
   
   public void loadPendingCases() throws SQLException{
        centerPanel.removeAll();
        centerPanel.repaint();
        centerPanel.revalidate();
        
        DBHelper db = new DBHelper();
        DefaultTableModel model = (DefaultTableModel) tblPendingCase.getModel();
        model.setRowCount(0);
        if(db.isConnected()){
            ResultSet rs = db.fetchPendingCase(userName);
            while(rs.next()){
                model.addRow(new Object[] {rs.getInt("caseId"), rs.getString("name"), rs.getString("subjectOfCase")});
            }
        }
        centerPanel.add(pendingCasesPanel);
        centerPanel.repaint();
        centerPanel.revalidate();
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appoinmentPanel;
    private javax.swing.JPanel appointmentRequestPanel;
    private javax.swing.JButton bntDetailView;
    private javax.swing.JButton btnAppoinment;
    private javax.swing.JButton btnAppointmentRequest;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnCases;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPendingCases;
    private javax.swing.JPanel casesPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel leftSidePanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pendingCasesPanel;
    private javax.swing.JTable tblAppointment;
    private javax.swing.JTable tblAppointmentRequest;
    private javax.swing.JTable tblCase;
    private javax.swing.JTable tblPendingCase;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
