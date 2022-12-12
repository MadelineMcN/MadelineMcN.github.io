#include<iostream>
using namespace std;

 /* Project 2: Fixed document from Project 1 
 Madeline McNeeley 10/13/22 */

// Declare variables

/*The issue - No unique password per user
The fix - Creating unique passwords for each user */
string password = "123"; //old password for ever user
string mgmtPassword [2] = {"BaltimoreRavens21!", "Password123!"};
string mgmtUsername [2] = {"Madeline", "Mr.West"};
string password1;
string InvestmentClients [5] = {"Bob Jones", "Sarah Davis", "Amy Friendly", "Johnny Smith", "Carol Spears"};

/*The issue - not validation for data type
The fix - use cin.fail() to validate corret input for variables. 
*/
//Change client choice - option 2
void ChangeCustomerChoice() {
  // Initialize local variables
  int clientNumber = 0;
  int serviceChoice = 0;
  int x = 0;

//client number
cout << "Enter the number of the client that you wish to change." << endl;
cin >> clientNumber;

 //FIX cin.fail &cin.clear
while (cin.fail()) {
  cin.clear();
  cin.ignore();
  cout << "Incorrect entry, please try again. " << endl;
cin >> clientNumber;
}
//User choses new nervice option for client
cout << "Please enter the client's new service choice (1 = Brokerage, 2 = Retirement)"
 << endl;
 cin >> serviceChoice;

 //FIX cin.fail &cin.clear
 while (cin.fail()) {
  cin.clear();
  cin.ignore();
  cout << "Incorrect entry, please try again. " << endl;
cin >> serviceChoice;
}

//find clientNumber
for (x = 0; x < sizeof(InvestmentClients); ++x) {
  if (clientNumber == x) {
    cout << "Selected option: " << x << endl;
        }
      }
 
}

//Accept any user name & password. Only validates password.
/* The issue - Checks username, but does not check for password
The fix- Check that username and password match up
mgmt usernames accepted: madeline & 
 */

bool CheckUserPermissionAccess() {
  string password1;
  string username;
  

  bool match = false;

  // Username
  cout << "Enter your username: ";
  cin >> username;

  //fix:: cin.fail() cin.clear()
 while (cin.fail()) {
  cin.clear();
  cin.ignore();
  cout << "Incorrect entry, please try again. " << endl;
cin >> username;
}

  // Password
  cout << "Enter your password: ";
  cin >> password1;

   while (cin.fail()) {
  cin.clear();
  cin.ignore();
  cout << "Incorrect entry, please try again. " << endl;
cin >> password1;
}

  if (username == mgmtUsername[0] && password1 == mgmtPassword[0]) {
    match = true;
  }
  else if (username == mgmtUsername[1] && password1 == mgmtPassword[1]){
    match = true;
  }
  else {
    match = false;
  }

  return match;
}

    // Client list display - option 1
    void DisplayInfo() {
          cout << "1.Bob Jones" << endl; 
          cout << "2.Sarah Davis" << endl; 
          cout << "3.Amy Friendly" << endl;
          cout << "4.Johnny Smith" << endl;
          cout << "5.Carol Spears" << endl;
          }

int main() {
          
          bool permission = false;
          bool exit = false;
          int menu_choice = 0;
          // Prints intial prompt 
          cout << "Madeline McNeeley Project 2"<< endl;
          cout << "Hello! Welcome to our Investment Company."  << endl;
          // checks permissions
          while (!permission) {
                permission =  CheckUserPermissionAccess();
                if (permission) {
                  //After user is validated: displays menu
                  while (!exit) {
                    cout << "What would you like to do?" << endl;
                    cout << "DISPLAY the client list (enter 1)" << endl;
                    cout << "CHANGE a client's choice (enter 2)" << endl;
                    cout << "EXIT the program (enter 3)" << endl;

                    cin >> menu_choice;

                     //FIX:: cin.fail &cin.clear
                     while (cin.fail()) {
                        cin.clear();
                        cin.ignore();
                        cout << "Incorrect entry, please try again." << endl;
                        cin >> menu_choice;
                      }

                    cout << "You chose " << menu_choice << endl;
                    switch (menu_choice) {
                        //option 1 - display clients
                        case 1 :
                          DisplayInfo();
                          break;
                        // option2 2- change client number
                        case 2 :
                          ChangeCustomerChoice();
                          break;
                        //exit program
                        case 3 :
                          exit = true;
                          break; 
                          }
                      }
                  }  
                  else {
                      cout << "Invalid Username or Password. Please try again." << endl;
                      break; 
                      }
                    }
                      
      return 0;
     }



