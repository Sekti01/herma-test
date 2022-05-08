package id.rsa.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class UserEntity extends PanacheEntity{
    public String Username;
    public String Name;
    public LocalDate  Birthdate;
    public String Phone;
    public String CreatedBy;
    public LocalDate  CreatedDate;
    public String ModifiedBy;
    public LocalDate ModifiedDate;
}
