package store.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import store.domain.*;
import store.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Stockdecrease extends AbstractEvent {

    private Long id;
    private Integer stock;

    public Stockdecrease(Inventory aggregate) {
        super(aggregate);
    }

    public Stockdecrease() {
        super();
    }
}
//>>> DDD / Domain Event
