package store.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import store.domain.*;
import store.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancled extends AbstractEvent {

    private Long id;

    public OrderCancled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancled() {
        super();
    }
}
//>>> DDD / Domain Event
