
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame jf;
	boolean isDotfound=false, isOperatorClicked=false, isCalculateInitialized=false,isPos;
	String oldValue, newValue, opr,negValue;  
	double result;
	JLabel displayLabel;
	JButton delButton, acButton, posnegButton,clearButton, sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, oneButton, twoButton,
			threeButton, zeroButton, dotButton, equalButton, divButton, mulButton, subButton, addButton;
	
	public Calculator() {
		jf = new JFrame("Calculator");
        jf.getContentPane().setBackground(Color.black);
		jf.setLayout(null);
		jf.setSize(500, 560);
		jf.setLocation(300, 150);
		displayLabel = new JLabel("0");
		displayLabel.setBounds(10, 30, 480, 80);
		displayLabel.setBackground(Color.black);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 36));
		jf.add(displayLabel);

		sevenButton = new JButton("7");
		sevenButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		sevenButton.setBounds(10, 130, 80, 80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);

		eightButton = new JButton("8");
		eightButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		eightButton.setBounds(110, 130, 80, 80);
		eightButton.addActionListener(this);
		jf.add(eightButton);

		nineButton = new JButton("9");
		nineButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		nineButton.setBounds(210, 130, 80, 80);
		nineButton.addActionListener(this);
		jf.add(nineButton);

		fourButton = new JButton("4");
		fourButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		fourButton.setBounds(10, 230, 80, 80);
		fourButton.addActionListener(this);
		jf.add(fourButton);

		fiveButton = new JButton("5");
		fiveButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		fiveButton.setBounds(110, 230, 80, 80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);

		sixButton = new JButton("6");
		sixButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		sixButton.setBounds(210, 230, 80, 80);
		sixButton.addActionListener(this);
		jf.add(sixButton);

		oneButton = new JButton("1");
		oneButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		oneButton.setBounds(10, 330, 80, 80);
		oneButton.addActionListener(this);
		jf.add(oneButton);

		twoButton = new JButton("2");
		twoButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		twoButton.setBounds(110, 330, 80, 80);
		twoButton.addActionListener(this);
		jf.add(twoButton);

		threeButton = new JButton("3");
		threeButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		threeButton.setBounds(210, 330, 80, 80);
		threeButton.addActionListener(this);
		jf.add(threeButton);

		zeroButton = new JButton("0");
		zeroButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		zeroButton.setBounds(10, 430, 80, 80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);

		dotButton = new JButton(".");
		dotButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		dotButton.setBounds(110, 430, 80, 80);
		dotButton.addActionListener(this);
		jf.add(dotButton);

		equalButton = new JButton("=");
		equalButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		equalButton.setBounds(210, 430, 80, 80);
		equalButton.addActionListener(this);
		jf.add(equalButton);

		divButton = new JButton("/");
		divButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		divButton.setBounds(310, 130, 80, 80);
		divButton.addActionListener(this);
		jf.add(divButton);

		mulButton = new JButton("x");
		mulButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		mulButton.setBounds(310, 230, 80, 80);
		mulButton.addActionListener(this);
		jf.add(mulButton);

		subButton = new JButton("-");
		subButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		subButton.setBounds(310, 330, 80, 80);
		subButton.addActionListener(this);
		jf.add(subButton);

		addButton = new JButton("+");
		addButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		addButton.setBounds(310, 430, 80, 80);
		addButton.addActionListener(this);
		jf.add(addButton);

		clearButton = new JButton("Clr");
		clearButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		clearButton.setBounds(410, 430, 80, 80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		posnegButton = new JButton("+/-");
		posnegButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		posnegButton.setBounds(410, 330, 80, 80);
		posnegButton.addActionListener(this);
		jf.add(posnegButton);

		acButton = new JButton("AC");
		acButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
	    acButton.setForeground(Color.red);
		acButton.setBounds(410, 130, 80, 80);
		acButton.addActionListener(this);
		jf.add(acButton);
		
		delButton = new JButton("DEL");
		delButton.setFont(new Font("SANS_SERIF", Font.PLAIN, 22));
		delButton.setBounds(410, 230, 80, 80);
		delButton.addActionListener(this);
		jf.add(delButton);
		

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton){
			if(displayLabel.getText()=="0") {
				displayLabel.setText("7");
			}else {
				if(isOperatorClicked){
				displayLabel.setText("7");
			isOperatorClicked=false;
			}
			else{ 
				displayLabel.setText(displayLabel.getText()+"7");
			}
	    }	
		}
		
		else if(e.getSource()==eightButton){
			if(displayLabel.getText()=="0") {
				displayLabel.setText("8");
			}else {
				if(isOperatorClicked){
					displayLabel.setText("8");
				isOperatorClicked=false;
				}
				else{ 
					displayLabel.setText(displayLabel.getText()+"8");
				}		
		}
		}
		
		else if(e.getSource()==nineButton) {
			if(displayLabel.getText()=="0") {
			displayLabel.setText("9");
		}else {
			if(isOperatorClicked){
					displayLabel.setText("9");
					isOperatorClicked=false;
				}
				else{ 
					displayLabel.setText(displayLabel.getText()+"9");
					}		
		}
		}
		
		else if(e.getSource()==fourButton){ 
			if(displayLabel.getText()=="0") {
				displayLabel.setText("4");
			}else {
			if(isOperatorClicked){
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			else{ 
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		}
		
		else if(e.getSource()==fiveButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("5");
			}else {
				if(isOperatorClicked){
					displayLabel.setText("5");
					isOperatorClicked=false;
				}
				else{ 
					displayLabel.setText(displayLabel.getText()+"5");
				}
		}
		}
		
		else if(e.getSource()==sixButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("6");
			}else {
				if(isOperatorClicked){
					displayLabel.setText("6");
					isOperatorClicked=false;
				}
				else{ 
					displayLabel.setText(displayLabel.getText()+"6");
				}
		}
		}
		
		else if(e.getSource()==oneButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("1");
			}else {
			if(isOperatorClicked){
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			else{ 
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		}
		
		else if(e.getSource()==twoButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("2");
			}else {
				if(isOperatorClicked){
					displayLabel.setText("2");
					isOperatorClicked=false;
				}
				else{ 
					displayLabel.setText(displayLabel.getText()+"2");
					}
				}
		}
		
		else if(e.getSource()==threeButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("3");
			}else {
				if(isOperatorClicked){
					displayLabel.setText("3");
					isOperatorClicked=false;
				}
				else{ 
					displayLabel.setText(displayLabel.getText()+"3");
				}
		}
		}
		
		else if(e.getSource()==dotButton) {
			if (!isDotfound) {
				if(isOperatorClicked) {
					displayLabel.setText("0.");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+".");
				}
				isDotfound=true;
			}
		}
		
		else if(e.getSource()==zeroButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("0");
			}else {
				if(isOperatorClicked){
					displayLabel.setText("0");
					isOperatorClicked=false;
				}
				else{ 
					displayLabel.setText(displayLabel.getText()+"0");
				}
				}
		}
		else if(e.getSource()==posnegButton) {
			if(isPos) {
				displayLabel.setText("-"+displayLabel.getText());
				isPos=false;
			}else {
				negValue=displayLabel.getText();
				displayLabel.setText(negValue.substring(1));
				isPos=true;
			}
		}
		
		else if(e.getSource()==equalButton) {

			newValue=displayLabel.getText();
			result=Calculate(newValue);
			displayLabel.setText(result+""); 
			
			isCalculateInitialized=false;
			
			isDotfound=false;
		
		}
		else if(e.getSource()==divButton) {
			if(isCalculateInitialized) {
				if (isOperatorClicked) {
					opr="/";
				}else {
					newValue=displayLabel.getText();
					
					result=Calculate(newValue);
					
					displayLabel.setText(result+"");
					
					isOperatorClicked=true;
					oldValue=result+"";
					opr="/";
				}
			}else {
				isOperatorClicked=true;
				isCalculateInitialized=true;
				opr="/";
				oldValue=displayLabel.getText();
			}
			isDotfound=false;
		}
		else if(e.getSource()==mulButton) {
			if(isCalculateInitialized) {
				if (isOperatorClicked) {
					opr="*";
				}else {
					newValue=displayLabel.getText();
					
					result=Calculate(newValue);
					
					displayLabel.setText(result+"");
					
					isOperatorClicked=true;
					oldValue=result+"";
					opr="*";
				}
			}else {
				isOperatorClicked=true;
				isCalculateInitialized=true;
				opr="*";
				oldValue=displayLabel.getText();
			}
			isDotfound=false;
		}
		else if(e.getSource()==subButton) {
			if(isCalculateInitialized) {
				if (isOperatorClicked) {
					opr="-";
				}else {
					newValue=displayLabel.getText();
					
					result=Calculate(newValue);
					
					displayLabel.setText(result+"");
					
					isOperatorClicked=true;
					oldValue=result+"";
					opr="-";
				}
			}else {
				isOperatorClicked=true;
				isCalculateInitialized=true;
				opr="-";
				oldValue=displayLabel.getText();
			}
			isDotfound=false;
		}
			
		else if(e.getSource()==addButton){
			if(isCalculateInitialized) {
				if(isOperatorClicked) {
					opr="+";
				}else {
					newValue=displayLabel.getText();
					
					result=Calculate(newValue);
					
					displayLabel.setText(result+"");
					
					isOperatorClicked=true;
					oldValue=result+"";
					opr="+";
				}
			}else {
				isOperatorClicked=true;
				isCalculateInitialized=true;
				opr="+";
				oldValue=displayLabel.getText();
			}
			isDotfound=false;
		}
		else if(e.getSource()==clearButton) {
			displayLabel.setText("0");
			isDotfound=false;
			isPos=true;
		}
	else if(e.getSource()==acButton) {
		displayLabel.setText("0");
		oldValue="0";
		isCalculateInitialized=false;
		isPos=true;
		isDotfound=false;
		
	}
	else if(e.getSource()==delButton) {
		String t = displayLabel.getText();
		
		if (t.isEmpty()){
			displayLabel.setText("0");
			} else {
				displayLabel.setText(t.substring(0, t.length() - 1));
				}
		
	}
	else if(e.getSource()==clearButton) {
		displayLabel.setText("0");
		isDotfound=false;
		isPos=true;
	}
	}
		
	public double Calculate(String value){
	
			
		double oldValueD=Double.parseDouble(oldValue);
		double newValueD=Double.parseDouble(value);
		if(opr=="+") {
			result= oldValueD+newValueD;
			displayLabel.setText(result+"");

		}
		else if(opr=="-") {
			result= oldValueD-newValueD;
			displayLabel.setText(result+"");
		}
		else if(opr=="/") {
			result= oldValueD/newValueD;
			displayLabel.setText(result+"");
		}
		else if(opr=="*") {
				result= oldValueD*newValueD;
				displayLabel.setText(result+"");
				}		

		return result;
	
	}
	}

		



