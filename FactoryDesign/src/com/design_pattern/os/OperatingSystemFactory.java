package com.design_pattern.os;

public class OperatingSystemFactory 
{
	public OS getOS(String msg)
	{
		if(msg.equals("Open"))
		{
			return new Android();
		}
		else if(msg.equals("Closed"))
		{
			return new IOS();
		}
		return new Windows();
	}
}
