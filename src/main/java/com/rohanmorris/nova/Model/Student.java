package com.rohanmorris.nova.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long acconut_id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private String email;
    private String street;
    private String city_town;
    private String zip_code;
    private String phone_home;
    private String phone_mobile;
    private String dob;
    private String enrollment_date;
    public int account_type;
    private int active;
    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;
    @OneToOne
    @JoinColumn(name = "parish_id")
    private CountryState country_state;
    @OneToOne
    @JoinTable(name = "account_school", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "school_id"))
    private SchoolStatic account_school;
    @OneToOne
    @JoinTable(name = "class_room_students", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "class_room_id"))
    private ClassRoom account_class;
    @OneToOne
    @JoinTable(name = "house_color_account", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "house_color_id"))
    private HouseColor housecolor;
    @OneToMany
    @JoinTable(name = "account_ex_activity", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "extracurricular_activity_id"))
    private List<ExtraCurricularActivity> extra_curricular_activity = new ArrayList<ExtraCurricularActivity>();
    @OneToMany
    @JoinTable(name = "account_responsibilities", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "responsibilities_id"))
    private List<Responsibilities> responsibilities = new ArrayList<Responsibilities>();
    @OneToMany
    @JoinTable(name = "account_citizenship", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "citizenship_id"))
    private List<Citizenship> citizenship = new ArrayList<Citizenship>();

    /**
     * @return the acconut_id
     */
    public long getAcconut_id() {
        return acconut_id;
    }

    /**
     * @param acconut_id the acconut_id to set
     */
    public void setAcconut_id(long acconut_id) {
        this.acconut_id = acconut_id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the middlename
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * @param middlename the middlename to set
     */
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city_town
     */
    public String getCity_town() {
        return city_town;
    }

    /**
     * @param city_town the city_town to set
     */
    public void setCity_town(String city_town) {
        this.city_town = city_town;
    }

    /**
     * @return the zip_code
     */
    public String getZip_code() {
        return zip_code;
    }

    /**
     * @param zip_code the zip_code to set
     */
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    /**
     * @return the phone_home
     */
    public String getPhone_home() {
        return phone_home;
    }

    /**
     * @param phone_home the phone_home to set
     */
    public void setPhone_home(String phone_home) {
        this.phone_home = phone_home;
    }

    /**
     * @return the phone_mobile
     */
    public String getPhone_mobile() {
        return phone_mobile;
    }

    /**
     * @param phone_mobile the phone_mobile to set
     */
    public void setPhone_mobile(String phone_mobile) {
        this.phone_mobile = phone_mobile;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the enrollment_date
     */
    public String getEnrollment_date() {
        return enrollment_date;
    }

    /**
     * @param enrollment_date the enrollment_date to set
     */
    public void setEnrollment_date(String enrollment_date) {
        this.enrollment_date = enrollment_date;
    }

    /**
     * @return the account_type
     */
    public int getAccount_type() {
        return account_type;
    }

    /**
     * @param account_type the account_type to set
     */
    public void setAccount_type(int account_type) {
        this.account_type = account_type;
    }

    /**
     * @return the active
     */
    public int getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(int active) {
        this.active = active;
    }

    // /**
    //  * @return the date_added
    //  */
    // public String getDate_added() {
    //     return this.date_added;
    // }

    // /**
    //  * @param date_added the date_added to set
    //  */
    // private void setDate_added() {
    //     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //     Date dateobj = new Date();
    //     this.date_added = df.format(dateobj);
    // }

    /**
     * @return the housecolor
     */
    public HouseColor getHousecolor() {
        return housecolor==null ? new HouseColor() : housecolor;
    }

    /**
     * @param housecolor the housecolor to set
     */
    public void setHousecolor(HouseColor housecolor) {
        this.housecolor = housecolor;
    }

    /**
     * @return the extra_curricular_activity
     */
    public List<ExtraCurricularActivity> getExtra_curricular_activity() {
        return extra_curricular_activity;
    }

    /**
     * @param extra_curricular_activity the extra_curricular_activity to set
     */
    public void setExtra_curricular_activity(List<ExtraCurricularActivity> extra_curricular_activity) {
        this.extra_curricular_activity = extra_curricular_activity;
    }

    /**
     * @return the responsibilities
     */
    public List<Responsibilities> getResponsibilities() {
        return responsibilities;
    }

    /**
     * @param responsibilities the responsibilities to set
     */
    public void setResponsibilities(List<Responsibilities> responsibilities) {
        this.responsibilities = responsibilities;
    }

    /**
     * @return the citizenship
     */
    public List<Citizenship> getCitizenship() {
        return citizenship;
    }

    /**
     * @param citizenship the citizenship to set
     */
    public void setCitizenship(List<Citizenship> citizenship) {
        this.citizenship = citizenship;
    }

    /**
     * @return the country
     */
    public Country getCountry() {
        return country==null ? new Country() : country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return the country_state
     */
    public CountryState getCountry_state() {
        return country_state;
    }

    /**
     * @param country_tate the country_state to set
     */
    public void setCountry_state(CountryState country_state) {
        this.country_state = country_state;
    }

    /**
     * @return the account_class
     */
    public ClassRoom getAccount_class() {
        return account_class;
    }

    /**
     * @param account_class the account_class to set
     */
    public void setAccount_class(ClassRoom account_class) {
        this.account_class = account_class;
    }

    /**
     * @return the account_school
     */
    public SchoolStatic getAccount_school() {
        return account_school;
    }

    /**
     * @param account_school the account_school to set
     */
    public void setAccount_school(SchoolStatic account_school) {
        this.account_school = account_school;
    }
}