/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.coordinate.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SvgCoordinateAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/svg/coordinate/parser/antlr/internal/InternalSvgCoordinate.tokens");
	}
}
