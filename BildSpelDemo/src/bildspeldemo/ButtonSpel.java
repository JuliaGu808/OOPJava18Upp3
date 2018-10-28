/*
 * Java
 */
package bildspeldemo;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Julia
 */
public class ButtonSpel extends JFrame{
    public static JButton test = new JButton("test");

    public static JButton[][] createButton(int n){
        JButton[][] button = new JButton[n][n];
        int tt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                tt++;
                String ss = "" + tt;
                button[i][j] = new JButton(ss);
            }
        }
        return button;
    }
    public static void blandB(JButton[][] button){
        Random rani = new Random();
        Random ranj = new Random();
        for(int i=0; i<button.length; i++){
            int raninum = rani.nextInt(button.length);
            for(int j=0; j<button.length; j++){
                int ranjnum = ranj.nextInt(button.length);
                if(i==raninum && j==ranjnum)
                    continue;
                test.setText("test");
                test.setText(button[i][j].getText());
                button[i][j].setText(button[raninum][ranjnum].getText());
                button[raninum][ranjnum].setText(test.getText());
                test.setText("test");
            }
        }          
    }
    public static void winButton(JButton[][] button){
        int total= 0;
        int number=0;       
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button.length; j++){
                number++;
                String str = "" + number;
                if(button[i][j].getText().equals(str))
                    total++;
            }
            if(total == button.length*button.length -1){
                JOptionPane.showMessageDialog(null, "YOU WIN!!!!");
            }
        }           
    }
}
