package com.gluonapplication;

import com.gluonapplication.views.AppViewManager;
import com.gluonhq.charm.glisten.application.AppManager;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/*
this is how to use javascript in JavaFXapplication
https://knowles.co.za/javafx-and-javascript-calling-java-from-javascript/
http://www.java2s.com/Code/Java/JavaFX/WebEngineLoadListener.htm
https://stackoverflow.com/questions/41654573/java-fx-javascript



*/

public class GluonApplication extends Application {

    private final AppManager appManager = AppManager.initialize(this::postInit);

    @Override
    public void init() {
        AppViewManager.registerViewsAndDrawer();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        appManager.start(primaryStage);
    }

    private void postInit(Scene scene) {
        Swatch.BLUE.assignTo(scene);

        scene.getStylesheets().add(GluonApplication.class.getResource("style.css").toExternalForm());
        ((Stage) scene.getWindow()).getIcons().add(new Image(GluonApplication.class.getResourceAsStream("/icon.png")));
    }

    public static void main(String args[]) {
        launch(args);
    }
}


/*
public class Adder{

public double getSum(String a, String b)
{
    return Double.parseDouble(b) + Double.parseDouble(a);
}}

*/

/*

WebView browser = new WebView();
    browser.getEngine().getLoadWorker()
            .stateProperty()
            .addListener((obs, old, neww) ->
            {
                if (neww == Worker.State.SUCCEEDED)
                {
                    JSObject jsobj = (JSObject) browser.getEngine()
                            .executeScript("window");
                    jsobj.setMember("adder", new Adder());
                }
            });


*/

/*

function add()
        {
            var sum = adder.getSum("5", "7");
        }

*/




/*
import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;
public class NashornTest extends Application{

@Override

public void start(Stage stage)
{

    //create an embeded web browser
    WebView browser = new WebView();

    browser.getEngine().getLoadWorker()
            .stateProperty()
            .addListener((obs, old, neww) ->
            {
                if (neww == Worker.State.SUCCEEDED)
                {
                    // Let JavaScript make calls to adder object,
                    //so we need to inject an [Adder] object into the JS code
                    JSObject bridge = (JSObject) browser.getEngine()
                            .executeScript("window");
                    bridge.setMember("adder", new Adder());
                }
            });
    //load the html page
    browser.getEngine().load(NashornTest.class.getResource("index.xhtml").toString());
    VBox box = new VBox(browser);

    Scene scene = new Scene(box);
    stage.setScene(scene);
    stage.show();
}

public static void main(String[] args)
{
    launch(args);
}}


*/


/*

public class Adder{

public double getSum(String a, String b)
{
    return Double.parseDouble(b) + Double.parseDouble(a);
}}

*/


/*
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <script>
            function add()
            {
                var num1 = document.getElementById("num1Field").value;
                var num2 = document.getElementById("num2Field").value;
                //make calls for injected java object
                var sum = adder.getSum(num1, num2);
                document.getElementById("outputDiv").innerHTML = "sum = " + sum;
            }

        </script>
    </head>
    <body>
        <input id="num1Field"/>
        <input id="num2Field"/>
        <button onclick="add()">sum</button>
        <div id="outputDiv"></div>
    </body>
</html>

*/