/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.lengths.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.svg.lengths.parser.antlr.internal.InternalSvgLengthsParser;
import org.xtext.svg.lengths.services.SvgLengthsGrammarAccess;

public class SvgLengthsParser extends AbstractAntlrParser {

	@Inject
	private SvgLengthsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSvgLengthsParser createParser(XtextTokenStream stream) {
		return new InternalSvgLengthsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "StrokeDashArray";
	}

	public SvgLengthsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SvgLengthsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
