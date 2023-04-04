import javax.swing.*;

public class Function {
    public void convertToDollar(double value){
    double dollar=value*0.013;
        JOptionPane.showInputDialog(null,"Amount of dollar :" + dollar+ "$" );
      }
    public void convertToYen(double value){
        double yen=value*1.69;
        JOptionPane.showInputDialog(null,"Amount of yen :" + yen+ "Y" );
    }

    //check input value
    public boolean check(String value){
        try{
                double x = Double.parseDouble(value);
                if(x>=0 ||x<=0);
                return true;
                }
        catch(NumberFormatException e){
            return false;
        }
    }
}
