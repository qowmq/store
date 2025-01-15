package store.domain;

import java.util.*;
import lombok.*;
import store.domain.*;
import store.infra.AbstractEvent;

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
}
