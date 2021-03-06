
package com.mastercard.api.partnerwallet.domain.switchapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizePairingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizePairingRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PairingDataTypes" type="{}PairingDataTypes"/>
 *         &lt;element name="OAuthToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MerchantCheckoutId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConsumerWalletId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WalletId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpressCheckout" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConsumerCountry" type="{}Country"/>
 *         &lt;element name="SilentPairing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="AuthorizePairingRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizePairingRequest", propOrder = {
    "pairingDataTypes",
    "oAuthToken",
    "merchantCheckoutId",
    "consumerWalletId",
    "walletId",
    "expressCheckout",
    "consumerCountry",
    "silentPairing",
    "extensionPoint"
})
public class AuthorizePairingRequest {

    @XmlElement(name = "PairingDataTypes", required = true)
    protected PairingDataTypes pairingDataTypes;
    @XmlElement(name = "OAuthToken", required = true)
    protected String oAuthToken;
    @XmlElement(name = "MerchantCheckoutId", required = true)
    protected String merchantCheckoutId;
    @XmlElement(name = "ConsumerWalletId", required = true)
    protected String consumerWalletId;
    @XmlElement(name = "WalletId", required = true)
    protected String walletId;
    @XmlElement(name = "ExpressCheckout")
    protected boolean expressCheckout;
    @XmlElement(name = "ConsumerCountry", required = true)
    protected Country consumerCountry;
    @XmlElement(name = "SilentPairing")
    protected Boolean silentPairing;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the pairingDataTypes property.
     * 
     * @return
     *     possible object is
     *     {@link PairingDataTypes }
     *     
     */
    public PairingDataTypes getPairingDataTypes() {
        return pairingDataTypes;
    }

    /**
     * Sets the value of the pairingDataTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingDataTypes }
     *     
     */
    public void setPairingDataTypes(PairingDataTypes value) {
        this.pairingDataTypes = value;
    }

    /**
     * Gets the value of the oAuthToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOAuthToken() {
        return oAuthToken;
    }

    /**
     * Sets the value of the oAuthToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOAuthToken(String value) {
        this.oAuthToken = value;
    }

    /**
     * Gets the value of the merchantCheckoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCheckoutId() {
        return merchantCheckoutId;
    }

    /**
     * Sets the value of the merchantCheckoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCheckoutId(String value) {
        this.merchantCheckoutId = value;
    }

    /**
     * Gets the value of the consumerWalletId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerWalletId() {
        return consumerWalletId;
    }

    /**
     * Sets the value of the consumerWalletId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerWalletId(String value) {
        this.consumerWalletId = value;
    }

    /**
     * Gets the value of the walletId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletId() {
        return walletId;
    }

    /**
     * Sets the value of the walletId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletId(String value) {
        this.walletId = value;
    }

    /**
     * Gets the value of the expressCheckout property.
     * 
     */
    public boolean isExpressCheckout() {
        return expressCheckout;
    }

    /**
     * Sets the value of the expressCheckout property.
     * 
     */
    public void setExpressCheckout(boolean value) {
        this.expressCheckout = value;
    }

    /**
     * Gets the value of the consumerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getConsumerCountry() {
        return consumerCountry;
    }

    /**
     * Sets the value of the consumerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setConsumerCountry(Country value) {
        this.consumerCountry = value;
    }

    /**
     * Gets the value of the silentPairing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSilentPairing() {
        return silentPairing;
    }

    /**
     * Sets the value of the silentPairing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSilentPairing(Boolean value) {
        this.silentPairing = value;
    }

    /**
     * Gets the value of the extensionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionPoint }
     *     
     */
    public ExtensionPoint getExtensionPoint() {
        return extensionPoint;
    }

    /**
     * Sets the value of the extensionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionPoint }
     *     
     */
    public void setExtensionPoint(ExtensionPoint value) {
        this.extensionPoint = value;
    }

}
