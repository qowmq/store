package store.domain;

import java.util.*;
import lombok.*;
import store.domain.*;
import store.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private Integer qty;
    private Long productid;
    private Long price;
}
