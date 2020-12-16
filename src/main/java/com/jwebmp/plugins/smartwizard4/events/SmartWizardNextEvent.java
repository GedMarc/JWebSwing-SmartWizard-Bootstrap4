package com.jwebmp.plugins.smartwizard4.events;

import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.smartwizard4.ISmartWizardEvents;

public abstract class SmartWizardNextEvent
		extends Event<GlobalFeatures,SmartWizardNextEvent>
		implements ISmartWizardEvents
{

	public SmartWizardNextEvent()
	{
		super("SmartWizardNextEvent");
	}

	@Override
	public void fireEvent(AjaxCall<?> call, AjaxResponse<?> response)
	{
		super.fireEvent(call, response);
		onNext(call, response);
	}

	public abstract void onNext(AjaxCall<?> call, AjaxResponse<?> response);
}
