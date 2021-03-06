
package BrugerAutorisation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Brugeradmin", targetNamespace = "http://soap.transport.brugerautorisation/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Brugeradmin {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns BrugerAutorisation.Bruger
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hentBruger", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.HentBruger")
    @ResponseWrapper(localName = "hentBrugerResponse", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.HentBrugerResponse")
    @Action(input = "http://soap.transport.brugerautorisation/Brugeradmin/hentBrugerRequest", output = "http://soap.transport.brugerautorisation/Brugeradmin/hentBrugerResponse")
    public Bruger hentBruger(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns BrugerAutorisation.Bruger
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "\u00e6ndrAdgangskode", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.\u00c6ndrAdgangskode")
    @ResponseWrapper(localName = "\u00e6ndrAdgangskodeResponse", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.\u00c6ndrAdgangskodeResponse")
    @Action(input = "http://soap.transport.brugerautorisation/Brugeradmin/\u00e6ndrAdgangskodeRequest", output = "http://soap.transport.brugerautorisation/Brugeradmin/\u00e6ndrAdgangskodeResponse")
    public Bruger ændrAdgangskode(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "sendEmail", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.SendEmail")
    @ResponseWrapper(localName = "sendEmailResponse", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.SendEmailResponse")
    @Action(input = "http://soap.transport.brugerautorisation/Brugeradmin/sendEmailRequest", output = "http://soap.transport.brugerautorisation/Brugeradmin/sendEmailResponse")
    public void sendEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "sendGlemtAdgangskodeEmail", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.SendGlemtAdgangskodeEmail")
    @ResponseWrapper(localName = "sendGlemtAdgangskodeEmailResponse", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.SendGlemtAdgangskodeEmailResponse")
    @Action(input = "http://soap.transport.brugerautorisation/Brugeradmin/sendGlemtAdgangskodeEmailRequest", output = "http://soap.transport.brugerautorisation/Brugeradmin/sendGlemtAdgangskodeEmailResponse")
    public void sendGlemtAdgangskodeEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Object
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEkstraFelt", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.GetEkstraFelt")
    @ResponseWrapper(localName = "getEkstraFeltResponse", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.GetEkstraFeltResponse")
    @Action(input = "http://soap.transport.brugerautorisation/Brugeradmin/getEkstraFeltRequest", output = "http://soap.transport.brugerautorisation/Brugeradmin/getEkstraFeltResponse")
    public Object getEkstraFelt(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setEkstraFelt", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.SetEkstraFelt")
    @ResponseWrapper(localName = "setEkstraFeltResponse", targetNamespace = "http://soap.transport.brugerautorisation/", className = "BrugerAutorisation.SetEkstraFeltResponse")
    @Action(input = "http://soap.transport.brugerautorisation/Brugeradmin/setEkstraFeltRequest", output = "http://soap.transport.brugerautorisation/Brugeradmin/setEkstraFeltResponse")
    public void setEkstraFelt(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        Object arg3);

}
