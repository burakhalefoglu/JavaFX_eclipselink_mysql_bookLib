package com.sakarya.viewjavafx;

import com.db.eclipslink.business.BookManager;
import com.db.eclipslink.controller.BookController;
import com.db.eclipslink.models.BookEntity;
import com.db.eclipslink.repository.BookDal;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class KutupController {

    @FXML
    private Text errMessage;

    @FXML
    private Button sagbtn;

    @FXML
    private Button solbtn;

    @FXML
    private Button kayitbtn;

    @FXML
    private Button aramabtn;

    @FXML
    private Button exitbtn;


    @FXML
    private TextField anahtarkelime;

    @FXML
    private TextField baskisayisi;

    @FXML
    private TextField baskiyili;

    @FXML
    private TextField baslik;

    @FXML
    private TextField durum;

    @FXML
    private TextField isbn;

    @FXML
    private TextField yayinevi;

    @FXML
    private TextField yazar1;

    @FXML
    private TextField yazar2;

    @FXML
    private TextField yazar3;

    @FXML
    private TextField kitaplik;

    @FXML
    private TextField kitapno;

    @FXML
    private TextField raf;


    private final BookController bookController;


    public KutupController() {
        this.bookController = new BookController(new BookManager(new BookDal()));
    }

    public void startApp(){
        this.kitapno.setText("1");
        BookEntity entity = bookController.getBook(1).getData();
        setFieldsFromDb(entity);
    }

    @FXML
    void exit(ActionEvent event) {
        showErrMessage("");
        Platform.exit();
        System.exit(0);
    }

    @FXML
    void next(ActionEvent event) {
        try {
            showErrMessage("");
            if (Integer.parseInt(kitapno.getText()) > 0) {
                showErrMessage("");
                int kitapNo = Integer.parseInt(kitapno.getText());
                kitapNo += 1;
                kitapno.setText(String.valueOf(kitapNo));
               BookEntity entity = bookController.getBook(kitapNo).getData();
                setFieldsFromDb(entity);
                return;
            }
            showErrMessage("Lütfen 0'dan büyük bir sayı giriniz...");

        } catch (NumberFormatException e) {
            showErrMessage("Lütfen 0'dan büyük bir sayı giriniz...");
        }
         catch (Exception e){
             clearFieldsFromDb();
             showErrMessage("bir hata oluştu...");
        }
    }

    @FXML
    void previous(ActionEvent event) {
        try {
            showErrMessage("");
            if (Integer.parseInt(kitapno.getText()) > 1) {
                showErrMessage("");
                int kitapNo = Integer.parseInt(kitapno.getText());
                kitapNo -= 1;
                kitapno.setText(String.valueOf(kitapNo));
                BookEntity entity = bookController.getBook(kitapNo).getData();
                setFieldsFromDb(entity);
                return;
            }
            showErrMessage("Lütfen 0'dan büyük bir sayı giriniz...");

        } catch (NumberFormatException e) {
            showErrMessage("Lütfen 0'dan büyük bir sayı giriniz...");
        }
        catch (Exception e){
            clearFieldsFromDb();
            showErrMessage("bir hata oluştu...");
        }
    }

    @FXML
    void save(ActionEvent event) {
        try {
            showErrMessage("");
            BookEntity entity = new BookEntity();
            entity.setAnahtar(anahtarkelime.getText());
            entity.setBaski(Integer.parseInt(baskisayisi.getText()));
            entity.setByil(baskiyili.getText());
            entity.setBaslik(baslik.getText());
            entity.setDurum(durum.getText());
            entity.setIssn(isbn.getText());
            entity.setYayinevi(yayinevi.getText());
            entity.setYazar1(yazar1.getText());
            entity.setYazar2(yazar2.getText());
            entity.setYazar3(yazar3.getText());
            entity.setKitaplik(Integer.parseInt(kitaplik.getText()));
            entity.setRaf(Integer.parseInt(raf.getText()));
            bookController.createBook(entity);


        } catch (NumberFormatException e) {
            showErrMessage("Lütfen bir sayı giriniz...");
        }
        catch (Exception e){
            clearFieldsFromDb();
            showErrMessage("bir hata oluştu...");
        }
    }

    @FXML
    void search(ActionEvent event) {

        try {
            if (Integer.parseInt(kitapno.getText()) > 0) {
                showErrMessage("");
                int kitapNo = Integer.parseInt(kitapno.getText());
                kitapno.setText(String.valueOf(kitapNo));
                BookEntity entity = bookController.getBook(kitapNo).getData();
                setFieldsFromDb(entity);
                return;
            }
            showErrMessage("Lütfen 0'dan büyük bir sayı giriniz...");

        } catch (NumberFormatException e) {
            showErrMessage("Lütfen 0'dan büyük bir sayı giriniz...");
        }
        catch (Exception e){
            clearFieldsFromDb();
            showErrMessage("bir hata oluştu...");
        }
    }

    private void showErrMessage(String message) {
        errMessage.setText(message);
    }

    private void setFieldsFromDb(BookEntity entity){
        anahtarkelime.setText(entity.getAnahtar().isEmpty() ? "null" : entity.getAnahtar());
        baskisayisi.setText((String.valueOf(entity.getBaski()).isEmpty() ? "null" : (String.valueOf(entity.getBaski()))));
        baskiyili.setText(entity.getByil().isEmpty() ? "null" : entity.getByil());
        baslik.setText(entity.getBaslik().isEmpty() ? "null" : entity.getBaslik());
        durum.setText(entity.getDurum().isEmpty() ? "null" : entity.getDurum());
        isbn.setText(entity.getIssn().isEmpty() ? "null" : entity.getIssn());
        yayinevi.setText(entity.getYayinevi().isEmpty() ? "null" : entity.getYayinevi());
        yazar1.setText(entity.getYazar1().isEmpty()  ? "null" : entity.getYazar1());
        yazar2.setText(entity.getYazar2().isEmpty() ? "null" : entity.getYazar2());
        yazar3.setText(entity.getYazar3().isEmpty() ? "null" : entity.getYazar3());
        kitaplik.setText((String.valueOf(entity.getKitaplik()).isEmpty() ? "null" : (String.valueOf(entity.getKitaplik()))));
        kitapno.setText((String.valueOf(entity.getKno()).isEmpty() ? "null" : (String.valueOf(entity.getKno()))));
        raf.setText((String.valueOf(entity.getRaf()).isEmpty() ? "null" : (String.valueOf(entity.getRaf()))));
    }

    private void clearFieldsFromDb(){
        anahtarkelime.setText("");
        baskisayisi.setText("");
        baskiyili.setText("");
        baslik.setText("");
        durum.setText("");
        isbn.setText("");
        yayinevi.setText("");
        yazar1.setText("");
        yazar2.setText("");
        yazar3.setText("");
        kitaplik.setText("");
        kitapno.setText("");
        raf.setText("");
    }
}
