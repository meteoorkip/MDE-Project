/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.preserveaspectratio.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SvgPreserveAspectRatioAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/svg/preserveaspectratio/parser/antlr/internal/InternalSvgPreserveAspectRatio.tokens");
	}
}