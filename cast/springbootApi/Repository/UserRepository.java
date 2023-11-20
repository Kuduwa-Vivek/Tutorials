package cast.springbootApi.Repository;

import cast.springbootApi.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmailId(String emailId);
  List<User> findDistinctByLastnameAndFirstname(String lastname, String firstname);


  List<User> findByLastnameAndFirstname(String lastname, String firstname);

  List<User> findByLastnameOrFirstname(String lastname, String firstname);

  List<User> findByStartDateBetween(Date startDate, Date endDate);

  List<User> findByAgeLessThan(int age);

  List<User> findByAgeLessThanEqual(int age);

  List<User> findByAgeGreaterThan(int age);

  List<User> findByAgeGreaterThanEqual(int age);

  List<User> findByStartDateAfter(Date startDate);

  List<User> findByAgeIsNull();

  List<User>findByAgeNotNull();

  List<User> findByFirstnameLike(String firstname);

  List<User> findByFirstnameNotLike(String firstname);

  List<User> findByFirstnameStartingWith(String prefix);

  List<User> findByFirstnameEndingWith(String prefix);
  List<User> findByFirstnameContaining(String prefix);

  List<User> findByAgeOrderByLastnameDesc(int age);

  List<User> findByLastnameNot(String name);

  List<User> findByActiveTrue();

  List<User>findByFirstnameIgnoreCase(String firstname);

//  List<User> findByActiveTrue(Boolean aTrue);


//  List<User> findByAge(Is)Null(int age);





  //  Example 60. Query method declaration in UserRepository
//  List<user> findByLastname(String lastname);
//
//  @Query("select u from User u where u.emailAddress = ?1")
//  user findByEmailAddress (String emailAddress);

////  Example 19. Using KeysetScrollPosition with Repository Query Methods
//  interface UserRepository extends Repository<user, Long> {
//
//    Window<user> findFirst10ByLastnameOrderByFirstname(String lastname, org.springframework.data.domain.KeysetScrollPosition position);
//  }
//
//  WindowIterator<user> users = WindowIterator.of(position -> repository.findFirst10ByLastnameOrderByFirstname("Doe", position))
//      .startingAt(KeysetScrollPosition.initial());

//  interface PersonRepository extends Repository<user, Long> {
//
//    List<user> findByEmailAddressAndLastname(EmailAddress emailAddress, String lastname);
//
//    // Enables the distinct flag for the query
//    List<user> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);
//    List<user> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);
//
//    // Enabling ignoring case for an individual property
//    List<user> findByLastnameIgnoreCase(String lastname);
//    // Enabling ignoring case for all suitable properties
//    List<user> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);
//
//    // Enabling static ORDER BY for a query
//    List<user> findByLastnameOrderByFirstnameAsc(String lastname);
//    List<user> findByLastnameOrderByFirstnameDesc(String lastname);
//  }
}




