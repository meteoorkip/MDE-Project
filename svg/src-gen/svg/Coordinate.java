/**
 */
package svg;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svg.Coordinate#getNumber <em>Number</em>}</li>
 *   <li>{@link svg.Coordinate#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see svg.SvgPackage#getCoordinate()
 * @model
 * @generated
 */
public interface Coordinate extends AttributeType {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigDecimal)
	 * @see svg.SvgPackage#getCoordinate_Number()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getNumber();

	/**
	 * Sets the value of the '{@link svg.Coordinate#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link svg.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see svg.Unit
	 * @see #setUnit(Unit)
	 * @see svg.SvgPackage#getCoordinate_Unit()
	 * @model
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link svg.Coordinate#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see svg.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // Coordinate
