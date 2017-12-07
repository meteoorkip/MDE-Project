/**
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.path.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.svg.path.services.SvgPathGrammarAccess;
import svg.Path;
import svg.PathValue;

@SuppressWarnings("all")
public class SvgPathFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private SvgPathGrammarAccess _svgPathGrammarAccess;
  
  protected void _format(final Path path, @Extension final IFormattableDocument document) {
    EList<PathValue> _path = path.getPath();
    for (final PathValue pathValue : _path) {
      document.<PathValue>format(pathValue);
    }
  }
  
  public void format(final Object path, final IFormattableDocument document) {
    if (path instanceof XtextResource) {
      _format((XtextResource)path, document);
      return;
    } else if (path instanceof Path) {
      _format((Path)path, document);
      return;
    } else if (path instanceof EObject) {
      _format((EObject)path, document);
      return;
    } else if (path == null) {
      _format((Void)null, document);
      return;
    } else if (path != null) {
      _format(path, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(path, document).toString());
    }
  }
}
