package cast.springbootApi.entitiy;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column (name = "first_name")
  private String firstname;
  @Column (name = "last_name")
  private String lastname;
  @Column (name = "email_id")
  private String emailId;

  private java.sql.Date startDate ;
  private Date endDate ;
  private int age;
  private Boolean active;
}
