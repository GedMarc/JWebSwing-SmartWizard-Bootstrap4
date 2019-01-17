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

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.SmallText;

public class SmartWizardStepItem<J extends SmartWizardStepItem<J>>
		extends ListItem<J>
{
	private String title;
	private Link stepLink;
	private SmallText stepDescription;

	public SmartWizardStepItem(String title)
	{
		this.title = title;
		this.stepDescription = null;
	}


	public SmartWizardStepItem(String title, String stepDescription)
	{
		this.title = title;
		this.stepDescription = new SmallText(stepDescription);
	}

	public SmartWizardStepItem(String title, SmallText stepDescription)
	{
		this.title = title;
		this.stepDescription = stepDescription;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void init()
	{
		if (!isInitialized())
		{
			if (stepLink == null)
			{
				stepLink = new Link<>("#step_" + getID()).setText(title + "<br/>");
			}
			stepLink.setRenderTextBeforeChildren(true);
			if(stepDescription != null)
			stepLink.add(stepDescription);
			add(stepLink);
		}
		super.init();
	}

	public String getTitle()
	{
		return title;
	}

	public SmartWizardStepItem setTitle(String title)
	{
		this.title = title;
		return this;
	}

	public Link getStepLink()
	{
		return stepLink;
	}

	public SmartWizardStepItem setStepLink(Link stepLink)
	{
		this.stepLink = stepLink;
		return this;
	}

	public SmallText getStepDescription()
	{
		return stepDescription;
	}

	public SmartWizardStepItem setStepDescription(SmallText stepDescription)
	{
		this.stepDescription = stepDescription;
		return this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
