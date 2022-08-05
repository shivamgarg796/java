package com.masai.Entity;

import javax.persistence.*;

@Entity
public class Employee extends Person{
    private int salary;

    @Embedded
    @AttributeOverrides({

            @AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
            @AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
            @AttributeOverride(name="pincode",column=@Column(name="HOME_PINCODE"))

    })
    private Address homeAddress;

    @Embedded
    @AttributeOverrides({

            @AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
            @AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
            @AttributeOverride(name="pincode",column=@Column(name="OFFICE_PINCODE"))

    })
    private Address officeAddress;

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", homeAddress=" + homeAddress +
                ", officeAddress=" + officeAddress +
                '}';
    }
}
