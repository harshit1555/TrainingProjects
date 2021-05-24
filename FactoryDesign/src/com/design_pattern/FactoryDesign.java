package com.design_pattern;

import com.design_pattern.os.Android;
import com.design_pattern.os.IOS;
import com.design_pattern.os.OS;
import com.design_pattern.os.OperatingSystemFactory;
import com.design_pattern.os.Windows;

public class FactoryDesign 
{
	public static void main(String[] args)
	{
		OperatingSystemFactory obj=new OperatingSystemFactory();
		OS os=obj.getOS("Closed");
		os.getOS();
	}
			
}
