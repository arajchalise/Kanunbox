
package kanunbox;

import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {
        DBHelper db = new DBHelper();
   
    public Dashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBarMenu = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnServices = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnAdvocates = new javax.swing.JButton();
        btnClients = new javax.swing.JButton();
        btnCases = new javax.swing.JButton();
        btnDocuments = new javax.swing.JButton();
        btnAppointment = new javax.swing.JButton();
        mainHeader = new javax.swing.JPanel();
        lblSoftwareName = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        subHeader = new javax.swing.JPanel();
        lblCompanyName = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        caseForTodayPanel = new javax.swing.JPanel();
        lblNoOfTodaysCase = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        todaysClientsPanel = new javax.swing.JPanel();
        lblNoOfTodaysClient = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pendingCasesPanel = new javax.swing.JPanel();
        lblNoOfPendingCase = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        casesWinPanel = new javax.swing.JPanel();
        lblNoOfWonCase = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        satisfiedClientPanel = new javax.swing.JPanel();
        lblNoOfClients = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        activeAdvocatesPanel = new javax.swing.JPanel();
        lblNoOfAdvocate = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        otherInfoPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        servicesPanel = new javax.swing.JPanel();
        employeePanel = new javax.swing.JPanel();
        subMenu = new javax.swing.JPanel();
        addEmployee = new javax.swing.JButton();
        editEmployee = new javax.swing.JButton();
        deleteEmployee = new javax.swing.JButton();
        employeeScrollPanel = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        advocatesPanel = new javax.swing.JPanel();
        advocateSubMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        advocateScrollPane = new javax.swing.JScrollPane();
        tblAdvocate = new javax.swing.JTable();
        clientsPanel = new javax.swing.JPanel();
        clientsSubMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clientsScrollPane = new javax.swing.JScrollPane();
        tblClients = new javax.swing.JTable();
        casesPanel = new javax.swing.JPanel();
        casesSubMenu = new javax.swing.JPanel();
        btnNewCase = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnSearchCase = new javax.swing.JButton();
        casesScrollPane = new javax.swing.JScrollPane();
        tblCases = new javax.swing.JTable();
        documentsPanel = new javax.swing.JPanel();
        appointmentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeclinedAppointment = new javax.swing.JTable();
        btnReRequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(950, 950));

        sideBarMenu.setBackground(new java.awt.Color(255, 255, 255));

        btnHome.setBackground(new java.awt.Color(0, 0, 204));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("गृहपृष्ठ");
        btnHome.setBorder(null);
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnServices.setBackground(new java.awt.Color(0, 0, 204));
        btnServices.setForeground(new java.awt.Color(255, 255, 255));
        btnServices.setText("सेवा हरु");
        btnServices.setBorder(null);
        btnServices.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnServices.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicesActionPerformed(evt);
            }
        });

        btnEmployee.setBackground(new java.awt.Color(0, 0, 204));
        btnEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee.setText("कर्मचारी");
        btnEmployee.setBorder(null);
        btnEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnAdvocates.setBackground(new java.awt.Color(0, 0, 204));
        btnAdvocates.setForeground(new java.awt.Color(255, 255, 255));
        btnAdvocates.setText("अधिवक्ता");
        btnAdvocates.setBorder(null);
        btnAdvocates.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdvocates.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAdvocates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvocatesActionPerformed(evt);
            }
        });

        btnClients.setBackground(new java.awt.Color(0, 0, 204));
        btnClients.setForeground(new java.awt.Color(255, 255, 255));
        btnClients.setText("ग्रहक");
        btnClients.setBorder(null);
        btnClients.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClients.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientsActionPerformed(evt);
            }
        });

        btnCases.setBackground(new java.awt.Color(0, 0, 204));
        btnCases.setForeground(new java.awt.Color(255, 255, 255));
        btnCases.setText("मुद्दा");
        btnCases.setBorder(null);
        btnCases.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCases.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasesActionPerformed(evt);
            }
        });

        btnDocuments.setBackground(new java.awt.Color(0, 0, 204));
        btnDocuments.setForeground(new java.awt.Color(255, 255, 255));
        btnDocuments.setText("कागजात");
        btnDocuments.setBorder(null);
        btnDocuments.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDocuments.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDocuments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocumentsActionPerformed(evt);
            }
        });

        btnAppointment.setBackground(new java.awt.Color(0, 0, 204));
        btnAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnAppointment.setText("Declined Appointment");
        btnAppointment.setBorder(null);
        btnAppointment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAppointment.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideBarMenuLayout = new javax.swing.GroupLayout(sideBarMenu);
        sideBarMenu.setLayout(sideBarMenuLayout);
        sideBarMenuLayout.setHorizontalGroup(
            sideBarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(sideBarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClients, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdvocates, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sideBarMenuLayout.createSequentialGroup()
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDocuments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sideBarMenuLayout.setVerticalGroup(
            sideBarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarMenuLayout.createSequentialGroup()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnServices, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdvocates, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCases, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDocuments, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        mainHeader.setBackground(new java.awt.Color(0, 0, 51));

        lblSoftwareName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblSoftwareName.setForeground(new java.awt.Color(255, 255, 255));
        lblSoftwareName.setText("Kanoon Box");

        btnExit.setBackground(new java.awt.Color(0, 0, 51));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainHeaderLayout = new javax.swing.GroupLayout(mainHeader);
        mainHeader.setLayout(mainHeaderLayout);
        mainHeaderLayout.setHorizontalGroup(
            mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHeaderLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblSoftwareName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(530, 530, 530)
                .addComponent(btnExit)
                .addGap(37, 37, 37))
        );
        mainHeaderLayout.setVerticalGroup(
            mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHeaderLayout.createSequentialGroup()
                .addComponent(lblSoftwareName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        subHeader.setBackground(new java.awt.Color(255, 255, 255));

        lblCompanyName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCompanyName.setText("Gold Stone Consultancy and Law Firm ");

        javax.swing.GroupLayout subHeaderLayout = new javax.swing.GroupLayout(subHeader);
        subHeader.setLayout(subHeaderLayout);
        subHeaderLayout.setHorizontalGroup(
            subHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subHeaderLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subHeaderLayout.setVerticalGroup(
            subHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setToolTipText("");

        caseForTodayPanel.setBackground(new java.awt.Color(255, 102, 102));

        lblNoOfTodaysCase.setForeground(new java.awt.Color(255, 255, 255));
        lblNoOfTodaysCase.setText("१०");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("आजका मुद्दा ");

        javax.swing.GroupLayout caseForTodayPanelLayout = new javax.swing.GroupLayout(caseForTodayPanel);
        caseForTodayPanel.setLayout(caseForTodayPanelLayout);
        caseForTodayPanelLayout.setHorizontalGroup(
            caseForTodayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caseForTodayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(caseForTodayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(lblNoOfTodaysCase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        caseForTodayPanelLayout.setVerticalGroup(
            caseForTodayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caseForTodayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNoOfTodaysCase, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        todaysClientsPanel.setBackground(new java.awt.Color(0, 153, 51));

        lblNoOfTodaysClient.setForeground(new java.awt.Color(255, 255, 255));
        lblNoOfTodaysClient.setText("५");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clients Visited today");

        javax.swing.GroupLayout todaysClientsPanelLayout = new javax.swing.GroupLayout(todaysClientsPanel);
        todaysClientsPanel.setLayout(todaysClientsPanelLayout);
        todaysClientsPanelLayout.setHorizontalGroup(
            todaysClientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todaysClientsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(todaysClientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(lblNoOfTodaysClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        todaysClientsPanelLayout.setVerticalGroup(
            todaysClientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todaysClientsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNoOfTodaysClient, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pendingCasesPanel.setBackground(new java.awt.Color(255, 0, 0));

        lblNoOfPendingCase.setForeground(new java.awt.Color(255, 255, 255));
        lblNoOfPendingCase.setText("७");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("बाँकी मुद्दा");

        javax.swing.GroupLayout pendingCasesPanelLayout = new javax.swing.GroupLayout(pendingCasesPanel);
        pendingCasesPanel.setLayout(pendingCasesPanelLayout);
        pendingCasesPanelLayout.setHorizontalGroup(
            pendingCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingCasesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pendingCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNoOfPendingCase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pendingCasesPanelLayout.setVerticalGroup(
            pendingCasesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingCasesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNoOfPendingCase, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        casesWinPanel.setBackground(new java.awt.Color(51, 255, 255));

        lblNoOfWonCase.setForeground(new java.awt.Color(255, 255, 255));
        lblNoOfWonCase.setText("१००");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("जितेका मुद्दा ");

        javax.swing.GroupLayout casesWinPanelLayout = new javax.swing.GroupLayout(casesWinPanel);
        casesWinPanel.setLayout(casesWinPanelLayout);
        casesWinPanelLayout.setHorizontalGroup(
            casesWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casesWinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(casesWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNoOfWonCase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        casesWinPanelLayout.setVerticalGroup(
            casesWinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casesWinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNoOfWonCase, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        satisfiedClientPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblNoOfClients.setText("५००");

        jLabel12.setText("सन्तुष्ठ ग्राहक");

        javax.swing.GroupLayout satisfiedClientPanelLayout = new javax.swing.GroupLayout(satisfiedClientPanel);
        satisfiedClientPanel.setLayout(satisfiedClientPanelLayout);
        satisfiedClientPanelLayout.setHorizontalGroup(
            satisfiedClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(satisfiedClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(satisfiedClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNoOfClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        satisfiedClientPanelLayout.setVerticalGroup(
            satisfiedClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(satisfiedClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNoOfClients, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        activeAdvocatesPanel.setBackground(new java.awt.Color(0, 51, 255));

        lblNoOfAdvocate.setForeground(new java.awt.Color(255, 255, 255));
        lblNoOfAdvocate.setText("१०");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("अधिवक्ता");

        javax.swing.GroupLayout activeAdvocatesPanelLayout = new javax.swing.GroupLayout(activeAdvocatesPanel);
        activeAdvocatesPanel.setLayout(activeAdvocatesPanelLayout);
        activeAdvocatesPanelLayout.setHorizontalGroup(
            activeAdvocatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeAdvocatesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(activeAdvocatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNoOfAdvocate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
        );
        activeAdvocatesPanelLayout.setVerticalGroup(
            activeAdvocatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeAdvocatesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNoOfAdvocate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        otherInfoPanel.setBackground(new java.awt.Color(0, 204, 0));

        jLabel15.setText("आज को मितिः ");

        javax.swing.GroupLayout otherInfoPanelLayout = new javax.swing.GroupLayout(otherInfoPanel);
        otherInfoPanel.setLayout(otherInfoPanelLayout);
        otherInfoPanelLayout.setHorizontalGroup(
            otherInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        otherInfoPanelLayout.setVerticalGroup(
            otherInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherInfoPanelLayout.createSequentialGroup()
                .addGap(0, 209, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caseForTodayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(casesWinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(todaysClientsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(satisfiedClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activeAdvocatesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pendingCasesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(todaysClientsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pendingCasesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caseForTodayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(satisfiedClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activeAdvocatesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(casesWinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(otherInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(homePanel, "card2");

        servicesPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout servicesPanelLayout = new javax.swing.GroupLayout(servicesPanel);
        servicesPanel.setLayout(servicesPanelLayout);
        servicesPanelLayout.setHorizontalGroup(
            servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        servicesPanelLayout.setVerticalGroup(
            servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        mainPanel.add(servicesPanel, "card3");

        employeePanel.setBackground(new java.awt.Color(255, 255, 255));

        addEmployee.setBackground(new java.awt.Color(0, 204, 0));
        addEmployee.setForeground(new java.awt.Color(255, 255, 255));
        addEmployee.setText("‌+ नयाँ कर्मचारी थप्नुहोस");
        addEmployee.setBorder(null);
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        editEmployee.setBackground(new java.awt.Color(255, 255, 255));
        editEmployee.setText("परिमार्जन गर्नुहोस");
        editEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeActionPerformed(evt);
            }
        });

        deleteEmployee.setBackground(new java.awt.Color(255, 255, 255));
        deleteEmployee.setText("- हटाउनुहोस");
        deleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subMenuLayout = new javax.swing.GroupLayout(subMenu);
        subMenu.setLayout(subMenuLayout);
        subMenuLayout.setHorizontalGroup(
            subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(editEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(deleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        subMenuLayout.setVerticalGroup(
            subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "कर्मचारी संकेत", "कर्मचारी को नाम", "पद", "पदस्थापन"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.setFillsViewportHeight(true);
        tblEmployee.setRowHeight(25);
        tblEmployee.setShowHorizontalLines(false);
        tblEmployee.setShowVerticalLines(false);
        employeeScrollPanel.setViewportView(tblEmployee);

        javax.swing.GroupLayout employeePanelLayout = new javax.swing.GroupLayout(employeePanel);
        employeePanel.setLayout(employeePanelLayout);
        employeePanelLayout.setHorizontalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeePanelLayout.createSequentialGroup()
                .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(employeeScrollPanel)
        );
        employeePanelLayout.setVerticalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeePanelLayout.createSequentialGroup()
                .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(employeePanel, "card4");

        advocatesPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("अधिवक्ता हरु");

        javax.swing.GroupLayout advocateSubMenuLayout = new javax.swing.GroupLayout(advocateSubMenu);
        advocateSubMenu.setLayout(advocateSubMenuLayout);
        advocateSubMenuLayout.setHorizontalGroup(
            advocateSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advocateSubMenuLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        advocateSubMenuLayout.setVerticalGroup(
            advocateSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advocateSubMenuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        advocateScrollPane.setBackground(new java.awt.Color(255, 255, 255));

        tblAdvocate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "अधिवक्ता संकेत", "नाम", "ठेगाना", "सम्पर्क नं"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAdvocate.setRowHeight(25);
        tblAdvocate.setShowHorizontalLines(false);
        tblAdvocate.setShowVerticalLines(false);
        advocateScrollPane.setViewportView(tblAdvocate);

        javax.swing.GroupLayout advocatesPanelLayout = new javax.swing.GroupLayout(advocatesPanel);
        advocatesPanel.setLayout(advocatesPanelLayout);
        advocatesPanelLayout.setHorizontalGroup(
            advocatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(advocateSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(advocatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(advocateScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
        );
        advocatesPanelLayout.setVerticalGroup(
            advocatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advocatesPanelLayout.createSequentialGroup()
                .addComponent(advocateSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 470, Short.MAX_VALUE))
            .addGroup(advocatesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(advocatesPanelLayout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(advocateScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        mainPanel.add(advocatesPanel, "card5");

        jLabel2.setText("ग्राहक हरु");

        javax.swing.GroupLayout clientsSubMenuLayout = new javax.swing.GroupLayout(clientsSubMenu);
        clientsSubMenu.setLayout(clientsSubMenuLayout);
        clientsSubMenuLayout.setHorizontalGroup(
            clientsSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsSubMenuLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel2)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        clientsSubMenuLayout.setVerticalGroup(
            clientsSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsSubMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tblClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Hari Bahadur ", "Bhaktapur", "9841987654", "N/A"}
            },
            new String [] {
                "नाम", "ठेगाना", "सम्पर्क नं", "सेवा को प्रकार"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblClients.setRowHeight(25);
        tblClients.setShowHorizontalLines(false);
        tblClients.setShowVerticalLines(false);
        clientsScrollPane.setViewportView(tblClients);

        javax.swing.GroupLayout clientsPanelLayout = new javax.swing.GroupLayout(clientsPanel);
        clientsPanel.setLayout(clientsPanelLayout);
        clientsPanelLayout.setHorizontalGroup(
            clientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientsSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(clientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(clientsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
        );
        clientsPanelLayout.setVerticalGroup(
            clientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsPanelLayout.createSequentialGroup()
                .addComponent(clientsSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 469, Short.MAX_VALUE))
            .addGroup(clientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(clientsPanelLayout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(clientsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        mainPanel.add(clientsPanel, "card7");

        casesPanel.setBackground(new java.awt.Color(255, 255, 255));

        casesSubMenu.setBackground(new java.awt.Color(255, 255, 255));

        btnNewCase.setText("‌+ नयाँ मुद्दा");
        btnNewCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCaseActionPerformed(evt);
            }
        });

        btnSearchCase.setText("मुद्दा खोज्नुहोस");
        btnSearchCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout casesSubMenuLayout = new javax.swing.GroupLayout(casesSubMenu);
        casesSubMenu.setLayout(casesSubMenuLayout);
        casesSubMenuLayout.setHorizontalGroup(
            casesSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casesSubMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNewCase, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchCase)
                .addGap(0, 96, Short.MAX_VALUE))
        );
        casesSubMenuLayout.setVerticalGroup(
            casesSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casesSubMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(casesSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchCase, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnNewCase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(42, 42, 42))
        );

        tblCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CS1234", "N/A", "Hari Bahadur ", "Ram Bahadur Thapa ", "2076-5-27"}
            },
            new String [] {
                "Case ID", "मुद्दा को बिषय", "ग्राहक को नाम", "अधिवक्ता", "अब को सुनुवाइ "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCases.setRowHeight(25);
        tblCases.setShowHorizontalLines(false);
        tblCases.setShowVerticalLines(false);
        casesScrollPane.setViewportView(tblCases);

        javax.swing.GroupLayout casesPanelLayout = new javax.swing.GroupLayout(casesPanel);
        casesPanel.setLayout(casesPanelLayout);
        casesPanelLayout.setHorizontalGroup(
            casesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(casesSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(casesScrollPane)
        );
        casesPanelLayout.setVerticalGroup(
            casesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casesPanelLayout.createSequentialGroup()
                .addComponent(casesSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(casesPanel, "card6");

        javax.swing.GroupLayout documentsPanelLayout = new javax.swing.GroupLayout(documentsPanel);
        documentsPanel.setLayout(documentsPanelLayout);
        documentsPanelLayout.setHorizontalGroup(
            documentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        documentsPanelLayout.setVerticalGroup(
            documentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        mainPanel.add(documentsPanel, "card8");

        tblDeclinedAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment Id", "Client Name", "Purpose", "Date ", "Time", "Advocate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeclinedAppointment.setRowHeight(25);
        tblDeclinedAppointment.setShowHorizontalLines(false);
        tblDeclinedAppointment.setShowVerticalLines(false);
        tblDeclinedAppointment.setUpdateSelectionOnSort(false);
        tblDeclinedAppointment.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tblDeclinedAppointment);

        btnReRequest.setText("Re Request");
        btnReRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appointmentPanelLayout = new javax.swing.GroupLayout(appointmentPanel);
        appointmentPanel.setLayout(appointmentPanelLayout);
        appointmentPanelLayout.setHorizontalGroup(
            appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
            .addGroup(appointmentPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnReRequest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        appointmentPanelLayout.setVerticalGroup(
            appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appointmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(appointmentPanel, "card9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(sideBarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(homePanel);
        mainPanel.repaint();
        mainPanel.revalidate();
       
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicesActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        
        mainPanel.add(servicesPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        
    }//GEN-LAST:event_btnServicesActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
       mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
            try {
                if(db.isConnected()){
                    ResultSet rs = db.fetchEmployee();
                    DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
                    model.setRowCount(0);
                    while (rs.next()) {
//                        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
                        model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4)});
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        mainPanel.add(employeePanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        //tblEmployee.add
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnAdvocatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvocatesActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
         try {
                if(db.isConnected()){
                    ResultSet rs = db.fetchAdvocate();
                    DefaultTableModel model = (DefaultTableModel) tblAdvocate.getModel();
                    model.setRowCount(0);
                    while (rs.next()) {
//                        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
                        model.addRow(new Object[]{ rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        mainPanel.add(advocatesPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnAdvocatesActionPerformed

    private void btnClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientsActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        String tos = "";
        DBHelper db = new DBHelper();
        DefaultTableModel model = (DefaultTableModel) tblClients.getModel();
        model.setRowCount(0);
        if(db.isConnected()){
            try {
                ResultSet rs = db.fetchClients();
                while(rs.next()){
                   if(rs.getInt("tos") == 1){ 
                       tos = "कानुनी कारवाही";
                   } else if(rs.getInt("tos") == 2){
                       tos = "परामर्श";
                   }
                   model.addRow(new Object[] {rs.getString("name"), rs.getString("address"), rs.getString("contactNo"), tos});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        mainPanel.add(clientsPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
   
    }//GEN-LAST:event_btnClientsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasesActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        DBHelper db = new DBHelper();
        DefaultTableModel model = (DefaultTableModel) tblCases.getModel();
        model.setRowCount(0);
        if(db.isConnected()){
            try {
                ResultSet rs = db.fetchCase();
                while(rs.next()){
                    String advId = db.fetchAdvocate(rs.getInt("caseId"));
            
                    String advName = db.getAdvocateName(advId);
                    ResultSet crs = db.fetchClients(rs.getInt("clientId"));
                    if(crs.next()){
                        model.addRow(new Object[] {rs.getInt("caseId"), rs.getString("subjectOfCase"), crs.getString("name"), advName, " "});
                    }
                
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        mainPanel.add(casesPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnCasesActionPerformed

    private void btnDocumentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocumentsActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        
        mainPanel.add(documentsPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnDocumentsActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        Employee e = new Employee();
        e.run();
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void editEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeActionPerformed
        
    }//GEN-LAST:event_editEmployeeActionPerformed

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
       if (tblEmployee.isColumnSelected(0)){
           int i = tblEmployee.getSelectedRow();
          ((DefaultTableModel)tblEmployee.getModel()).removeRow(i);
       }
    }//GEN-LAST:event_deleteEmployeeActionPerformed

    private void btnNewCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCaseActionPerformed
       Cases c = new Cases();
       c.run();
    }//GEN-LAST:event_btnNewCaseActionPerformed

    private void btnSearchCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCaseActionPerformed
        JOptionPane.showMessageDialog(this, "तपाँइ को कार्य सम्पन्न भयो");
    }//GEN-LAST:event_btnSearchCaseActionPerformed

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
        loadAppointmentPanel();
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void btnReRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReRequestActionPerformed
        if(tblDeclinedAppointment.getSelectedRowCount() > 1){
        } else if(tblDeclinedAppointment.getSelectedRowCount() == -1){
        
        } else {
            int i = tblDeclinedAppointment.getSelectedRow();
            int id = (int) tblDeclinedAppointment.getModel().getValueAt(i, 0);
            //System.out.println(id);
            ReRequest rr = new ReRequest(id);
            rr.run();
        }
        
        
    }//GEN-LAST:event_btnReRequestActionPerformed

   public void run() throws SQLException{
       this.setVisible(true);
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
       DBHelper db = new DBHelper();
       if(db.isConnected()){
           lblNoOfClients.setText(db.getClientCount()+"");
           lblNoOfAdvocate.setText(db.countAdvocate()+"");
           lblNoOfPendingCase.setText(db.getPendingCaseCount()+"");
           lblNoOfWonCase.setText(db.getWinCaseCount()+"");
       }
       
   }
  public void loadAppointmentPanel(){
      mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        DBHelper db = new DBHelper();
        DefaultTableModel model = (DefaultTableModel) tblDeclinedAppointment.getModel();
        model.setRowCount(0);
       if(db.isConnected()){
           try{
               //System.out.println(userName);
               ResultSet rs = db.fetchDeclinedAppointment();
               
                while(rs.next()){
               ResultSet crs = db.fetchClients(rs.getInt("clientId"));
               String advName = db.getAdvocateName(rs.getString("advId"));
               if(crs.next()){
                   model.addRow(new Object[] {rs.getInt(1), crs.getString("name"), rs.getString("purpose"), rs.getDate("date"), rs.getTime("time"), advName});
               }
           } 
       }catch(Exception e){}
       }
        mainPanel.add(appointmentPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel activeAdvocatesPanel;
    private javax.swing.JButton addEmployee;
    private javax.swing.JScrollPane advocateScrollPane;
    private javax.swing.JPanel advocateSubMenu;
    private javax.swing.JPanel advocatesPanel;
    private javax.swing.JPanel appointmentPanel;
    private javax.swing.JButton btnAdvocates;
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnCases;
    private javax.swing.JButton btnClients;
    private javax.swing.JButton btnDocuments;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNewCase;
    private javax.swing.JButton btnReRequest;
    private javax.swing.JButton btnSearchCase;
    private javax.swing.JButton btnServices;
    private javax.swing.JPanel caseForTodayPanel;
    private javax.swing.JPanel casesPanel;
    private javax.swing.JScrollPane casesScrollPane;
    private javax.swing.JPanel casesSubMenu;
    private javax.swing.JPanel casesWinPanel;
    private javax.swing.JPanel clientsPanel;
    private javax.swing.JScrollPane clientsScrollPane;
    private javax.swing.JPanel clientsSubMenu;
    private javax.swing.JButton deleteEmployee;
    private javax.swing.JPanel documentsPanel;
    private javax.swing.JButton editEmployee;
    private javax.swing.JPanel employeePanel;
    private javax.swing.JScrollPane employeeScrollPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblNoOfAdvocate;
    private javax.swing.JLabel lblNoOfClients;
    private javax.swing.JLabel lblNoOfPendingCase;
    private javax.swing.JLabel lblNoOfTodaysCase;
    private javax.swing.JLabel lblNoOfTodaysClient;
    private javax.swing.JLabel lblNoOfWonCase;
    private javax.swing.JLabel lblSoftwareName;
    private javax.swing.JPanel mainHeader;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel otherInfoPanel;
    private javax.swing.JPanel pendingCasesPanel;
    private javax.swing.JPanel satisfiedClientPanel;
    private javax.swing.JPanel servicesPanel;
    private javax.swing.JPanel sideBarMenu;
    private javax.swing.JPanel subHeader;
    private javax.swing.JPanel subMenu;
    private javax.swing.JTable tblAdvocate;
    private javax.swing.JTable tblCases;
    private javax.swing.JTable tblClients;
    private javax.swing.JTable tblDeclinedAppointment;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JPanel todaysClientsPanel;
    // End of variables declaration//GEN-END:variables
}
