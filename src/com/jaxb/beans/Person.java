package com.jaxb.beans;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

  @XmlElementWrapper(name = "hobbies")
  @XmlElement(name = "hobby")
  private List<String> hobbies;

  public Person() {
  }

  public Person(List<String> hobbies) {
    this.hobbies = hobbies;
  }

  public List<String> getHobbies() {
    System.out.println("getter");
    return hobbies;
  }

  public void setHobbies(List<String> hobbies) {
    System.out.println("setter");
    this.hobbies = hobbies;
  }

  @Override
  public String toString() {
    return "Person [hobbies=" + hobbies + "]";
  }

}
