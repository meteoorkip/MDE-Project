/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.length.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SvgLengthGrammarAccess extends AbstractGrammarElementFinder {
	
	public class LengthElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.length.SvgLength.Length");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNumberAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNumberNumberParserRuleCall_0_0 = (RuleCall)cNumberAssignment_0.eContents().get(0);
		private final Assignment cUnitAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUnitUnitEnumRuleCall_1_0 = (RuleCall)cUnitAssignment_1.eContents().get(0);
		
		//Length:
		//	number=Number unit=Unit?;
		@Override public ParserRule getRule() { return rule; }
		
		//number=Number unit=Unit?
		public Group getGroup() { return cGroup; }
		
		//number=Number
		public Assignment getNumberAssignment_0() { return cNumberAssignment_0; }
		
		//Number
		public RuleCall getNumberNumberParserRuleCall_0_0() { return cNumberNumberParserRuleCall_0_0; }
		
		//unit=Unit?
		public Assignment getUnitAssignment_1() { return cUnitAssignment_1; }
		
		//Unit
		public RuleCall getUnitUnitEnumRuleCall_1_0() { return cUnitUnitEnumRuleCall_1_0; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.length.SvgLength.Number");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cIntegerParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Alternatives cAlternatives_0_1_0 = (Alternatives)cGroup_0_1.eContents().get(0);
		private final Keyword cEKeyword_0_1_0_0 = (Keyword)cAlternatives_0_1_0.eContents().get(0);
		private final Keyword cEKeyword_0_1_0_1 = (Keyword)cAlternatives_0_1_0.eContents().get(1);
		private final RuleCall cIntegerParserRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cFullStopKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		private final Group cGroup_1_4 = (Group)cGroup_1.eContents().get(4);
		private final Alternatives cAlternatives_1_4_0 = (Alternatives)cGroup_1_4.eContents().get(0);
		private final Keyword cEKeyword_1_4_0_0 = (Keyword)cAlternatives_1_4_0.eContents().get(0);
		private final Keyword cEKeyword_1_4_0_1 = (Keyword)cAlternatives_1_4_0.eContents().get(1);
		private final RuleCall cIntegerParserRuleCall_1_4_1 = (RuleCall)cGroup_1_4.eContents().get(1);
		
		//Number ecore::EBigDecimal:
		//	Integer (('E' | 'e') Integer)? | ('+' | '-')? INT? '.' INT (('E' | 'e') Integer)?;
		@Override public ParserRule getRule() { return rule; }
		
		//Integer (('E' | 'e') Integer)? | ('+' | '-')? INT? '.' INT (('E' | 'e') Integer)?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Integer (('E' | 'e') Integer)?
		public Group getGroup_0() { return cGroup_0; }
		
		//Integer
		public RuleCall getIntegerParserRuleCall_0_0() { return cIntegerParserRuleCall_0_0; }
		
		//(('E' | 'e') Integer)?
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//'E' | 'e'
		public Alternatives getAlternatives_0_1_0() { return cAlternatives_0_1_0; }
		
		//'E'
		public Keyword getEKeyword_0_1_0_0() { return cEKeyword_0_1_0_0; }
		
		//'e'
		public Keyword getEKeyword_0_1_0_1() { return cEKeyword_0_1_0_1; }
		
		//Integer
		public RuleCall getIntegerParserRuleCall_0_1_1() { return cIntegerParserRuleCall_0_1_1; }
		
		//('+' | '-')? INT? '.' INT (('E' | 'e') Integer)?
		public Group getGroup_1() { return cGroup_1; }
		
		//('+' | '-')?
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0() { return cPlusSignKeyword_1_0_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1() { return cHyphenMinusKeyword_1_0_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_2() { return cFullStopKeyword_1_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_3() { return cINTTerminalRuleCall_1_3; }
		
		//(('E' | 'e') Integer)?
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//'E' | 'e'
		public Alternatives getAlternatives_1_4_0() { return cAlternatives_1_4_0; }
		
		//'E'
		public Keyword getEKeyword_1_4_0_0() { return cEKeyword_1_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_1_4_0_1() { return cEKeyword_1_4_0_1; }
		
		//Integer
		public RuleCall getIntegerParserRuleCall_1_4_1() { return cIntegerParserRuleCall_1_4_1; }
	}
	public class IntegerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.length.SvgLength.Integer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Integer ecore::EBigInteger:
		//	('+' | '-')? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//('+' | '-')? INT
		public Group getGroup() { return cGroup; }
		
		//('+' | '-')?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_0_0() { return cPlusSignKeyword_0_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_0_1() { return cHyphenMinusKeyword_0_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	public class UnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.svg.length.SvgLength.Unit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPxEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPxPxKeyword_0_0 = (Keyword)cPxEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEmEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEmEmKeyword_1_0 = (Keyword)cEmEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cExEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cExExKeyword_2_0 = (Keyword)cExEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cInEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cInInKeyword_3_0 = (Keyword)cInEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cCmEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cCmCmKeyword_4_0 = (Keyword)cCmEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cMmEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cMmMmKeyword_5_0 = (Keyword)cMmEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cPtEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cPtPtKeyword_6_0 = (Keyword)cPtEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cPcEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cPcPcKeyword_7_0 = (Keyword)cPcEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cPercentageEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cPercentagePercentSignKeyword_8_0 = (Keyword)cPercentageEnumLiteralDeclaration_8.eContents().get(0);
		
		//enum Unit:
		//	px | em | ex | in | cm | mm | pt | pc | percentage='%';
		public EnumRule getRule() { return rule; }
		
		//px | em | ex | in | cm | mm | pt | pc | percentage='%'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//px
		public EnumLiteralDeclaration getPxEnumLiteralDeclaration_0() { return cPxEnumLiteralDeclaration_0; }
		
		//'px'
		public Keyword getPxPxKeyword_0_0() { return cPxPxKeyword_0_0; }
		
		//em
		public EnumLiteralDeclaration getEmEnumLiteralDeclaration_1() { return cEmEnumLiteralDeclaration_1; }
		
		//'em'
		public Keyword getEmEmKeyword_1_0() { return cEmEmKeyword_1_0; }
		
		//ex
		public EnumLiteralDeclaration getExEnumLiteralDeclaration_2() { return cExEnumLiteralDeclaration_2; }
		
		//'ex'
		public Keyword getExExKeyword_2_0() { return cExExKeyword_2_0; }
		
		//in
		public EnumLiteralDeclaration getInEnumLiteralDeclaration_3() { return cInEnumLiteralDeclaration_3; }
		
		//'in'
		public Keyword getInInKeyword_3_0() { return cInInKeyword_3_0; }
		
		//cm
		public EnumLiteralDeclaration getCmEnumLiteralDeclaration_4() { return cCmEnumLiteralDeclaration_4; }
		
		//'cm'
		public Keyword getCmCmKeyword_4_0() { return cCmCmKeyword_4_0; }
		
		//mm
		public EnumLiteralDeclaration getMmEnumLiteralDeclaration_5() { return cMmEnumLiteralDeclaration_5; }
		
		//'mm'
		public Keyword getMmMmKeyword_5_0() { return cMmMmKeyword_5_0; }
		
		//pt
		public EnumLiteralDeclaration getPtEnumLiteralDeclaration_6() { return cPtEnumLiteralDeclaration_6; }
		
		//'pt'
		public Keyword getPtPtKeyword_6_0() { return cPtPtKeyword_6_0; }
		
		//pc
		public EnumLiteralDeclaration getPcEnumLiteralDeclaration_7() { return cPcEnumLiteralDeclaration_7; }
		
		//'pc'
		public Keyword getPcPcKeyword_7_0() { return cPcPcKeyword_7_0; }
		
		//percentage='%'
		public EnumLiteralDeclaration getPercentageEnumLiteralDeclaration_8() { return cPercentageEnumLiteralDeclaration_8; }
		
		//'%'
		public Keyword getPercentagePercentSignKeyword_8_0() { return cPercentagePercentSignKeyword_8_0; }
	}
	
	private final LengthElements pLength;
	private final NumberElements pNumber;
	private final IntegerElements pInteger;
	private final UnitElements eUnit;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SvgLengthGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pLength = new LengthElements();
		this.pNumber = new NumberElements();
		this.pInteger = new IntegerElements();
		this.eUnit = new UnitElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.svg.length.SvgLength".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Length:
	//	number=Number unit=Unit?;
	public LengthElements getLengthAccess() {
		return pLength;
	}
	
	public ParserRule getLengthRule() {
		return getLengthAccess().getRule();
	}
	
	//Number ecore::EBigDecimal:
	//	Integer (('E' | 'e') Integer)? | ('+' | '-')? INT? '.' INT (('E' | 'e') Integer)?;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//Integer ecore::EBigInteger:
	//	('+' | '-')? INT;
	public IntegerElements getIntegerAccess() {
		return pInteger;
	}
	
	public ParserRule getIntegerRule() {
		return getIntegerAccess().getRule();
	}
	
	//enum Unit:
	//	px | em | ex | in | cm | mm | pt | pc | percentage='%';
	public UnitElements getUnitAccess() {
		return eUnit;
	}
	
	public EnumRule getUnitRule() {
		return getUnitAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
