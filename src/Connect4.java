import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Connect4 extends JFrame {
    private JPanel pnlMain;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;
    private JLabel lbl9;
    private JLabel lbl10;
    private JLabel lbl11;
    private JLabel lbl12;
    private JLabel lbl13;
    private JLabel lbl14;
    private JLabel lbl15;
    private JLabel lbl16;
    private JLabel lbl17;
    private JLabel lbl18;
    private JLabel lbl19;
    private JLabel lbl20;
    private JLabel lbl21;
    private JLabel lbl22;
    private JLabel lbl23;
    private JLabel lbl24;
    private JLabel lbl25;
    private JLabel lbl26;
    private JLabel lbl27;
    private JLabel lbl28;
    private JLabel lbl29;
    private JLabel lbl30;
    private JLabel lbl31;
    private JLabel lbl32;
    private JLabel lbl33;
    private JLabel lbl34;
    private JLabel lbl35;
    private JLabel lbl36;
    private JLabel lbl37;
    private JLabel lbl38;
    private JLabel lbl39;
    private JLabel lbl40;
    private JLabel lbl41;
    private JLabel lbl42;
    private JLabel lblTop;
    private JButton btnGame;
    private JLabel lblP1;
    private JLabel lblP2;
    private JLabel lblTie;
    private List<JLabel> col1;
    private List<JLabel> col2;
    private List<JLabel> col3;
    private List<JLabel> col4;
    private List<JLabel> col5;
    private List<JLabel> col6;
    private List<JLabel> col7;
    private List<JLabel> lstWin;
    private ImageIcon cirPurple;
    private ImageIcon cirOrange;
    private ImageIcon iconConnect4;
    private ImageIcon cirOutline;
    private Boolean inPlay = false;
    private Boolean turnP1;
    private Boolean win = false;
    private int winsP1 = 0;
    private int winsP2 = 0;
    private int numTies = 0;
//    Circle circle;


    Connect4() {
        this.setContentPane(pnlMain);

//      * * * * * * Set up columns * * * * * *
        col1 = new ArrayList<>();
        col1.add(lbl1);
        col1.add(lbl2);
        col1.add(lbl3);
        col1.add(lbl4);
        col1.add(lbl5);
        col1.add(lbl6);

        col2 = new ArrayList<>();
        col2.add(lbl7);
        col2.add(lbl8);
        col2.add(lbl9);
        col2.add(lbl10);
        col2.add(lbl11);
        col2.add(lbl12);

        col3 = new ArrayList<>();
        col3.add(lbl13);
        col3.add(lbl14);
        col3.add(lbl15);
        col3.add(lbl16);
        col3.add(lbl17);
        col3.add(lbl18);

        col4 = new ArrayList<>();
        col4.add(lbl19);
        col4.add(lbl20);
        col4.add(lbl21);
        col4.add(lbl22);
        col4.add(lbl23);
        col4.add(lbl24);

        col5 = new ArrayList<>();
        col5.add(lbl25);
        col5.add(lbl26);
        col5.add(lbl27);
        col5.add(lbl28);
        col5.add(lbl29);
        col5.add(lbl30);

        col6 = new ArrayList<>();
        col6.add(lbl31);
        col6.add(lbl32);
        col6.add(lbl33);
        col6.add(lbl34);
        col6.add(lbl35);
        col6.add(lbl36);

        col7 = new ArrayList<>();
        col7.add(lbl37);
        col7.add(lbl38);
        col7.add(lbl39);
        col7.add(lbl40);
        col7.add(lbl41);
        col7.add(lbl42);

        lstWin = new ArrayList<>();
        
        lblP1.setText("Player 1:  " + winsP1);
        lblP2.setText("Player 2:  " + winsP2);

//        * * * Set up Images with columns starting out as outline * * *
        cirOrange = new ImageIcon("src/circle-orange.png");
        cirPurple = new ImageIcon("src/circle-purple.png");
        cirOutline = new ImageIcon("src/circle-outline.png");
        Image cirOrangeScaled = cirOrange.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        cirOrange = new ImageIcon(cirOrangeScaled);

        Image cirPurpleScaled = cirPurple.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        cirPurple = new ImageIcon(cirPurpleScaled);

        Image cirOutlineScaled = cirOutline.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        cirOutline = new ImageIcon(cirOutlineScaled);


//        * * * Starts the screen out with circle outlines * * *
        newGame();

        iconConnect4 = new ImageIcon("src/connect-four.png");
        this.setIconImage(iconConnect4.getImage());

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

//       * * * * * *  Action Listeners * * * * * *
        btnGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Commented out if statement until I decide what to do when pressing "End Game"
//                if (!inPlay) {
                    double random = Math.random();
                    System.out.println(random);
                    if (random < 0.5) {
                        turnP1 = true;
                    } else {
                        turnP1 = false;
                    }
                    btnGame.setText("End Game");
                    lblTop.setText("Turn: " + getTurn());
                    inPlay = true;
//                }
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                newGame();
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (col1.get(i).getIcon() != cirOutline) {
                    i++;
                }
                if (turnP1) {
                    col1.get(i).setIcon(cirOrange);
                    lblTop.setText("Turn: Player 2");
                } else {
                    col1.get(i).setIcon(cirPurple);
                    lblTop.setText("Turn: Player 1");
                }
                turnP1 = !turnP1;
                if (col1.get(5).getIcon() != cirOutline) {
                    btn1.setEnabled(false);
                }
                check4Win();
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (col2.get(i).getIcon() != cirOutline) {
                    i++;
                }
                if (turnP1) {
                    col2.get(i).setIcon(cirOrange);
                    lblTop.setText("Turn: Player 2");
                } else {
                    col2.get(i).setIcon(cirPurple);
                    lblTop.setText("Turn: Player 1");
                }
                turnP1 = !turnP1;
                if (col2.get(5).getIcon() != cirOutline) {
                    btn2.setEnabled(false);
                }
                check4Win();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (col3.get(i).getIcon() != cirOutline) {
                    i++;
                }
                if (turnP1) {
                    col3.get(i).setIcon(cirOrange);
                    lblTop.setText("Turn: Player 2");
                } else {
                    col3.get(i).setIcon(cirPurple);
                    lblTop.setText("Turn: Player 1");
                }
                turnP1 = !turnP1;
                if (col3.get(5).getIcon() != cirOutline) {
                    btn3.setEnabled(false);
                }
                check4Win();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (col4.get(i).getIcon() != cirOutline) {
                    i++;
                }
                if (turnP1) {
                    col4.get(i).setIcon(cirOrange);
                    lblTop.setText("Turn: Player 2");
                } else {
                    col4.get(i).setIcon(cirPurple);
                    lblTop.setText("Turn: Player 1");
                }
                turnP1 = !turnP1;
                if (col4.get(5).getIcon() != cirOutline) {
                    btn4.setEnabled(false);
                }
                check4Win();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (col5.get(i).getIcon() != cirOutline) {
                    i++;
                }
                if (turnP1) {
                    col5.get(i).setIcon(cirOrange);
                    lblTop.setText("Turn: Player 2");
                } else {
                    col5.get(i).setIcon(cirPurple);
                    lblTop.setText("Turn: Player 1");
                }
                turnP1 = !turnP1;
                if (col5.get(5).getIcon() != cirOutline) {
                    btn5.setEnabled(false);
                }
                check4Win();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (col6.get(i).getIcon() != cirOutline) {
                    i++;
                }
                if (turnP1) {
                    col6.get(i).setIcon(cirOrange);
                    lblTop.setText("Turn: Player 2");
                } else {
                    col6.get(i).setIcon(cirPurple);
                    lblTop.setText("Turn: Player 1");
                }
                turnP1 = !turnP1;
                if (col6.get(5).getIcon() != cirOutline) {
                    btn6.setEnabled(false);
                }
                check4Win();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (col7.get(i).getIcon() != cirOutline) {
                    i++;
                }
                if (turnP1) {
                    col7.get(i).setIcon(cirOrange);
                    lblTop.setText("Turn: Player 2");
                } else {
                    col7.get(i).setIcon(cirPurple);
                    lblTop.setText("Turn: Player 1");
                }
                turnP1 = !turnP1;
                if (col7.get(5).getIcon() != cirOutline) {
                    btn7.setEnabled(false);
                }
                check4Win();
            }
        });
    }

    void newGame() {
        win = false;
        for (JLabel label : col1) {
            label.setIcon(cirOutline);
        }
        for (JLabel label : col2) {
            label.setIcon(cirOutline);
        }
        for (JLabel label : col3) {
            label.setIcon(cirOutline);
        }
        for (JLabel label : col4) {
            label.setIcon(cirOutline);
        }
        for (JLabel label : col5) {
            label.setIcon(cirOutline);
        }
        for (JLabel label : col6) {
            label.setIcon(cirOutline);
        }
        for (JLabel label : col7) {
            label.setIcon(cirOutline);
        }

        for (JLabel win : lstWin) {
            win.setOpaque(false);
        }
        lstWin.clear();
    }

    String getTurn() {
        if (turnP1) {
           return "Player 1";
        }
        return "Player 2";
    }

    void check4Win() {
//        *** Vertical ***
        for (int i = 0; i < 3; i++) {
            if (!col1.get(i).getIcon().equals(cirOutline)) {
                if (col1.get(i).getIcon().equals(col1.get(i + 1).getIcon())
                        && col1.get(i).getIcon().equals(col1.get(i + 2).getIcon())
                        && col1.get(i).getIcon().equals(col1.get(i + 3).getIcon()) ) {
                    lstWin.add(col1.get(i));
                    lstWin.add(col1.get(i + 1));
                    lstWin.add(col1.get(i + 2));
                    lstWin.add(col1.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col2.get(i).getIcon().equals(cirOutline)) {
                if (col2.get(i).getIcon().equals(col2.get(i + 1).getIcon())
                        && col2.get(i).getIcon().equals(col2.get(i + 2).getIcon())
                        && col2.get(i).getIcon().equals(col2.get(i + 3).getIcon()) ) {
                    lstWin.add(col2.get(i));
                    lstWin.add(col2.get(i + 1));
                    lstWin.add(col2.get(i + 2));
                    lstWin.add(col2.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col3.get(i).getIcon().equals(cirOutline)) {
                if (col3.get(i).getIcon().equals(col3.get(i + 1).getIcon())
                        && col3.get(i).getIcon().equals(col3.get(i + 2).getIcon())
                        && col3.get(i).getIcon().equals(col3.get(i + 3).getIcon()) ) {
                    lstWin.add(col3.get(i));
                    lstWin.add(col3.get(i + 1));
                    lstWin.add(col3.get(i + 2));
                    lstWin.add(col3.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col4.get(i).getIcon().equals(cirOutline)) {
                if (col4.get(i).getIcon().equals(col4.get(i + 1).getIcon())
                        && col4.get(i).getIcon().equals(col4.get(i + 2).getIcon())
                        && col4.get(i).getIcon().equals(col4.get(i + 3).getIcon()) ) {
                    lstWin.add(col4.get(i));
                    lstWin.add(col4.get(i + 1));
                    lstWin.add(col4.get(i + 2));
                    lstWin.add(col4.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col5.get(i).getIcon().equals(cirOutline)) {
                if (col5.get(i).getIcon().equals(col5.get(i + 1).getIcon())
                        && col5.get(i).getIcon().equals(col5.get(i + 2).getIcon())
                        && col5.get(i).getIcon().equals(col5.get(i + 3).getIcon()) ) {
                    lstWin.add(col5.get(i));
                    lstWin.add(col5.get(i + 1));
                    lstWin.add(col5.get(i + 2));
                    lstWin.add(col5.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col6.get(i).getIcon().equals(cirOutline)) {
                if (col6.get(i).getIcon().equals(col6.get(i + 1).getIcon())
                        && col6.get(i).getIcon().equals(col6.get(i + 2).getIcon())
                        && col6.get(i).getIcon().equals(col6.get(i + 3).getIcon()) ) {
                    lstWin.add(col6.get(i));
                    lstWin.add(col6.get(i + 1));
                    lstWin.add(col6.get(i + 2));
                    lstWin.add(col6.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col7.get(i).getIcon().equals(cirOutline)) {
                if (col7.get(i).getIcon().equals(col7.get(i + 1).getIcon())
                        && col7.get(i).getIcon().equals(col7.get(i + 2).getIcon())
                        && col7.get(i).getIcon().equals(col7.get(i + 3).getIcon()) ) {
                    lstWin.add(col7.get(i));
                    lstWin.add(col7.get(i + 1));
                    lstWin.add(col7.get(i + 2));
                    lstWin.add(col7.get(i + 3));
                    win = true;
                }
            }
        }
//        *** Horizontal ***
        for (int i = 0; i < 6; i++) {
            if (!col1.get(i).getIcon().equals(cirOutline)) {
                if (col1.get(i).getIcon().equals(col2.get(i).getIcon())
                        && col1.get(i).getIcon().equals(col3.get(i).getIcon())
                        && col1.get(i).getIcon().equals(col4.get(i).getIcon()) ) {
                    lstWin.add(col1.get(i));
                    lstWin.add(col2.get(i));
                    lstWin.add(col3.get(i));
                    lstWin.add(col4.get(i));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            if (!col2.get(i).getIcon().equals(cirOutline)) {
                if (col2.get(i).getIcon().equals(col3.get(i).getIcon())
                        && col2.get(i).getIcon().equals(col4.get(i).getIcon())
                        && col2.get(i).getIcon().equals(col5.get(i).getIcon()) ) {
                    lstWin.add(col2.get(i));
                    lstWin.add(col3.get(i));
                    lstWin.add(col4.get(i));
                    lstWin.add(col5.get(i));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            if (!col3.get(i).getIcon().equals(cirOutline)) {
                if (col3.get(i).getIcon().equals(col4.get(i).getIcon())
                        && col3.get(i).getIcon().equals(col5.get(i).getIcon())
                        && col3.get(i).getIcon().equals(col6.get(i).getIcon()) ) {
                    lstWin.add(col3.get(i));
                    lstWin.add(col4.get(i));
                    lstWin.add(col5.get(i));
                    lstWin.add(col6.get(i));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            if (!col4.get(i).getIcon().equals(cirOutline)) {
                if (col4.get(i).getIcon().equals(col5.get(i).getIcon())
                        && col4.get(i).getIcon().equals(col6.get(i).getIcon())
                        && col4.get(i).getIcon().equals(col7.get(i).getIcon()) ) {
                    lstWin.add(col4.get(i));
                    lstWin.add(col5.get(i));
                    lstWin.add(col6.get(i));
                    lstWin.add(col7.get(i));
                    win = true;
                }
            }
        }
//        *** Diagonal ***
        for (int i = 0; i < 3; i++) {
            if (!col1.get(i).getIcon().equals(cirOutline)) {
                if (col1.get(i).getIcon().equals(col2.get(i + 1).getIcon())
                && col1.get(i).getIcon().equals(col3.get(i + 2).getIcon())
                && col1.get(i).getIcon().equals(col4.get(i + 3).getIcon()) ) {
                    lstWin.add(col1.get(i));
                    lstWin.add(col2.get(i + 1));
                    lstWin.add(col3.get(i + 2));
                    lstWin.add(col4.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col2.get(i).getIcon().equals(cirOutline)) {
                if (col2.get(i).getIcon().equals(col3.get(i + 1).getIcon())
                        && col2.get(i).getIcon().equals(col4.get(i + 2).getIcon())
                        && col2.get(i).getIcon().equals(col5.get(i + 3).getIcon()) ) {
                    lstWin.add(col2.get(i));
                    lstWin.add(col3.get(i + 1));
                    lstWin.add(col4.get(i + 2));
                    lstWin.add(col5.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col3.get(i).getIcon().equals(cirOutline)) {
                if (col3.get(i).getIcon().equals(col4.get(i + 1).getIcon())
                        && col3.get(i).getIcon().equals(col5.get(i + 2).getIcon())
                        && col3.get(i).getIcon().equals(col6.get(i + 3).getIcon()) ) {
                    lstWin.add(col3.get(i));
                    lstWin.add(col4.get(i + 1));
                    lstWin.add(col5.get(i + 2));
                    lstWin.add(col6.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col4.get(i).getIcon().equals(cirOutline)) {
                if (col4.get(i).getIcon().equals(col5.get(i + 1).getIcon())
                        && col4.get(i).getIcon().equals(col6.get(i + 2).getIcon())
                        && col4.get(i).getIcon().equals(col7.get(i + 3).getIcon()) ) {
                    lstWin.add(col4.get(i));
                    lstWin.add(col5.get(i + 1));
                    lstWin.add(col6.get(i + 2));
                    lstWin.add(col7.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col7.get(i).getIcon().equals(cirOutline)) {
                if (col7.get(i).getIcon().equals(col6.get(i + 1).getIcon())
                        && col7.get(i).getIcon().equals(col5.get(i + 2).getIcon())
                        && col7.get(i).getIcon().equals(col4.get(i + 3).getIcon()) ) {
                    lstWin.add(col7.get(i));
                    lstWin.add(col6.get(i + 1));
                    lstWin.add(col5.get(i + 2));
                    lstWin.add(col4.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col6.get(i).getIcon().equals(cirOutline)) {
                if (col6.get(i).getIcon().equals(col5.get(i + 1).getIcon())
                        && col6.get(i).getIcon().equals(col4.get(i + 2).getIcon())
                        && col6.get(i).getIcon().equals(col3.get(i + 3).getIcon()) ) {
                    lstWin.add(col6.get(i));
                    lstWin.add(col5.get(i + 1));
                    lstWin.add(col4.get(i + 2));
                    lstWin.add(col3.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col5.get(i).getIcon().equals(cirOutline)) {
                if (col5.get(i).getIcon().equals(col4.get(i + 1).getIcon())
                        && col5.get(i).getIcon().equals(col3.get(i + 2).getIcon())
                        && col5.get(i).getIcon().equals(col2.get(i + 3).getIcon()) ) {
                    lstWin.add(col5.get(i));
                    lstWin.add(col4.get(i + 1));
                    lstWin.add(col3.get(i + 2));
                    lstWin.add(col2.get(i + 3));
                    win = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (!col4.get(i).getIcon().equals(cirOutline)) {
                if (col4.get(i).getIcon().equals(col3.get(i + 1).getIcon())
                        && col4.get(i).getIcon().equals(col2.get(i + 2).getIcon())
                        && col4.get(i).getIcon().equals(col1.get(i + 3).getIcon()) ) {
                    lstWin.add(col4.get(i));
                    lstWin.add(col3.get(i + 1));
                    lstWin.add(col2.get(i + 2));
                    lstWin.add(col1.get(i + 3));
                    win = true;
                }
            }
        }
        if(win) {
            if(turnP1) {
                lblTop.setText("Player 2 Wins!");
                winsP2++;
                lblP2.setText("Player 2:  " + winsP2);
            } else {
                lblTop.setText("Player 1 Wins!");
                winsP1++;
                lblP1.setText("Player 1:  " + winsP1);
            }
            for (JLabel win : lstWin) {
                win.setBackground(Color.lightGray);
                win.setOpaque(true);
            }
            inPlay = false;
            btnGame.setText("New Game");
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);

        }
        if (!btn1.isEnabled() && !btn2.isEnabled() && !btn3.isEnabled() && !btn4.isEnabled() && !btn5.isEnabled()
           && !btn6.isEnabled() && !btn7.isEnabled() && !win) {
            lblTop.setText("It's a Tie!");
            numTies++;
            lblTie.setText("Ties:  " + numTies);
            inPlay = false;
            btnGame.setText("New Game");
        }
    }


    public static void main(String[] args) {
        Connect4 connect4 = new Connect4();
    }
}
