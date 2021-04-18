package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.UserInformation;

@Repository
public interface UserRepositry extends JpaRepository<UserInformation, Long> {
}