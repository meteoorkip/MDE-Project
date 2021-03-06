/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.points.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.svg.points.services.SvgPointsGrammarAccess
import svg.Point
import svg.Polygon

class SvgPointsFormatter extends AbstractFormatter2 {
	
	@Inject extension SvgPointsGrammarAccess

	def dispatch void format(Polygon polygon, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Point point : polygon.getPoints()) {
			point.format;
		}
	}

	def dispatch void format(Point point, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		point.getX.format;
		point.getY.format;
	}
	
	// TODO: implement for 
}
