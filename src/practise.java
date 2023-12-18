import java.awt.*;
import java.awt.event.ActionListener;
// import java.awt.event.AdjustmentEvent;
// import java.awt.event.AdjustmentListener;
// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
// import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
// import javax.swing.JPasswordField;
// import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
// import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
// import javax.swing.SwingConstants;
// import javax.swing.event.CaretListener;
import javax.swing.border.Border;

public class practise {

    public practise() {
        try {

            // making the color chooser

            JButton b;
            JTextArea ta;

            b = new JButton("choose color");

            ta = new JTextArea();
            b.setBounds(10, 700, 200, 40);

            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Color c = JColorChooser.showDialog(b, "choose color", Color.CYAN);
                    ta.setBackground(c);
                }
            });

            // setting the jframe

            JFrame newfFrame = new JFrame();

            // making the menu bar in the top of the panel
            JMenu nMenu, subMenu, File;

            JMenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;

            nMenu = new JMenu("menu");

            nMenu.setBounds(700, 80, 0, 0);
            File = new JMenu("File");
            subMenu = new JMenu("submenu");

            JMenuBar newmenuBar = new JMenuBar();
            m1 = new JMenuItem("itam 1");
            m2 = new JMenuItem("item 2");
            m3 = new JMenuItem("item 3");
            m4 = new JMenuItem("item 4");
            m5 = new JMenuItem("item 5");

            m6 = new JMenuItem("item 6");
            m7 = new JMenuItem("item 7");
            m8 = new JMenuItem("item 8");
            m9 = new JMenuItem("open folder");
            m10 = new JMenuItem("open file");
            m11 = new JMenuItem("save this file");
            m12 = new JMenuItem("open file");

            // adding the menu on the items
            nMenu.add(m1);
            nMenu.add(m2);
            nMenu.add(m3);

            subMenu.add(m4);
            subMenu.add(m5);

            File.add(m6);

            File.add(m7);

            File.add(m8);

            newmenuBar.add(nMenu);
            nMenu.add(subMenu);
            nMenu.add(File);


            //adding the navbar on the bottom 

            JPanel newpPanelm = new JPanel(new BorderLayout());
           

            JButton b1,b2,b3;
            b1 = new JButton("open file");
            b2 = new JButton("save file");
            b3 = new JButton("support us");

            newpPanelm.add(b3,BorderLayout.SOUTH);
            newpPanelm.add(b2,BorderLayout.EAST);
            newpPanelm.add(b1,BorderLayout.EAST);

            

            
            

            



            // making the action listener when the button clicked
            m1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(m1, "the button 1 was clicked");
                }
            });

            m2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(m2, "the button 2 was clicked");
                }
            });

            m6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(m6, "the button 6 was clicked");
                }
            });

            // creating the another JMenu

            JMenu newJMenu2JMenu, visitJMenu, findUsJMenu, contaJMenu, feedbaJMenu;

            newJMenu2JMenu = new JMenu("File");
            visitJMenu = new JMenu("Save as");
            findUsJMenu = new JMenu("contact us");
            contaJMenu = new JMenu("find us");
            feedbaJMenu = new JMenu("sent feedback us..");

            newJMenu2JMenu.add(m9);
            newJMenu2JMenu.add(m10);

            visitJMenu.add(m11);
            visitJMenu.add(m12);

            // making the event listener for the m11 to directly save the file from ctrl s

            newmenuBar.add(newJMenu2JMenu);
            newmenuBar.add(contaJMenu);
            newmenuBar.add(visitJMenu);
            newmenuBar.add(findUsJMenu);
            newmenuBar.add(feedbaJMenu);

            // making the action listeter to save the file of the note pad

            // m9.addActionListener(new ActionListener() {
            // public void actionPerformed(ActionEvent e) {
            // try {
            // // opening the files

            // JFileChooser rfc = new JFileChooser();
            // int r = rfc.showOpenDialog(feedbaJMenu);

            // if (r == JFileChooser.APPROVE_OPTION) {

            // }

            // } catch (Exception a) {
            // System.out.println(a);
            // }
            // }
            // });
            // making the label for the navbar inconinage

            JLabel newjLabel = new JLabel();

            // making the scroll bar
            JScrollBar newsScrollBar = new JScrollBar();
            final JLabel newjJLabelsJLabel = new JLabel();

            newjJLabelsJLabel.setHorizontalAlignment(JLabel.CENTER);
            newjJLabelsJLabel.setFont(new Font("serif", Font.PLAIN, 20));
            newjJLabelsJLabel.setForeground(Color.white);
            newjJLabelsJLabel.setBounds(300, 100, 200, 200);
            newjJLabelsJLabel.setSize(400, 100);

            // setting the biounds of the schroll bar
            newsScrollBar.setBounds(400, 200, 200, 100);

            // adding the image icon

            newfFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            newfFrame.setTitle("Notepad ");
            newfFrame.setSize(700, 700);
            newfFrame.setLayout(null);
            newfFrame.setVisible(true);

            newjLabel.setVisible(true);
            ImageIcon newiImageIcon = new ImageIcon("D:\\java_projects\\first\\src\\notepad.png");
            newjLabel.setIcon(newiImageIcon);
            newfFrame.setIconImage(newiImageIcon.getImage());
            newfFrame.getContentPane().setBackground(Color.white);

            // now making the login form with the username and the passsword box

            // making the usernae field

            // setting the label
            JLabel newjlabel2 = new JLabel("username");
            newjlabel2.setBounds(20, 10, 100, 200);
            newjlabel2.setFont(new Font("serif", Font.PLAIN, 20));

            JTextField newfField = new JTextField();
            // setting the bounds
            newfField.setBounds(100, 90, 200, 40);

            // making the password filed

            // making the event listener

            // setting the action liestener for the schroll bar
           

            // making the component

            JTextArea newJTextArea = new JTextArea(500, 500);
            // JPanel newpPanel = new JPanel();
            // newpPanel.add(newJTextArea);

            JTextArea newtTextArea1 = new JTextArea();
            JTextArea newtTextArea2 = new JTextArea();
            JTextArea newtTextArea3 = new JTextArea();
            JTextArea newtTextArea4 = new JTextArea();
            JTextArea newtTextArea5 = new JTextArea();
            JTextArea newtTextArea6 = new JTextArea();

          
            newtTextArea1.add(newJTextArea);
            newtTextArea2.add(newJTextArea);
            newtTextArea3.add(newJTextArea);

            newtTextArea4.add(newJTextArea);
            newtTextArea5.add(newJTextArea);
            newtTextArea6.add(newJTextArea);

            m9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent b) {
                    JFileChooser chooser = new JFileChooser();
                    int i = chooser.showSaveDialog(chooser);

                    if (i != JFileChooser.APPROVE_OPTION)
                        return;
                    try {
                        BufferedWriter bf = new BufferedWriter(new FileWriter(chooser.getSelectedFile() + ".txt"));
                        bf.write(newtTextArea1.getText());
                        bf.flush();
                        bf.close();

                    } catch (Exception a) {
                        System.out.println(a);
                    }
                }
            });

            // action listener

            // JPanel newpPanel2 = new JPanel();
            // JPanel newpPanel3 = new JPanel();

            JTabbedPane tp = new JTabbedPane();

            tp.setBounds(10, 20, 1510, 650);
            tp.add("Tab one", newtTextArea1);
            tp.add("Tab two", newtTextArea2);
            tp.add("Tab three", newtTextArea3);
            tp.add("Tab four", newtTextArea4);
            tp.add("Tab five", newtTextArea5);
            tp.add("Tab six", newtTextArea6);

            // adding the component

            newfFrame.add(newjLabel);

            newfFrame.add(tp);

            newfFrame.setJMenuBar(newmenuBar);
            newfFrame.add(b);
            newfFrame.add(ta);
            newfFrame.add(b3);
  


            newfFrame.add(newpPanelm);


            m11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent r) {
                    try {

                        // making the jframe
                        JFrame f = new JFrame();

                        JPanel pane = new JPanel();

                        // for the seperator

                        // making the jlabel
                        JLabel l = new JLabel();
                        l.setText("Enter File Name");
                        JLabel l1 = new JLabel("Choose a Location");
                        l1.setBounds(100, 180, 200, 60);

                        // setting the image in the saving the document

                        ImageIcon image = new ImageIcon("D:\\java_projects\\first\\src\\folder.png");
                        JLabel k = new JLabel("", image, JLabel.CENTER);
                        k.setBounds(100, 240, 20, 40);
                        k.setSize(35, 40);
                        // Image newiImage = image.getImage().getScaledInstance(25, 40,
                        // Image.SCALE_DEFAULT);
                        f.setIconImage(image.getImage());

                        // making the button to save the file directly in the file by selecting the file
                        // and folder locations
                        JButton B = new JButton();
                        B.setText("Documents");
                        B.setBounds(140, 240, 360, 40);

                        // JLabel label = new JLabel("no selected file");
                        // label.setBounds(100, 300, 200, 40);

                        // adding the button

                        JButton btn = new JButton("Save");
                        JButton btnn = new JButton("Cancel");

                        btn.setBounds(100, 350, 180, 40);
                        btnn.setBounds(300, 350, 200, 40);

                        pane.add(btn);
                        pane.add(btnn);

                        // making the action listener while clicking the documents button

                        B.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent t) {
                                try {
                                    // making the file chooser
                                    JFileChooser r = new JFileChooser();
                                    int m = r.showSaveDialog(r);

                                    if (m != JFileChooser.APPROVE_OPTION)
                                        return;

                                    BufferedWriter bf = new BufferedWriter(
                                            new FileWriter(r.getSelectedFile() + ".html"));
                                    bf.write(newtTextArea1.getText());
                                    bf.write(newtTextArea2.getText());
                                    bf.write(newtTextArea3.getText());
                                    bf.write(newtTextArea4.getText());
                                    bf.write(newtTextArea5.getText());
                                    bf.write(newtTextArea6.getText());

                                    bf.flush();
                                    bf.close();

                                } catch (Exception e) {
                                    System.out.println(e);
                                }
                            }
                        });

                        // setting the bounds
                        l.setBounds(100, 50, 200, 60);

                        f.setTitle("saving the file");
                        f.setVisible(true);
                        f.setSize(500, 500);
                        f.setBounds(100, 200, 800, 500);

                        f.setLayout(null);

                        // making the checkbox to enter the filename and save the document that wriitten
                        // in the text box

                        JTextField tt = new JTextField("Presentation1");

                        tt.setBounds(100, 100, 400, 40);

                        // adding the another listener for the save button

                        btn.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent m) {
                                if (tt.getText().length() <= 0) {
                                    JOptionPane.showMessageDialog(btn, "file not saved");
                                } else {
                                    JOptionPane.showMessageDialog(btn, "file saved sucess");
                                }
                            }
                        });

                        // adding the listener for the closure for the close button

                        btnn.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent m) {
                                System.exit(1);
                            }
                        });

                        // adding the elements

                        f.add(tt);
                        f.add(l);
                        f.add(l1);
                        f.add(k);
                        f.add(B);
                        // f.add(label);
                        f.add(btn);
                        f.add(btnn);
                        f.add(pane);

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            });

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        practise newpPractise = new practise();
        System.out.println(newpPractise);

    }
}
