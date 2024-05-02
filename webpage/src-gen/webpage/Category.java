/**
 */
package webpage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.Category#getArticle <em>Article</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Article</b></em>' containment reference list.
	 * The list contents are of type {@link webpage.Article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Article</em>' containment reference list.
	 * @see webpage.WebpagePackage#getCategory_Article()
	 * @model containment="true"
	 * @generated
	 */
	EList<Article> getArticle();

} // Category
