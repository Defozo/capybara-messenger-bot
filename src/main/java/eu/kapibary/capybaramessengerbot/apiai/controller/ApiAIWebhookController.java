package eu.kapibary.capybaramessengerbot.apiai.controller;

import com.google.gson.Gson;
import eu.kapibary.capybaramessengerbot.apiai.handler.IntentHandler;
import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIRequest;
import eu.kapibary.capybaramessengerbot.apiai.model.ApiAIResponse;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ApiAIWebhookController {

    private static final Map<String, IntentHandler> intentHandlers = new HashMap<String, IntentHandler>() {{
        /*put("greetings", new GreetingsHandler());
        put("selectSubject", new SubjectHandler());
        put("selectLevel", new QuestionHandler());
        put("answer", new AnswerHandler());*/
    }};

    @RequestMapping(value = "/api-ai", method = RequestMethod.POST, produces = {"application/json"}, consumes = {"application/json"})
    @ResponseBody
    public String generateResponse(@RequestBody String request) {
        Gson gson = new Gson();
        ApiAIRequest apiAIRequest = gson.fromJson(request, ApiAIRequest.class);
        ApiAIResponse apiAIResponse = new ApiAIResponse();
        if (intentHandlers.containsKey(apiAIRequest.getResult().getAction())) {
            apiAIResponse = intentHandlers.get(apiAIRequest.getResult().getAction()).handle(apiAIRequest);
        }
        return gson.toJson(apiAIResponse);
    }

}
