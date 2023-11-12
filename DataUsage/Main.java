public class Main {

    public static void main(String[] args) {

        DataUsage new_phone = new DataUsage();
        // retrievephone provider 
        System.out.print("Please enter the name of your phone provider: ");
        new_phone.setPhoneProvider();

        System.out.println("Phone Provider: " + new_phone.getPhoneProvider());
        
        // get phone model
        System.out.print("Please enter the model of the phone: ");
        new_phone.setPhoneModel();

        System.out.println("Phone Model: " + new_phone.getPhoneModel());

        // get monthly minutes on plan
        System.out.print("Please enter the number of calling minutes you get for your plan: ");
        new_phone.setMonthlyMinutes();

        System.out.println("Monthly minutes: " + new_phone.getMonthlyMinutes());
        
        // get monthly minutes on plan
        System.out.print("Please enter the number of Gigabits of data per month for your plan  : ");
        new_phone.setMonthlyData();

        System.out.println("Monthly Gigabits: " + new_phone.getMonthlyData()); 
        
        // get current amount of minutes used
        System.out.print("Please enter the number of minutes you have used so far : ");
        new_phone.setCurrentMinutes();

        System.out.println("Minutes used: " + new_phone.getCurrentMinutes()); 
        
        // get current amount of gigabits used 
        System.out.print("Please enter the number of gigabits you have used so far : ");
        new_phone.setCurrentData();

        System.out.println("Gigabits used: " + new_phone.getCurrentData());  

        // minutes left 
        System.out.println("Minutes left: " + (new_phone.getMonthlyMinutes() - new_phone.getCurrentMinutes()));  
        // gigs left 

        System.out.println("Gigabits left: " + (new_phone.getMonthlyData() - new_phone.getCurrentData()));  
        
        
        
        
    }
 
}