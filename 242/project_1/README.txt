Project 1

1. Specification
The first programming project involves writing a program that computes the salaries for a
collection of employees of different types. This program consists of four classes.

1. The first class is Employee, which contains the employee's name and monthly salary which
is specified in whole dollars. It should have three methods:
    a. A constructor that allows the name and monthly salary to be initialized.
    b. A method named annualSalary that returns the salary for a whole year.
    c. A toString method that returns a string containing the name and monthly salary, appropriately labeled.

The Employee class has two subclasses: Salesman and Executive.

2. The Salesman class has an additional instance variable that contains the number of sold items.
It should have the same three methods:
    a. A constructor that allows the name, monthly salary and number of sold items to be initialized.
    b. An overridden method annualSalary that returns the salary for a whole year. The salary for a
    salesman consists of the base salary computed from the monthly salary plus a commission. The commission
    is zero if the number of sold items is less than 100, equal to one month salary if the number of sold
    items is between 100 and 200 and equal to two month salary if the number of sold items is 200 or more.
    c. An overridden toString method that returns a string containing the name, monthly salary and number
    of sold items, appropriately labeled.


3. The Executive class has an additional instance variable that reflects the current stock price.
It should have the same three methods:
    a. A constructor that allows the name, monthly salary and stock price to be initialized.
    b. An overridden method annualSalary that returns the salary for a whole year. The salary for an
    executive consists of the base salary computed from the monthly salary plus a bonus. The bonus
    is $20,000 if the current stock price is greater than $100 and nothing otherwise.
    c. An overridden toString method that returns a string containing the name, monthly salary and
    stock price, appropriately labeled.

4. Finally there should be a fourth class P1Driver that contains the main method. It should read in
employee information from a text file inputData.txt. The file will contain employee information for
only two years: 2015 and 2016. Each line of the text file will represent the information for one employee
for one year. An example of how the text file will look is shown below:

2015 Employee Smithson,John 2000
2016 Salesman Jokey,Will 3000 136
2015 Executive Obama,Barack 5000 150

The year is the first data element on the line. Next is the type of the employee followed by the employee
name and the monthly salary. For salesmen, the final value is the number of sold items and for executives
the stock price. As the employees are read in, Employee objects of the appropriate type should be created
and stored in an array depending upon the year. There should be two arrays, one corresponding to 2015 and
one corresponding to year 2016. You may assume that the file will contain no more than 100 employee records
for each year and that
the data in the file will be formatted correctly.
Once all the employee data is read in, a report should be displayed on the console for each of the two years.
Each line of the report should contain all original data supplied for each employee together with that employee's
annual salary for the year. For each of the two years, an average of all salaries for all employees for that year
should be computed and displayed.
Your program should compile without errors.
The Google recommended Java style guide (https://google.github.io/styleguide/javaguide.html), should be used to
format and document your code. Specifically, the following style guide attributes should be addressed:
     Header comments include filename, author, date and brief purpose of the program.
     In-line comments used to describe major functionality of the code.
     Meaningful variable names and prompts applied.
     Class names are written in UpperCamelCase.
     Variable names are written in lowerCamelCase.
     Constant names are in written in All Capitals.
     Braces use K&R style.

In addition the following design constraints should be followed:
     Declare all instance variables private
     Avoid the duplication of code

Test cases should be supplied in the form of a table with columns indicating what aspect is tested, the input
values, expected output, actual output and if the test case passed or failed. This table should contain 5 columns
with appropriate labels and a row for each test case. Note that the actual output should be the actual results you
receive when running your program and applying the input for the test record. Be sure to select enough different
kinds of employees and situations to completely test the program.


2. Submission Requirements
Submit the following to the Project 1 assignment area no later than the due date listed in your LEO classroom.

1. All .java source files (no other file types should be submitted) and the inputData.txt file. The source code
should use Java code conventions and appropriate code layout (white space management and indents) and comments.
All submitted files may be included in a .zip file. The input file will be generated by the students using a
simple text editor such as Notepad. 2. The solution description document P1SolutionDescription (.pdf or .doc / .docx)
containing the following:
    (1) Assumptions, main design decisions, error handling;
    (2) Test cases table
    (3) Screen captures showing successful program compilation and test cases execution. Each screen capture should
    be properly labeled, clearly indicated what the screen capture represents.
    (4) Lessons learned from the project; 3. Grading Rubric

