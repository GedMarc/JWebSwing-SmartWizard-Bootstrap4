package com.jwebmp.plugins.smartwizard4.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class SmartWizard4ExclusionsModule
		implements IGuiceScanModuleExclusions<SmartWizard4ExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.smartwizard4");
		return strings;
	}
}
