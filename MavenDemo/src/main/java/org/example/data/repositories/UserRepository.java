package org.example.data.repositories;


import org.example.data.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Contact, Long> {

}
