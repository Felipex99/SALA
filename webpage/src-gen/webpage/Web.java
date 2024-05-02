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
 *   <li>{@link webpage.Web#getWebpages <em>Webpages</em>}</li>
 *   <li>{@link webpage.Web#getKeywords <em>Keywords</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getWeb()
 * @model
 * @generated
 */
public interface Web extends EObject {
	/**
	 * Returns the value of the '<em><b>Webpages</b></em>' containment reference list.
	 * The list contents are of type {@link webpage.Webpage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpages</em>' containment reference list.
	 * @see webpage.WebpagePackage#getWeb_Webpages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Webpage> getWebpages();

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute.
	 * @see #setKeywords(String)
	 * @see webpage.WebpagePackage#getWeb_Keywords()
	 * @model
	 * @generated
	 */
	String getKeywords();

	/**
	 * Sets the value of the '{@link webpage.Web#getKeywords <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' attribute.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(String value);

} // Web
