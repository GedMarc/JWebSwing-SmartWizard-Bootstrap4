package com.jwebmp.plugins.smartwizard4.events;

import com.jwebmp.core.Event;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.smartwizard4.ISmartWizardEvents;

public abstract class SmartWizardCancelEvent
		extends Event<GlobalFeatures,SmartWizardCancelEvent>
		implements ISmartWizardEvents
{

	public SmartWizardCancelEvent()
	{
		super("SmartWizardCancelEvent");
	}

	public SmartWizardCancelEvent(ComponentHierarchyBase component)
	{
		super(component);
	}

	@Override
	public void fireEvent(AjaxCall<?> call, AjaxResponse<?> response)
	{
		super.fireEvent(call, response);
		onCancel(call, response);
	}

	public abstract void onCancel(AjaxCall<?> call, AjaxResponse<?> response);

	@Override
	protected void assignFunctionsToComponent()
	{
		//addQuery();
	}
}
