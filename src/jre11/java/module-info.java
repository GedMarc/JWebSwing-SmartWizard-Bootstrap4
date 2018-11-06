import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.smartwizard4.SmartWizardPageConfigurator;
import com.jwebmp.plugins.smartwizard4.implementations.SmartWizard4ExclusionsModule;

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
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with SmartWizardPageConfigurator;

	provides IGuiceScanModuleExclusions with SmartWizard4ExclusionsModule;
	provides IGuiceScanJarExclusions with SmartWizard4ExclusionsModule;

	opens com.jwebmp.plugins.smartwizard4 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard4.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard4.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.smartwizard4.events to com.fasterxml.jackson.databind, com.jwebmp.core;
}
