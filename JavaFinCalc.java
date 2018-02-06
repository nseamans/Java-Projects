/** JavaFinCalc
 * A simple one entry calculator that takes a salary and calculates the suggested 
 * monthly and yearly amounts that should be spent according to various sources
 * on budgeting and how to save money
 * @author Nicholas Seamans
 */
package javafincalc;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFinCalc extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception  {              
        GridPane calcFin = new GridPane();   
        calcFin.setAlignment(Pos.TOP_LEFT);
        calcFin.setHgap(10);
        calcFin.setVgap(10);      
        
        Scene scene = new Scene(calcFin, 400, 400);          
        TextField salary = new TextField ();
        Label yAmount = new Label("Salary Per Year");
        Button display = new Button();        
        display.setText("Enter");
        
        calcFin.add(yAmount, 2, 2);
        calcFin.add(salary, 2, 3);
        
        calcFin.add(display, 3, 3);
        
        Label headLabel = new Label("Monthly Cost Calculator");
        Label head2Label = new Label("Monthly");
        Label head3Label = new Label("Yearly");
        
        calcFin.add(headLabel, 2, 6);
        calcFin.add(head2Label, 3, 6);
        calcFin.add(head3Label, 4, 6);
                
        Label mHouse = new Label("House Payment: ");
        Label mhPay = new Label();
        Label mhPayY = new Label();
        calcFin.add(mHouse, 2, 7);    
        
        Label mCar = new Label("Transportation: ");
        Label mcPay = new Label();
        Label mcPayY = new Label();
        calcFin.add(mCar, 2, 8);  
        
        Label mFood= new Label("Food: ");
        Label mfPay = new Label();
        Label mfPayY = new Label();
        calcFin.add(mFood, 2, 9);  
        
        Label mApparel= new Label("Apparel: ");
        Label mAPay = new Label();
        Label mAPayY = new Label();
        calcFin.add(mApparel, 2, 10);  
        
        Label mHealth= new Label("Healthcare: ");
        Label mHePay = new Label();
        Label mHePayY = new Label();
        calcFin.add(mHealth, 2, 11);  
        
        Label mEntertainment= new Label("Entertainment: ");
        Label mEPay = new Label();
        Label mEPayY = new Label();
        calcFin.add(mEntertainment, 2, 12);  
        
        Label mRetirement= new Label("Retirement: ");
        Label mRPay = new Label();
        Label mRPayY = new Label();
        calcFin.add(mRetirement, 2, 13);  
        
        Label mOther= new Label("Other: ");
        Label mOPay = new Label();
        Label mOPayY = new Label();
        calcFin.add(mOther, 2, 14);  
        
        /** display.setOnAction
         *  This takes in the actions of the user and calculates.
         */
        display.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {                     
              display.setDisable(true);
                              
              // House Payment amount
              mhPay.setText(paymentCalc(salary.getText(), .33 ) );     
              calcFin.add(mhPay, 3, 7);
              mhPayY.setText(yearCalc(salary.getText(), .33 ) );     
              calcFin.add(mhPayY, 4, 7);    
              
              // Car Payment amount
              mcPay.setText(paymentCalc(salary.getText(), .17 ) );  
              calcFin.add(mcPay, 3, 8);
              mcPayY.setText(yearCalc(salary.getText(), .17 ) );  
              calcFin.add(mcPayY, 4, 8);   
              
              // Food Payment amount
              mfPay.setText(paymentCalc(salary.getText(), .13 ) ); 
              calcFin.add(mfPay, 3, 9);
              mfPayY.setText(yearCalc(salary.getText(), .13 ) ); 
              calcFin.add(mfPayY, 4, 9);     
              
              // Apparel Payment amount
              mAPay.setText(paymentCalc(salary.getText(), .03 ) ); 
              calcFin.add(mAPay, 3, 10);
              mAPayY.setText(yearCalc(salary.getText(), .03 ) ); 
              calcFin.add(mAPayY, 4, 10);
              
              // Healthcare Payment amount
              mHePay.setText(paymentCalc(salary.getText(), .08 ) ); 
              calcFin.add(mHePay, 3, 11);
              mHePayY.setText(yearCalc(salary.getText(), .08 ) ); 
              calcFin.add(mHePayY, 4, 11); 
              
              // Entertainment amount
              mEPay.setText(paymentCalc(salary.getText(), .05 ) ); 
              calcFin.add(mEPay, 3, 12);
              mEPayY.setText(yearCalc(salary.getText(), .05 ) ); 
              calcFin.add(mEPayY, 4, 12);  
              
              // Retirement amount
              mRPay.setText(paymentCalc(salary.getText(), .12 ) ); 
              calcFin.add(mRPay, 3, 13);
              mRPayY.setText(yearCalc(salary.getText(), .12 ) ); 
              calcFin.add(mRPayY, 4, 13);
              
              // Other Savings amount
              mOPay.setText(paymentCalc(salary.getText(), .09 ) ); 
              calcFin.add(mOPay, 3, 14);
              mOPayY.setText(yearCalc(salary.getText(), .09 ) ); 
              calcFin.add(mOPayY, 4, 14);         
            }   
        });
        
        primaryStage.setTitle("Financial Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }  
    
    /** paymentCalc
    *  Calculates monthly payment amounts.
    *  Formula: Floor[(Amount / 12) * percent given]
    * @param paymentTxt The salary to calculate from
    * @param percent The percent required for the monthly calculation
    * @return 
    */
    public String paymentCalc(String paymentTxt, double percent){        
        double paymentInt = Math.floor((Integer.parseInt(paymentTxt)/12)*percent);      
        String  result = "$ " + Double.toString(paymentInt);
               
        return result;
    }
    
    /** yearCalc
     *  Calculates the yearly cost of a salary.
     *  Formula: Floor[(Amount) * percent given]
     * @param paymentTxt The salary to calculate from
     * @param percent The percent required for the yearly calculation
     * @return 
     */
    public String yearCalc(String paymentTxt, double percent){        
        double paymentInt = Math.floor((Integer.parseInt(paymentTxt))*percent);      
        String  result = "$ " + Double.toString(paymentInt);
               
        return result;
    }
    
}
