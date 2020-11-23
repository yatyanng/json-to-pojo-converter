
package com.example;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "leftHanded",
    "gender",
    "alias",
    "father",
    "mother",
    "siblings"
})
public class Person
    extends Mammal
    implements Serializable
{

    /**
     * Given Name of the Person
     * <p>
     * This name must be registered.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("This name must be registered.")
    private String name = "Anonymous";
    /**
     * Left handed
     * <p>
     * This flag indicates whether the person prefers to use his left hand.
     * 
     */
    @JsonProperty("leftHanded")
    @JsonPropertyDescription("This flag indicates whether the person prefers to use his left hand.")
    private Boolean leftHanded;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gender")
    private Person.Gender gender;
    @JsonProperty("alias")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<String> alias = new LinkedHashSet<String>();
    @JsonProperty("father")
    private Person father;
    @JsonProperty("mother")
    private Person mother;
    @JsonProperty("siblings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<Person> siblings = new LinkedHashSet<Person>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Given Name of the Person
     * <p>
     * This name must be registered.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Given Name of the Person
     * <p>
     * This name must be registered.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Person withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Left handed
     * <p>
     * This flag indicates whether the person prefers to use his left hand.
     * 
     */
    @JsonProperty("leftHanded")
    public Boolean getLeftHanded() {
        return leftHanded;
    }

    /**
     * Left handed
     * <p>
     * This flag indicates whether the person prefers to use his left hand.
     * 
     */
    @JsonProperty("leftHanded")
    public void setLeftHanded(Boolean leftHanded) {
        this.leftHanded = leftHanded;
    }

    public Person withLeftHanded(Boolean leftHanded) {
        this.leftHanded = leftHanded;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gender")
    public Person.Gender getGender() {
        return gender;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gender")
    public void setGender(Person.Gender gender) {
        this.gender = gender;
    }

    public Person withGender(Person.Gender gender) {
        this.gender = gender;
        return this;
    }

    @JsonProperty("alias")
    public Set<String> getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(Set<String> alias) {
        this.alias = alias;
    }

    public Person withAlias(Set<String> alias) {
        this.alias = alias;
        return this;
    }

    @JsonProperty("father")
    public Person getFather() {
        return father;
    }

    @JsonProperty("father")
    public void setFather(Person father) {
        this.father = father;
    }

    public Person withFather(Person father) {
        this.father = father;
        return this;
    }

    @JsonProperty("mother")
    public Person getMother() {
        return mother;
    }

    @JsonProperty("mother")
    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person withMother(Person mother) {
        this.mother = mother;
        return this;
    }

    @JsonProperty("siblings")
    public Set<Person> getSiblings() {
        return siblings;
    }

    @JsonProperty("siblings")
    public void setSiblings(Set<Person> siblings) {
        this.siblings = siblings;
    }

    public Person withSiblings(Set<Person> siblings) {
        this.siblings = siblings;
        return this;
    }

    @Override
    public Person withSpecies(String species) {
        super.withSpecies(species);
        return this;
    }

    @Override
    public Person withBirthDate(Date birthDate) {
        super.withBirthDate(birthDate);
        return this;
    }

    @Override
    public Person withAge(Integer age) {
        super.withAge(age);
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Person withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Person.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("leftHanded");
        sb.append('=');
        sb.append(((this.leftHanded == null)?"<null>":this.leftHanded));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("alias");
        sb.append('=');
        sb.append(((this.alias == null)?"<null>":this.alias));
        sb.append(',');
        sb.append("father");
        sb.append('=');
        sb.append(((this.father == null)?"<null>":this.father));
        sb.append(',');
        sb.append("mother");
        sb.append('=');
        sb.append(((this.mother == null)?"<null>":this.mother));
        sb.append(',');
        sb.append("siblings");
        sb.append('=');
        sb.append(((this.siblings == null)?"<null>":this.siblings));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.mother == null)? 0 :this.mother.hashCode()));
        result = ((result* 31)+((this.siblings == null)? 0 :this.siblings.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.father == null)? 0 :this.father.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.leftHanded == null)? 0 :this.leftHanded.hashCode()));
        result = ((result* 31)+((this.alias == null)? 0 :this.alias.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Person) == false) {
            return false;
        }
        Person rhs = ((Person) other);
        return ((((((((super.equals(rhs)&&((this.mother == rhs.mother)||((this.mother!= null)&&this.mother.equals(rhs.mother))))&&((this.siblings == rhs.siblings)||((this.siblings!= null)&&this.siblings.equals(rhs.siblings))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.father == rhs.father)||((this.father!= null)&&this.father.equals(rhs.father))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.leftHanded == rhs.leftHanded)||((this.leftHanded!= null)&&this.leftHanded.equals(rhs.leftHanded))))&&((this.alias == rhs.alias)||((this.alias!= null)&&this.alias.equals(rhs.alias))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public enum Gender {

        MALE("male"),
        FEMALE("female");
        private final String value;
        private final static Map<String, Person.Gender> CONSTANTS = new HashMap<String, Person.Gender>();

        static {
            for (Person.Gender c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Gender(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Person.Gender fromValue(String value) {
            Person.Gender constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
