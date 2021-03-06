/*
 * generated by Xtext 2.12.0
 */
grammar InternalSvgTransform;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.svg.transform.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.svg.transform.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.svg.transform.services.SvgTransformGrammarAccess;

}

@parser::members {

 	private SvgTransformGrammarAccess grammarAccess;

    public InternalSvgTransformParser(TokenStream input, SvgTransformGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Transform";
   	}

   	@Override
   	protected SvgTransformGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTransform
entryRuleTransform returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransformRule()); }
	iv_ruleTransform=ruleTransform
	{ $current=$iv_ruleTransform.current; }
	EOF;

// Rule Transform
ruleTransform returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTransformAccess().getTransformTransformValueParserRuleCall_0_0());
				}
				lv_transform_0_0=ruleTransformValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransformRule());
					}
					add(
						$current,
						"transform",
						lv_transform_0_0,
						"org.xtext.svg.transform.SvgTransform.TransformValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_1=','
				{
					newLeafNode(otherlv_1, grammarAccess.getTransformAccess().getCommaKeyword_1_0());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getTransformAccess().getTransformTransformValueParserRuleCall_1_1_0());
					}
					lv_transform_2_0=ruleTransformValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransformRule());
						}
						add(
							$current,
							"transform",
							lv_transform_2_0,
							"org.xtext.svg.transform.SvgTransform.TransformValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTransformValue
entryRuleTransformValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransformValueRule()); }
	iv_ruleTransformValue=ruleTransformValue
	{ $current=$iv_ruleTransformValue.current; }
	EOF;

// Rule TransformValue
ruleTransformValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTransformValueAccess().getMatrixParserRuleCall_0());
		}
		this_Matrix_0=ruleMatrix
		{
			$current = $this_Matrix_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransformValueAccess().getTranslateParserRuleCall_1());
		}
		this_Translate_1=ruleTranslate
		{
			$current = $this_Translate_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransformValueAccess().getScaleParserRuleCall_2());
		}
		this_Scale_2=ruleScale
		{
			$current = $this_Scale_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransformValueAccess().getRotateParserRuleCall_3());
		}
		this_Rotate_3=ruleRotate
		{
			$current = $this_Rotate_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransformValueAccess().getSkewXParserRuleCall_4());
		}
		this_SkewX_4=ruleSkewX
		{
			$current = $this_SkewX_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTransformValueAccess().getSkewYParserRuleCall_5());
		}
		this_SkewY_5=ruleSkewY
		{
			$current = $this_SkewY_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMatrix
entryRuleMatrix returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMatrixRule()); }
	iv_ruleMatrix=ruleMatrix
	{ $current=$iv_ruleMatrix.current; }
	EOF;

// Rule Matrix
ruleMatrix returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='matrix'
		{
			newLeafNode(otherlv_0, grammarAccess.getMatrixAccess().getMatrixKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMatrixAccess().getANumberParserRuleCall_2_0());
				}
				lv_a_2_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMatrixRule());
					}
					set(
						$current,
						"a",
						lv_a_2_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getCommaKeyword_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMatrixAccess().getBNumberParserRuleCall_4_0());
				}
				lv_b_4_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMatrixRule());
					}
					set(
						$current,
						"b",
						lv_b_4_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getMatrixAccess().getCommaKeyword_5());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMatrixAccess().getCNumberParserRuleCall_6_0());
				}
				lv_c_6_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMatrixRule());
					}
					set(
						$current,
						"c",
						lv_c_6_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getMatrixAccess().getCommaKeyword_7());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMatrixAccess().getDNumberParserRuleCall_8_0());
				}
				lv_d_8_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMatrixRule());
					}
					set(
						$current,
						"d",
						lv_d_8_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_9=','
			{
				newLeafNode(otherlv_9, grammarAccess.getMatrixAccess().getCommaKeyword_9());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMatrixAccess().getENumberParserRuleCall_10_0());
				}
				lv_e_10_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMatrixRule());
					}
					set(
						$current,
						"e",
						lv_e_10_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_11=','
			{
				newLeafNode(otherlv_11, grammarAccess.getMatrixAccess().getCommaKeyword_11());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMatrixAccess().getFNumberParserRuleCall_12_0());
				}
				lv_f_12_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMatrixRule());
					}
					set(
						$current,
						"f",
						lv_f_12_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=')'
		{
			newLeafNode(otherlv_13, grammarAccess.getMatrixAccess().getRightParenthesisKeyword_13());
		}
	)
;

// Entry rule entryRuleTranslate
entryRuleTranslate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTranslateRule()); }
	iv_ruleTranslate=ruleTranslate
	{ $current=$iv_ruleTranslate.current; }
	EOF;

// Rule Translate
ruleTranslate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='translate'
		{
			newLeafNode(otherlv_0, grammarAccess.getTranslateAccess().getTranslateKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getTranslateAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTranslateAccess().getXNumberParserRuleCall_2_0());
				}
				lv_x_2_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTranslateRule());
					}
					set(
						$current,
						"x",
						lv_x_2_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getTranslateAccess().getCommaKeyword_3_0());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getTranslateAccess().getYNumberParserRuleCall_3_1_0());
					}
					lv_y_4_0=ruleNumber
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTranslateRule());
						}
						set(
							$current,
							"y",
							lv_y_4_0,
							"org.xtext.svg.transform.SvgTransform.Number");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getTranslateAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleScale
entryRuleScale returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScaleRule()); }
	iv_ruleScale=ruleScale
	{ $current=$iv_ruleScale.current; }
	EOF;

// Rule Scale
ruleScale returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='scale'
		{
			newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getScaleAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScaleAccess().getXNumberParserRuleCall_2_0());
				}
				lv_x_2_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScaleRule());
					}
					set(
						$current,
						"x",
						lv_x_2_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getScaleAccess().getCommaKeyword_3_0());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getScaleAccess().getYNumberParserRuleCall_3_1_0());
					}
					lv_y_4_0=ruleNumber
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScaleRule());
						}
						set(
							$current,
							"y",
							lv_y_4_0,
							"org.xtext.svg.transform.SvgTransform.Number");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getScaleAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleRotate
entryRuleRotate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateRule()); }
	iv_ruleRotate=ruleRotate
	{ $current=$iv_ruleRotate.current; }
	EOF;

// Rule Rotate
ruleRotate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rotate'
		{
			newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getRotateKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRotateAccess().getANumberParserRuleCall_2_0());
				}
				lv_a_2_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRotateRule());
					}
					set(
						$current,
						"a",
						lv_a_2_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getCommaKeyword_3_0());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getRotateAccess().getXNumberParserRuleCall_3_1_0());
					}
					lv_x_4_0=ruleNumber
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRotateRule());
						}
						set(
							$current,
							"x",
							lv_x_4_0,
							"org.xtext.svg.transform.SvgTransform.Number");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getRotateAccess().getCommaKeyword_3_2());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getRotateAccess().getYNumberParserRuleCall_3_3_0());
					}
					lv_y_6_0=ruleNumber
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRotateRule());
						}
						set(
							$current,
							"y",
							lv_y_6_0,
							"org.xtext.svg.transform.SvgTransform.Number");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getRotateAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleSkewX
entryRuleSkewX returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSkewXRule()); }
	iv_ruleSkewX=ruleSkewX
	{ $current=$iv_ruleSkewX.current; }
	EOF;

// Rule SkewX
ruleSkewX returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='skewX'
		{
			newLeafNode(otherlv_0, grammarAccess.getSkewXAccess().getSkewXKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSkewXAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSkewXAccess().getANumberParserRuleCall_2_0());
				}
				lv_a_2_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSkewXRule());
					}
					set(
						$current,
						"a",
						lv_a_2_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSkewXAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleSkewY
entryRuleSkewY returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSkewYRule()); }
	iv_ruleSkewY=ruleSkewY
	{ $current=$iv_ruleSkewY.current; }
	EOF;

// Rule SkewY
ruleSkewY returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='skewY'
		{
			newLeafNode(otherlv_0, grammarAccess.getSkewYAccess().getSkewYKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSkewYAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSkewYAccess().getANumberParserRuleCall_2_0());
				}
				lv_a_2_0=ruleNumber
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSkewYRule());
					}
					set(
						$current,
						"a",
						lv_a_2_0,
						"org.xtext.svg.transform.SvgTransform.Number");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSkewYAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current.getText(); }
	EOF;

// Rule Number
ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_0_0());
			}
			this_Integer_0=ruleInteger
			{
				$current.merge(this_Integer_0);
			}
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					kw='E'
					{
						$current.merge(kw);
						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_0_1_0_0());
					}
					    |
					kw='e'
					{
						$current.merge(kw);
						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_0_1_0_1());
					}
				)
				{
					newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_0_1_1());
				}
				this_Integer_3=ruleInteger
				{
					$current.merge(this_Integer_3);
				}
				{
					afterParserOrEnumRuleCall();
				}
			)?
		)
		    |
		(
			(
				kw='+'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_1_0_0());
				}
				    |
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_1_0_1());
				}
			)?
			(
				this_INT_6=RULE_INT
				{
					$current.merge(this_INT_6);
				}
				{
					newLeafNode(this_INT_6, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1());
				}
			)?
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_2());
			}
			this_INT_8=RULE_INT
			{
				$current.merge(this_INT_8);
			}
			{
				newLeafNode(this_INT_8, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_3());
			}
			(
				(
					kw='E'
					{
						$current.merge(kw);
						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_1_4_0_0());
					}
					    |
					kw='e'
					{
						$current.merge(kw);
						newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_1_4_0_1());
					}
				)
				{
					newCompositeNode(grammarAccess.getNumberAccess().getIntegerParserRuleCall_1_4_1());
				}
				this_Integer_11=ruleInteger
				{
					$current.merge(this_Integer_11);
				}
				{
					afterParserOrEnumRuleCall();
				}
			)?
		)
	)
;

// Entry rule entryRuleInteger
entryRuleInteger returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	iv_ruleInteger=ruleInteger
	{ $current=$iv_ruleInteger.current.getText(); }
	EOF;

// Rule Integer
ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='+'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIntegerAccess().getPlusSignKeyword_0_0());
			}
			    |
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_1());
			}
		)?
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
