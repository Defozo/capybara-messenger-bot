package eu.kapibary.capybaramessengerbot.apiai.handler;

import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIRequest;
import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIResponse;

public interface IntentHandler {
    ApiAIResponse handle(ApiAIRequest apiAIRequest);
}

