package gui.menu;

import gui.StatusLabel;
import gui.XL;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;

class SaveMenuItem extends OpenMenuItem {
	public SaveMenuItem(XL xl, StatusLabel statusLabel) {
		super(xl, statusLabel, "Save");
	}

	protected void action(String path) throws FileNotFoundException {
		XLPrintStream printer = new XLPrintStream(path);
		printer.save(xl.getData());
	}

	protected int openDialog(JFileChooser fileChooser) {
		return fileChooser.showSaveDialog(xl);
	}
}