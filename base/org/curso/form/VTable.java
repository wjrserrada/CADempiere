/**
 * 
 */
package org.curso.form;

import org.compiere.apps.ADialog;
import org.compiere.apps.ConfirmPanel;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.swing.CPanel;
import org.compiere.swing.CTextField;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
/**
 * @author Usuario
 *
 */
public class VTable extends Table implements FormPanel, ActionListener {

	private FormFrame m_Frame;
	private CPanel panel = new CPanel();
	private GridBagLayout mainLayout = new GridBagLayout();
	private JLabel lValue = new JLabel();
	private JLabel lName = new JLabel();
	private CTextField fValue = new CTextField();
	private CTextField fName = new CTextField();
	private int m_WindowNo;
	private VLookup test;
	
	private ConfirmPanel confirmPanel = new ConfirmPanel(true);
	
	public VTable() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(int WindowNo, FormFrame frame) {
		m_Frame = frame;
		m_WindowNo = WindowNo;
		dyInit();
		jbInit();
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(confirmPanel, BorderLayout.SOUTH);
	}

	public void jbInit() {
		panel.setLayout(mainLayout);
		lValue.setText(Msg.getMsg(Env.getCtx(), "Value"));
		lName.setText(Msg.getMsg(Env.getCtx(), "Name"));
		fValue.setColumns(10);
		fName.setColumns(10);
		
		fValue.setMandatory(true);
		
		confirmPanel.addActionListener(this);
		
		panel.add(lValue, new GridBagConstraints(0,0,1,1,0.0,0.0,GridBagConstraints.EAST,GridBagConstraints.NONE, new Insets(5,5,5,5),0,0));
		panel.add(lName, new GridBagConstraints(0,1,1,1,0.0,0.0,GridBagConstraints.EAST,GridBagConstraints.NONE, new Insets(5,5,5,5),0,0));		
		panel.add(fValue, new GridBagConstraints(1,0,1,1,0.0,0.0,GridBagConstraints.EAST,GridBagConstraints.NONE, new Insets(5,5,5,5),0,0));
		panel.add(fName, new GridBagConstraints(1,1,1,1,0.0,0.0,GridBagConstraints.EAST,GridBagConstraints.NONE, new Insets(5,5,5,5),0,0));
		panel.add(test, new GridBagConstraints(1,2,1,1,0.0,0.0,GridBagConstraints.EAST,GridBagConstraints.NONE, new Insets(5,5,5,5),0,0));
	}

	public void dyInit() {
		MLookup tL = MLookupFactory.get(Env.getCtx(), 0, 0, 2893, DisplayType.Search);
		test = new VLookup("C_BPartner_ID", false, false, true, tL);
		
	}
	
	@Override
	public void dispose() {
		m_Frame.dispose();
		m_Frame = null;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(ConfirmPanel.A_OK)) {
			if(fValue.isMandatory() && fValue.getText().isEmpty()){
				fValue.setBackground(true);
			}
			else if(save(fName.getText(), fValue.getText()))
				ADialog.info(0,  panel,  Msg.getMsg(Env.getCtx(), "Save"));
			else
				ADialog.info(0,  panel,  Msg.getMsg(Env.getCtx(), "NotSave"));
		}
		
		if(e.getActionCommand().equals(ConfirmPanel.A_CANCEL)) {
			dispose();
		}
		
		
	}

}
