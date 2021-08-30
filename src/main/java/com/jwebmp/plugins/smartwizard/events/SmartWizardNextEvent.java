package com.jwebmp.plugins.smartwizard.events;

import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.smartwizard.ISmartWizardEvents;

public abstract class SmartWizardNextEvent<J extends SmartWizardNextEvent<J>>
		extends Event<GlobalFeatures,J>
		implements ISmartWizardEvents<J>
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
