
/*Portfolio CS499
Madeline McNeeley November 2022
Category 1 Enhanced Artifact. [C++ -> JS]
 */


//This file is intented to create an interface that allows its users to access their client and client data

//Declaring variables
let mgmtPassword = ["BaltimoreRavens21!", "Password123!"];
let mgmtUsername = ["Madeline", "Mr.West"];
let InvestmentClients = ["Bob Jones", "Sarah Davis", "Amy Friendly", "Johnny Smith", "Carol Spears"];
let permission = false;
let exit = false;
let menu_choice = 0;

// import readline module
const readline = require("readline");

// create interface for input and output
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

// create empty user input
let userInput = "";

console.log("Hello! Welcome to our Investment Company.\n");

// checks permissions
while (!permission) {
    permission = CheckUserPermissionAccess();
    if (permission) {
        //After user is validated: displays menu
        while (!exit) {
            console.log("What would you like to do?\n");
            console.log("DISPLAY the client list (enter 1)\n");
            console.log("CHANGE a client's choice (enter 2)\n");
            console.log("EXIT the program (enter 3)\n");

            //Question for User to provide menu choice
            rl.question(" ", function (string) {
                userInput = string;
                menu_choice = parseInt(userInput);
                rl.close();
            });

            console.log("You chose " + menu_choice);

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
        console.log("Invalid Username or Password. Please try again.\n");
        break;
    }
}

function ChangeCustomerChoice() {
    // Initialize local variables
    let clientNumber = 0;
    let serviceChoice = "0";
    let x;

    let userInput = "";

// question user to enter client number
    rl.question("Enter the number of the client that you wish to change.\n", function (string) {
        userInput = string;
        clientNumber = parseInt(userInput);
        rl.close();
    });

    //find clientNumber
    for (x = 0; x < InvestmentClients.length; ++x) {
        if (clientNumber === x) {
            console.log("Selected Option: " + x);
        }
    }

    //question user to enter service choice
    rl.question("Please enter the client's new service choice (1 = Brokerage, 2 = Retirement)\n", function (string) {
        userInput = string;
        serviceChoice = parseInt(userInput);
        rl.close();
    });
}

function DisplayInfo() {
    console.log("1.Bob Jones\n");
    console.log("2.Sarah Davis\n");
    console.log("3.Amy Friendly\n");
    console.log("4.Johnny Smith\n");
    console.log("5.Carol Spears\n");
}

function CheckUserPermissionAccess() {
    let userPassword
    let userName;
    let match = false;

    //Question for username
    rl.question("Enter your username:\n", function (string) {
        userInput = string;
        userName = userInput;
        rl.close();
    });

        //Questions user for password
        rl.question("Enter your password:\n", function (string) {
            userInput = string;
            userPassword = userInput;
            rl.close();
        });

    /* If username and password match assigned array values, access into the application is granted*/
    if (userName === mgmtUsername[0] && userPassword === mgmtPassword[0]) {
        match = true;
    }
    else if (userName === mgmtUsername[1] && userPassword === mgmtPassword[1]){
        match = true;
    }
    else {
        match = false;
    }

    return match;

}

