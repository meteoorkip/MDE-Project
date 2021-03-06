/**
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.viewbox.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.svg.viewbox.services.SvgViewboxGrammarAccess;
import svg.Coordinate;
import svg.Length;
import svg.ViewBox;

@SuppressWarnings("all")
public class SvgViewboxFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private SvgViewboxGrammarAccess _svgViewboxGrammarAccess;
  
  protected void _format(final ViewBox viewBox, @Extension final IFormattableDocument document) {
    document.<Coordinate>format(viewBox.getMinX());
    document.<Coordinate>format(viewBox.getMinY());
    document.<Length>format(viewBox.getWidth());
    document.<Length>format(viewBox.getHeight());
  }
  
  public void format(final Object viewBox, final IFormattableDocument document) {
    if (viewBox instanceof XtextResource) {
      _format((XtextResource)viewBox, document);
      return;
    } else if (viewBox instanceof ViewBox) {
      _format((ViewBox)viewBox, document);
      return;
    } else if (viewBox instanceof EObject) {
      _format((EObject)viewBox, document);
      return;
    } else if (viewBox == null) {
      _format((Void)null, document);
      return;
    } else if (viewBox != null) {
      _format(viewBox, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(viewBox, document).toString());
    }
  }
}
