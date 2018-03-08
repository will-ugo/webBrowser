import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class webBrowser extends JFrame {
	private JTextField addressField;
	private JEditorPane window;
	
	public webBrowser() {
		super("Simple Web Browser Demo");
		
		addressField = new JTextField("Enter a URL!");
		addressField.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						loadSite(event.getActionCommand());
					}
				}
				);
		add(addressField, BorderLayout.NORTH);
		
		window = new JEditorPane();
		window.setEditable(false);
		window.addHyperlinkListener(
				new HyperlinkListener() {
					public void hyperlinkUpdate(HyperlinkEvent event) {
						if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
						loadSite(event.getURL().toString());
						}
					}
				}
				);
		add(new JScrollPane(window), BorderLayout.CENTER);
	}
	
	private void loadSite(String text) {
		try {
			window.setPage(text);
			addressField.setText(text);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Invalid URL!");
		}
	}
}