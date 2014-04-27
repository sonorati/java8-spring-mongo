package photo.domain;


import org.springframework.data.annotation.Id;

import java.util.List;

public class Photographer {

    public Photographer(String company, String name, String surname, String email, Region region, String website, String message, List<String> services) {
        this.company = company;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.region = region;
        this.website = website;
        this.message = message;
        this.services = services;
    }

    @Id
    String id;
    String company;
    String name;
    String surname;
    String email;
    Region region;
    String website;
    String message;
    List<String> services;

    public void setId(String id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public String getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Region getRegion() {
        return region;
    }

    public String getWebsite() {
        return website;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getServices() {
        return services;
    }

    @Override
    public String toString() {
        return "Photographer{" +
                "services=" + services +
                ", message='" + message + '\'' +
                ", website='" + website + '\'' +
                ", region=" + region +
                ", email='" + email + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
