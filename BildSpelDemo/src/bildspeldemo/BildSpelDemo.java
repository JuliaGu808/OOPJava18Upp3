/*
 * Java
 */

package bildspeldemo;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class BildSpelDemo {
    public BildSpelDemo(){
        boolean again = true;
        int row = 0;
        String input = JOptionPane.showInputDialog("How many rows?(2-10)");
        while(again){
            try{
                if(input==null || input.trim().equals(""))
                    System.exit(0);
                row = Integer.parseInt(input);
                if(row>=2 && row<=10)
                    again = false;
                else{
                    input = JOptionPane.showInputDialog("Write number 2 to 10 !");
                    again = true;
                }        
            }
            catch(NumberFormatException exc){
                input = JOptionPane.showInputDialog("Write number 2 to 10 !");
                again = true;
            }
        }
        
        SpelCentral sc = new SpelCentral(row);
    }
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable(){
//            public void run(){
//                new BildSpelDemo();
//            }    
//        });  
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new BildSpel();
            }    
        });  
    }
    

}
