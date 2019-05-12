package com.uyghurschool.learnjava.graphics;

import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class NotePad extends JFrame implements ActionListener {
    //define a Text Area
    JTextArea textArea;
    //define a Frame
    JFrame frame;
    public NotePad()
    {
        //create a new frame
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java Text Editor - Uyghur School");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedLookAndFeelException e)
        {
            e.printStackTrace();
        }
        textArea=new JTextArea();
        //create a menu bar
        JMenuBar menuBar=new JMenuBar();
        frame.setJMenuBar(menuBar);
        //create menu
        JMenu fileMenu=new JMenu("File");
        //create menu item
        JMenuItem open=new JMenuItem("Open");
        JMenuItem save=new JMenuItem("Save");
        JMenuItem newfile=new JMenuItem("New");
        JMenuItem close=new JMenuItem("Close");
        //add menu item to menu
        fileMenu.add(newfile);
        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.add(close);
        //add menu to menu bar
        menuBar.add(fileMenu);
        //Add action listener
        newfile.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        close.addActionListener(this);
        frame.add(textArea);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        String s=event.getActionCommand();
        if(s.equalsIgnoreCase("save"))
        {
            //define a file chooser
            JFileChooser jFileChooser=new JFileChooser("c:\\Users\\seleniummaster");
            //show the file chooser save window
            int r=jFileChooser.showSaveDialog(null);
            if(r==JFileChooser.APPROVE_OPTION)
            {
                //set File Path
                File file=new File(jFileChooser.getSelectedFile().getAbsolutePath());
                try {
                    FileUtils.write(file, textArea.getText());
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
        else if(s.equalsIgnoreCase("open"))
        {
            //Create a file choose object instance
            JFileChooser fileChooser=new JFileChooser("c:\\Users\\seleniummaster");
            //open the show dialog
            int r=fileChooser.showOpenDialog(null);
            //if the user selects a file
            if(r==JFileChooser.APPROVE_OPTION)
            {
                //set the label to the path of the selected directory
                File openFile=new File(fileChooser.getSelectedFile().getAbsolutePath());
                try{
                    textArea.setText(FileUtils.readFileToString(openFile));
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
        else if(s.equalsIgnoreCase("new"))
        {
            textArea.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(frame,"The user close the application");
            System.exit(0);
        }
    }
}
