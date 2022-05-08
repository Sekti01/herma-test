package id.rsa.model;

import java.time.LocalDate;

public class UserModel {
    private Integer Id;
    private String Username;
    private String Name;
    private LocalDate  Birthdate;
    private String Phone;
    private String CreatedBy;
    private LocalDate  CreatedDate;
    private String ModifiedBy;
    private LocalDate ModifiedDate;

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public LocalDate getBirthdate() {
        return this.Birthdate;
    }

    public void setBirthdate(LocalDate Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getCreatedBy() {
        return this.CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public LocalDate getCreatedDate() {
        return this.CreatedDate;
    }

    public void setCreatedDate(LocalDate CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public String getModifiedBy() {
        return this.ModifiedBy;
    }

    public void setModifiedBy(String ModifiedBy) {
        this.ModifiedBy = ModifiedBy;
    }

    public LocalDate getModifiedDate() {
        return this.ModifiedDate;
    }

    public void setModifiedDate(LocalDate ModifiedDate) {
        this.ModifiedDate = ModifiedDate;
    }

}
