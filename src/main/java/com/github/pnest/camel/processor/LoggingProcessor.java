package com.github.pnest.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingProcessor implements Processor {

    private static final Logger log = LoggerFactory.getLogger(LoggingProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        final Message message = exchange.getIn();
        log.info("Message ID: {}; Exchange Name: {}.",
                message.getMessageId(), message.getHeader("rabbitmq.EXCHANGE_NAME", String.class));
    }

}
