package store.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import store.config.kafka.KafkaProcessor;
import store.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    DeliveryRepository deliveryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCancled'"
    )
    public void wheneverOrderCancled_CancelDelivery(
        @Payload OrderCancled orderCancled
    ) {
        OrderCancled event = orderCancled;
        System.out.println(
            "\n\n##### listener CancelDelivery : " + orderCancled + "\n\n"
        );

        // Sample Logic //
        Delivery.cancelDelivery(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_StartShiping(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener StartShiping : " + orderPlaced + "\n\n"
        );

        // Comments //
        //1. CJ 택배 전문전송
        // 2. 고객 알림
        // 3. 우리장부 저장

        // Sample Logic //
        Delivery.startShiping(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
