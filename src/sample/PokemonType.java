package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.util.Observable;

public class PokemonType extends Application implements Types {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("PokemonType.fxml"));
        stage.setTitle("Poke Type Calc");
       // ChoiceBox<String> type1 = new ChoiceBox<>()    ;
        //type1.getItems().add("getPokeTypeList()");

        //ChoiceBox<String> types1 = new ChoiceBox<>(FXCollections.observableArrayList(getPokeTypeList()));
   //types1.setItems("apple");
        //ChoiceBox<String> c = new ChoiceBox<>(FXCollections.observableArrayList(getPokeTypeList()));
        Scene scene = new Scene(root);
        stage.setScene(scene); // attach scene to stage
        stage.show();



    }


    private static void main(String[] args) {
        launch(args);
    }
}
