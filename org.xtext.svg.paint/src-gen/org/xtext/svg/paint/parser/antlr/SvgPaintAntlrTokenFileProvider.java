/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.paint.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SvgPaintAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/svg/paint/parser/antlr/internal/InternalSvgPaint.tokens");
	}
}
