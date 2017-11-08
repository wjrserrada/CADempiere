/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.curso.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for RS_Table_Allocation
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_RS_Table_Allocation extends PO implements I_RS_Table_Allocation, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20171019L;

    /** Standard Constructor */
    public X_RS_Table_Allocation (Properties ctx, int RS_Table_Allocation_ID, String trxName)
    {
      super (ctx, RS_Table_Allocation_ID, trxName);
      /** if (RS_Table_Allocation_ID == 0)
        {
			setRS_Table_Allocation_ID (0);
        } */
    }

    /** Load Constructor */
    public X_RS_Table_Allocation (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_RS_Table_Allocation[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getC_BPartner_ID()));
    }

	/** Set Closed Status.
		@param IsClosed 
		The status is closed
	  */
	public void setIsClosed (boolean IsClosed)
	{
		set_Value (COLUMNNAME_IsClosed, Boolean.valueOf(IsClosed));
	}

	/** Get Closed Status.
		@return The status is closed
	  */
	public boolean isClosed () 
	{
		Object oo = get_Value(COLUMNNAME_IsClosed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Table_Allocation ID.
		@param RS_Table_Allocation_ID Table_Allocation ID	  */
	public void setRS_Table_Allocation_ID (int RS_Table_Allocation_ID)
	{
		if (RS_Table_Allocation_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RS_Table_Allocation_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RS_Table_Allocation_ID, Integer.valueOf(RS_Table_Allocation_ID));
	}

	/** Get Table_Allocation ID.
		@return Table_Allocation ID	  */
	public int getRS_Table_Allocation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RS_Table_Allocation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.curso.model.I_RS_Table getRS_Table() throws RuntimeException
    {
		return (org.curso.model.I_RS_Table)MTable.get(getCtx(), org.curso.model.I_RS_Table.Table_Name)
			.getPO(getRS_Table_ID(), get_TrxName());	}

	/** Set Table ID.
		@param RS_Table_ID Table ID	  */
	public void setRS_Table_ID (int RS_Table_ID)
	{
		if (RS_Table_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RS_Table_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RS_Table_ID, Integer.valueOf(RS_Table_ID));
	}

	/** Get Table ID.
		@return Table ID	  */
	public int getRS_Table_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RS_Table_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}