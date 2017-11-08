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

/** Generated Model for H_QueryLine
 *  @author Adempiere (generated) 
 *  @version Release 3.8.0 - $Id$ */
public class X_H_QueryLine extends PO implements I_H_QueryLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20171103L;

    /** Standard Constructor */
    public X_H_QueryLine (Properties ctx, int H_QueryLine_ID, String trxName)
    {
      super (ctx, H_QueryLine_ID, trxName);
      /** if (H_QueryLine_ID == 0)
        {
			setH_QueryLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_H_QueryLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_H_QueryLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	public org.curso.model.I_H_Affliction getH_Affliction() throws RuntimeException
    {
		return (org.curso.model.I_H_Affliction)MTable.get(getCtx(), org.curso.model.I_H_Affliction.Table_Name)
			.getPO(getH_Affliction_ID(), get_TrxName());	}

	/** Set Affliction ID.
		@param H_Affliction_ID Affliction ID	  */
	public void setH_Affliction_ID (int H_Affliction_ID)
	{
		if (H_Affliction_ID < 1) 
			set_Value (COLUMNNAME_H_Affliction_ID, null);
		else 
			set_Value (COLUMNNAME_H_Affliction_ID, Integer.valueOf(H_Affliction_ID));
	}

	/** Get Affliction ID.
		@return Affliction ID	  */
	public int getH_Affliction_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_H_Affliction_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.curso.model.I_H_Query getH_Query() throws RuntimeException
    {
		return (org.curso.model.I_H_Query)MTable.get(getCtx(), org.curso.model.I_H_Query.Table_Name)
			.getPO(getH_Query_ID(), get_TrxName());	}

	/** Set Query ID.
		@param H_Query_ID Query ID	  */
	public void setH_Query_ID (int H_Query_ID)
	{
		if (H_Query_ID < 1) 
			set_Value (COLUMNNAME_H_Query_ID, null);
		else 
			set_Value (COLUMNNAME_H_Query_ID, Integer.valueOf(H_Query_ID));
	}

	/** Get Query ID.
		@return Query ID	  */
	public int getH_Query_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_H_Query_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set QueryLine ID.
		@param H_QueryLine_ID QueryLine ID	  */
	public void setH_QueryLine_ID (int H_QueryLine_ID)
	{
		if (H_QueryLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_H_QueryLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_H_QueryLine_ID, Integer.valueOf(H_QueryLine_ID));
	}

	/** Get QueryLine ID.
		@return QueryLine ID	  */
	public int getH_QueryLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_H_QueryLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}