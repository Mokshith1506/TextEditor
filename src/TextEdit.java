import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;

public class TextEdit extends JFrame implements ActionListener {
    JTextArea textArea;
    JScrollPane scrollPane;
    JSpinner fontSizeSpinner;
    JLabel fontLabel;

    //Create a constructor
    TextEdit(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Bro Text Editor");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        //Creating the text area on the window created above
        textArea = new JTextArea();
        //textArea.setPreferredSize(new Dimension(470,500));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial",Font.PLAIN,20));

        //Creating a scroll pane
        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(450,450));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        fontLabel =new JLabel("Font: ");


        //Give the user the flexibility to resize the font size
        fontSizeSpinner = new JSpinner();
        fontSizeSpinner.setPreferredSize(new Dimension(50,25));
        fontSizeSpinner.setValue(20);
        fontSizeSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                textArea.setFont(new Font(textArea.getFont().getFamily(),Font.PLAIN,(int) fontSizeSpinner.getValue()));
            }
        });
        this.add(fontLabel);
        this.add(fontSizeSpinner);
        this.add(scrollPane);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }

}
