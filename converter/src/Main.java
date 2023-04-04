import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Function function = new Function();
        Object[] option1 = {"Dollar", "Yen", "Quit"};
        Object[] option2 = {"Try again", "Quit"};
        while (true) {
            String value = JOptionPane.showInputDialog(null, "Enter value");
            if (function.check(value) == true) {
                double input = Double.parseDouble(value);
                int choice1 = JOptionPane.showOptionDialog(null, "Choose wich currency you wish to convert", "Currency converter",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1[2]);
                if (choice1 == 0) {
                    function.convertToDollar(input);

                    int choice2 = JOptionPane.showOptionDialog(null, "What do u wish to do", "Currency converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {

                    } else
                        break;
                    break;
                } else if (choice1 == 1) {
                    function.convertToYen(input);
                    int choice2 = JOptionPane.showOptionDialog(null, "What do u wish to do", "Currency converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {

                    } else
                        break;
                } else {
                    break;
                }
            }
            else {
                JOptionPane.showInputDialog(null, "Invalid text");
            }

        int choice2 = JOptionPane.showOptionDialog(null,"What do u wish to do","Currency converter",
                JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option2,option2[1]);
        if(choice2==0){

        }else
            break;
            }
        }

    }
