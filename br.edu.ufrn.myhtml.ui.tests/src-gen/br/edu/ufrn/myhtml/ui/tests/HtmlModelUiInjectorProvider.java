/*
 * generated by Xtext 2.26.0.M2
 */
package br.edu.ufrn.myhtml.ui.tests;

import br.edu.ufrn.myhtml.ui.internal.MyhtmlActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class HtmlModelUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MyhtmlActivator.getInstance().getInjector("br.edu.ufrn.myhtml.HtmlModel");
	}

}
