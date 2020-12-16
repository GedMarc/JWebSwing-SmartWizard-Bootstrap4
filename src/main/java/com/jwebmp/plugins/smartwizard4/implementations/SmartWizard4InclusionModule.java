package com.jwebmp.plugins.smartwizard4.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class SmartWizard4InclusionModule implements IGuiceScanModuleInclusions<SmartWizard4InclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.smartwizard4");
		return set;
	}
}
