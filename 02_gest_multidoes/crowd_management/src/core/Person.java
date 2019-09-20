/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Objects;

/**
 *
 * @author EFA
 */
public class Person {
    private int nif = 0;
    private String name = "";
    private String address = "";
    private String phone = "";
    private String email = "";


    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String prefix = String.valueOf(phone.charAt(0));
        
        if (("+".equals(prefix) && phone.length()==13) ||
            (Character.isDigit(prefix.charAt(0)) && phone.length()==9)) {
            this.phone = phone;    
        }
        else
        {
            // erro
        }
    }
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        int at_position = email.indexOf('@');
        int last_at_position = email.lastIndexOf('@');
        
        int dot_position = email.lastIndexOf('.');
        
        if (at_position != -1  &&  dot_position != -1 && 
              at_position == last_at_position &&
              last_at_position < dot_position &&
              dot_position < email.length()-2) {
            this.email = email;
        } else {
            // erro.
        }
        
    }
    
    
    
    @Override
    public String toString() {
        return "Person{" + "nif=" + nif + ", name=" + name + ", address=" + address + ", phone=" + phone + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.address);
        hash = 67 * hash + Objects.hashCode(this.phone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.nif != other.nif) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        return true;
    }

}
