package store.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import store.domain.*;
import store.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private Integer qty;
    private Long productid;
    private Long price;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
