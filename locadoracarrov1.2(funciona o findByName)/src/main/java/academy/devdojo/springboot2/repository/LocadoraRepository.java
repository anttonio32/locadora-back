package academy.devdojo.springboot2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import academy.devdojo.springboot2.domain.Locadora;

public interface LocadoraRepository extends JpaRepository<Locadora,Long>{
    
}
