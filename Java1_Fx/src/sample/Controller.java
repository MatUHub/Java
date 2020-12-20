package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.util.Random;




public class Controller {

    @FXML
    public TextField textField;

    @FXML
    public Label headerName;

    @FXML
    public Label bottomName;


    @FXML
    void onAction() {


          guessNumber();
//        chooseAnswer();


        /*random = new Random();
        String message = textField.getText();
        if (!message.isBlank()) {
            try {
                int number = Integer.parseInt(message);
                int randomNumber = random.nextInt(number);
                headerName.setText(String.valueOf(randomNumber));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число!");
            }
        }*/
    }

    Random random = new Random();
    int aSupposed = random.nextInt(10);
    int counter = 3;
    boolean playerWin = false;
    String message1="Введено неверное значение!\nВведите значение от 0 до 9";
    String message2 ="Ваши попытки закончились!\nЗагаданное число было " + aSupposed;;
    String message3 = "";
    String message4 = "Поздравляю, вы угадали число!";
    String message5 = "Загаданное число больше\nпредполагаемого числа";
    String message6 = "Загаданное число меньше\nпредполагаемого числа";
//    /**/String message7 = "У вас " + counter + " попытки\nВведите предполагаемое значение\nзагаданного числа:";
    String message8 = "Введите 1 для перезапуска игры";



    private void guessNumber() {
        String message = textField.getText();

        if (counter <= 1) {
            if(playerWin) {
                headerName.setText(message4);
                bottomName.setText(message8);
            } else {
            headerName.setText(message2);
            bottomName.setText(message8);
            }
            bottomName.setText(message8);
            if(Integer.parseInt(message) == 1) {
                counter = 3;
                headerName.setText("У вас " + counter + " попытки\nВведите предполагаемое значение\nзагаданного числа:");
                bottomName.setText(message3);
                playerWin = false;
            }

        } else if (message.matches("[0-9]")) {
                System.out.println(message);
                bottomName.setText("");
            int aPlayer = Integer.parseInt(message);

            if (aPlayer == aSupposed) {
                headerName.setText(message4);
                bottomName.setText(message8);
                playerWin = true;

            } else if (aPlayer < aSupposed) {
                counter--;
                headerName.setText("У вас " + counter + " попытки\nВведите предполагаемое значение\nзагаданного числа:");
                bottomName.setText(message5);
            } else if (aPlayer > aSupposed) {
                counter--;
                headerName.setText("У вас " + counter + " попытки\nВведите предполагаемое значение\nзагаданного числа:");
                bottomName.setText(message6);
            }

            } else bottomName.setText(message1);
            textField.setText(message3);

/*}

        if (counter < 1) {
            message1 = "Ваши попытки закончились! Загаданное число было " + aSupposed;
            headerName.setText(message1);
            message2 = " ";
            bottomName.setText(message2);


        }

            message1 = ("У вас " + counter + " попытки\nВведите предполагаемое значение\nзагаданного числа: \n");
        headerName.setText(message1);

        int aPlayer = Integer.parseInt(message);

        if (aPlayer == aSupposed) {
            message1 = "Поздравляю, вы угадали число!";
            headerName.setText(message1);
            message2 = " ";
            bottomName.setText(message2);

        } else if (aPlayer < aSupposed) {
            counter--;
            message2 = "Загаданное число больше\nпредполагаемого числа";
            bottomName.setText(message2);
        } else if (aPlayer > aSupposed) {
            counter--;
            message2 = "Загаданное число меньше\nпредполагаемого числа";
            bottomName.setText(message2);
        }

        textField.setText(message3);
*/


    }


    /*private void chooseAnswer() {
        message1 = "Повторить игру еше раз? 1 - да/ 0 - нет" ;
        headerName.setText(message1);
        message2 = " ";
        bottomName.setText(message2);


        String message = textField.getText();
        switch (Integer.parseInt(message)) {
            case 1:
                guessNumber();
                chooseAnswer();
                break;
            case 0:
                System.out.println("Спасибо за игру!");

        }

    }*/

}