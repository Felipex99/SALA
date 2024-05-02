/**
 */
package webpage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.Web#getWebpage <em>Webpage</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getWeb()
 * @model
 * @generated
 */
public interface Web extends EObject {
	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' containment reference list.
	 * The list contents are of type {@link webpage.Webpage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' containment reference list.
	 * @see webpage.WebpagePackage#getWeb_Webpage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Webpage> getWebpage();

} // Web
