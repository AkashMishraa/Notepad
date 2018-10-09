import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Notpad extends JFrame{

  JRootPane root;

  JMenuBar mb;
  JMenu fileMenu, editMenu, formatMenu;
  JMenuItem fNew, fOpen,fSave,fClose,fExit;
  JMenuItem eCut,eCopy,ePaste;
  JMenuItem formatSetting, formatWordWrap;

  JTextArea tArea;
  JScrollPane sc;

  JFileChooser file;

  Container con;

  public Notpad(){


    fNew = new JMenuItem("New");
    fOpen = new JMenuItem("Open");
    fSave = new JMenuItem("Save");
    fClose = new JMenuItem("Close");
    fExit = new JMenuItem("Exit");

    eCut = new JMenuItem("Cut");
    eCopy = new JMenuItem("Copy");
    ePaste = new JMenuItem("Paste");

    formatSetting = new JMenuItem("Setting");
    formatWordWrap = new JMenuItem("Word Wrap");

    fileMenu = new JMenu("File");
    editMenu = new JMenu("Edit");
    formatMenu = new JMenu("Format");


    mb = new JMenuBar();

    tArea = new JTextArea();
    sc = new JScrollPane(tArea);
    //sc.add();

    con = getContentPane();
    //con.add(tArea);
    con.add(sc);

    root = new JRootPane();

  /* Method Depricated in */
  //  root.setMenuBar(mb);

    setJMenuBar(mb);

    mb.add(fileMenu);
    mb.add(editMenu);
    mb.add(formatMenu);

    fileMenu.add(fNew);
    fileMenu.add(fOpen);
    fileMenu.add(fSave);
    fileMenu.add(fClose);
    fileMenu.add(fExit);

    editMenu.add(eCut);
    editMenu.add(eCopy);
    editMenu.add(ePaste);

    formatMenu.add(formatSetting);
    formatMenu.add(formatWordWrap);

    fNew.addActionListener(new ActionListener(){

      public void actionPerformed(ActionEvent e){

        file = new JFileChooser();
        Object obj = e.getSource();
        if(obj == fNew)
          tArea.setText("");
      }
    });

    fOpen.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        file = new JFileChooser();
        Object obj = e.getSource();
        if(obj == fOpen){
          file.showOpenDialog(null);
        }
      }
    });

    fSave.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        file  = new JFileChooser();
        Object obj = e.getSource();
        if(obj == fSave){
          file.showSaveDialog(null);
        }
      }
    });

    fClose.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == fClose){

      hide();
        }
      }
    });

    fExit.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == fExit){
          dispose();
        }
      }
    });

    eCopy.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == eCopy){
          tArea.copy();
        }
      }
    });

    eCut.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == eCut){
          tArea.cut();
        }
      }
    });

    ePaste.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == ePaste){
          tArea.paste();
        }
      }
    });

    //Exit_ON_CLOSE();
  }
}
