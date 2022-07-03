package com.originalui;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class OriginalUIPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(OriginalUPlugin.class);
		RuneLite.main(args);
	}
}