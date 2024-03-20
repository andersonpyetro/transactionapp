package br.com.pyetro.bankproject.messaging;

import br.com.pyetro.bankproject.exception.NotificationException;
import br.com.pyetro.bankproject.transaction.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.client.RestClient;

public class NotificationConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(NotificationConsumer.class);
    private RestClient restClient;


    public NotificationConsumer(RestClient.Builder builder) {
        this.restClient = builder.baseUrl(
                        "https://run.mocky.io/v3/54dc2cf1-3add-45b5-b5a9-6bf7e7f1f4a6")
                .build();
    }

    @KafkaListener(topics = "transaction-notification", groupId = "picpay-desafio-backend")
    public void receiveNotification(Transaction transaction) {
        LOGGER.info("notifying transaction {}...", transaction);

        var response = restClient.get().retrieve().toEntity(Notification.class);

        if (response.getStatusCode().isError() || !response.getBody().message())
            throw new NotificationException("Error notifying transaction " + transaction);

        LOGGER.info("notification has been sent {}...", response.getBody());
    }
}
