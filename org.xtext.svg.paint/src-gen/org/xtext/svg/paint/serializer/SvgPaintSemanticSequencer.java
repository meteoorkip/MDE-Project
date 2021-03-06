/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.paint.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.svg.paint.services.SvgPaintGrammarAccess;
import svg.HexColor;
import svg.IriPaint;
import svg.KeywordColor;
import svg.LocalIri;
import svg.NonePaint;
import svg.RgbColor;
import svg.RgbPercentage;
import svg.SvgPackage;

@SuppressWarnings("all")
public class SvgPaintSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SvgPaintGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SvgPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SvgPackage.HEX_COLOR:
				sequence_HexColor(context, (HexColor) semanticObject); 
				return; 
			case SvgPackage.IRI_PAINT:
				sequence_IriPaint(context, (IriPaint) semanticObject); 
				return; 
			case SvgPackage.KEYWORD_COLOR:
				sequence_KeywordColor(context, (KeywordColor) semanticObject); 
				return; 
			case SvgPackage.LOCAL_IRI:
				sequence_LocalIri(context, (LocalIri) semanticObject); 
				return; 
			case SvgPackage.NONE_PAINT:
				sequence_NonePaint(context, (NonePaint) semanticObject); 
				return; 
			case SvgPackage.RGB_COLOR:
				sequence_RgbColor(context, (RgbColor) semanticObject); 
				return; 
			case SvgPackage.RGB_PERCENTAGE:
				sequence_RgbPercentage(context, (RgbPercentage) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Paint returns HexColor
	 *     Color returns HexColor
	 *     HexColor returns HexColor
	 *
	 * Constraint:
	 *     hex=HEX
	 */
	protected void sequence_HexColor(ISerializationContext context, HexColor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.HEX_COLOR__HEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.HEX_COLOR__HEX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHexColorAccess().getHexHEXTerminalRuleCall_0(), semanticObject.getHex());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Paint returns IriPaint
	 *     IriPaint returns IriPaint
	 *
	 * Constraint:
	 *     iri=LocalIri
	 */
	protected void sequence_IriPaint(ISerializationContext context, IriPaint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.IRI_PAINT__IRI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.IRI_PAINT__IRI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIriPaintAccess().getIriLocalIriParserRuleCall_0(), semanticObject.getIri());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Paint returns KeywordColor
	 *     Color returns KeywordColor
	 *     KeywordColor returns KeywordColor
	 *
	 * Constraint:
	 *     keyword=ColorKeyword
	 */
	protected void sequence_KeywordColor(ISerializationContext context, KeywordColor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.KEYWORD_COLOR__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.KEYWORD_COLOR__KEYWORD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeywordColorAccess().getKeywordColorKeywordEnumRuleCall_0(), semanticObject.getKeyword());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LocalIri returns LocalIri
	 *
	 * Constraint:
	 *     elementName=ID
	 */
	protected void sequence_LocalIri(ISerializationContext context, LocalIri semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.LOCAL_IRI__ELEMENT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.LOCAL_IRI__ELEMENT_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocalIriAccess().getElementNameIDTerminalRuleCall_3_0(), semanticObject.getElementName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Paint returns NonePaint
	 *     NonePaint returns NonePaint
	 *
	 * Constraint:
	 *     {NonePaint}
	 */
	protected void sequence_NonePaint(ISerializationContext context, NonePaint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Paint returns RgbColor
	 *     Color returns RgbColor
	 *     RgbColor returns RgbColor
	 *
	 * Constraint:
	 *     (red=RGB_NUMBER green=RGB_NUMBER blue=RGB_NUMBER)
	 */
	protected void sequence_RgbColor(ISerializationContext context, RgbColor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.RGB_COLOR__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.RGB_COLOR__RED));
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.RGB_COLOR__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.RGB_COLOR__GREEN));
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.RGB_COLOR__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.RGB_COLOR__BLUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRgbColorAccess().getRedRGB_NUMBERTerminalRuleCall_2_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getRgbColorAccess().getGreenRGB_NUMBERTerminalRuleCall_4_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getRgbColorAccess().getBlueRGB_NUMBERTerminalRuleCall_6_0(), semanticObject.getBlue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Paint returns RgbPercentage
	 *     Color returns RgbPercentage
	 *     RgbPercentage returns RgbPercentage
	 *
	 * Constraint:
	 *     (red=RGB_PERCENTAGE green=RGB_PERCENTAGE blue=RGB_PERCENTAGE)
	 */
	protected void sequence_RgbPercentage(ISerializationContext context, RgbPercentage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.RGB_PERCENTAGE__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.RGB_PERCENTAGE__RED));
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.RGB_PERCENTAGE__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.RGB_PERCENTAGE__GREEN));
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.RGB_PERCENTAGE__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.RGB_PERCENTAGE__BLUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRgbPercentageAccess().getRedRGB_PERCENTAGETerminalRuleCall_2_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getRgbPercentageAccess().getGreenRGB_PERCENTAGETerminalRuleCall_4_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getRgbPercentageAccess().getBlueRGB_PERCENTAGETerminalRuleCall_6_0(), semanticObject.getBlue());
		feeder.finish();
	}
	
	
}
