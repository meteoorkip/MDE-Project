/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.href


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SvgHrefStandaloneSetup extends SvgHrefStandaloneSetupGenerated {

	def static void doSetup() {
		new SvgHrefStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}