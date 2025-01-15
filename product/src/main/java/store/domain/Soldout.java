package store.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import store.domain.*;
import store.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Soldout extends AbstractEvent {

    private Long id;
    private Long stock;

    public Soldout(Inventory aggregate) {
        super(aggregate);
    }

    public Soldout() {
        super();
    }
}
//>>> DDD / Domain Event
