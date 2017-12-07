/**
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.transform.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.svg.transform.services.SvgTransformGrammarAccess;
import svg.Transform;
import svg.TransformValue;

@SuppressWarnings("all")
public class SvgTransformFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private SvgTransformGrammarAccess _svgTransformGrammarAccess;
  
  protected void _format(final Transform transform, @Extension final IFormattableDocument document) {
    EList<TransformValue> _transform = transform.getTransform();
    for (final TransformValue transformValue : _transform) {
      document.<TransformValue>format(transformValue);
    }
  }
  
  public void format(final Object transform, final IFormattableDocument document) {
    if (transform instanceof XtextResource) {
      _format((XtextResource)transform, document);
      return;
    } else if (transform instanceof Transform) {
      _format((Transform)transform, document);
      return;
    } else if (transform instanceof EObject) {
      _format((EObject)transform, document);
      return;
    } else if (transform == null) {
      _format((Void)null, document);
      return;
    } else if (transform != null) {
      _format(transform, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(transform, document).toString());
    }
  }
}
