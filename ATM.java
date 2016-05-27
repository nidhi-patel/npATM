//=======================================================================
// Name         : Nidhi Patel
// Date         :  03/03/2016
// Description  : This program is an ATM(Cash Machine with a simple GUI
//=======================================================================

//import statements
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.text.DecimalFormat;

//ATM class that creates the GUI for the ATM and implements the functions of the ATM
public class ATM extends Application  {

	String currentNum = "";	//currentNum stores the value of the button that is pressed in the keypad
	String currentFunction = "Enter Pin";	//currentFunction stores the active function
	int password = 1234;	//password stores the sample pin
	int pin = 0;	//pin stores the pin entered by the user
	int depositAmount;	//depositAmount stores the amount the user has entered to deposit
	int numTry = 1;		//numTry is a counter to count the number of attemps a user has made to enter the pin
	double balance = 1573.91;	//balance stores the current balance of the account

	//create a currency format to output the currecny values (e.g. balance)
	DecimalFormat currency = new DecimalFormat ("$###,###.###");

	//main method to launch the program
	public static void main(String[]args){
		launch(args);
	}

	//Overridden start method which creats the GUI and manipulates the data used in the program
	public void start(Stage primaryStage) throws Exception{

		//Set styling properties for the stage
		primaryStage.setTitle("Cash Machine");
		primaryStage.setResizable(false);

		//Create a grid layout
		GridPane layout = new GridPane();

		//Add styling properties to the stage
		layout.setPadding(new Insets(10));
		layout.setHgap(5);
		layout.setVgap(5);

		//Set width for each column in the grid
		layout.getColumnConstraints().add(new ColumnConstraints(150));
		layout.getColumnConstraints().add(new ColumnConstraints(150));
		layout.getColumnConstraints().add(new ColumnConstraints(150));
		layout.getColumnConstraints().add(new ColumnConstraints(150));

		//Create a text area to display instructions and output to the user
		TextArea txtArea = new TextArea();

		//Set properties for the text area
		txtArea.setPrefColumnCount(50);
		txtArea.setPrefRowCount(10);
		txtArea.setWrapText(true);
		txtArea.setEditable(false);
		txtArea.appendText("Instructions Area\nPlease Enter Pin on the numeric keypad.");

		//Create a text field to get inputs from the user
		TextField inputTxt = new TextField();

		//Set properties for the text field
		inputTxt.setEditable(false);
		txtArea.setWrapText(true);

		//Create buttons
		Button btnWithdraw50 = new Button("Withdraw $50");
		Button btnWithdraw100 = new Button("Withdraw $100");
		Button btnWithdraw200 = new Button("Withdraw $200");
		Button btnDeposit = new Button("Deposit");
		Button btnQuit = new Button("Quit");
		Button btnClear = new Button("Clear");
		Button btnEnter = new Button("Enter");
		Button btn0 = new Button("0");
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8");
		Button btn9 = new Button("9");

		//Set styling properties for the buttons
		btnWithdraw50.setMaxWidth(Double.MAX_VALUE);
		btnWithdraw50.setDisable(true);
		btnWithdraw100.setMaxWidth(Double.MAX_VALUE);
		btnWithdraw100.setDisable(true);
		btnWithdraw200.setMaxWidth(Double.MAX_VALUE);
		btnWithdraw200.setDisable(true);
		btnDeposit.setMaxWidth(Double.MAX_VALUE);
		btnDeposit.setDisable(true);
		btnQuit.setMaxWidth(Double.MAX_VALUE);
		btnClear.setMaxWidth(Double.MAX_VALUE);
		btnEnter.setMaxWidth(Double.MAX_VALUE);
		btn0.setMaxWidth(Double.MAX_VALUE);
		btn1.setMaxWidth(Double.MAX_VALUE);
		btn2.setMaxWidth(Double.MAX_VALUE);
		btn3.setMaxWidth(Double.MAX_VALUE);
		btn4.setMaxWidth(Double.MAX_VALUE);
		btn5.setMaxWidth(Double.MAX_VALUE);
		btn6.setMaxWidth(Double.MAX_VALUE);
		btn7.setMaxWidth(Double.MAX_VALUE);
		btn8.setMaxWidth(Double.MAX_VALUE);
		btn9.setMaxWidth(Double.MAX_VALUE);

		//Add the UI elements to the layout
		layout.add(txtArea,0,0,4,1);
		layout.add(inputTxt,0,1,4,1);
		layout.add(btnWithdraw50,0,2);
		layout.add(btn1,1,2);
		layout.add(btn2,2,2);
		layout.add(btn3,3,2);
		layout.add(btnWithdraw100,0,3);
		layout.add(btn4,1,3);
		layout.add(btn5,2,3);
		layout.add(btn6,3,3);
		layout.add(btnWithdraw200,0,4);
		layout.add(btn7,1,4);
		layout.add(btn8,2,4);
		layout.add(btn9,3,4);
		layout.add(btnDeposit,0,5);
		layout.add(btn0,1,5);
		layout.add(btnClear,2,5);
		layout.add(btnEnter,3,5);
		layout.add(btnQuit,0,6);

		//Create a scene
		Scene scene = new Scene(layout);

		//Set the scene onto the stage
		primaryStage.setScene(scene);

		//Display the stage
		primaryStage.show();

		//Handle the events related to the 0 button
		btn0.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "0";
				inputTxt.setText(currentNum);
	        }
		});

		//Handle the events related to the 1 button
		btn1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "1";
				inputTxt.setText(currentNum);
				System.out.println("HI");
			}
		});

		//Handle the events related to the 2 button
		btn2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "2";
				inputTxt.setText(currentNum);
			}
		});

		//Handle the events related to the 3 button
		btn3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "3";
				inputTxt.setText(currentNum);
			}
		});

		//Handle the events related to the 4 button
		btn4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "4";
				inputTxt.setText(currentNum);
			}
		});

		//Handle the events related to the 5 button
		btn5.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "5";
				inputTxt.setText(currentNum);
			}
		});

		//Handle the events related to the 6 button
		btn6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "6";
				inputTxt.setText(currentNum);
			}
		});

		//Handle the events related to the 7 button
		btn7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "7";
				inputTxt.setText(currentNum);
			}
		});


		//Handle the events related to the 8 button
		btn8.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "8";
				inputTxt.setText(currentNum);
			}
		});


		//Handle the events related to the 9 button
		btn9.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum += "9";
				inputTxt.setText(currentNum);
			}
		});


		//Handle the events related to the Clear button
		btnClear.setOnAction(new EventHandler<ActionEvent>(){
 			public void handle(ActionEvent event){
				inputTxt.setText("");
				currentNum = "";
			}
		});

		//Handle the events related to the Quit button
		//The user is returned to the Enter Pin screen
		btnQuit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				numTry = 1;
				currentFunction = "Enter Pin";
				txtArea.setText("");
				txtArea.appendText("Instructions Area\nPlease Enter Pin on the numeric keypad.\n");
				inputTxt.setText("");
				currentNum = "";
				pin = 0;
				btnWithdraw50.setDisable(true);
				btnWithdraw100.setDisable(true);
				btnWithdraw200.setDisable(true);
				btnDeposit.setDisable(true);
				btn0.setDisable(false);
				btn1.setDisable(false);
				btn2.setDisable(false);
				btn3.setDisable(false);
				btn4.setDisable(false);
				btn5.setDisable(false);
				btn6.setDisable(false);
				btn7.setDisable(false);
				btn8.setDisable(false);
				btn9.setDisable(false);
				btnEnter.setDisable(false);
			}
		});

		//Handle the events related to the Deposit button
		//Activates the Deposit funtion which allows the user to make a deposit
		btnDeposit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				currentNum = "";
				inputTxt.setText("");
				currentFunction = "Deposit";
				txtArea.appendText("\nPlease enter the deposit amount. Maximum deposit possible $2500\n");
				btn0.setDisable(false);
				btn1.setDisable(false);
				btn2.setDisable(false);
				btn3.setDisable(false);
				btn4.setDisable(false);
				btn5.setDisable(false);
				btn6.setDisable(false);
				btn7.setDisable(false);
				btn8.setDisable(false);
				btn9.setDisable(false);
				btnEnter.setDisable(false);
			}
		});

		//Handle the events related to the Withdraw 50 button
		//Allows the user to withdraw $50.00
		btnWithdraw50.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				if(balance >= 50){
					System.out.println("\nReceipt");
					System.out.println("\nCurrent Balance: " + currency.format(balance));
					System.out.println("Withdraw Amount: $50.00");
					balance -= 50.00;
					System.out.println("New Balance: " + currency.format(balance));
					System.out.println("___________________________________");
					txtArea.appendText("\nWithdraw Successful \nWithdraw Amount: $50.00\n");
					txtArea.appendText("New Balance: " + currency.format(balance)+"\n") ;
					inputTxt.setText("");
					if(balance < 50)
					{
						btnWithdraw50.setDisable(true);
						btnWithdraw100.setDisable(true);
						btnWithdraw200.setDisable(true);
					}
					else if(balance < 100)
					{
						btnWithdraw50.setDisable(false);
						btnWithdraw100.setDisable(true);
						btnWithdraw200.setDisable(true);
					}
					else if(balance < 200)
					{
						btnWithdraw50.setDisable(false);
						btnWithdraw100.setDisable(false);
						btnWithdraw200.setDisable(true);
					}
				}
			}
		});

		//Handle the events related to the Withdraw 100  button
		//Allows the user to withdraw $100.00
		btnWithdraw100.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				if(balance >= 100){
					System.out.println("\nReceipt");
					System.out.println("\nCurrent Balance: " + currency.format(balance));
					System.out.println("Withdraw Amount: $100.00");
					balance -= 100.00;
					System.out.println("New Balance: " + currency.format(balance));
					System.out.println("___________________________________");
					txtArea.appendText("\nWithdraw Successful \nWithdraw Amount: $100.00\n");
					txtArea.appendText("New Balance: " + currency.format(balance)+"\n");
					inputTxt.setText("");
					if(balance < 50)
					{
						btnWithdraw50.setDisable(true);
						btnWithdraw100.setDisable(true);
						btnWithdraw200.setDisable(true);
					}
					else if(balance < 100)
					{
						btnWithdraw50.setDisable(false);
						btnWithdraw100.setDisable(true);
						btnWithdraw200.setDisable(true);
					}
					else if(balance < 200 && balance < 100 && balance < 50)
					{
						btnWithdraw50.setDisable(true);
						btnWithdraw100.setDisable(true);
						btnWithdraw200.setDisable(true);
					}
				}
			}
		});

		//Handle the events related to the Withdraw 200 button
		//Allows the user to withdraw $200.00
		btnWithdraw200.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				if(balance >= 200){
					System.out.println("\nReceipt");
					System.out.println("\nCurrent Balance: " + currency.format(balance));
					System.out.println("Withdraw Amount: $200.00");
					balance -= 200.00;
					System.out.println("New Balance: " + currency.format(balance));
					System.out.println("___________________________________");
					txtArea.appendText("\nWithdraw Successful \nWithdraw Amount: $200.00\n");
					txtArea.appendText("New Balance: " + currency.format(balance) + "\n");
					inputTxt.setText("");
					if(balance < 50)
					{
						btnWithdraw50.setDisable(true);
						btnWithdraw100.setDisable(true);
						btnWithdraw200.setDisable(true);
					}
					else if(balance < 100)
					{
						btnWithdraw50.setDisable(false);
						btnWithdraw100.setDisable(true);
						btnWithdraw200.setDisable(true);
					}
					else if(balance < 200)
					{
						btnWithdraw50.setDisable(false);
						btnWithdraw100.setDisable(false);
						btnWithdraw200.setDisable(true);
					}

				}
			}
		});

		//Handle the events related to the Enter button
		//Allows the user to send the input to the program
		btnEnter.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){

				//If the active funtion is Enter Pin
				//Check if the user has entered the correct pin
				//Check if the user has entered a blank value
				//Check if the user has entered the wrong pin
				//Exit the program if the user has 3 incorrect attempts
				if(currentFunction == "Enter Pin")
				{
					if((inputTxt.getText().isEmpty()))
					{
						txtArea.appendText("\nPlease Enter Pin on the numeric keypad.\n");
					}
					else
					{
						pin = Integer.parseInt(inputTxt.getText());
					}
					if(pin == password)
					{
						txtArea.appendText("\nTotal Balance: " + currency.format(balance) + "\nTo make a deposit click the Deposit button.\nTo withdraw click on the Withdraw button.\n");
						inputTxt.setText("");
						currentNum = "";
						btn0.setDisable(true);
						btn1.setDisable(true);
						btn2.setDisable(true);
						btn3.setDisable(true);
						btn4.setDisable(true);
						btn5.setDisable(true);
						btn6.setDisable(true);
						btn7.setDisable(true);
						btn8.setDisable(true);
						btn9.setDisable(true);
						btnEnter.setDisable(true);

						if(balance >= 50)
						{
							btnWithdraw50.setDisable(false);
						}
						if (balance >= 100)
						{
							btnWithdraw100.setDisable(false);
						}
						if(balance >= 200)
						{
							btnWithdraw50.setDisable(false);
							btnWithdraw100.setDisable(false);
							btnWithdraw200.setDisable(false);
						}
						btnDeposit.setDisable(false);
					}
					else if (pin != password && numTry < 3 && (!inputTxt.getText().isEmpty()))
					{
						txtArea.appendText("\nIncorrect Pin Try Again.\n");
						numTry++;
					}
					else if (numTry == 3)
					{
						primaryStage.close();
					}
				}
				//If the active funtion is Deposit
				//Check if the user has entered a black value
				//Check if the user has entered a value greater than 2500
				//If the  user has entered a valid value add the deposit amount
				//to the current balnce and display the transaction in the text area
				else if (currentFunction == "Deposit")
				{
					if((inputTxt.getText().isEmpty()))
					{
						txtArea.appendText("\nPlease Enter Deposit Amount.\n");
					}
					else
					{
						depositAmount = Integer.parseInt(inputTxt.getText());
						if(depositAmount >= 2500)
						{
							 txtArea.appendText("\nDeposit Amount Must Be Less Than $2500.00\n");
							 inputTxt.setText("");
							 currentNum = "";
						}
						else if (depositAmount < 2500 )
						{
							System.out.println("\nReceipt");
							System.out.println("Current Balance: " + currency.format(balance));
							System.out.println("Deposit Amount: " + currency.format(depositAmount));
							balance += depositAmount;
							System.out.println("New Balance: " + currency.format(balance));
							System.out.println("___________________________________");
							txtArea.appendText("\nDeposit Successful \nDeposit Amount: $"+ depositAmount + "\n");
							txtArea.appendText("New Balance: " + currency.format(balance) + "\n") ;
							inputTxt.setText("");
							depositAmount = 0;
							currentNum = "";
							btn0.setDisable(true);
							btn1.setDisable(true);
							btn2.setDisable(true);
							btn3.setDisable(true);
							btn4.setDisable(true);
							btn5.setDisable(true);
							btn6.setDisable(true);
							btn7.setDisable(true);
							btn8.setDisable(true);
							btn9.setDisable(true);
							btnEnter.setDisable(true);
							if(balance >= 50)
							{
								btnWithdraw50.setDisable(false);
							}
							if (balance >= 100)
							{
								btnWithdraw100.setDisable(false);
							}
							if(balance >= 200)
							{
								btnWithdraw50.setDisable(false);
								btnWithdraw100.setDisable(false);
								btnWithdraw200.setDisable(false);
							}
						}
					}
				}
			}
		});
	}
}
