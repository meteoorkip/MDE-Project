/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.path.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.svg.path.parser.antlr.internal.InternalSvgPathParser;
import org.xtext.svg.path.services.SvgPathGrammarAccess;

public class SvgPathParser extends AbstractAntlrParser {

	@Inject
	private SvgPathGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSvgPathParser createParser(XtextTokenStream stream) {
		return new InternalSvgPathParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Path";
	}

	public SvgPathGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SvgPathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
