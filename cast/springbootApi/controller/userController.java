package cast.springbootApi.controller;

import cast.springbootApi.Repository.UserRepository;
import cast.springbootApi.entitiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class userController {
  @Autowired
  private UserRepository userRepository;
//  public List<Entitiy> findYoungerPersons(int maxAge) {
//    return userRepository.findByAgeLessThan(maxAge);
//  }

//  @GetMapping("/young-persons")
//  public List<Entitiy> getYoungPersons() {
//    int maxAge = 30;
//    return userRepository.findYoungerPersons(maxAge);
//  }

  //  @GetMapping
//  public List<User> getAllUsers() {
//    return userRepository.findAll();
//  }
  @GetMapping("/all")
  public List<User> getAllEntities() {
    return userRepository.findAll();
  }

  @GetMapping("/find-by-age-less-than")
  public List<User> findByAgeLessThan(@RequestParam int age) {
    return userRepository.findByAgeLessThan(age);
  }

  @GetMapping("/find-by-age-less-than-equal")
  public List<User> findByAgeLessThanEqual(@RequestParam int age) {
    return userRepository.findByAgeLessThanEqual(age);
  }

  @GetMapping("/find-by-age-greater-than")
  public List<User> findByAgeGreaterThan(@RequestParam int age) {
    return userRepository.findByAgeGreaterThan(age);
  }

  @GetMapping("/find-by-age-greater-than-equal")
  public List<User> findByAgeGreaterThanEqual(@RequestParam int age) {
    return userRepository.findByAgeGreaterThanEqual(age);
  }

  @GetMapping("/find-distinct-by-lastname-and-firstname")
  public List<User> findDistinctByLastnameAndFirstname(@RequestParam("lastname") String lastname, @RequestParam("firstname") String firstname) {
    return userRepository.findDistinctByLastnameAndFirstname(lastname, firstname);
  }

  @GetMapping("/find-by-lastname-and-firstname")
  public List<User> findByLastnameAndFirstname(@RequestParam("lastname") String lastname, @RequestParam("firstname") String firstname) {
    return userRepository.findByLastnameAndFirstname(lastname, firstname);
  }

  @GetMapping("/find-by-lastname-or-firstname")
  public List<User> findByLastnameOrFirstname(@RequestParam("lastname") String lastname, @RequestParam("firstname") String firstname) {
    return userRepository.findByLastnameOrFirstname(lastname, firstname);
  }

  @GetMapping("/find-by-start-date-between")
  public List<User> findByStartDateBetween(@RequestParam java.sql.Date startDate, @RequestParam java.sql.Date endDate) {
    return userRepository.findByStartDateBetween(startDate, endDate);
  }
//  @GetMapping("/find-by-start-date-after")
//  public List<User> findByStartDateAfter(@RequestParam Date startDate){
//    return userRepository.findByStartDateAfter((java.sql.Date) startDate);
//  }

  @GetMapping("/find-by-start-date-after")
  public List<User> findByStartDateAfter(@RequestParam java.sql.Date date) {
    return userRepository.findByStartDateAfter(date);
  }

  @GetMapping("/find-by-age-null")
  public List<User> findByAgeIsNull() {
    return userRepository.findByAgeIsNull();
  }

  @GetMapping("/find-by-age-not-null")
  public List<User> findByAgeNotNull() {
    return userRepository.findByAgeNotNull();
  }

  @GetMapping("/find-by-firstname-like")
  public List<User> findByFirstnameLike(@RequestParam("name") String name) {
    return userRepository.findByFirstnameLike(name);
  }

  @GetMapping("/find-by-firstname-not-like")
  public List<User> findByFirstnameNotLike(@RequestParam("name") String name) {
    return userRepository.findByFirstnameNotLike(name);
  }

  @GetMapping("/find-by-firstname-starting-with")
  public List<User> findByFirstnameStartingWith(@RequestParam String prefix) {
    return userRepository.findByFirstnameStartingWith(prefix);
  }

  @GetMapping("/find-by-firstname-ending-with")
  public List<User> findByFirstnameEndingWith(@RequestParam("prefix") String prefix) {
    return userRepository.findByFirstnameEndingWith(prefix);
  }

  @GetMapping("/find-by-firstname-containing")
  public List<User> findByFirstnameContaining(@RequestParam("prefix") String prefix) {
    return userRepository.findByFirstnameContaining(prefix);
  }

  @GetMapping("/find-by-age-order-by-lastname-desc")
  public List<User> findByFAgeOrderByLastnameDesc(@RequestParam("age") int age) {
    return userRepository.findByAgeOrderByLastnameDesc(age);
  }

  @GetMapping("/find-by-lastname-not")
  public List<User> findByLastnameNot(@RequestParam("lastname") String lastname) {
    return userRepository.findByLastnameNot(lastname);
  }

  @GetMapping("/find-active-true")
  public List<User> findByActiveTrue() {
    return userRepository.findByActiveTrue();
  }

  @GetMapping("/find-by-firstname-ignore-case")
  public List<User> findByFirstnameIgnoreCase(@RequestParam("firstname") String firstname) {
    return userRepository.findByFirstnameIgnoreCase(firstname);
  }

  @GetMapping
  public User getUserByEmailId(@RequestParam String email) {
    User user = userRepository.findByEmailId(email);
    return user;
  }


  @PostMapping
  public User createUser(@RequestBody User user) {
    return userRepository.save(user);
  }

  @PutMapping("/{id}")
  public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
    if (!userRepository.existsById(id)) {
      return ResponseEntity.notFound().build();
    }
    updatedUser.setId(id);
    return ResponseEntity.ok(userRepository.save(updatedUser));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
    if (!userRepository.existsById(id)) {
      return ResponseEntity.notFound().build();
    }
    userRepository.deleteById(id);
    return ResponseEntity.noContent().build();
  }

//  @GetMapping("/findByLastname")
//  public List<user> findByLastname(@RequestParam("lastname") String lastname) {
//    return userRepository.findByLastname(lastname);
//}


  @GetMapping("/find-by-email-address")
  public User findByEmailAddress(@RequestParam("emailId") String emailAddress) {
    return userRepository.findByEmailId(emailAddress);
  }


}