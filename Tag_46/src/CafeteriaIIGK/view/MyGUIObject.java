package CafeteriaIIGK.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import CafeteriaIIGK.model.IDrinkingCoffee;

public class MyGUIObject implements IDrinkingCoffee{
	
	private JPanel pnl;
	private JButton btn;
	private JLabel lbl;
	private JSlider sli;
	private JTextField txf;
	private JTextPane txp;
	private JList<String> lst;
	private JScrollPane scp;
	private JProgressBar pgb;
	
	private String text;
	private String name;
	private int top;
	private int left;
	private int width;
	private int height;
	private int layer;
	
	public MyGUIObject(JPanel pnl, String name, int left, int top, int width, int height, int layer) {
		super();
		this.pnl = pnl;
		this.pnl.setName(name);
		this.pnl.setBounds(left, top , width, height);
		this.pnl.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		this.layer = layer;
		
	}
	
	public MyGUIObject(JButton btn, String name, String text, int left, int top, int width, int height, int layer) {
		super();
		this.btn = btn;
		this.btn.setName(name);
		this.btn.setText(text);
		this.btn.setBounds(left, top , width, height);
		this.layer = layer;
		
	}
	
	public MyGUIObject(JLabel lbl, String name, String text, int left, int top, int width, int height, int layer) {
		super();
		this.lbl = lbl;
		this.lbl.setName(name);
		this.lbl.setText(text);
		this.lbl.setBounds(left, top , width, height);
		this.layer = layer;
	}

	public MyGUIObject(JSlider sli, String name, String text, int left, int top, int width, int height, int layer) {
		super();
		this.sli = sli;
		this.sli.setName(name);
		this.sli.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), new Color(160, 160, 160)), text,
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.sli.setBounds(left, top , width, height);
		this.sli.setMinimum(1);
		this.sli.setMaximum(6);
		this.sli.setMajorTickSpacing(1);
		this.sli.setMinorTickSpacing(1);
		this.sli.setPaintTicks(true);
		this.sli.createStandardLabels(1, 3);
		this.sli.setPaintLabels(true);
		this.sli.setValue(3);
		this.layer = layer;
		
	}

	public MyGUIObject(JTextField txf, String name, String text, int left, int top, int width, int height, int layer) {
		super();
		this.txf = txf;
		this.txf.setName(name);
		this.txf.setText(text);
		this.txf.setBounds(left, top , width, height);
		this.txf.setHorizontalAlignment(JTextField.RIGHT);
		this.txf.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.layer = layer;
	}

	public MyGUIObject(JTextPane txp, String name, String text, int left, int top, int width, int height, int layer) {
		super();
		this.txp = txp;
		this.txp.setName(name);
		this.txp.setText(text);
		this.txp.setBounds(left, top , width, height);
		StyledDocument doc = this.txp.getStyledDocument();
		SimpleAttributeSet right = new SimpleAttributeSet();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		doc.setParagraphAttributes(0, doc.getLength(), right, false);
		this.layer = layer;
	}

	public MyGUIObject(JList<String> lst, String name, String text, int left, int top, int width, int height, int layer) {
		super();
		this.lst = lst;
		this.lst.setName(name);
		this.lst.setBounds(left, top , width, height);
		this.layer = layer;
	}

	public MyGUIObject(JScrollPane scp, String name, int left, int top, int width, int height, int layer) {
		super();
		this.scp = scp;
		this.scp.setName(name);
		this.scp.setBounds(left, top , width, height);
		this.layer = layer;
	}
	
	public MyGUIObject(JProgressBar pgb, String name, int left, int top, int width, int height, int layer) {
		super();
		this.pgb = pgb;
		this.pgb.setBounds(left, top , width, height);
		this.layer = layer;
		this.pgb.setMinimum(0);
		this.pgb.setMaximum(MAXVOLUMEDISPENSER);
		this.pgb.setValue(MAXVOLUMEDISPENSER);
		this.pgb.setForeground(new Color(140,200,255));
		this.pgb.setBackground(new Color(80,80,80));
		this.pgb.setBorderPainted(false);

	}

	public JPanel getJPanel() {
		return pnl;
	}
	public void setJPanel(JPanel pnl) {
		this.pnl = pnl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public JPanel getPnl() {
		return pnl;
	}

	public void setPnl(JPanel pnl) {
		this.pnl = pnl;
	}

	public JButton getBtn() {
		return btn;
	}

	public void setBtn(JButton btn) {
		this.btn = btn;
	}

	public String getText() {
		return text;
	}

	public void setBtnText(String text) {
		this.text = text;
	}
	
	public JLabel getLbl() {
		return lbl;
	}

	public void setLbl(JLabel lbl) {
		this.lbl = lbl;
	}

	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	public JSlider getSli() {
		return sli;
	}

	public void setSli(JSlider sli) {
		this.sli = sli;
	}

	public void setText(String text) {
		this.text = text;
	}

	public JTextField getTxf() {
		return txf;
	}

	public void setTxf(JTextField txf) {
		this.txf = txf;
	}

	public JTextPane getTxp() {
		return txp;
	}

	public JList<String> getLst() {
		return lst;
	}

	public void setLst(JList<String> lst) {
		this.lst = lst;
	}

	public JScrollPane getScp() {
		return scp;
	}

	public void setScp(JScrollPane scp) {
		this.scp = scp;
	}

	public JProgressBar getPgb() {
		return pgb;
	}

	public void setPgb(JProgressBar pgb) {
		this.pgb = pgb;
	}

	public void setTxp(JTextPane txp) {
		this.txp = txp;
	}

	@Override
	public String toString() {
		return "MyGUIObject [pnl=" + pnl + ", btn=" + btn + ", lbl=" + lbl + ", sli=" + sli + ", txf=" + txf + ", txp="
				+ txp + ", lst=" + lst + ", scp=" + scp + ", pgb=" + pgb + ", text=" + text + ", name=" + name
				+ ", top=" + top + ", left=" + left + ", width=" + width + ", height=" + height + ", layer=" + layer
				+ ", getJPanel()=" + getJPanel() + ", getName()=" + getName() + ", getTop()=" + getTop()
				+ ", getLeft()=" + getLeft() + ", getWidth()=" + getWidth() + ", getHeight()=" + getHeight()
				+ ", getPnl()=" + getPnl() + ", getBtn()=" + getBtn() + ", getText()=" + getText() + ", getLbl()="
				+ getLbl() + ", getLayer()=" + getLayer() + ", getSli()=" + getSli() + ", getTxf()=" + getTxf()
				+ ", getTxp()=" + getTxp() + ", getLst()=" + getLst() + ", getScp()=" + getScp() + ", getPgb()="
				+ getPgb() + "]";
	}





}


