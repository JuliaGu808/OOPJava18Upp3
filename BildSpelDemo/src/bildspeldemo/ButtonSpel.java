/*
 * Java
 */
package bildspeldemo;

import java.awt.Font;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Julia
 */
public class ButtonSpel extends JFrame{
    public static JButton[][] createButton(int n){
        JButton[][] button = new JButton[n][n];
        int tt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                tt++;
                String ss = "" + tt;
                if(!(i== n-1 && j == n-1)){
                    button[i][j] = new JButton(ss);
                    button[i][j].setFont(new Font("Arial", Font.PLAIN, 20));
                } else {
                    button[i][j] = new JButton("");
                    button[i][j].setFont(new Font("Arial", Font.PLAIN, 20));
                }
                
            }
        }
        return button;
    }
    public static void blandButton(JButton[][] button){
        Random rani = new Random();
        JButton tmp = new JButton("tmp");

        for(int i=0; i<button.length; i++){
            int raninum = rani.nextInt(button.length);
            for(int j=0; j<button.length; j++){
                int ranjnum = rani.nextInt(button.length);
                if(i==raninum && j==ranjnum)
                    continue;

                tmp.setText(button[i][j].getText());
                button[i][j].setText(button[raninum][ranjnum].getText());
                button[raninum][ranjnum].setText(tmp.getText());
            }
        }          
    }
    public static boolean winButton(JButton[][] button){
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
                return true;
            }
        }
        return false;
    }
    
    public static void blandBPar(JButton[] button){
        ImageIcon imgsrc12 = new ImageIcon("src\\imgs\\num12.jpg");
        Image im12 = imgsrc12.getImage();
        int wwimg = 200;
        int hhimg = 200;
        Image imnew12 = im12.getScaledInstance(wwimg, hhimg, SCALE_SMOOTH);
        ImageIcon img12 = new ImageIcon(imnew12);  
        JButton testbb = new JButton(img12);
        Random rani = new Random();
        for(int i=0; i<button.length; i++){
            int raninum = rani.nextInt(button.length);
                if(i==raninum)
                    continue;
                testbb.setIcon(img12);
                testbb.setIcon(button[i].getIcon());
                button[i].setIcon(button[raninum].getIcon());
                button[raninum].setIcon(testbb.getIcon());
                testbb.setIcon(img12);
        }
    }    
}
