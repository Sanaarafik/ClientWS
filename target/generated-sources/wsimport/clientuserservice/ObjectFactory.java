
package clientuserservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientuserservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddBenevole_QNAME = new QName("http://userpackage/", "addBenevole");
    private final static QName _AddBenevoleResponse_QNAME = new QName("http://userpackage/", "addBenevoleResponse");
    private final static QName _AddDemandeur_QNAME = new QName("http://userpackage/", "addDemandeur");
    private final static QName _AddDemandeurResponse_QNAME = new QName("http://userpackage/", "addDemandeurResponse");
    private final static QName _AddUser_QNAME = new QName("http://userpackage/", "addUser");
    private final static QName _AddUserResponse_QNAME = new QName("http://userpackage/", "addUserResponse");
    private final static QName _AddValidator_QNAME = new QName("http://userpackage/", "addValidator");
    private final static QName _AddValidatorResponse_QNAME = new QName("http://userpackage/", "addValidatorResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://userpackage/", "getAllUsers");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://userpackage/", "getAllUsersResponse");
    private final static QName _GetBenevoles_QNAME = new QName("http://userpackage/", "getBenevoles");
    private final static QName _GetBenevolesResponse_QNAME = new QName("http://userpackage/", "getBenevolesResponse");
    private final static QName _GetDemandeurs_QNAME = new QName("http://userpackage/", "getDemandeurs");
    private final static QName _GetDemandeursResponse_QNAME = new QName("http://userpackage/", "getDemandeursResponse");
    private final static QName _GetValidators_QNAME = new QName("http://userpackage/", "getValidators");
    private final static QName _GetValidatorsResponse_QNAME = new QName("http://userpackage/", "getValidatorsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientuserservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBenevole }
     * 
     */
    public AddBenevole createAddBenevole() {
        return new AddBenevole();
    }

    /**
     * Create an instance of {@link AddBenevoleResponse }
     * 
     */
    public AddBenevoleResponse createAddBenevoleResponse() {
        return new AddBenevoleResponse();
    }

    /**
     * Create an instance of {@link AddDemandeur }
     * 
     */
    public AddDemandeur createAddDemandeur() {
        return new AddDemandeur();
    }

    /**
     * Create an instance of {@link AddDemandeurResponse }
     * 
     */
    public AddDemandeurResponse createAddDemandeurResponse() {
        return new AddDemandeurResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link AddValidator }
     * 
     */
    public AddValidator createAddValidator() {
        return new AddValidator();
    }

    /**
     * Create an instance of {@link AddValidatorResponse }
     * 
     */
    public AddValidatorResponse createAddValidatorResponse() {
        return new AddValidatorResponse();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetBenevoles }
     * 
     */
    public GetBenevoles createGetBenevoles() {
        return new GetBenevoles();
    }

    /**
     * Create an instance of {@link GetBenevolesResponse }
     * 
     */
    public GetBenevolesResponse createGetBenevolesResponse() {
        return new GetBenevolesResponse();
    }

    /**
     * Create an instance of {@link GetDemandeurs }
     * 
     */
    public GetDemandeurs createGetDemandeurs() {
        return new GetDemandeurs();
    }

    /**
     * Create an instance of {@link GetDemandeursResponse }
     * 
     */
    public GetDemandeursResponse createGetDemandeursResponse() {
        return new GetDemandeursResponse();
    }

    /**
     * Create an instance of {@link GetValidators }
     * 
     */
    public GetValidators createGetValidators() {
        return new GetValidators();
    }

    /**
     * Create an instance of {@link GetValidatorsResponse }
     * 
     */
    public GetValidatorsResponse createGetValidatorsResponse() {
        return new GetValidatorsResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBenevole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBenevole }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "addBenevole")
    public JAXBElement<AddBenevole> createAddBenevole(AddBenevole value) {
        return new JAXBElement<AddBenevole>(_AddBenevole_QNAME, AddBenevole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBenevoleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBenevoleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "addBenevoleResponse")
    public JAXBElement<AddBenevoleResponse> createAddBenevoleResponse(AddBenevoleResponse value) {
        return new JAXBElement<AddBenevoleResponse>(_AddBenevoleResponse_QNAME, AddBenevoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDemandeur }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDemandeur }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "addDemandeur")
    public JAXBElement<AddDemandeur> createAddDemandeur(AddDemandeur value) {
        return new JAXBElement<AddDemandeur>(_AddDemandeur_QNAME, AddDemandeur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDemandeurResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDemandeurResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "addDemandeurResponse")
    public JAXBElement<AddDemandeurResponse> createAddDemandeurResponse(AddDemandeurResponse value) {
        return new JAXBElement<AddDemandeurResponse>(_AddDemandeurResponse_QNAME, AddDemandeurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddValidator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddValidator }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "addValidator")
    public JAXBElement<AddValidator> createAddValidator(AddValidator value) {
        return new JAXBElement<AddValidator>(_AddValidator_QNAME, AddValidator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddValidatorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddValidatorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "addValidatorResponse")
    public JAXBElement<AddValidatorResponse> createAddValidatorResponse(AddValidatorResponse value) {
        return new JAXBElement<AddValidatorResponse>(_AddValidatorResponse_QNAME, AddValidatorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBenevoles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBenevoles }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "getBenevoles")
    public JAXBElement<GetBenevoles> createGetBenevoles(GetBenevoles value) {
        return new JAXBElement<GetBenevoles>(_GetBenevoles_QNAME, GetBenevoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBenevolesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBenevolesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "getBenevolesResponse")
    public JAXBElement<GetBenevolesResponse> createGetBenevolesResponse(GetBenevolesResponse value) {
        return new JAXBElement<GetBenevolesResponse>(_GetBenevolesResponse_QNAME, GetBenevolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDemandeurs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDemandeurs }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "getDemandeurs")
    public JAXBElement<GetDemandeurs> createGetDemandeurs(GetDemandeurs value) {
        return new JAXBElement<GetDemandeurs>(_GetDemandeurs_QNAME, GetDemandeurs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDemandeursResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDemandeursResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "getDemandeursResponse")
    public JAXBElement<GetDemandeursResponse> createGetDemandeursResponse(GetDemandeursResponse value) {
        return new JAXBElement<GetDemandeursResponse>(_GetDemandeursResponse_QNAME, GetDemandeursResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidators }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetValidators }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "getValidators")
    public JAXBElement<GetValidators> createGetValidators(GetValidators value) {
        return new JAXBElement<GetValidators>(_GetValidators_QNAME, GetValidators.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidatorsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetValidatorsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://userpackage/", name = "getValidatorsResponse")
    public JAXBElement<GetValidatorsResponse> createGetValidatorsResponse(GetValidatorsResponse value) {
        return new JAXBElement<GetValidatorsResponse>(_GetValidatorsResponse_QNAME, GetValidatorsResponse.class, null, value);
    }

}
