/*
 * Java
 */
package bildspeldemo;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Julia
 */
public class PanelSpel extends JFrame{
    public static JPanel cratePanel(int n){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(n, n));
        return p;
    }
    public static JPanel orderPanel(JPanel panel, int n){
        String[][] orderP = new String[n][n];
        int index = 0;
        int order = 100;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                String num = "" + order;
                orderP[i][j] = num;
                panel.getComponent(index).setName(orderP[i][j]);
                order += 1;
                index += 1;
            }
            order += 1;
        }
        return panel;
    }
}    
