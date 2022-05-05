package com;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class RequestAttributeDemoListener implements ServletRequestAttributeListener{
	
	public void attributeAdded(ServletRequestAttributeEvent e)
	{
	System.out.println(e.getName()+"... Attribute Added"+e.getValue());
	}
	public void attributeRemoved(ServletRequestAttributeEvent e)
	{
	System.out.println(e.getName()+"...Attribute Removed");
	}
	public void attributeReplaced(ServletRequestAttributeEvent e)
	{
	System.out.println(e.getName()+"...Attribute Replaced..."+e.getValue());
	}

}
