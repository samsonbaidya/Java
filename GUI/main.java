/*import javax.swing.JOptionPane ;

public class main{
	public static void main(String []args){
		String fn = JOptionPane.showInputDialog("enter first number ");
		String sn = JOptionPane.showInputDialog("enter second number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
 JOptionPane.showMessageDialog(null,"your answer is " + sum,"the world", JOptionPane.PLAIN_MESSAGE );
		
	}
}*/

import java.awt.Frame;
import java.awt.TextField;
import java.awt.PasswordField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;

public class main{
	public static void main(String s[]){
		Window w=new Window();
		Window2 w2=new Window2();
	}
}
//java API documentation
class Window extends Frame{
	public Window(){
		super("Java Login Window");
		Label l=new Label("User Name");
		Label l2=new Label("Password");
		TextField tf=new TextField("enter your name"); 
		PasswordField tf2=new PasswordField(20);
		Button b=new Button("search");
		Button b1=new Button("order");
		Button b2=new Button("expired");
		Button b3=new Button("sell");
		add(l);add(tf);
		add(l2);add(tf2);
		add(b);add(b1);add(b2);add(b3);
		setSize(300,400);
		setLayout(new FlowLayout());
		setVisible(true);
	}
}
class Window2 extends Frame{
	public Window2(){
		super("Signup Window");
		Label l=new Label("User Name");
		Label l2=new Label("Email");
		TextField tf=new TextField(20);
		TextField tf2=new TextField(20);
		Button b=new Button("Signup");
		add(l);add(tf);
		add(l2);add(tf2);
		add(b);
		setSize(400,400);
		setLayout(new FlowLayout());
		setVisible(true);
	}
}