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

package com.jwebmp.plugins.smartwizard;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.plugins.smartwizard.interfaces.ISmartWizardTheme;

public enum SmartWizardThemes
		implements ISmartWizardTheme
{
	All(new CSSReference("SmartWizardArrowsThemeArrows", 1.0, "bower_components/smartwizard/dist/css/smart_wizard_all.min.css")),
	Arrows(new CSSReference("SmartWizardArrowsThemeArrows", 1.0, "bower_components/smartwizard/dist/css/smart_wizard_arrows.min.css")),
	Circles(new CSSReference("SmartWizardArrowsThemeCircles", 1.0, "bower_components/smartwizard/dist/css/smart_wizard_dots.min.css")),
	Dark(new CSSReference("SmartWizardArrowsThemeDark", 1.0, "bower_components/smartwizard/dist/css/smart_wizard_dark.min.css")),
	Progress(new CSSReference("SmartWizardArrowsThemeProgress", 1.0, "bower_components/smartwizard/dist/css/smart_wizard_progress.min.css")),
	;

	private CSSReference themeReference;

	SmartWizardThemes(CSSReference themeReference)
	{
		this.themeReference = themeReference;
	}

	public CSSReference getThemeReference()
	{
		return themeReference;
	}

	public void setThemeReference(CSSReference themeReference)
	{
		this.themeReference = themeReference;
	}

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase();
	}
}
