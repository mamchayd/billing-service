package ma.enset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.enset.entity.Bill;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill, Long>{
}