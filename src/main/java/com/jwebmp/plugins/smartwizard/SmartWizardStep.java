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

import com.jwebmp.core.base.html.DivSimple;

public class SmartWizardStep<J extends SmartWizardStep<J>>
{
	/**
	 * The actual contents of the step
	 */
	private DivSimple<?> stepContents;
	/**
	 * The step title
	 */
	private SmartWizardStepItem<?> stepTitle;

	/**
	 * Initial Constructor
	 */
	private SmartWizardStep()
	{
		//Nothing Needed
	}

	/**
	 * Construct a new Smart Wizard Step with the given items
	 *
	 * @param stepContents
	 * @param stepTitle
	 * @param stepDescription
	 */
	public SmartWizardStep(DivSimple<?> stepContents, String stepTitle, String stepDescription)
	{
		this.stepContents = stepContents;
		stepContents.addClass("tab-pane");
		this.stepTitle = new SmartWizardStepItem<>(stepTitle, stepDescription);
	}

	/**
	 * Construct a new Smart Wizard Step with the given items
	 *
	 * @param stepContents
	 * @param stepTitle
	 */
	public SmartWizardStep(DivSimple<?> stepContents, String stepTitle)
	{
		this.stepContents = stepContents;
		stepContents.addClass("tab-pane");
		this.stepTitle = new SmartWizardStepItem<>(stepTitle);
	}

	/**
	 * Construct a new Smart Wizard Step with the given items
	 *
	 * @param stepContents
	 * @param stepTitle
	 */
	public SmartWizardStep(DivSimple<?> stepContents, SmartWizardStepItem<?> stepTitle)
	{
		this.stepContents = stepContents;
		stepContents.addClass("tab-pane");
		this.stepTitle = stepTitle;
	}

	/**
	 * Returns the step contents
	 *
	 * @return
	 */
	public DivSimple<?> getStepContents()
	{
		return stepContents;
	}

	/**
	 * Sets the step contents for this item
	 *
	 * @param stepContents
	 *
	 * @return
	 */
	public SmartWizardStep<?> setStepContents(DivSimple<?> stepContents)
	{
		this.stepContents = stepContents;
		return this;
	}

	/**
	 * Returns the step title
	 *
	 * @return
	 */
	public SmartWizardStepItem<?> getStepTitle()
	{
		return stepTitle;
	}

	/**
	 * @param stepTitle
	 *
	 * @return
	 */
	public SmartWizardStep<?> setStepTitle(SmartWizardStepItem<?> stepTitle)
	{
		this.stepTitle = stepTitle;
		return this;
	}
}
