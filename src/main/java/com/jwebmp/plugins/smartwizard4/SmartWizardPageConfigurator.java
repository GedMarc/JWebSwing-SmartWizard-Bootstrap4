/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.smartwizard4;

import com.google.inject.Singleton;
import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

@PluginInformation(pluginName = "Smart Wizard",
		pluginUniqueName = "smart-wizard",
		pluginDescription = "The awesome jQuery step wizard plugin with Bootstrap support",
		pluginVersion = "4",
		pluginDependancyUniqueIDs = "jquery,bootstrap",
		pluginCategories = "smartwizard,bootstrap,forms,angular,validation,wizard",
		pluginSubtitle = "The awesome jQuery step wizard plugin with Bootstrap support",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-SmartWizard",
		pluginSourceUrl = "https://github.com/GedMarc/JWebMP-SmartWizard",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-SmartWizard/wiki",
		pluginOriginalHomepage = "http://techlaboratory.net/angularfileupload/documentation",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.forms/jwebmp-smart-wizard",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2020/12/16",
		pluginGroupId = "com.jwebmp.plugins.forms",
		pluginArtifactId = "jwebmp-smart-wizard",
		pluginModuleName = "com.jwebmp.plugins.smartwizard4",
		pluginStatus = PluginStatus.Released
)
@Singleton
@SuppressWarnings("unused")
public class SmartWizardPageConfigurator
		implements IPageConfigurator<SmartWizardPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	private static SmartWizardThemes theme = SmartWizardThemes.Circles;

	/**
	 * Configures the page for this component
	 */
	public SmartWizardPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return SmartWizardPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		SmartWizardPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Gets the current theme
	 *
	 * @return
	 */
	public static SmartWizardThemes getTheme()
	{
		return SmartWizardPageConfigurator.theme;
	}

	/**
	 * Sets the current theme
	 *
	 * @param theme
	 */
	public static void setTheme(SmartWizardThemes theme)
	{
		SmartWizardPageConfigurator.theme = theme;
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.addJavaScriptReference(SmartWizardReferencePool.SmartWizardReference.getJavaScriptReference());
			page.addCssReference(SmartWizardReferencePool.SmartWizardReference.getCssReference());
			page.addCssReference(SmartWizardPageConfigurator.theme.getThemeReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return SmartWizardPageConfigurator.enabled;
	}
}
