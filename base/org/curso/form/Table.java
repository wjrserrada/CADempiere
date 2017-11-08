/**
 * 
 */
package org.curso.form;

import org.compiere.apps.form.GenForm;
import org.compiere.minigrid.IMiniTable;
import org.compiere.util.Env;
import org.curso.model.MRSTable;

/**
 * @author Usuario
 *
 */
public class Table extends GenForm {

	/**
	 * 
	 */
	public Table() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.compiere.apps.form.GenForm#configureMiniTable(org.compiere.minigrid.IMiniTable)
	 */
	@Override
	public void configureMiniTable(IMiniTable miniTable) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.compiere.apps.form.GenForm#saveSelection(org.compiere.minigrid.IMiniTable)
	 */
	@Override
	public void saveSelection(IMiniTable miniTable) {
		// TODO Auto-generated method stub

	}

	public boolean save(String p_name, String p_value) {
		MRSTable table = new MRSTable(Env.getCtx(), 0, null);
		table.setName(p_name);
		table.setValue(p_value);
		
		return table.save();
		
	}
}
