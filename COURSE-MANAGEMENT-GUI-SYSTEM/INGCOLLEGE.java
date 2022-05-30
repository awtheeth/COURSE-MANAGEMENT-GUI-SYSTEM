import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
public class INGCOLLEGE
{
    private JFrame f,fa,fna;
    private JLabel lblWelcome,lblSelect,lblDev,lblAcademic,lblCourseID,lblCourseName,lblDuration,lblLevel,lblCredit,lblNoOfAssesments,lblCourseLeader,lblLecturerName,lblStartingDate,
    lblCompletionDate,lblNonAcademic,lblCourseIDNon,lblCourseNameNon,lblPreRequisiteNon,lblDurationNon,lblCourseLeaderNon,lblInstructorName,lblCompletionDateNon,lblStartingDateNon,lblExamDate;

    private JTextField txtCourseID,txtCourseName,txtDuration,txtLevel,txtCredit,txtNoOfAssesments,txtCourseLeader,txtLecturerName,txtStartingDate,txtCompletionDate,txtCourseIDNon,
    txtCourseNameNon,txtPreRequisiteNon,txtDurationNon,txtCourseLeaderNon,txtInstructorName,txtCompletionDateNon,txtStartingDateNon,txtExamDate;

    private JButton btnAca,btnNonAca,btnAdd,btnRegister,btnDisplay,btnClear,btnExitNon,btnNonAcaInner,btnAddNon,btnRemoveNon,btnRegisterNon,btnDisplayNon,btnClearNon,btnExit,btnAcaInner;

    private Font FAca,FNonAca,FF,Add,Register,Display,Clear,FA,FS,FD,FAtxt,ffNon,ARDCRNon,FFNon,FFNontxt;
    private DefaultTableModel tableModelAca,tableModelNon;
    private JTable tableAca,tableNon;

    //creating arraylistCourse class
    private ArrayList<Course> academicCourseList = new ArrayList<Course>();
    private ArrayList<Course> nonAcademicCourseList = new ArrayList<Course>();
    public INGCOLLEGE()
    {
        //first frame of our project
        f = new JFrame("Courses");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(2000,1200);
        f.getContentPane().setBackground(new Color(111,227,183));
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        //To welcome user 
        lblWelcome = new JLabel ("W E L C O M E  T O   C O U R S E    R E G I S T R A T I O N   F O R M ");
        lblWelcome.setBounds(120,15,2000,160);
        FF = new Font ("Berlin Sans FB Demi",Font.BOLD, 60);
        lblWelcome.setFont(FF);
        f.add(lblWelcome);
        //To Give select option words for Users
        lblSelect = new JLabel ("P L E A S E  S E L E C T  Y O U R  C O U R S E  T Y P E ");
        lblSelect.setBounds(530,250,1500,160);
        FS = new Font ("Calibri",Font.BOLD, 40);
        lblSelect.setFont(FS);
        f.add(lblSelect);

        //To give name of the developer
        lblDev = new JLabel ("P O W E R E D    B Y    M A N    B A H A D U R    T H A P A");
        lblDev.setBounds(600,750,1500,160);
        FD = new Font ("Calibri",Font.BOLD, 30);
        lblDev.setFont(FD);
        f.add(lblDev);
        //AcademicCourse button 
        btnAca=new JButton("Academic Course");
        //NonAcademicCourse button
        btnNonAca=new JButton("Non-Academic Course"); 

        //AcademicCourse left, top, width, height
        btnAca.setBounds(400,450,500,200);
        //NonAcademicCourse left, top, width, height
        btnNonAca.setBounds(950,450,500,200);

        //puts style and size in button text
        FAca = new Font ("Calibri",Font.BOLD, 45);
        btnAca.setFont(FAca);
        f.add(btnAca);

        FNonAca = new Font ("Calibri",Font.BOLD, 45);
        btnNonAca.setFont(FNonAca);
        f.add(btnNonAca);
        //addingcolor
        btnAca.setBackground(new Color(241, 242, 240));
        btnNonAca.setBackground(new Color(241, 242, 240));
        //To show in our Frame of Academic and NonAcademic Course
        f.add(btnAca);
        f.add(btnNonAca);

        //creating Academic form
        fa = new JFrame("AcademicCourse");
        fa.setVisible(false);
        fa.setLayout(null);
        fa.setSize(2000,1200);
        fa.getContentPane().setBackground(new Color(111,227,183));
        fa.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        //label of AcademicCourse
        lblAcademic = new JLabel ("Academic Course");
        lblCourseID = new JLabel ("CourseID: ");
        lblCourseName = new JLabel ("CourseName : ");
        lblDuration = new JLabel ("Duration : ");
        lblLevel = new JLabel ("Level : ");
        lblCredit = new JLabel ("Credit : ");
        lblNoOfAssesments = new JLabel ("NoOfAssesments : ");
        lblCourseLeader = new JLabel ("CourseLeader : ");
        lblLecturerName = new JLabel ("LecturerName : ");
        lblStartingDate = new JLabel ("StartingDate : ");
        lblCompletionDate = new JLabel ("CompletionDate : ");

        //button of academicCourse
        btnAdd = new JButton("Add");
        btnRegister = new JButton("Register");
        btnDisplay = new JButton("Display");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        btnNonAcaInner = new JButton("Non-Academic Course");

        //TextFiled of AcademicCourse
        txtCourseID = new JTextField();
        txtCourseName = new JTextField();
        txtDuration = new JTextField();
        txtLevel = new JTextField();
        txtCredit = new JTextField();
        txtNoOfAssesments = new JTextField();
        txtCourseLeader = new JTextField();
        txtLecturerName = new JTextField();
        txtStartingDate = new JTextField();
        txtCompletionDate = new JTextField();

        //Label LEFT,TOP,WIDTH ANF HEIGHT 
        lblAcademic.setBounds(650,5,800,200);
        lblCourseID.setBounds(230,200,300,100);
        lblCourseName.setBounds(700,200,300,100);
        lblDuration.setBounds(1190,200,300,100);
        lblLevel.setBounds(230,300,200,100);
        lblCredit.setBounds(700,300,200,100);
        lblNoOfAssesments.setBounds(1190,300,330,100);
        lblCourseLeader.setBounds(230,500,300,100);
        lblLecturerName.setBounds(740,500,300,100);
        lblStartingDate.setBounds(1250,500,300,100);
        lblCompletionDate.setBounds(230,600,300,100);

        //TEXTFILED LEFT,TOP,WIDTH ANF HEIGHT
        txtCourseID.setBounds(400,225,200,40);
        txtCourseName.setBounds(940,225,200,40);
        txtDuration.setBounds(1500,225,200,40);
        txtLevel.setBounds(400,325,200,40);
        txtCredit.setBounds(940,325,200,40);
        txtNoOfAssesments.setBounds(1500,325,200,40);
        txtCourseLeader.setBounds(480,525,200,40);
        txtLecturerName.setBounds(1010,525,200,40);
        txtStartingDate.setBounds(1500,525,200,40);
        txtCompletionDate.setBounds(520,625,200,40);

        //BUTTON LEFT,TOP,WIDTH ANF HEIGHT
        btnAdd.setBounds(850,420,150,60);
        btnRegister.setBounds(850,715,150,60);
        btnDisplay.setBounds(650,770,150,60);
        btnClear.setBounds(1050,770,150,60);
        btnExit.setBounds(230,850,400,100);
        btnNonAcaInner.setBounds(1300,850,400,100);

        //adding color
        btnAdd.setBackground(new Color(166,219,227));
        btnRegister.setBackground(new Color(166,219,227));
        btnDisplay.setBackground(new Color(166,219,227));
        btnClear.setBackground(new Color(166,219,227));
        btnExit.setBackground(new Color(227,166,168));
        btnNonAcaInner.setBackground(new Color(166,219,227));

        //change the font style and size of academic course tittle
        Font ff = new Font ("Calibri", Font.BOLD, 80);
        lblAcademic.setFont(ff);
        Font Add = new Font ("Calibri", Font.PLAIN, 30);
        btnAdd.setFont(Add);
        Font Register = new Font ("Calibri", Font.PLAIN, 30);
        btnRegister.setFont(Register);
        Font Display = new Font ("Calibri", Font.PLAIN, 30);
        btnDisplay.setFont(Display);
        Font Clear = new Font ("Calibri", Font.PLAIN, 30);
        btnClear.setFont(Clear);
        Font FA = new Font ("Calibri", Font.PLAIN, 40);
        lblCourseID.setFont(FA);
        lblCourseName.setFont(FA);
        lblDuration.setFont(FA);
        lblLevel.setFont(FA);
        lblCredit.setFont(FA);
        lblNoOfAssesments.setFont(FA);
        lblCourseLeader.setFont(FA);
        lblLecturerName.setFont(FA);
        lblStartingDate.setFont(FA);
        lblCompletionDate.setFont(FA);
        btnExit.setFont(FA);
        btnNonAcaInner.setFont(FA);

        txtCourseID.setFont(Add);
        txtCourseName.setFont(Add);
        txtCourseID.setFont(Add);
        txtDuration.setFont(Add);
        txtLevel.setFont(Add);
        txtCredit.setFont(Add);
        txtNoOfAssesments.setFont(Add);
        txtCourseLeader.setFont(Add);
        txtLecturerName.setFont(Add);
        txtStartingDate.setFont(Add);
        txtCompletionDate.setFont(Add);

        //TO show in framework
        fa.add(lblAcademic);
        fa.add(lblCourseID);
        fa.add(lblCourseName);
        fa.add(lblDuration);
        fa.add(lblLevel);
        fa.add(lblCredit);
        fa.add(lblNoOfAssesments);
        fa.add(lblCourseLeader);
        fa.add(lblLecturerName);
        fa.add(lblStartingDate);
        fa.add(lblCompletionDate);

        fa.add(txtCourseID);
        fa.add(txtCourseName);
        fa.add(txtDuration);
        fa.add(txtLevel);
        fa.add(txtCredit);
        fa.add(txtNoOfAssesments);
        fa.add(txtCourseLeader);
        fa.add(txtLecturerName);
        fa.add(txtStartingDate);
        fa.add(txtCompletionDate);

        fa.add(btnAdd);
        fa.add(btnRegister);
        fa.add(btnDisplay);
        fa.add(btnClear);
        fa.add(btnExit);
        fa.add(btnNonAcaInner);

        //creating Non-academic
        fna = new JFrame("NonAcademicCourse");
        fna.setVisible(false);
        fna.setLayout(null);
        fna.setSize(2000,1200);
        fna.getContentPane().setBackground(new Color(111,227,183));
        fna.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        //label of NONAcademicCourse
        lblNonAcademic = new JLabel ("Non-Academic Course");
        lblCourseIDNon = new JLabel ("CourseID: ");
        lblCourseNameNon = new JLabel ("CourseName : ");
        lblPreRequisiteNon = new JLabel ("PreRequisite : ");
        lblDurationNon = new JLabel ("Duration : ");
        lblCourseLeaderNon = new JLabel ("CourseLeader : ");
        lblInstructorName = new JLabel ("InstructorName : ");
        lblExamDate = new JLabel ("ExamDate : ");
        lblStartingDateNon = new JLabel ("StartingDate : ");
        lblCompletionDateNon = new JLabel ("CompletionDate : ");

        //button of NONacademicCourse
        btnAddNon = new JButton("Add");
        btnRemoveNon = new JButton("Remove");
        btnRegisterNon = new JButton("Register");
        btnDisplayNon = new JButton("Display");
        btnClearNon = new JButton("Clear");
        btnExitNon = new JButton("Exit");
        btnAcaInner = new JButton("Academic Course");

        //TextFiled of NONAcademicCourse
        txtCourseIDNon = new JTextField();
        txtCourseNameNon = new JTextField();
        txtPreRequisiteNon = new JTextField();
        txtDurationNon = new JTextField();
        txtCourseLeaderNon = new JTextField();
        txtInstructorName = new JTextField();
        txtExamDate = new JTextField();
        txtCompletionDateNon = new JTextField();
        txtStartingDateNon = new JTextField();

        //Label LEFT,TOP,WIDTH ANF HEIGHT 
        lblNonAcademic.setBounds(650,5,800,200);
        lblCourseIDNon.setBounds(230,200,300,100);
        lblCourseNameNon.setBounds(700,200,300,100);
        lblPreRequisiteNon.setBounds(1250,200,300,100);
        lblDurationNon.setBounds(230,300,250,100);
        lblCourseLeaderNon.setBounds(230,500,300,100);              
        lblInstructorName.setBounds(730,500,300,100);
        lblExamDate.setBounds(1300,500,300,100);
        lblCompletionDateNon.setBounds(730,600,300,100);
        lblStartingDateNon.setBounds(230,600,300,100);

        //TEXTFILED LEFT,TOP,WIDTH ANF HEIGHT
        txtCourseIDNon.setBounds(430,225,200,40);
        txtCourseNameNon.setBounds(970,225,200,40);
        txtPreRequisiteNon.setBounds(1500,225,220, 40);
        txtDurationNon.setBounds(430,325,200,40);
        txtCourseLeaderNon.setBounds(480,525,200,40);
        txtInstructorName.setBounds(1030,525,200,40);
        txtExamDate.setBounds(1500,525,200,40);
        txtCompletionDateNon.setBounds(1030,625,200,40);
        txtStartingDateNon.setBounds(480,625,200,40);

        //BUTTON LEFT,TOP,WIDTH ANF HEIGHT
        btnAddNon.setBounds(850,420,150,60);
        btnRegisterNon.setBounds(720,715,150,60);
        btnRemoveNon.setBounds(970,715,150,60);
        btnDisplayNon.setBounds(500,770,150,60);
        btnClearNon.setBounds(1200,770,150,60);
        btnExitNon.setBounds(230,850,400,100);
        btnAcaInner.setBounds(1300,850,400,100);

        //adding color
        btnAddNon.setBackground(new Color(166,219,227));
        btnRegisterNon.setBackground(new Color(166,219,227));
        btnRemoveNon.setBackground(new Color(166,219,227));
        btnDisplayNon.setBackground(new Color(166,219,227));
        btnClearNon.setBackground(new Color(166,219,227));
        btnExitNon.setBackground(new Color(227,166,168));
        btnAcaInner.setBackground(new Color(166,219,227));
        //change the font style and size of nonacademic course tittle
        ffNon = new Font ("Calibri", Font.BOLD, 80);
        lblNonAcademic.setFont(ffNon);
        ARDCRNon = new Font ("Calibri", Font.PLAIN, 30);
        btnAddNon.setFont(ARDCRNon);
        btnRegisterNon.setFont(ARDCRNon);
        btnDisplayNon.setFont(ARDCRNon);
        btnClearNon.setFont(ARDCRNon);
        btnRemoveNon.setFont(ARDCRNon);

        FFNon = new Font ("Calibri", Font.PLAIN, 40);
        lblCourseIDNon.setFont(FFNon);
        lblCourseNameNon.setFont(FFNon);
        lblDurationNon.setFont(FFNon);
        lblPreRequisiteNon.setFont(FFNon);
        lblCourseLeaderNon.setFont(FFNon);
        lblInstructorName.setFont(FFNon);
        lblExamDate.setFont(FFNon);
        lblStartingDateNon.setFont(FFNon);
        lblCompletionDateNon.setFont(FFNon);
        btnExitNon.setFont(FFNon);
        btnAcaInner.setFont(FFNon);

        txtCourseIDNon.setFont(ARDCRNon);
        txtCourseNameNon.setFont(ARDCRNon);
        txtCourseIDNon.setFont(ARDCRNon);
        txtDurationNon.setFont(ARDCRNon);
        txtPreRequisiteNon.setFont(ARDCRNon);
        txtCourseLeaderNon.setFont(ARDCRNon);
        txtInstructorName.setFont(ARDCRNon);
        txtStartingDateNon.setFont(ARDCRNon);
        txtExamDate.setFont(ARDCRNon);
        txtCompletionDateNon.setFont(ARDCRNon);

        //TO show in framework
        fna.add(lblNonAcademic);
        fna.add(lblCourseIDNon);
        fna.add(lblCourseNameNon);
        fna.add(lblDurationNon);
        fna.add(lblPreRequisiteNon);
        fna.add(lblCourseLeaderNon);
        fna.add(lblInstructorName);
        fna.add(lblExamDate);
        fna.add(lblStartingDateNon);
        fna.add(lblCompletionDateNon);

        fna.add(txtCourseIDNon);
        fna.add(txtCourseNameNon);
        fna.add(txtDurationNon);
        fna.add(txtPreRequisiteNon);
        fna.add(txtCourseLeaderNon);
        fna.add(txtInstructorName);
        fna.add(txtExamDate);
        fna.add(txtStartingDateNon);
        fna.add(txtCompletionDateNon);

        fna.add(btnAddNon);
        fna.add(btnRemoveNon);
        fna.add(btnRegisterNon);
        fna.add(btnDisplayNon);
        fna.add(btnClearNon);
        fna.add(btnExitNon);
        fna.add(btnAcaInner);

        //triggered to open Academic Course Framework
        btnAca.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fa.setVisible(true);
                    fna.setVisible(false);
                    f.setVisible(false);
                }
            });

        //triggered to open NonAcademic course framework
        btnNonAca.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    fa.setVisible(false);
                    fna.setVisible(true);
                    f.setVisible(false); 
                }
            });

        //the button to select Nonacademic course from academic registration form
        btnNonAcaInner.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fa.setVisible(false);
                    fna.setVisible(true);
                    f.setVisible(false); 
                }
            }); 
        //the button to select academic course from nonacademic registration form
        btnAcaInner.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fa.setVisible(true);
                    fna.setVisible(false);
                    f.setVisible(false);
                }
            });

        //actionlistener for add button of academicCourse
        btnAdd.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    //using try catch in integer datatype(duration and NoOfassesments)
                    try

                    {
                        String duration_temp = txtDuration.getText();
                        int duration = Integer.parseInt(duration_temp);
                        String numberOfAssesments_temp = txtNoOfAssesments.getText();
                        int numberOfAssessments = Integer.parseInt(numberOfAssesments_temp);

                    }
                    catch(Exception I)
                    {
                        String duration_temp = txtDuration.getText();
                        String numberOfAssesments_temp = txtNoOfAssesments.getText();
                        if (duration_temp.isEmpty() || numberOfAssesments_temp.isEmpty())
                        {
                            JOptionPane.showMessageDialog(f,"Text Field is empty");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(f,"Invalid Data");
                        }
                    }
                    String courseID = txtCourseID.getText();
                    String courseName = txtCourseName.getText();
                    String duration_temp = txtDuration.getText();
                    String level = txtLevel.getText();
                    String credit = txtCredit.getText();
                    String numberOfAssesments_temp = txtNoOfAssesments.getText();
                    int duration = Integer.parseInt(duration_temp);
                    int numberOfAssesments = Integer.parseInt(numberOfAssesments_temp);
                    if (courseID.isEmpty() || courseName.isEmpty() || duration_temp.isEmpty() || level.isEmpty() || credit.isEmpty() || numberOfAssesments_temp.isEmpty())
                    {
                        JOptionPane.showMessageDialog(f,"TextField is empty");
                    }
                    else
                    {
                        for (Course a: academicCourseList)
                        {
                            if(courseID.equals(a.getCourseID()))
                            {
                                JOptionPane.showMessageDialog(f,"This course Id is already Added");
                                return;
                            }
                        }
                        AcademicCourse store = new AcademicCourse(courseID, courseName, duration, level, credit, numberOfAssesments);
                        academicCourseList.add(store); //store is a variable
                        JOptionPane.showMessageDialog(f,"Your records have been added succesfully.");
                    }
                }
            }
        );

        //actionlistener for add button of NonacademicCourse
        btnAddNon.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    //using try catch in integer datatype(duration and NoOfassesments)
                    try

                    {
                        String duration_temp = txtDurationNon.getText();
                        int duration = Integer.parseInt(duration_temp);
                    }
                    catch(Exception I)
                    {
                        String duration_temp = txtDurationNon.getText();
                        if (duration_temp.isEmpty())
                        {
                            JOptionPane.showMessageDialog(f,"Text Field is empty");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(f,"Invalid Data");
                        }
                    }
                    String courseIDNon = txtCourseIDNon.getText();
                    String courseNameNon = txtCourseNameNon.getText();
                    String duration_temp = txtDurationNon.getText();
                    String preRequisite = txtPreRequisiteNon.getText();
                    int duration = Integer.parseInt(duration_temp);
                    if (courseIDNon.isEmpty() || courseNameNon.isEmpty() || duration_temp.isEmpty() || preRequisite.isEmpty())
                    {
                        JOptionPane.showMessageDialog(f,"Text Field is missing");
                    }
                    else
                    {
                        for (Course a: nonAcademicCourseList)
                        {
                            if(courseIDNon.equals(a.getCourseID()))
                            {
                                JOptionPane.showMessageDialog(f,"This course Id is already added");
                                return;
                            }
                        }
                        NonAcademicCourse store = new NonAcademicCourse(courseIDNon, courseNameNon, duration, preRequisite);
                        nonAcademicCourseList.add(store); //store is a variable
                        JOptionPane.showMessageDialog(f,"Your records have been added succesfully.");
                    }
                }
            }
        );

        //actionlistener for register button of academicCourse
        btnRegister.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String courseLeader = txtCourseLeader.getText();
                    String lecturerName = txtLecturerName.getText();
                    String startingDate = txtStartingDate.getText();
                    String completionDate = txtCompletionDate.getText();

                    if (courseLeader.isEmpty() || lecturerName.isEmpty() || startingDate.isEmpty() || completionDate.isEmpty())
                    {
                        JOptionPane.showMessageDialog(f,"Text Field is empty.");
                    }
                    else
                    {
                        for (int i=0; i<academicCourseList.size(); i++)
                        {
                            if (academicCourseList.get(i).getCourseID().equals(txtCourseID.getText()))
                            {
                                AcademicCourse ac = (AcademicCourse) academicCourseList.get(i);
                                if (!ac.getIsRegistered())
                                {
                                    ac.register(courseLeader,lecturerName,startingDate,completionDate);
                                    JOptionPane.showMessageDialog(f,"Academic Course is registered.");
                                }
                                else if(ac.getIsRegistered())
                                {
                                    JOptionPane.showMessageDialog(f,"Academic CourseID is already Registered.");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(f,"Please Enter Valid Academic CourseID");
                                }
                            }
                        }
                    }
                }
            });

        //actionlistener for register button of non-academicCourse
        btnRegisterNon.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String courseLeaderNon = txtCourseLeaderNon.getText();
                    String instructorName = txtInstructorName.getText();
                    String examDate = txtExamDate.getText();
                    String startingDateNon = txtStartingDateNon.getText();
                    String completionDateNon = txtCompletionDateNon.getText();

                    if (courseLeaderNon.isEmpty() || instructorName.isEmpty() || examDate.isEmpty() || startingDateNon.isEmpty() || completionDateNon.isEmpty())
                    {
                        JOptionPane.showMessageDialog(f,"Text Field is empty.");
                    }
                    else
                    {
                        for (int i=0; i<nonAcademicCourseList.size(); i++)
                        {
                            if (nonAcademicCourseList.get(i).getCourseID().equals(txtCourseIDNon.getText()))
                            {
                                NonAcademicCourse nac = (NonAcademicCourse) nonAcademicCourseList.get(i);
                                if (!nac.getIsRegistered())
                                {
                                    nac.register(courseLeaderNon,instructorName,examDate,startingDateNon,completionDateNon);
                                    JOptionPane.showMessageDialog(f,"Non-Academic Course is registered.");
                                }
                                else if(nac.getIsRegistered())
                                {
                                    JOptionPane.showMessageDialog(f,"Non-Academic CourseID is already Registered.");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(f,"Non-Please Enter Valid Academic CourseID");
                                }
                            }
                        }
                    }
                }
            });

        //actionlistener for display button of Non-academicCourse
        btnDisplayNon.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    JFrame display = new JFrame("Non-Academic Course");
                    display.setBounds(100,50,1000,500); 

                    tableModelNon = new DefaultTableModel(); 
                    //table creation
                    tableNon = new JTable(tableModelNon); 
                    //columns in table
                    tableModelNon.addColumn("Course ID");
                    tableModelNon.addColumn("Course Name");
                    tableModelNon.addColumn("PreRequisite");
                    tableModelNon.addColumn("Duration");
                    tableModelNon.addColumn("Course Leader");
                    tableModelNon.addColumn("Instructor Name");
                    tableModelNon.addColumn("exam Date");
                    tableModelNon.addColumn("Starting Date");
                    tableModelNon.addColumn("Completion Date");

                    String rowTitleList[] = {"Course ID","Course Name","PreRequisite","Duration","Course Leader","Instructor Name","exam Date","Starting Date","Completion Date"};
                    tableModelNon.addRow(rowTitleList);
                    //for the rows of the table
                    for(int i = 0; i < nonAcademicCourseList.size(); i++){
                        NonAcademicCourse Nac = (NonAcademicCourse) (nonAcademicCourseList.get(i));
                        String courseIDNon = Nac.getCourseID();
                        String courseNameNon = Nac.getCourseName();
                        String preRequisite = Nac.getPreRequisite();
                        int durationNon_temp = Nac.getDuration();
                        String durationNon = Integer.toString(durationNon_temp);
                        String courseLeaderNon = Nac.getCourseLeader();
                        String instructor = Nac.getInstructorName();
                        String examDate = Nac.getExamDate();
                        String startingDateNon = Nac.getStartingDate();
                        String completionDateNon = Nac.getCompletionDate();
                        String tableRow[] = {courseIDNon, courseNameNon, preRequisite, durationNon, courseLeaderNon,instructor,examDate,startingDateNon,completionDateNon,};
                        tableModelNon.addRow(tableRow);

                    }             
                    display.add(tableNon);
                    display.setVisible(true);   
                }
            });

        //actionlistener for display button of academicCourse
        btnDisplay.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    JFrame display = new JFrame("Non-Academic Course");
                    display.setBounds(100,50,1000,500); 

                    tableModelAca = new DefaultTableModel(); 
                    //table creation
                    tableAca = new JTable(tableModelAca); 
                    //columns in table
                    tableModelAca.addColumn("Course ID");
                    tableModelAca.addColumn("Course Name");
                    tableModelAca.addColumn("Duration");
                    tableModelAca.addColumn("Level");
                    tableModelAca.addColumn("Credit");
                    tableModelAca.addColumn("NoOfAssesments");
                    tableModelAca.addColumn("Course Leader");
                    tableModelAca.addColumn("Lecturer Name");
                    tableModelAca.addColumn("Starting Date");
                    tableModelAca.addColumn("Completion Date");

                    String rowTitleList[] = {"Course ID","Course Name","Duration","Level","Credit", "NoOfAssesments","Course Leader","Lecturer Name","Starting Date","Completion Date"};
                    tableModelAca.addRow(rowTitleList);
                    //for the rows of the table
                    for(int i = 0; i < academicCourseList.size(); i++){
                        AcademicCourse ac = (AcademicCourse) (academicCourseList.get(i));
                        String courseID = ac.getCourseID();
                        String courseName = ac.getCourseName();
                        int duration_temp = ac.getDuration();
                        String duration = Integer.toString(duration_temp);
                        String level = ac.getLevel();
                        String credit = ac.getCredit();
                        int noOfAssesments_temp = ac.getNumberOfAssessments();
                        String noOfAssesments = Integer.toString(noOfAssesments_temp);  
                        String courseLeader = ac.getCourseLeader();
                        String lecturer = ac.getLecturerName();
                        String startingDate = ac.getStartingDate();
                        String completionDate = ac.getCompletionDate();
                        String tableRow[] = {courseID, courseName, duration, level, credit, noOfAssesments, courseLeader,lecturer, startingDate, completionDate,};
                        tableModelAca.addRow(tableRow);

                    }             
                    display.add(tableAca);
                    display.setVisible(true);   
                }
            });

        //Clear Text field of NonAcademicClass   
        btnClearNon.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    txtCourseIDNon.setText("");
                    txtCourseNameNon.setText("");
                    txtPreRequisiteNon.setText("");
                    txtDurationNon.setText("");
                    txtCourseLeaderNon.setText("");
                    txtInstructorName.setText("");
                    txtStartingDateNon.setText("");
                    txtCompletionDateNon.setText("");   
                    JOptionPane.showMessageDialog(f,"Text Field is clear");
                }
            });

        //Clear Text field of AcademicClass   
        btnClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    txtCourseID.setText("");
                    txtCourseName.setText("");
                    txtDuration.setText("");
                    txtLevel.setText("");
                    txtCredit.setText("");
                    txtNoOfAssesments.setText("");
                    txtCourseLeader.setText("");
                    txtLecturerName.setText("");
                    txtStartingDate.setText("");
                    txtCompletionDate.setText("");   
                    JOptionPane.showMessageDialog(f,"Text Field is clear");
                }
            });

        btnRemoveNon.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    // creating a local variable and storing the text field data 
                    String id = txtCourseIDNon.getText();
                    for(int i = 0; i < nonAcademicCourseList.size(); i++)
                    { 
                        //checking if the course id in the text fielkd matches to the one in the arraylist 
                        if(nonAcademicCourseList.get(i).getCourseID().equals(id))
                        {
                            //if the course id matches then storing that objects data in a newly created object of non academic course NAc 
                            NonAcademicCourse Nac = (NonAcademicCourse)(nonAcademicCourseList.get(i)); 
                            //checking if the course is removed ot not 
                            if(!Nac.getIsRemoved())
                            {
                                //if not removed then calling the remove method from the non acadmic course class 
                                nonAcademicCourseList.remove(Nac); 
                                JOptionPane.showMessageDialog(f, "The course with course ID "+ id + " has been removed successfully."); 
                                return; 
                            } 
                            else
                            {
                                JOptionPane.showMessageDialog(f, "The course has already been removed."); 
                                return; 
                            }
                        }
                    }   
                    JOptionPane.showMessageDialog(f, "The Non-Academic course is already removed.", "ALERT", JOptionPane.ERROR_MESSAGE); 
                    return; 
                } 
            });

        //exit AcademicCourse 
        btnExit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    fa.dispose();
                }
            });

        //exit Non-Academic Course
        btnExitNon.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    fna.dispose();
                }
            });
    }

    public static void main(String [] args) 
    {
        new INGCOLLEGE(); 
    }
}

