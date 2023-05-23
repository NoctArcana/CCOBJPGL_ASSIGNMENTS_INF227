package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class FastFoodController {
    @FXML
    ImageView Bonchon, BurgerKing, Chowking, KFC, Popeyes;

    @FXML
    Button kfcBtn, popeyesBtn, bonchonBtn, chowkingBtn, burgerkingBtn;

    KFC kfc = new KFC();
    Popeyes popeyes = new Popeyes();
    Bonchon bonchon = new Bonchon();
    Chowking chowking = new Chowking();
    BurgerKing burgerking = new BurgerKing();


    public void initialize() {

        kfc.setFoodStyle("American");
        kfc.setKnownFood("11-herbs & spices Fried Chicken");

        popeyes.setFoodStyle("American");
        popeyes.setKnownFood("Crispy Fried Chicken");

        bonchon.setFoodStyle("South Korean");
        bonchon.setKnownFood("Glazed Fried Chicken");

        chowking.setFoodStyle("Chinese");
        chowking.setKnownFood("a variety of Chinese dishes");

        burgerking.setFoodStyle("American");
        burgerking.setKnownFood("Flame-broiled Hamburgers");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(kfcBtn)) {
            alert.setContentText("KFC is an " + kfc.getFoodStyle() + " style fast-food restaurant that is known for " + kfc.getKnownFood());
        }

        if (sourceButton == popeyesBtn) {
            alert.setContentText("Popeyes is an " + popeyes.getFoodStyle() + " style fast-food restaurant that is known for " + popeyes.getKnownFood());
        }

        if (sourceButton.equals(bonchonBtn)) {
            alert.setContentText("Bonchon is a " + bonchon.getFoodStyle() + " style fast-food restaurant that is known for " + bonchon.getKnownFood());
        }

        if (sourceButton == chowkingBtn) {
            alert.setContentText("Chowking is a " + chowking.getFoodStyle() + " style fast-food restaurant that is known for " + chowking.getKnownFood());
        }

        if (sourceButton.equals(burgerkingBtn)) {
            alert.setContentText("Burger King is an " + burgerking.getFoodStyle() + " style fast-food restaurant that is known for " + burgerking.getKnownFood());
        }

        alert.showAndWait();

    }
}
