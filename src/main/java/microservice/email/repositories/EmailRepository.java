package microservice.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import microservice.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
