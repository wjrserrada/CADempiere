/**
 * 
 */
package org.curso.process;

import java.util.List;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.Msg;
import org.curso.model.MRSTableAllocation;

/**
 * @author Usuario
 *
 */
public class CloseTable extends SvrProcess {

	private int p_AD_User_ID = 0;
	public CloseTable() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.compiere.process.SvrProcess#prepare()
	 */
	@Override
	protected void prepare() {
		ProcessInfoParameter[] parameter = getParameter();
		for(int i=0; i<parameter.length; i++)
		{
			String name = parameter[i].getParameterName();
			if(name == null)
				;
			else if(name.equals("AD_User_ID")) {
				p_AD_User_ID = parameter[i].getParameterAsInt();
			}
		}
		

	}

	/* (non-Javadoc)
	 * @see org.compiere.process.SvrProcess#doIt()
	 */
	@Override
	protected String doIt() throws Exception {
		List<MRSTableAllocation> tableAllocations = MRSTableAllocation.getByUser(getCtx(), p_AD_User_ID, get_TrxName());
		int qty = 0;
		for(int i=0; i < tableAllocations.size(); i++) {
			if(!tableAllocations.get(i).isClosed()) {
				tableAllocations.get(i).setIsClosed(true);
				tableAllocations.get(i).saveEx();
				qty++;
			}
		}		
		
		return Msg.getMsg(getCtx(), "Table Close ")+qty;
	}

}
