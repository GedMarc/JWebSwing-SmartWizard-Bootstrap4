import com.jwebmp.plugins.smartwizard.implementations.SmartWizard4InclusionModule;

module com.jwebmp.plugins.smartwizard {

	exports com.jwebmp.plugins.smartwizard;
	exports com.jwebmp.plugins.smartwizard.events;
	exports com.jwebmp.plugins.smartwizard.interfaces;
	exports com.jwebmp.plugins.smartwizard.options;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.google.guice;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.smartwizard.SmartWizardPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with SmartWizard4InclusionModule;
	
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.smartwizard.implementations.SmartWizard4ExclusionsModule;

	opens com.jwebmp.plugins.smartwizard to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard.events to com.fasterxml.jackson.databind, com.jwebmp.core;
}
