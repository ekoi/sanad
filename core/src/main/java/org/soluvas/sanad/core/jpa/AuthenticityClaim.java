package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A representation of the model object '<em><b>AuthenticityClaim</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Claims
 * that a Concept has the specified authenticity. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity()
public class AuthenticityClaim extends Claim {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private Authenticity authenticity = null;

	/**
	 * Returns the value of '<em><b>authenticity</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>authenticity</b></em>' feature
	 * @generated
	 */
	public Authenticity getAuthenticity() {
		return authenticity;
	}

	/**
	 * Sets the '{@link AuthenticityClaim#getAuthenticity()
	 * <em>authenticity</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAuthenticity
	 *            the new value of the '
	 *            {@link AuthenticityClaim#getAuthenticity() authenticity}'
	 *            feature.
	 * @generated
	 */
	public void setAuthenticity(Authenticity newAuthenticity) {
		authenticity = newAuthenticity;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "AuthenticityClaim " + " [authenticity: " + getAuthenticity()
				+ "]";
	}
}
