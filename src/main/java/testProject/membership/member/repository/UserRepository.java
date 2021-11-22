package testProject.membership.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testProject.membership.member.domain.UserInfo;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findByEmail(String email);
}
