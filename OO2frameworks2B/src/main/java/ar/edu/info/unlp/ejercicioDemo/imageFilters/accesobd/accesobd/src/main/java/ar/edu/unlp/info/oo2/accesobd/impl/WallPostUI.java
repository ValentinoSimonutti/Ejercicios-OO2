package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.impl;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;



public class WallPostUI {

  private WallPost wallPost;
  private JTextArea textArea;
  private JLabel featuredLabelTitle;
  private JCheckBox featuredCheckbox;
  private JLabel likesLabelTitle;
  private JLabel likesLabel;
  private JButton like; 
  private JButton dislike; 
  private JFrame window;
  
  
  private static final Logger uiLogger = Logger.getLogger("WallPostUI");

  static {
      try {
          FileHandler fileHandler = new FileHandler("ui.log", true);
          fileHandler.setFormatter(new JsonFormatter());
          uiLogger.addHandler(fileHandler);
          uiLogger.setUseParentHandlers(false);
      } catch (IOException e) {
          e.printStackTrace();
      }
  }

  public WallPostUI() {
	uiLogger.info("Inicio de la aplicación WallPost");  
    this.wallPost = new WallPostImpl();
    this.textArea = new JTextArea();
    this.featuredLabelTitle = new JLabel("Featured");
    this.featuredCheckbox = new JCheckBox();
    this.likesLabelTitle = new JLabel("Likes");
    this.like = new JButton("Like");
    this.likesLabel = new JLabel();
    this.dislike = new JButton("Dislike");
    this.window = new JFrame("WallPost");
    this.setUpWindow();
    this.wireComponents();
    this.window.setVisible(true);
  }
  
  private void setUpWindow() {
    JPanel pane = new JPanel();
    this.window.getContentPane().add(pane);
    this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.window.setSize(640, 480);
    pane.setLayout(new GridLayout(5,1,1,10));
    pane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
   
    JScrollPane scrollPane = new JScrollPane(this.textArea);
    pane.add(scrollPane);
    this.textArea.setEditable(true);
    this.textArea.setLineWrap(true);
    this.textArea.setWrapStyleWord(true);
    
    JPanel featuredPane = new JPanel();
    featuredPane.setLayout(new GridLayout(1, 2));
    featuredPane.add(this.featuredLabelTitle);
    featuredPane.add(this.featuredCheckbox);
    pane.add(featuredPane);
    
    JPanel likesPane = new JPanel();
    likesPane.setLayout(new GridLayout(1, 2));
    likesPane.add(this.likesLabelTitle);
    likesPane.add(this.likesLabel);
    likesLabel.setText("0");
    pane.add(likesPane);
    
    JPanel likeButtonsPane = new JPanel();
    likeButtonsPane.setLayout(new GridLayout(1, 2));
    likeButtonsPane.add(this.like);
    likeButtonsPane.add(this.dislike);
    pane.add(likeButtonsPane);
  
    this.window.pack();
  }
  
  private void wireComponents() {
	    this.like.addActionListener(e -> {
	        this.wallPost.like();
	        this.likesLabel.setText(String.valueOf(this.wallPost.getLikes()));
	        uiLogger.info("Click en Like");
	    });

	    this.dislike.addActionListener(e -> {
	        this.wallPost.dislike();
	        this.likesLabel.setText(String.valueOf(this.wallPost.getLikes()));
	        uiLogger.info("Click en Dislike");
	    });

	    this.featuredCheckbox.addActionListener(e -> {
	        this.wallPost.toggleFeatured();
	        uiLogger.info("Click en Featured: " + (this.featuredCheckbox.isSelected() ? "activado" : "desactivado"));
	    });

	    this.textArea.getDocument().addDocumentListener(new DocumentListener() {

	        @Override
	        public void removeUpdate(DocumentEvent e) {
	            wallPost.setText(textArea.getText());
	            uiLogger.info("Texto del post modificado (remove)");
	        }

	        @Override
	        public void insertUpdate(DocumentEvent e) {
	            wallPost.setText(textArea.getText());
	            uiLogger.info("Texto del post modificado (insert)");
	        }

	        @Override
	        public void changedUpdate(DocumentEvent e) {
	            wallPost.setText(textArea.getText());
	            uiLogger.info("Texto del post modificado (change)");
	        }
	    });
	}

}
