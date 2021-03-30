package example;


import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ItemRepository extends PagingAndSortingRepository<Item,Long> {
    Optional<Item> findById( Long id );
}
