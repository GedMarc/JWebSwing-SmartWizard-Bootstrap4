import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.smartwizard4.SmartWizardPageConfigurator;

module com.jwebmp.plugins.smartwizard4 {

	exports com.jwebmp.plugins.smartwizard4;
	exports com.jwebmp.plugins.smartwizard4.events;
	exports com.jwebmp.plugins.smartwizard4.interfaces;
	exports com.jwebmp.plugins.smartwizard4.options;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.google.guice;

	provides IPageConfigurator with SmartWizardPageConfigurator;
	opens com.jwebmp.plugins.smartwizard4 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard4.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard4.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard4.events to com.fasterxml.jackson.databind, com.jwebmp.core;
}
