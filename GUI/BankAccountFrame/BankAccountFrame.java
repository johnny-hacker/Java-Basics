/* 
Programmer Name: Johnny Olmedo
Date: 04/03/2022
This Program generates a Bank GUI application
*/
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BankAccountFrame extends JFrame implements ActionListener {
    private JButton balanceButton;            // Triggers viewing balance
    private JButton depositButton;            // Triggers Deposit
    private JButton withdrawalButton;         // Triggers Withdrawal
    private JLabel userBalanceLabel;          // Label for distance input
    private JLabel depositLabel;              // Label for deposit
    private JLabel withdrawalLabel;           // Label for withdrawal
    private JFormattedTextField depositField; // holds deposit
    private JFormattedTextField withdrawalField; // holds withdrawals
    private JFormattedTextField userBalanceField; // Holds balance given
    private BankAccount bank = new BankAccount(); // make an instance of Bank.java

   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   BankAccountFrame() {
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Set frame's title
      setTitle("Bank Balance Application");
 
      // Create labels
      userBalanceLabel = new JLabel("Account Balance:");
      depositLabel = new JLabel("Deposit Amount:");
      withdrawalLabel = new JLabel("Withdrawal Amount:");

      // Create button and add action listener for balance
      balanceButton = new JButton("View Balance");
      balanceButton.addActionListener(this);

      // create button for deposit and add action listner
      depositButton = new JButton("Deposit");
      depositButton.addActionListener(this);

      // create button for withdrawl and add action listner
      withdrawalButton = new JButton("Withdrawal");
      withdrawalButton.addActionListener(this);


      // ********************************************************************************************************************

      // withdrawal field
      withdrawalField = new JFormattedTextField(NumberFormat.getNumberInstance());
      withdrawalField.setEditable(true); // edit field
      withdrawalField.setText("0");
      withdrawalField.setColumns(15); // Initial width of 10 units 

      // Create and set-up an input field for numbers (not text)
      userBalanceField = new JFormattedTextField(NumberFormat.getNumberInstance());
      userBalanceField.setEditable(true); // be able to edit text
      userBalanceField.setText("0");
      userBalanceField.setColumns(15); // Initial width of 10 units 

      // Create and set-up an input field for numbers (not text)
      depositField = new JFormattedTextField(NumberFormat.getNumberInstance());
      depositField.setEditable(true); // edit field
      depositField.setText("0");
      depositField.setColumns(15); // Initial width of 10 units 

      //**************************************************************************************************************************

      // Use a GridBagLayout
      setLayout(new GridBagLayout());
       // Specify component's grid location
       // user balance field, button, label
       layoutConst = new GridBagConstraints();
       layoutConst.insets = new Insets(10, 10, 10, 1);
       layoutConst.gridx = 0;
       layoutConst.gridy = 0;
       add(userBalanceLabel, layoutConst);
 
       layoutConst = new GridBagConstraints();
       layoutConst.insets = new Insets(10, 1, 10, 10);
       layoutConst.gridx = 1;
       layoutConst.gridy = 0;
       add(userBalanceField, layoutConst);
       
       layoutConst = new GridBagConstraints();
       layoutConst.insets = new Insets(10, 5, 10, 10);
       layoutConst.gridx = 2;
       layoutConst.gridy = 0;
       add(balanceButton, layoutConst);
       
       // deposit field, label, and button
       layoutConst = new GridBagConstraints();
       layoutConst.insets = new Insets(10, 5, 10, 10);
       layoutConst.gridx = 1;
       layoutConst.gridy = 3;
       add(depositButton, layoutConst);
 
       layoutConst = new GridBagConstraints();
       layoutConst.insets = new Insets(10, 0, 1, 10);
       layoutConst.gridx = 1;
       layoutConst.gridy = 1;
       add(depositLabel, layoutConst);
 
       layoutConst = new GridBagConstraints();
       layoutConst.insets = new Insets(1, 0, 10, 10);
       layoutConst.gridx = 1;
       layoutConst.gridy = 2;
       add(depositField, layoutConst);
       
       // withdrawal label, button, and field
       layoutConst = new GridBagConstraints();
       layoutConst.insets = new Insets(10, 0, 1, 10);
       layoutConst.gridx = 2;
       layoutConst.gridy = 1;
       add(withdrawalLabel, layoutConst);
 
       layoutConst = new GridBagConstraints();
       layoutConst.insets = new Insets(1, 0, 10, 10);
       layoutConst.gridx = 2;
       layoutConst.gridy = 2;
       add(withdrawalField, layoutConst);

       layoutConst = new GridBagConstraints();
       layoutConst.insets = new Insets(10, 5, 10, 10);
       layoutConst.gridx = 2;
       layoutConst.gridy = 3;
       add(withdrawalButton, layoutConst);
   }
 
    /* Method is automatically called when an event 
       occurs (e.g, Enter key is pressed) */
    @Override
    public void actionPerformed(ActionEvent event) {
      // holds value of whats entered in field
       double deposit = 0;
       double withdrawal = 0;
       double balance = 0; 

      // Get source of event (3 buttons in GUI)
       JButton sourceEvent = (JButton) event.getSource();
      // if user presses deposit
      if (sourceEvent == depositButton) {
         // get value of deposit
         deposit = ((Number) depositField.getValue()).doubleValue();
         // pass to bank to load balance
         bank.deposit(deposit);
         // set field with updated balance
         userBalanceField.setText(Double.toString(bank.getBalance()));
         // Show success dialog
         javax.swing.JOptionPane.showMessageDialog(this, "Deposit Succescfully completed.");
      }
      // if user presses withdrawal
      else if (sourceEvent == withdrawalButton){
         // get value of withdrawal
         withdrawal = ((Number) withdrawalField.getValue()).doubleValue();
         // pass to bank to withdrawal
         bank.withdrawal(withdrawal);
         // set field with updated balance
         userBalanceField.setText(Double.toString(bank.getBalance()));
         // let the user know the withdrawal was Succescfully
         javax.swing.JOptionPane.showMessageDialog(this, "Withdrawal Succescfully completed.");
      }
      // if they didn't deposit or withdrawal then they clicked view balance
      else {
         // get value from user 
         balance = ((Number) userBalanceField.getValue()).doubleValue();
         // update the balance
         bank.setBalance(balance);
         // set balance field
         userBalanceField.setText(Double.toString(bank.getBalance()));
      }
       
   }
    /* Creates a BankAccountFrame and makes it visible */
   public static void main(String[] args) {
      // Creates BankAccountFrame and its components
      BankAccountFrame myFrame = new BankAccountFrame();
      // close
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}