/*
 * Java
 */
package bildspeldemo;

import java.awt.GridLayout;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Julia
 */
public class BildSpel extends JFrame implements ActionListener{
    JFrame f = new JFrame();
    JPanel pagain = new JPanel();
    JPanel pimg = new JPanel();
    JPanel ptogether = new JPanel();
//    Vector<String> imgcatch = new Vector<>();
    
    ImageIcon imgsrc1 = new ImageIcon("src\\imgs\\num1.jpg");
    int himg = 200;
    int wimg = 200;
    Image im1 = imgsrc1.getImage();
    Image imnew1 = im1.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img1 = new ImageIcon(imnew1);
    ImageIcon imgsrc2 = new ImageIcon("src\\imgs\\num2.jpg");
    Image im2 = imgsrc2.getImage();
    Image imnew2 = im2.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img2 = new ImageIcon(imnew2);
    ImageIcon imgsrc3 = new ImageIcon("src\\imgs\\num3.png");
    Image im3 = imgsrc3.getImage();
    Image imnew3 = im3.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img3 = new ImageIcon(imnew3);
    ImageIcon imgsrc4 = new ImageIcon("src\\imgs\\num4.png");
    Image im4 = imgsrc4.getImage();
    Image imnew4 = im4.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img4 = new ImageIcon(imnew4);
    ImageIcon imgsrc5 = new ImageIcon("src\\imgs\\num5.png");
    Image im5 = imgsrc5.getImage();
    Image imnew5 = im5.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img5 = new ImageIcon(imnew5);
    ImageIcon imgsrc6 = new ImageIcon("src\\imgs\\num6.png");
    Image im6 = imgsrc6.getImage();
    Image imnew6 = im6.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img6 = new ImageIcon(imnew6);
    ImageIcon imgsrc7 = new ImageIcon("src\\imgs\\num7.png");
    Image im7 = imgsrc7.getImage();
    Image imnew7 = im7.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img7 = new ImageIcon(imnew7);
    ImageIcon imgsrc8 = new ImageIcon("src\\imgs\\num8.jpg");
    Image im8 = imgsrc8.getImage();
    Image imnew8 = im8.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img8 = new ImageIcon(imnew8);
    ImageIcon imgsrc9 = new ImageIcon("src\\imgs\\num9.png");
    Image im9 = imgsrc9.getImage();
    Image imnew9 = im9.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img9 = new ImageIcon(imnew9);
    ImageIcon imgsrc10 = new ImageIcon("src\\imgs\\num10.jpg");
    Image im10 = imgsrc10.getImage();
    Image imnew10 = im10.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img10 = new ImageIcon(imnew10);
    ImageIcon imgsrc11 = new ImageIcon("src\\imgs\\num11.png");
    Image im11 = imgsrc11.getImage();
    Image imnew11 = im11.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img11 = new ImageIcon(imnew11);
    ImageIcon imgsrc12 = new ImageIcon("src\\imgs\\num12.jpg");
    Image im12 = imgsrc12.getImage();
    int wwimg = 200;
    int hhimg = 200;
    Image imnew12 = im12.getScaledInstance(wwimg, hhimg, SCALE_SMOOTH);
    ImageIcon img12 = new ImageIcon(imnew12);
    ImageIcon imgsrc13 = new ImageIcon("src\\imgs\\num13.png");
    Image im13 = imgsrc13.getImage();
    Image imnew13 = im13.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img13 = new ImageIcon(imnew13);
    ImageIcon imgsrc14 = new ImageIcon("src\\imgs\\num14.png");
    Image im14 = imgsrc14.getImage();
    Image imnew14 = im14.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img14 = new ImageIcon(imnew14);
    ImageIcon imgsrc15 = new ImageIcon("src\\imgs\\num15.png");
    Image im15 = imgsrc15.getImage();
    Image imnew15 = im15.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img15 = new ImageIcon(imnew15);
    ImageIcon imgsrc16 = new ImageIcon("src\\imgs\\num16.png");
    Image im16 = imgsrc16.getImage();
    Image imnew16 = im16.getScaledInstance(wimg, himg, SCALE_SMOOTH);
    ImageIcon img16 = new ImageIcon(imnew16);
    ImageIcon testimg = new ImageIcon("");
    JButton pic1 = new JButton(img1);
    JButton pic2 = new JButton(img2);
    JButton pic3 = new JButton(img3);
    JButton pic4 = new JButton(img4);
    JButton pic5 = new JButton(img5);
    JButton pic6 = new JButton(img6);
    JButton pic7 = new JButton(img7);
    JButton pic8 = new JButton(img8);
    JButton pic9 = new JButton(img1);
    JButton pic10 = new JButton(img2);
    JButton pic11 = new JButton(img3);
    JButton pic12 = new JButton(img4);
    JButton pic13 = new JButton(img5);
    JButton pic14 = new JButton(img6);
    JButton pic15 = new JButton(img7);
    JButton pic16 = new JButton(img8);
    JButton testb1 = new JButton(img10);
    JButton testb2 = new JButton(img11);
    JLabel test1 = new JLabel(img16);
    JLabel test2 = new JLabel(img16);
    JLabel test3 = new JLabel(img16);
    JLabel test4 = new JLabel(img16);
    JLabel test5 = new JLabel(img16);
    JLabel test6 = new JLabel(img16);
    JLabel test7 = new JLabel(img16);
    JLabel test8 = new JLabel(img16);
    JLabel test9 = new JLabel(img16);
    JLabel test10 = new JLabel(img16);
    JLabel test11 = new JLabel(img16);
    JLabel test12 = new JLabel(img16);
    JLabel test13 = new JLabel(img16);
    JLabel test14 = new JLabel(img16);
    JLabel test15 = new JLabel(img16);
    JLabel test16 = new JLabel(img16);
    JLabel testn1 = new JLabel(img10);
    JLabel testn2 = new JLabel(img11);
    JLabel[] testL = {test1, test2, test3, test4, test5, test6, test7, test8, 
                      test9, test10, test11, test12, test13, test14, test15, test16};
    JButton[] ettParB = {testb1, testb2};
    int n =1;
    
    JButton[] allButton = {pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8, pic9,
        pic10, pic11, pic12, pic13, pic14, pic15, pic16};
    

    BildSpel(){
        ButtonSpel.blandBPar(allButton);
        pimg.setLayout(new GridLayout(4, 4));
        for(int i=0; i<allButton.length; i++){
            allButton[i].setName("" + i);
            allButton[i].add(testL[i]);
            pimg.add(allButton[i]);
            allButton[i].addMouseListener(musLyss);
        }
        testb1.setName("100");
        testb1.setName("200");
        ptogether.add(pimg);
        f.add(ptogether);
        f.pack();
        f.setLocation(600, 50);
        f.setVisible(true);
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    MouseAdapter musLyss = new MouseAdapter() {

        @Override
        public void mouseReleased(MouseEvent e){
            int t = Integer.parseInt(e.getComponent().getName().trim());
            testL[t].setIcon(img16);
        }
        
        @Override
        public void mousePressed(MouseEvent e){
            int t = Integer.parseInt(e.getComponent().getName().trim());
            testL[t].setIcon(allButton[t].getIcon());
            int m = n%2;
            n++;
            ettParB[m] = allButton[t];
            if(ettParB[0].getIcon().equals(ettParB[1].getIcon()) &&
                    (allButton[t].equals(ettParB[0]) ^ allButton[t].equals(ettParB[1]))){
                allButton[t].remove(testL[t]);
                for(int i=0; i<allButton.length; i++){
                    if(i != t && allButton[i].getIcon().equals(allButton[t].getIcon()))
                        allButton[i].remove(testL[i]);
                }
            }
        }
    };     

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
