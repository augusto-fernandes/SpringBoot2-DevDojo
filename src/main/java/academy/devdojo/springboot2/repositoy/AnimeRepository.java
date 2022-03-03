package academy.devdojo.springboot2.repositoy;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AnimeRepository extends JpaRepository<Anime,Long> {
}



