/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.viewbox


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SvgViewboxStandaloneSetup extends SvgViewboxStandaloneSetupGenerated {

	def static void doSetup() {
		new SvgViewboxStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
