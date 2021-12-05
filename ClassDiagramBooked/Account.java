
public abstract class Account {
  private String firstname;
  private String surname;
  private String email;
  private String addressLine;
  private String city;
  private String postcode;
  private String password;
  private String membershipNumber;
  private AccountStatus status;

  public Account(String firstname, String surname, String email, String addressLine, String city, String postcode,
      String password, String membershipNumber, AccountStatus status) {
  }

  public boolean resetPassword() {
  }
}

public class Volunteer extends Account {
  public Vounteer(String firstname, String surname, String email, String addressLine, String city, String postcode, String password, String membershipNumber, AccountStatus status) {

    super(firstname, surname, email, addressLine, city, postcode,  password, membershipNumber, status);
  }

  public boolean assignRole() {
  }

  public boolean blockMember(Member member) {
  }

  public boolean unBlockMember(Member member) {
  }
}

public class LeadVolunteer extends Volunteer {

  public LeadVolunteer(String firstname, String surname, String email, String addressLine, String city, String postcode,
      String password, String membershipNumber, AccountStatus status) {
    super(firstname, surname, email, addressLine, city, postcode, password, membershipNumber, status);
  }

  public boolean assignFacilitatorRole() {
  }

  public boolean assignVolunteerRole() {
  }

  public boolean assignMemberRole() {
  }
}

public class Member extends Account {
  private Date dateOfMembership;

  public Member(String firstname, String surname, String email, String addressLine, String city, String postcode,
      String password, String membershipNumber, AccountStatus status, Date dateOfMembership) {
    super(firstname, surname, email, addressLine, city, postcode, password, membershipNumber, status);
  }
}