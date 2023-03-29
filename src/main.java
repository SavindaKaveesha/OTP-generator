import java.util.Random;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		
		int length = 5;
		String number = "0123456789";
		char[] otp = new char[length];
		Random ran = new Random();
		for(int i=0; i<length; ++i) {
			otp[i] = number.charAt(ran.nextInt(number.length()));
		}
		JOptionPane.showMessageDialog(null, "OTP : "+new String(otp));
	}

}
