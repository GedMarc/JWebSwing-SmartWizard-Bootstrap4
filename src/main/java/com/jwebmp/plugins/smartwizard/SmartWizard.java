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

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.children.ListChildren;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.smartwizard.interfaces.SmartWizardFeatures;

import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@ComponentInformation(name = "SmartWizard",
		description = "Smart Wizard is a flexible and heavily customizable jQuery step wizard plugin " + "with Bootstrap support. ",
		url = "https://github.com/GedMarc/JWebMP-SmartWizard")
public class SmartWizard<J extends SmartWizard<J>>
		extends Div<GlobalChildren, NoAttributes, SmartWizardFeatures, com.jwebmp.plugins.smartwizard.ISmartWizardEvents, J>
{
	/**
	 * My Feature
	 */
	private final com.jwebmp.plugins.smartwizard.SmartWizardFeature feature;
	/**
	 * The actual steps
	 */
	private List<SmartWizardStep<?>> steps;

	/**
	 * Configures the page for this component
	 */
	public SmartWizard(String id)
	{
		setID(id);
		feature = new com.jwebmp.plugins.smartwizard.SmartWizardFeature(this);
		addFeature(feature);
	}

	@Override
	public SmartWizardOptions<?> getOptions()
	{
		return feature.getOptions();
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			com.jwebmp.core.base.html.List<ListChildren,?,?,?> stepList = new com.jwebmp.core.base.html.List<>().addClass("nav");
			DivSimple<?> actualContent = new DivSimple<>().addClass("tab-content");
			List<SmartWizardStep<?>> steps1 = getSteps();
			for (int i = 0; i < steps1.size(); i++)
			{
				SmartWizardStep<?> step = steps1.get(i);
				step.getStepContents().addClass("tab-pane");
				step.getStepContents().asAttributeBase().addAttribute("role","tabpanel");
				actualContent.add(step.getStepContents());

				String id = "step_" + step.getStepTitle()
				                          .getID() + "_" + i;

				stepList.add(step.getStepTitle());

				step.getStepTitle().init();
				step.getStepTitle()
				    .getStepLink()
				    .setDirectToAddress("#" + id);

				step.getStepContents()
				    .setID(id);
			}
			add(stepList);
			stepList.init();
			add(actualContent);
			actualContent.init();
		}
		super.init();
	}

	/**
	 * Gets the current steps for this wizard
	 *
	 * @return
	 */
	@NotNull
	public List<com.jwebmp.plugins.smartwizard.SmartWizardStep<?>> getSteps()
	{
		if (steps == null)
		{
			setSteps(new ArrayList<>());
		}
		return steps;
	}

	/**
	 * Sets the steps for this Smart Wizard
	 *
	 * @param steps
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setSteps(@NotNull List<com.jwebmp.plugins.smartwizard.SmartWizardStep<?>> steps)
	{
		this.steps = steps;
		return (J) this;
	}

	/**
	 * Convenience method to open up all tabs for a wizard
	 *
	 * @return this
	 */
	@SuppressWarnings("unchecked")
	public J openAllTabs()
	{
		getOptions()
				.getAnchorSettings()
				.setEnableAllAnchors(true)
				.setMarkDoneStep(true)
				.setMarkAllPreviousStepsAsDone(true)
				.setAnchorClickable(true);
		return (J)this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J addStep(SmartWizardStep<?> step)
	{
		getSteps().add(step);
		return (J) this;
	}

	/**
	 * Returns this feature
	 *
	 * @return
	 */
	@NotNull
	public com.jwebmp.plugins.smartwizard.SmartWizardFeature getFeature()
	{
		return feature;
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
