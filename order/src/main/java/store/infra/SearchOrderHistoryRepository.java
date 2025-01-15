package store.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import store.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "searchOrderHistories",
    path = "searchOrderHistories"
)
public interface SearchOrderHistoryRepository
    extends PagingAndSortingRepository<SearchOrderHistory, Long> {}
