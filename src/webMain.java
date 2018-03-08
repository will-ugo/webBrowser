import javax.swing.JFrame;

public class webMain {
	public static void main (String args []) {
		webBrowser browser = new webBrowser();
		browser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		browser.setSize(500,  300);
		browser.setVisible(true);
	}

}
