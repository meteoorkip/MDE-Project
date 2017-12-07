/**
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.lengths.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.svg.lengths.services.SvgLengthsGrammarAccess;
import svg.Length;
import svg.StrokeDashArray;

@SuppressWarnings("all")
public class SvgLengthsFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private SvgLengthsGrammarAccess _svgLengthsGrammarAccess;
  
  protected void _format(final StrokeDashArray strokeDashArray, @Extension final IFormattableDocument document) {
    EList<Length> _strokeDashArray = strokeDashArray.getStrokeDashArray();
    for (final Length length : _strokeDashArray) {
      document.<Length>format(length);
    }
  }
  
  public void format(final Object strokeDashArray, final IFormattableDocument document) {
    if (strokeDashArray instanceof XtextResource) {
      _format((XtextResource)strokeDashArray, document);
      return;
    } else if (strokeDashArray instanceof StrokeDashArray) {
      _format((StrokeDashArray)strokeDashArray, document);
      return;
    } else if (strokeDashArray instanceof EObject) {
      _format((EObject)strokeDashArray, document);
      return;
    } else if (strokeDashArray == null) {
      _format((Void)null, document);
      return;
    } else if (strokeDashArray != null) {
      _format(strokeDashArray, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(strokeDashArray, document).toString());
    }
  }
}
