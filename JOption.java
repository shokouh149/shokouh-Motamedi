
import javax.swing.JOptionPane;

public class JOption {
	public static void main(String[] args){
	String inputName = JOptionPane.showInputDialog(null,"Please Enter your name:"); 
		
		
	
int ageNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Hello \t " + inputName + "How old are you?")) ;

	JOptionPane.showMessageDialog(null, "you are \t" + ageNumber);  


	
String addressInput = JOptionPane.showInputDialog(null,"what is your address?") ;

	JOptionPane.showMessageDialog(null, "you are \t" + addressInput);  

	

	
String monthInput = JOptionPane.showInputDialog(null,"which month did you born?") ;

	JOptionPane.showMessageDialog(null, " You born in  \t" + monthInput);  



		
String inputEmail = JOptionPane.showInputDialog(null,"what is your email?") ;
	JOptionPane.showMessageDialog(null, " your email is \t" +  inputEmail );


}
}
