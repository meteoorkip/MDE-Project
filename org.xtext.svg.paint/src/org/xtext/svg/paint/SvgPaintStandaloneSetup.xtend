/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.paint


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SvgPaintStandaloneSetup extends SvgPaintStandaloneSetupGenerated {

	def static void doSetup() {
		new SvgPaintStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}