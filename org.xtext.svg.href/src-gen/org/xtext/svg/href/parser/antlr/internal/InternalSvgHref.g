/*
 * generated by Xtext 2.12.0
 */
grammar InternalSvgHref;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.svg.href.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.svg.href.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.svg.href.services.SvgHrefGrammarAccess;

}

@parser::members {

 	private SvgHrefGrammarAccess grammarAccess;

    public InternalSvgHrefParser(TokenStream input, SvgHrefGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Href";
   	}

   	@Override
   	protected SvgHrefGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleHref
entryRuleHref returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHrefRule()); }
	iv_ruleHref=ruleHref
	{ $current=$iv_ruleHref.current; }
	EOF;

// Rule Href
ruleHref returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getHrefAccess().getLocalIriParserRuleCall_0());
		}
		this_LocalIri_0=ruleLocalIri
		{
			$current = $this_LocalIri_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHrefAccess().getBase64RefParserRuleCall_1());
		}
		this_Base64Ref_1=ruleBase64Ref
		{
			$current = $this_Base64Ref_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLocalIri
entryRuleLocalIri returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocalIriRule()); }
	iv_ruleLocalIri=ruleLocalIri
	{ $current=$iv_ruleLocalIri.current; }
	EOF;

// Rule LocalIri
ruleLocalIri returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='url'
		{
			newLeafNode(otherlv_0, grammarAccess.getLocalIriAccess().getUrlKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getLocalIriAccess().getLeftParenthesisKeyword_1());
		}
		otherlv_2='#'
		{
			newLeafNode(otherlv_2, grammarAccess.getLocalIriAccess().getNumberSignKeyword_2());
		}
		(
			(
				lv_elementName_3_0=RULE_ID
				{
					newLeafNode(lv_elementName_3_0, grammarAccess.getLocalIriAccess().getElementNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLocalIriRule());
					}
					setWithLastConsumed(
						$current,
						"elementName",
						lv_elementName_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getLocalIriAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleBase64Ref
entryRuleBase64Ref returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBase64RefRule()); }
	iv_ruleBase64Ref=ruleBase64Ref
	{ $current=$iv_ruleBase64Ref.current; }
	EOF;

// Rule Base64Ref
ruleBase64Ref returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='data'
		{
			newLeafNode(otherlv_0, grammarAccess.getBase64RefAccess().getDataKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getBase64RefAccess().getColonKeyword_1());
		}
		(
			(
				lv_base64_2_0=RULE_BASE64_STRING
				{
					newLeafNode(lv_base64_2_0, grammarAccess.getBase64RefAccess().getBase64BASE64_STRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBase64RefRule());
					}
					setWithLastConsumed(
						$current,
						"base64",
						lv_base64_2_0,
						"org.xtext.svg.href.SvgHref.BASE64_STRING");
				}
			)
		)
	)
;

RULE_BASE64_STRING : RULE_ID '/' RULE_ID ';' RULE_ID ',' ('A'..'Z'|'a'..'z'|'0'..'9'|'+'|'/'|'=')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
