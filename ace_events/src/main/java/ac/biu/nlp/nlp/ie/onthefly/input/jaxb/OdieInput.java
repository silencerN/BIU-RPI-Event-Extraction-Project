//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 01:08:44 PM IDT 
//


package ac.biu.nlp.nlp.ie.onthefly.input.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corpus">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xmi_folder_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="predicate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="arguments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="argument" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="types" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="usage_samples">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sample" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="global_context">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phrases" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "corpus",
    "predicate",
    "arguments",
    "usageSamples",
    "globalContext"
})
@XmlRootElement(name = "odie_input")
public class OdieInput {

    @XmlElement(required = true)
    protected OdieInput.Corpus corpus;
    @XmlElement(required = true)
    protected OdieInput.Predicate predicate;
    @XmlElement(required = true)
    protected OdieInput.Arguments arguments;
    @XmlElement(name = "usage_samples", required = true)
    protected OdieInput.UsageSamples usageSamples;
    @XmlElement(name = "global_context", required = true)
    protected OdieInput.GlobalContext globalContext;

    /**
     * Gets the value of the corpus property.
     * 
     * @return
     *     possible object is
     *     {@link OdieInput.Corpus }
     *     
     */
    public OdieInput.Corpus getCorpus() {
        return corpus;
    }

    /**
     * Sets the value of the corpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdieInput.Corpus }
     *     
     */
    public void setCorpus(OdieInput.Corpus value) {
        this.corpus = value;
    }

    /**
     * Gets the value of the predicate property.
     * 
     * @return
     *     possible object is
     *     {@link OdieInput.Predicate }
     *     
     */
    public OdieInput.Predicate getPredicate() {
        return predicate;
    }

    /**
     * Sets the value of the predicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdieInput.Predicate }
     *     
     */
    public void setPredicate(OdieInput.Predicate value) {
        this.predicate = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link OdieInput.Arguments }
     *     
     */
    public OdieInput.Arguments getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdieInput.Arguments }
     *     
     */
    public void setArguments(OdieInput.Arguments value) {
        this.arguments = value;
    }

    /**
     * Gets the value of the usageSamples property.
     * 
     * @return
     *     possible object is
     *     {@link OdieInput.UsageSamples }
     *     
     */
    public OdieInput.UsageSamples getUsageSamples() {
        return usageSamples;
    }

    /**
     * Sets the value of the usageSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdieInput.UsageSamples }
     *     
     */
    public void setUsageSamples(OdieInput.UsageSamples value) {
        this.usageSamples = value;
    }

    /**
     * Gets the value of the globalContext property.
     * 
     * @return
     *     possible object is
     *     {@link OdieInput.GlobalContext }
     *     
     */
    public OdieInput.GlobalContext getGlobalContext() {
        return globalContext;
    }

    /**
     * Sets the value of the globalContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdieInput.GlobalContext }
     *     
     */
    public void setGlobalContext(OdieInput.GlobalContext value) {
        this.globalContext = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="argument" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="types" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "argument"
    })
    public static class Arguments {

        protected List<OdieInput.Arguments.Argument> argument;

        /**
         * Gets the value of the argument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the argument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArgument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OdieInput.Arguments.Argument }
         * 
         * 
         */
        public List<OdieInput.Arguments.Argument> getArgument() {
            if (argument == null) {
                argument = new ArrayList<OdieInput.Arguments.Argument>();
            }
            return this.argument;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="types" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "role",
            "types"
        })
        public static class Argument {

            @XmlElement(required = true)
            protected String role;
            @XmlElement(required = true)
            protected String types;

            /**
             * Gets the value of the role property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRole() {
                return role;
            }

            /**
             * Sets the value of the role property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRole(String value) {
                this.role = value;
            }

            /**
             * Gets the value of the types property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypes() {
                return types;
            }

            /**
             * Sets the value of the types property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypes(String value) {
                this.types = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="xmi_folder_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "xmiFolderPath"
    })
    public static class Corpus {

        @XmlElement(name = "xmi_folder_path", required = true)
        protected String xmiFolderPath;

        /**
         * Gets the value of the xmiFolderPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXmiFolderPath() {
            return xmiFolderPath;
        }

        /**
         * Sets the value of the xmiFolderPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXmiFolderPath(String value) {
            this.xmiFolderPath = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="phrases" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phrases"
    })
    public static class GlobalContext {

        @XmlElement(required = true)
        protected String phrases;

        /**
         * Gets the value of the phrases property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhrases() {
            return phrases;
        }

        /**
         * Sets the value of the phrases property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhrases(String value) {
            this.phrases = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class Predicate {

        @XmlElement(required = true)
        protected String name;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sample" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sample"
    })
    public static class UsageSamples {

        protected List<String> sample;

        /**
         * Gets the value of the sample property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sample property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSample().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSample() {
            if (sample == null) {
                sample = new ArrayList<String>();
            }
            return this.sample;
        }

    }

}