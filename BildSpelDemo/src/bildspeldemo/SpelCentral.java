/*
 * Java
 */
package bildspeldemo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Julia
 */
public class SpelCentral extends JFrame implements ActionListener{
    JFrame fram = new JFrame();
    JPanel totalP = new JPanel();
    JPanel again = new JPanel();
    JButton bland = new JButton("once again");
    JButton[][] button =null;
    public SpelCentral(int n){
        button = ButtonSpel.createButton(n);
        totalP.setLayout(new BorderLayout());
        again.setLayout(new FlowLayout());
        again.add(bland);
        JPanel pane = PanelSpel.cratePanel(n);
        button[n-1][n-1].setText("");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                pane.add(button[i][j]);
            }
        }
        ButtonSpel.blandB(button);
        pane = PanelSpel.orderPanel(pane, n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                button[i][j].addActionListener(this);
            }
        }
        bland.addActionListener(onceagain ->{
            ButtonSpel.blandB(button);
        });
        pane.setPreferredSize(new Dimension(500, 500));
        totalP.add(pane, BorderLayout.CENTER);
        totalP.add(again, BorderLayout.WEST);
        fram.add(totalP);
        fram.pack();
        fram.setLocation(600, 50);
        fram.setVisible(true);
        fram.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }   //konstruktur
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getSource().toString();
        s = s.substring(20, 23);
        int n = Integer.parseInt(s);
        int m =0;
        int upp=0;
        int ner=0;
        int left=0;
        int right=0;
        if(n>=100 && n<500){
            for(int i=0; i<button.length; i++){
                for(int j=0; j<button.length; j++){
                    if(button[i][j].getText().equals("")){
                        m = Integer.parseInt(button[i][j].getName());
                        left = Integer.parseInt(button[i][0].getName());
                        right = Integer.parseInt(button[i][button.length-1].getName());
                        while(n>=left && n<m){
                            button[i][j].setText(button[i][--j].getText());
                            button[i][j].setText("");
                            n++;
                        }
                        while(n>m && n<=right){
                            button[i][j].setText(button[i][++j].getText());
                            button[i][j].setText("");
                            n--;
                        }
                        if(n>right){
                            for(int k=i+1; k<button.length; k++){
                                ner=Integer.parseInt(button[k][j].getName()); 
                                if(n==ner){
                                    for(int p=i; p<k; p++){
                                        button[p][j].setText(button[p+1][j].getText());
                                        button[p+1][j].setText("");
                                    }
                                }
                            }
                        }
                        if(n<left){
                            for(int k=i-1; k>=0; k--){
                                upp=Integer.parseInt(button[k][j].getName()); 
                                if(n==upp){
                                    for(int p=i; p>k; p--){
                                        button[p][j].setText(button[p-1][j].getText());
                                        button[p-1][j].setText("");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ButtonSpel.winButton(button);          
    }
}

