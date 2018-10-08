/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 84570695272
 */
public class CalculadoraController implements Initializable {
    
    @FXML
    private TextField txtNumero1;
    
    @FXML
    private TextField txtNumero2;
    
    @FXML
    private Button btnSoma;
    
    @FXML
    private Button btnSubtrair;
     
    @FXML
    private Button btnMultiplicar;
      
    @FXML
    private Button btnDividir;
   
    @FXML
    private TextField lbResultado;
     
    @FXML
    private void somar(ActionEvent event) {
        Double num1, num2, result;
        num1 = Double.parseDouble(txtNumero1.getText());
        num2 = Double.parseDouble(txtNumero2.getText());
        result = num1 + num2;
        // IMPLEMENTAR A SOMA
        lbResultado.setText(result.toString());
        
        Historico cal = new Historico();
        cal.setPrimeiroValor(Double.parseDouble(txtNumero1.getText()));
        cal.setSegundoValor(Double.parseDouble(txtNumero2.getText()));
        cal.setResultado(Double.parseDouble(lbResultado.getText()));
        cal.setOperador("Soma");
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(cal);
        em.getTransaction().commit();
       
      
    }
    
    
    
    @FXML
    private void subtrair(ActionEvent event) {
        Double num1, num2, result;
        num1 = Double.parseDouble(txtNumero1.getText());
        num2 = Double.parseDouble(txtNumero2.getText());
        result = num1 - num2;
        // IMPLEMENTAR A SUBTRAÇÃO
        lbResultado.setText(result.toString());
      
        Historico cal = new Historico();
        cal.setPrimeiroValor(Double.parseDouble(txtNumero1.getText()));
        cal.setSegundoValor(Double.parseDouble(txtNumero2.getText()));
        cal.setResultado(Double.parseDouble(lbResultado.getText()));
        cal.setOperador("Subtração");
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(cal);
        em.getTransaction().commit();
      
    }
    
    @FXML
    private void mult(ActionEvent event) {
        Double num1, num2, result;
        num1 = Double.parseDouble(txtNumero1.getText());
        num2 = Double.parseDouble(txtNumero2.getText());
        result = num1 * num2;
        // IMPLEMENTAR A MULTIPLICAÇÃO
        lbResultado.setText(result.toString());
       
         Historico cal = new Historico();
        cal.setPrimeiroValor(Double.parseDouble(txtNumero1.getText()));
        cal.setSegundoValor(Double.parseDouble(txtNumero2.getText()));
        cal.setResultado(Double.parseDouble(lbResultado.getText()));
        cal.setOperador("Multiplicação");
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(cal);
        em.getTransaction().commit();
      
    }
    
    @FXML
    private void dividir(ActionEvent event) {
        Double num1, num2, result;
        num1 = Double.parseDouble(txtNumero1.getText());
        num2 = Double.parseDouble(txtNumero2.getText());
        result = (num1 / num2);
        // IMPLEMENTAR A DIVISÃO
        lbResultado.setText(result.toString());
        
         Historico cal = new Historico();
        cal.setPrimeiroValor(Double.parseDouble(txtNumero1.getText()));
        cal.setSegundoValor(Double.parseDouble(txtNumero2.getText()));
        cal.setResultado(Double.parseDouble(lbResultado.getText()));
        cal.setOperador("Divisão");
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(cal);
        em.getTransaction().commit();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
//        EntityManager em = emf.createEntityManager();
    }    
    
}