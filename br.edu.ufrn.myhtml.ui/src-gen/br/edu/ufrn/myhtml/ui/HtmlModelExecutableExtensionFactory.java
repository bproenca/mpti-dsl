/*
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.ui;

import br.edu.ufrn.myhtml.ui.internal.MyhtmlActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HtmlModelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MyhtmlActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MyhtmlActivator activator = MyhtmlActivator.getInstance();
		return activator != null ? activator.getInjector(MyhtmlActivator.BR_EDU_UFRN_MYHTML_HTMLMODEL) : null;
	}

}