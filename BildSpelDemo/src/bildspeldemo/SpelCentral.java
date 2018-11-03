/*
 * Java
 */
package bildspeldemo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Julia
 */
public class SpelCentral extends JFrame implements ActionListener{
    JFrame frame = new JFrame();
    JPanel totalP = new JPanel();
    JPanel again = new JPanel();
    JPanel pane = new JPanel();
    JButton shuffle = new JButton("Nytt spel");
    JButton[][] button = null;
    
    public SpelCentral(int n){
        button = ButtonSpel.createButton(n);
        totalP.setLayout(new BorderLayout());
        again.setLayout(new GridLayout(10,1));
        again.setBorder(new EmptyBorder(5,5,5,5));
        again.add(shuffle);
        pane.setLayout(new GridLayout(n, n));

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                pane.add(button[i][j]);
            }
        }      
        do{
            ButtonSpel.blandButton(button);
        } while(ButtonSpel.winButton(button));
              
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                button[i][j].addActionListener(this);
            }
        }
        
        shuffle.addActionListener(onceagain ->{   //Lamda
            do{
                ButtonSpel.blandButton(button);
            } while(ButtonSpel.winButton(button));
            pane.setVisible(true);
        });
                
        pane.setPreferredSize(new Dimension(600, 600));
        totalP.add(pane, BorderLayout.CENTER);
        totalP.add(again, BorderLayout.WEST);
               
        frame.add(totalP);
        frame.pack();
        frame.setLocation(600, 50);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                
    }   //konstruktur
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jb = (JButton) e.getSource();
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button.length; j++){
                if(button[i][j].getText().equals("")){
                    for(int k=0; k<j; k++){     //e ligger left
                        if(button[i][k].getText().equals(jb.getText())){
                            while(k<j){
                                button[i][j].setText(button[i][--j].getText());
                                button[i][j].setText("");
                            }
                        }
                    }
                    for(int k=j+1; k<button.length; k++){     //e ligger right
                        if(button[i][k].getText().equals(jb.getText())){
                            for(int q=j; q<k;){
                                button[i][q].setText(button[i][++q].getText());
                                button[i][q].setText("");
                            }
                        }
                    }
                    for(int k=0; k<i; k++){     //e ligger uppe
                        if(button[k][j].getText().equals(jb.getText())){
                            while(k<i){
                                button[i][j].setText(button[--i][j].getText());
                                button[i][j].setText("");
                            }
                        }
                    }
                    for(int k=i+1; k<button.length; k++){     //e ligger nere
                        if(button[k][j].getText().equals(jb.getText())){
                            while(i<k){
                                button[i][j].setText(button[++i][j].getText());
                                button[i][j].setText("");
                            }
                        }
                    }
                }
            }
        }  
        if(ButtonSpel.winButton(button)){
            JOptionPane.showMessageDialog(null, "Grattis, du vann!");
            pane.setVisible(false);
        }
    }
}

