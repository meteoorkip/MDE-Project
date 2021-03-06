/**
 */
package svg.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import svg.AbsoluteSmoothCubicCurveTo;
import svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute Smooth Cubic Curve To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link svg.impl.AbsoluteSmoothCubicCurveToImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link svg.impl.AbsoluteSmoothCubicCurveToImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link svg.impl.AbsoluteSmoothCubicCurveToImpl#getX <em>X</em>}</li>
 *   <li>{@link svg.impl.AbsoluteSmoothCubicCurveToImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbsoluteSmoothCubicCurveToImpl extends PathValueImpl implements AbsoluteSmoothCubicCurveTo {
	/**
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cx = CX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cy = CY_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteSmoothCubicCurveToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCx() {
		return cx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(BigDecimal newCx) {
		BigDecimal oldCx = cx;
		cx = newCx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CX, oldCx,
					cx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCy() {
		return cy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(BigDecimal newCy) {
		BigDecimal oldCy = cy;
		cy = newCy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CY, oldCy,
					cy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(BigDecimal newX) {
		BigDecimal oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__X, oldX,
					x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(BigDecimal newY) {
		BigDecimal oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__Y, oldY,
					y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CX:
			return getCx();
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CY:
			return getCy();
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__X:
			return getX();
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__Y:
			return getY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CX:
			setCx((BigDecimal) newValue);
			return;
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CY:
			setCy((BigDecimal) newValue);
			return;
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__X:
			setX((BigDecimal) newValue);
			return;
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__Y:
			setY((BigDecimal) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CX:
			setCx(CX_EDEFAULT);
			return;
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CY:
			setCy(CY_EDEFAULT);
			return;
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__X:
			setX(X_EDEFAULT);
			return;
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__Y:
			setY(Y_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CX:
			return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__CY:
			return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__X:
			return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
		case SvgPackage.ABSOLUTE_SMOOTH_CUBIC_CURVE_TO__Y:
			return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cx: ");
		result.append(cx);
		result.append(", cy: ");
		result.append(cy);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //AbsoluteSmoothCubicCurveToImpl
