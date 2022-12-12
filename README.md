# Introduction
In this portfolio, you will find an accumulation of work that I have created and enhanced during my time at SNHU. The work below contains a code review which walks through intended plans for enhancement, initial artifacts, justification of the enhancements, the enhanced artifacts themselves, and a professional self-assessment. The enhanced artifacts will showcase my refined skills in areas such as software design and engineering, algorithms and data structures, and databases. The amalgamation of these skills represent my strengths as computer scientist and the value I carry into my career as a software engineer.

 # Table of Contents

 1. Professional Self-Assessment
 2. Code Review
 3. Software Design and Engineering: Artifact and Justification Narrative
 4. Algorithm and Data Structures: Artifact and Justification Narrative
 5. Databases: Artifact and Justification Narrative


# 1. Professional Self-Assessment
I have been in the Computer Science program since May of 2018. Up until recently, I took only 1-2 classes per semester as I work full time. I have learned so much in this computer science program. I feel like the program is well-structured and new concepts build on previous courses. One skill that was immediately useful to me was the concept of using git. Being able to move code from a remote repository to a local machine (and vis versa) has allowed me to collaborate with classmates and coworkers. Another concept that I have learned in this program is data structures and algorithms. This concept is discussed and tested in most technical interviews for software engineering roles and is the basis for how efficient code is developed. The technology I have learned in order to complete this program feels like one of the most important aspects of this program. I have learned 4-5 programming languages, two or more query languages, multiple databases, unit testing, UML, etc. These are all technologies that I either use in my current role or can use in future role. During my capstone, I learned to refine these skills, review code and identify areas of improvement, organized my codebases in a way that is ideal for collaboration, and justify my reasoning behind modifications.

I have worked in various software engineering roles for almost 3 years. In my currently role, I work as an automation engineering manager for 3 different teams. I use computer science concepts every day to solve problems or help my team.  I plan to stay in computer science as I really enjoy the challenge, problem solving, and consistent learning involved with it. After learning about security in a previous semester, I believe that my future goals are to get into cyber security. To reach this goal, I will continue my education to get a master’s degree in Cybersecurity.

# 2. Code Review


- [View Part One Of My Code Review Here](https://www.youtube.com/watch?v=aDWh6lzc8UA)
- [View Part Two Of My Code Review Here](https://www.youtube.com/watch?v=gyD7lRHjadw)

# 3. Software Design and Engineering: Artifact and Justification Narrative
<img width="384" alt="image" src="https://user-images.githubusercontent.com/39343394/206945948-e50837bf-9902-4f99-a050-0c10af938a49.png">


 - [Original Artifact](https://github.com/MadelineMcN/MadelineMcN.github.io/tree/main/FinalCapstone/Oiriginal%20Files/Category%20One)
 - [Enhanced Artifact](https://github.com/MadelineMcN/MadelineMcN.github.io/tree/main/FinalCapstone/Enhancements%20/Category%20One)

## Software Design and Engineering Narrative
The artifact I have selected for Category 1: Software and Design is the C++ file I created for Project Two of my Software Reverse engineering course. The initial artifact was created on October 13th, 2022. This program, when run, allows users to access client data and make changes to client information. I selected this file for my artifact because I saw an opportunity to convert the C++ code to a language that popularly used for graphical user interfaces and client-side programs. To accomplish this, I transformed the C++ code to JavaScript.  When implementing the enhancements, I had to be innovative with my approach to stream input and output. Unlike C++, JavaScript does not come with a built-in way for input data to come from the terminal. This is because it commonly uses html inputs as parameters for functions that user input. To solve this problem, I found that I could use the NodeJS library to access the console. By using the readline module provided by NodeJS, I was able to create an interface that prompted data to be entered from the console.  To solve the logic problem of creating an interface each time I needed an input stream inside of a function, I created an interface globally so it could be reused in each private function. To mitigate security risks, I used the variable ‘let’ in place of specifying between strings and numeric values. This differs from C++ that requires specific variables to be used when using different types of data. With this, C++ has more restrictions on the size of input values for specific variable types. This leads to a greater risk of buffer overflow and the program crashing. Instead, using let allows for a virtually endless string to be inputted as data. To limit and parameterize this, I have added checks inside the file that look for string and number matches that either allow users to continue with the program or deny access and end the program.

I demonstrated an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals by researching and implementing the JavaScript language and NodeJS methods to rewrite the C++ program to a more industry specific language. This is exemplified when I used a JavaScript library to allow user input when it was determined that JavaScript does not offer input and output streaming outright. By using NodeJS to work aroud this short coming of JavaScript, I demonstrated the ability to program solutions to solve logic problems in software. Through this category, I developed a security mindset that anticipates adversarial exploits in software architecture and designs to expose potential vulnerabilities, mitigate design flaws, and ensure privacy and enhanced security of data and resources by adding code that verifies user input,  implemented a default deny security that denies access until authentication is prove valid, and provided a way for the program to safe fail to mitigate security risk when conditions are not properly met. I employed strategies for building collaborative environments that enable diverse audiences to support organizational decision making in the field of computer science by adding plenty of documentation in the code file as well as using descriptive naming conventions which improved the overall readability of it.

As mentioned above, there was a learning curve when enhancing this artifact from C++ to JavaScript. Figuring out the input and output streams were the biggest hurdle. After that, there was a learning curve to how variables are initialized, how functions are created, and how Booleans work on JavaScript as opposed to C++.


# 4. Algorithm and Data Structures: Artifact and Justification Narrative
  <img width="545" alt="image" src="https://user-images.githubusercontent.com/39343394/206946082-44a90fb0-bb2f-4301-af13-d51c6ba72c7c.png">


 - [Original Artifact](https://github.com/MadelineMcN/MadelineMcN.github.io/tree/main/FinalCapstone/Oiriginal%20Files/Category%20Two/Grand-Strand-Systems-main)
 - [Enhanced Artifact](https://github.com/MadelineMcN/MadelineMcN.github.io/tree/main/FinalCapstone/Enhancements%20/Category%20Two/Grand-Strand-Systems)

## Algorithm and Data Structures Narrative

For category 2, I used Java files I created for Project Two in course CS-320 Software Test Automation and QA as my artifact. This artifact was created August 3rd, 2022. The work I completed in this category enhanced this project by creating a new backend service that uses in-memory data structures to support storing doctor information and unit tests for the new implementations. To accomplish this work, my deliverables are 4 new source code files. One contains the Doctor class, which accepts input to create a new doctor in the system. One file contains the Doctor Service class which uses the Doctor Class object and allows for modifications on the in-memory data. The last two deliverables are unit test files to test the first two files mentioned. The work I complete in this category displays my ability to design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution, while managing the trade-offs involved in design choices.

I chose this project as my artifact because I noticed that most appointment systems that I have used also let you pick which doctor you are choosing when you are creating the appointment. With the new implementations I added, an office manager or front desk of a doctor’s office can manager contacts, appointments, and doctor information in the system. This aligns with current healthcare industry standards.

I had to be innovative about how I implemented design solutions, because the service that allows users to preform CRUD operations around doctor information, is dependent around the doctor object existing. To accomplish this, I created the doctor class first. In this file, I defined the doctor object, as well as an easy way to access it. To improve the algorithm that locates the correct doctor information, a doctor must have an ID to be in the system. With this implementation, when a doctor is being located in the system, only the correct doctor object is returned, as opposed to the entire doctor data structure. This was intentional to improve performance and speed of the application. Throughout the doctor and doctor service class there are many checks that can be used for security. For example, when a user inputs a doctor id that is greater than ten or null, an exception is thrown. Exceptions are also thrown when doctor Ids are duplicate, when any input data is null or greater than the specified size for that variable, and when doctor Ids are non-existent when trying to be deleted. To add to the security and to verify that these exceptions are catching risks, the two unit test files test each scenario where a user could input something incorrect.

Through this category, I designed and evaluated computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution, while managing the trade-offs involved in design choices by using algorithms to create a new data structure to store doctor information that expect specific criteria through user input. I demonstrated an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals by using algorithms to create CRUD methods that would allow users of the system to create appointments for specific doctors.  I employed strategies for building collaborative environments that enable diverse audiences to support organizational decision making in the field of computer science by revising artifact files to contain more readability through comments as well as implemented them in the new files.


# 5. Databases: Artifact and Justification Narrative
<img width="471" alt="image" src="https://user-images.githubusercontent.com/39343394/206946122-bb23cc75-38aa-4d34-a331-ccf452ea0ed4.png">


 - [Original Artifact](https://github.com/MadelineMcN/MadelineMcN.github.io/tree/main/FinalCapstone/Oiriginal%20Files/Category%20Three)
 - [Enhanced Artifact](https://github.com/MadelineMcN/MadelineMcN.github.io/tree/main/FinalCapstone/Enhancements%20/Category%20Three/AirBnB%20Capstone%202022)
