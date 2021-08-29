package br.inatel.cdg.algebra.scene;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScenePrincipal {

    private Button btnTeste, btnCalcCoefLinear; //Button representa botoes
    private Label labelTeste1; //Label representam rótulos
    private TextField textField1, textField2; //TextField Representam áreas de texto

    public void criaScenePrincipal(Stage stage){

        //Criando os labels para os pontos e os campos de texto para os dados
        labelTeste1 = new Label("Digite alguma coisa"); //rótulos
        textField1 = new TextField(); //área de texto onde vc digitara alguma coisa


        //HBox é usado para agrupar elementos horizontalmente
        HBox grupoHorizontal = new HBox(labelTeste1, textField1); //Passamos no construtor todos os elementos. Você poderá criar vários grupos horizontais


        //Agora vamos criar a area que mostrará o que foi digitado
        textField2 = new TextField();
        textField2.setEditable(false);//vamos deixar false para apenas mostrar texto
        textField2.setText("Sua frase aparecerá aqui");

        //Criamos o botão
        btnTeste = new Button("Executar Ação");
        //Criamos a ação que o botão responderá as ser pressionado
        btnTeste.setOnAction(evento -> {
            //Aqui dentro é a ação que será executado ao pressionar o botão
            textField2.setText(textField1.getText());//Acessamos o componente textField1, pegamos o texto e colocaos em textField2
        });

        //VBox é usada para agrupar elementos verticalmente
        //No construtor passamos todos os elementos que serão agrupados, que podem ser outros grupos
        VBox layoutFinal = new VBox(grupoHorizontal, textField2,btnTeste);//Aqui vamos agrupar verticalmente o grupo (Label + Texto) o Botao e A area que aparecer o texto digitado
        //Criamos a Scene
        Scene scene = new Scene(layoutFinal, 300 , 200);

        stage.setTitle("Software Para Calculos de Álgebra Linear");
        stage.setScene(scene);
        stage.show();
    }

}
