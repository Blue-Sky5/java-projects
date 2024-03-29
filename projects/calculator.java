import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main{
    double first_d = 0.0;
    int first_i = 0;
    public static void main(String[] args){
        //variables
        holder hold = new holder();
        hold.first = 0.0;
        hold.second = 0.0;
        hold.action = " ";
        //...........................


        JFrame calculator = new JFrame("Neu_Calc");
        calculator.setSize(230,250);
        calculator.setResizable(false);

        Container panel = calculator.getContentPane();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color sefid = new Color(190,190,190);
        Color sabz = new Color(108,230,10);
        JButton zero = new JButton("0");
        zero.setBackground(sefid);
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton div = new JButton("/");
        JButton mul = new JButton("*");
        JButton equal = new JButton("=");
        JButton c = new JButton("C");
        JButton Dot = new JButton(".");
        JButton Dot2 = new JButton(".");
        JButton pow = new JButton("x^y");
        JButton root = new JButton("Vx");
        one.setBackground(sefid);
        two.setBackground(sefid);
        three.setBackground(sefid);
        four.setBackground(sefid);
        five.setBackground(sefid);
        six.setBackground(sefid);
        seven.setBackground(sefid);
        eight.setBackground(sefid);
        nine.setBackground(sefid);
        plus.setBackground(sefid);
        minus.setBackground(sefid);
        equal.setBackground(sabz);
        c.setBackground(sefid);
        div.setBackground(sefid);
        mul.setBackground(sefid);
        pow.setBackground(sefid);
        root.setBackground(sefid);
        Dot.setBackground(sefid);
        Dot2.setBackground(sefid);
        JTextField digit = new JTextField("0");
        digit.setEditable(false);
        digit.setBackground(Color.WHITE);

        panel.add(digit);
        panel.add(c);
        panel.add(seven);
        panel.add(four);
        panel.add(one);
        panel.add(Dot);
        panel.add(root);
        panel.add(zero);
        panel.add(two);
        panel.add(five);
        panel.add(eight);
        panel.add(Dot2);
        panel.add(three);
        panel.add(six);
        panel.add(nine);
        panel.add(pow);
        panel.add(minus);
        panel.add(equal);
        panel.add(plus);
        panel.add(mul);
        panel.add(div);
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);

        //layouts
        {
            layout.putConstraint(SpringLayout.NORTH, digit, 10, SpringLayout.NORTH, panel);
            layout.putConstraint(SpringLayout.EAST, digit, -10, SpringLayout.EAST, panel);
            layout.putConstraint(SpringLayout.WEST, digit, 10, SpringLayout.WEST, panel);

            layout.putConstraint(SpringLayout.NORTH, c, 10, SpringLayout.SOUTH, digit);
            layout.putConstraint(SpringLayout.WEST, c, 5, SpringLayout.WEST, panel);

            layout.putConstraint(SpringLayout.NORTH, seven, 5, SpringLayout.SOUTH, c);
            layout.putConstraint(SpringLayout.WEST, seven, 5, SpringLayout.WEST, panel);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, seven, 0, SpringLayout.HORIZONTAL_CENTER, c);

            layout.putConstraint(SpringLayout.NORTH, four, 5, SpringLayout.SOUTH, seven);
            layout.putConstraint(SpringLayout.WEST, four, 5, SpringLayout.WEST, panel);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, four, 0, SpringLayout.HORIZONTAL_CENTER, seven);

            layout.putConstraint(SpringLayout.NORTH, one, 5, SpringLayout.SOUTH, four);
            layout.putConstraint(SpringLayout.WEST, one, 5, SpringLayout.WEST, panel);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, one, 0, SpringLayout.HORIZONTAL_CENTER, four);

            layout.putConstraint(SpringLayout.NORTH, Dot, 5, SpringLayout.SOUTH, one);
            layout.putConstraint(SpringLayout.WEST, Dot, 5, SpringLayout.WEST, panel);
            layout.putConstraint(SpringLayout.SOUTH, Dot, -10, SpringLayout.SOUTH, panel);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, Dot, 0, SpringLayout.HORIZONTAL_CENTER, one);

            layout.putConstraint(SpringLayout.NORTH, root, 10, SpringLayout.SOUTH, digit);
            layout.putConstraint(SpringLayout.WEST, root, 5, SpringLayout.EAST, c);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, root, 0, SpringLayout.VERTICAL_CENTER, c);

            layout.putConstraint(SpringLayout.NORTH, eight, 5, SpringLayout.SOUTH, root);
            layout.putConstraint(SpringLayout.WEST, eight, 5, SpringLayout.EAST, seven);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, eight, 0, SpringLayout.VERTICAL_CENTER, seven);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, eight, 0, SpringLayout.HORIZONTAL_CENTER, root);

            layout.putConstraint(SpringLayout.NORTH, five, 5, SpringLayout.SOUTH, eight);
            layout.putConstraint(SpringLayout.WEST, five, 5, SpringLayout.EAST, four);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, five, 0, SpringLayout.VERTICAL_CENTER, four);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, five, 0, SpringLayout.HORIZONTAL_CENTER, eight);

            layout.putConstraint(SpringLayout.NORTH, two, 5, SpringLayout.SOUTH, five);
            layout.putConstraint(SpringLayout.WEST, two, 5, SpringLayout.EAST, one);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, two, 0, SpringLayout.VERTICAL_CENTER, one);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, two, 0, SpringLayout.HORIZONTAL_CENTER, five);

            layout.putConstraint(SpringLayout.NORTH, zero, 5, SpringLayout.SOUTH, two);
            layout.putConstraint(SpringLayout.EAST, zero, 5, SpringLayout.WEST, Dot2);
            layout.putConstraint(SpringLayout.WEST, zero, 5, SpringLayout.EAST, Dot);
            layout.putConstraint(SpringLayout.SOUTH, zero, -10, SpringLayout.SOUTH, panel);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, zero, 0, SpringLayout.VERTICAL_CENTER, Dot);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, zero, 0, SpringLayout.HORIZONTAL_CENTER, two);

            layout.putConstraint(SpringLayout.NORTH, pow, 10, SpringLayout.SOUTH, digit);
            layout.putConstraint(SpringLayout.WEST, pow, 5, SpringLayout.EAST, root);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, pow, 0, SpringLayout.VERTICAL_CENTER, root);

            layout.putConstraint(SpringLayout.NORTH, nine, 5, SpringLayout.SOUTH, pow);
            layout.putConstraint(SpringLayout.WEST, nine, 5, SpringLayout.EAST, eight);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, nine, 0, SpringLayout.VERTICAL_CENTER, eight);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, nine, 0, SpringLayout.HORIZONTAL_CENTER, pow);

            layout.putConstraint(SpringLayout.NORTH, six, 5, SpringLayout.SOUTH, nine);
            layout.putConstraint(SpringLayout.EAST, six, 5, SpringLayout.WEST, minus);
            layout.putConstraint(SpringLayout.WEST, six, 5, SpringLayout.EAST, five);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, six, 0, SpringLayout.VERTICAL_CENTER, five);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, six, 0, SpringLayout.HORIZONTAL_CENTER, nine);

            layout.putConstraint(SpringLayout.NORTH, three, 5, SpringLayout.SOUTH, six);
            layout.putConstraint(SpringLayout.EAST, three, 5, SpringLayout.WEST, plus);
            layout.putConstraint(SpringLayout.WEST, three, 5, SpringLayout.EAST, two);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, three, 0, SpringLayout.VERTICAL_CENTER, two);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, three, 0, SpringLayout.HORIZONTAL_CENTER, six);

            layout.putConstraint(SpringLayout.NORTH, Dot2, 5, SpringLayout.SOUTH, three);
            layout.putConstraint(SpringLayout.EAST, Dot2, 5, SpringLayout.WEST, equal);
            layout.putConstraint(SpringLayout.WEST, Dot2, 5, SpringLayout.EAST, zero);
            layout.putConstraint(SpringLayout.SOUTH, Dot2, -10, SpringLayout.SOUTH, panel);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, Dot2, 0, SpringLayout.VERTICAL_CENTER, zero);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, Dot2, 0, SpringLayout.HORIZONTAL_CENTER, three);

            layout.putConstraint(SpringLayout.NORTH, div, 10, SpringLayout.SOUTH, digit);
            layout.putConstraint(SpringLayout.EAST, div, -5, SpringLayout.EAST, panel);
            layout.putConstraint(SpringLayout.WEST, div, 5, SpringLayout.EAST, pow);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, div, 0, SpringLayout.VERTICAL_CENTER, pow);

            layout.putConstraint(SpringLayout.NORTH, mul, 5, SpringLayout.SOUTH, div);
            layout.putConstraint(SpringLayout.EAST, mul, -5, SpringLayout.EAST, panel);
            layout.putConstraint(SpringLayout.WEST, mul, 5, SpringLayout.EAST, nine);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, mul, 0, SpringLayout.VERTICAL_CENTER, nine);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, mul, 0, SpringLayout.HORIZONTAL_CENTER, div);

            layout.putConstraint(SpringLayout.NORTH, minus, 5, SpringLayout.SOUTH, mul);
            layout.putConstraint(SpringLayout.EAST, minus, -5, SpringLayout.EAST, panel);
            layout.putConstraint(SpringLayout.WEST, minus, 5, SpringLayout.EAST, six);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, minus, 0, SpringLayout.VERTICAL_CENTER, six);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, minus, 0, SpringLayout.HORIZONTAL_CENTER, mul);

            layout.putConstraint(SpringLayout.NORTH, plus, 5, SpringLayout.SOUTH, minus);
            layout.putConstraint(SpringLayout.EAST, plus, -5, SpringLayout.EAST, panel);
            layout.putConstraint(SpringLayout.WEST, plus, 5, SpringLayout.EAST, three);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, plus, 0, SpringLayout.VERTICAL_CENTER, three);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, plus, 0, SpringLayout.HORIZONTAL_CENTER, minus);

            layout.putConstraint(SpringLayout.NORTH, equal, 5, SpringLayout.SOUTH, plus);
            layout.putConstraint(SpringLayout.EAST, equal, -5, SpringLayout.EAST, panel);
            layout.putConstraint(SpringLayout.WEST, equal, 5, SpringLayout.EAST, Dot2);
            layout.putConstraint(SpringLayout.SOUTH, equal, -10, SpringLayout.SOUTH, panel);
            layout.putConstraint(SpringLayout.VERTICAL_CENTER, equal, 0, SpringLayout.VERTICAL_CENTER, Dot2);
            layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, equal, 0, SpringLayout.HORIZONTAL_CENTER, plus);
            calculator.setVisible(true);
        }
        //action buttons
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    return;
                }
                else {
                    digit.setText(digit.getText()+"0");
                }
            }
        });
        Dot2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!digit.getText().contains(".")){
                    digit.setText(digit.getText()+".");
                }
                else{
                    return;
                }
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digit.setText("0");
                hold.first = 0;
                hold.second = 0;
                hold.action = " ";
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    digit.setText("1");
                    return;
                }
                digit.setText(digit.getText()+"1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    digit.setText("2");
                    return;
                }
                digit.setText(digit.getText()+"2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    digit.setText("3");
                    return;
                }
                digit.setText(digit.getText()+"3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    digit.setText("4");
                    return;
                }
                digit.setText(digit.getText()+"4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    digit.setText("5");
                    return;
                }
                digit.setText(digit.getText()+"5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    digit.setText("6");
                    return;
                }
                digit.setText(digit.getText()+"6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    digit.setText("7");
                    return;
                }
                digit.setText(digit.getText()+"7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    digit.setText("8");
                    return;
                }
                digit.setText(digit.getText()+"8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(digit.getText().equals("0")){
                    digit.setText("9");
                    return;
                }
                digit.setText(digit.getText()+"9");
            }
        });
        //.............................
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( hold.action == "N"){
                    hold.first = hold.second;
                    digit.setText("0");
                    hold.action = "p";
                    return;
                }
                hold.second = Double.parseDouble(digit.getText());
                digit.setText("0");
                hold.first += hold.second;
                hold.action = "p";
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( hold.action == "N"){
                    hold.first = hold.second;
                    digit.setText("0");
                    hold.action = "m";
                    return;
                }
                hold.second = Double.parseDouble(digit.getText());
                digit.setText("0");
                hold.first -= hold.second;
                hold.action = "m";
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( hold.action == "N"){
                    hold.first = hold.second;
                    digit.setText("0");
                    hold.action = "z";
                    return;
                }
                if(hold.action.equals(" ")){
                    hold.first = 1;
                }
                hold.second = Double.parseDouble(digit.getText());
                digit.setText("0");
                hold.first *= hold.second;
                hold.action = "z";
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( hold.action == "N"){
                    hold.first = hold.second;
                    digit.setText("0");
                    hold.action = "d";
                    return;
                }
                if(hold.action.equals(" ")){
                    hold.first = 1;
                    hold.first = Double.parseDouble(digit.getText());
                    digit.setText("0");
                    hold.action = "d";
                    return;
                }
                hold.second = Double.parseDouble(digit.getText());
                digit.setText("0");
                if(hold.second == 0){
                    digit.setText("ZeroDivision Error");
                    return;
                }
                hold.first /= hold.second;
                hold.action = "d";
            }
        });
        pow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( hold.action == "N"){
                    hold.first = hold.second;
                    digit.setText("0");
                    hold.action = "o";
                    return;
                }
                if(hold.action.equals(" ")){
                    hold.first = Double.parseDouble(digit.getText());
                    digit.setText("0");
                    hold.action = "o";
                    return;
                }
                hold.second = Double.parseDouble(digit.getText());
                digit.setText("0");
                hold.first = Math.pow(hold.first,Double.parseDouble(digit.getText()));
                hold.action = "o";
            }
        });
        root.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( hold.action == "N"){
                    hold.first = hold.second;
                    digit.setText("0");
                    hold.action = "r";
                    return;
                }
                if(hold.action.equals(" ")){
                    hold.first = Double.parseDouble(digit.getText());
                    digit.setText("0");
                    hold.action = "r";
                    return;
                }
                hold.second = Double.parseDouble(digit.getText());
                digit.setText("0");
                hold.first = Math.pow(hold.first,1/Double.parseDouble(digit.getText()));
                hold.action = "r";
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (hold.action){
                    case "p":
                        hold.first+= Double.parseDouble(digit.getText());
                        digit.setText(""+hold.first);
                        hold.second = hold.first;
                        hold.first = 0;
                        hold.action = "N";
                        break;
                    case "m":
                        hold.first-= Double.parseDouble(digit.getText());
                        digit.setText(""+hold.first);
                        hold.second = hold.first;
                        hold.first = 0;
                        hold.action = "N";
                        break;
                    case "z":
                        hold.first*= Double.parseDouble(digit.getText());
                        digit.setText(""+hold.first);
                        hold.second = hold.first;
                        hold.first = 1;
                        hold.action = "N";
                        break;
                    case "d":
                        if(digit.getText().equals("0")){
                            digit.setText("ZeroDiv Error");
                            break;
                        }
                        hold.first/= Double.parseDouble(digit.getText());
                        digit.setText(""+hold.first);
                        hold.second = hold.first;
                        hold.first = 1;
                        hold.action = "N";
                        break;
                    case "o":
                        hold.first = Math.pow(hold.first,Double.parseDouble(digit.getText()));
                        digit.setText(""+hold.first);
                        hold.second = hold.first;
                        hold.first = 0;
                        hold.action = "N";
                        break;
                    case "r":
                        hold.first = Math.pow(hold.first,1/Double.parseDouble(digit.getText()));
                        digit.setText(""+hold.first);
                        hold.second = hold.first;
                        hold.first = 0;
                        hold.action = "N";
                        break;
                    case "N":
                        digit.setText(""+hold.second);
                        break;
                }
            }
        });

    }
    //functions
    public static double add(double numOne, double numTwo) {
        return numOne+numTwo;
    }
    public static double subtract(double numOne, double numTwo) {
        if(numTwo == 0){
            System.out.println("ZeroDivision Error");
            return numOne;
        }
        return numOne / numTwo;

    }
    public static double divide(double numOne, double numTwo) {
        return  numOne-numTwo;
    }
    public static double multiply(double numOne, double numTwo) {
        return numOne*numTwo;
    }
    //.............................

}
class holder{
    public double first;
    public String action;
    public double second;
}