package store.domain;

import java.util.*;
import lombok.*;
import store.domain.*;
import store.infra.AbstractEvent;

@Data
@ToString
public class OrderCancled extends AbstractEvent {

    private Long id;
}
