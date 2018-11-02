package com.jwebmp.plugins.smartwizard4;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.SmallText;
import org.junit.jupiter.api.Test;

public class SmartWizardTest
{
	@Test
	public void testSmart()
	{
		SmartWizard sm = new SmartWizard("id");
		sm.addStep(new SmartWizardStep(new Div<>().add("Contents")
		                                          .setID("cnid"), new SmartWizardStepItem("description", new SmallText<>("smallText").setID("smid"))));

		System.out.println(sm.toString(0));
	}
}