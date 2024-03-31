package MyfirstProject;
import javax.swing.JOptionPane;
import javax.swing.text.html.Option;


public class Myfirstproject {


    public static void main(String args[]){

         

        double miles; //Declare your miles variable
        double CentsperGallon; // Declare how many cents you will be paid by gallon
        


       
       miles = Double.parseDouble(JOptionPane.showInputDialog(null, "how much miles have you done?"));

       CentsperGallon = Double.parseDouble(JOptionPane.showInputDialog(null, "how much are you being paid per gallon?"));

       double Total = miles * CentsperGallon ;
       double Total1 = Math.round( Total * 100.00)/ 100.00;

       JOptionPane.showMessageDialog(null,"Your total is reimbursment is $" + Total1);

       int Option = JOptionPane.showConfirmDialog(null, "Would you like to repeat?" + JOptionPane.YES_NO_OPTION);
        

       if (Option == JOptionPane.YES_OPTION) {


    
        
       }
    
        

    }
}
