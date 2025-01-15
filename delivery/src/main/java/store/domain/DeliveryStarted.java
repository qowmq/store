package store.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import store.domain.*;
import store.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String userid;
    private String where;
    private String productname;
    private Integer qty;
    private String state;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
