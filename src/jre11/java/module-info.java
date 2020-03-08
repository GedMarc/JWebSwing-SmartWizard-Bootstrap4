module com.jwebmp.plugins.smartwizard4 {

	exports com.jwebmp.plugins.smartwizard4;
	exports com.jwebmp.plugins.smartwizard4.events;
	exports com.jwebmp.plugins.smartwizard4.interfaces;
	exports com.jwebmp.plugins.smartwizard4.options;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.google.guice;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.smartwizard4.SmartWizardPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.smartwizard4.implementations.SmartWizard4ExclusionsModule;

	opens com.jwebmp.plugins.smartwizard4 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard4.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard4.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard4.events to com.fasterxml.jackson.databind, com.jwebmp.core;
}
