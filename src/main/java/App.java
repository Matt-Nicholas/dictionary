
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";



        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/index.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Word newWord = new Word(request.queryParams("new-word"));
            List<Word> words = Word.all();
            model.put("template", "templates/index.vtl");
            model.put("words", words);
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/words/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Word word = Word.find(Integer.parseInt(request.params(":id")));
            model.put("word", word);
            model.put("template", "templates/definitions.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/words/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Definition newDefinition = new Definition(request.queryParams("new-definition"));
            Word word = Word.find(Integer.parseInt(request.params(":id")));
            word.setDefinition(newDefinition);
            model.put("word", word);
            model.put("template", "templates/definitions.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

    }
}
