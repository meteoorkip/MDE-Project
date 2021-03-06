/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.href.serializer;

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
import org.xtext.svg.href.services.SvgHrefGrammarAccess;
import svg.Base64Ref;
import svg.LocalIri;
import svg.SvgPackage;

@SuppressWarnings("all")
public class SvgHrefSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SvgHrefGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SvgPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SvgPackage.BASE64_REF:
				sequence_Base64Ref(context, (Base64Ref) semanticObject); 
				return; 
			case SvgPackage.LOCAL_IRI:
				sequence_LocalIri(context, (LocalIri) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Href returns Base64Ref
	 *     Base64Ref returns Base64Ref
	 *
	 * Constraint:
	 *     base64=BASE64_STRING
	 */
	protected void sequence_Base64Ref(ISerializationContext context, Base64Ref semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SvgPackage.Literals.BASE64_REF__BASE64) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SvgPackage.Literals.BASE64_REF__BASE64));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBase64RefAccess().getBase64BASE64_STRINGTerminalRuleCall_2_0(), semanticObject.getBase64());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Href returns LocalIri
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
	
	
}
