/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.preserveaspectratio


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SvgPreserveAspectRatioStandaloneSetup extends SvgPreserveAspectRatioStandaloneSetupGenerated {

	def static void doSetup() {
		new SvgPreserveAspectRatioStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
