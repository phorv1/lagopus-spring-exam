# EXAM: Java Spring

## Getting Started

- Fork this repository under your own account
- Clone the forked repository to your computer
- Please commit frequently, but push only ONCE at the end of the exam
- Go through the whole description before starting it

## What can I use?

- You can use any resource online, but please work individually
- Instead of copy-pasting your answers and solutions, write them in your own words
- **Don't push your work to GitHub until your mentor announces that the time is up**

# Tasks

## Setup a new project

- Create a new Spring Boot project inside your cloned repository
- Setup .gitignore file to exclude the IDE's generated files
  - the src directory should be committed (containing all java and resource files)
  - the gradle related files should be committed
  - the resource folder should be committed
  - the gitignore should be committed
- Create a package called com.greenfox.exam.spring and work under that

## Green Fox Quiz API

### Description

Your task is to create a RESTful quiz application with full of greenfox questions hence giving the possibility to make it reachable and reuseable by any other services.

### Get 5 random questions

- Create a `GET /questions` endpoint
- Get 5 random questions in JSON object from an SQL database that you create
- the JSON object should be:

```json
{
  "id": 1,
  "questions":[
    {"id": 1, "question": "What is the color code of Green Fox?"},
    {"id": 2, "question": "When was Green Fox founded?(yyyy.mm.)"},
    ...
   ]
}
```

- Below you can find some more question and answer example, please add them all to the database, to one table:
    - When did your course start? (yyyy.mm.dd)(2017.03.13)
    - What type of dog Barbi has? (Whippet)
    - What is HerrNorbert's favourite color? (Green)
    - How many classes are learning at Green Fox Academy at this moment? (4)
    - How many mentors teach at Green Fox at this moment? (16)
    - What was the name of the first Green Fox class? (Vulpes)
    - How many likes do we have on facebook? (~3300)
    - What is Tojas's horoscope? (Libra)
- Feel free to add some new, if you have the time

### Give the answer
- Create a `POST /answers` endpoint
- Post the answers to the 5 random questions
- Make sure that the user answers to exactly the 5 random questions that he/she got
- This endpoint should receive the following input

```json
{
  "id": 1,
  "answers":[
  {"id": 1, "answer": "#3CB879"},
  {"id": 2, "answer": "2015.09."},
  ...
  ]
}
  ```

- Regarding the response, continue reading

### Response of POST endpoint
- In the case that all of the given answers are **CORRECT** you should get a list of projects in this endpoint
- In case some of the answers are **not** correct you should get back an empty list
- The list of projects will be the highly awaited titles of the actual projects you will work on in the project phase :)
- The response format should be the following:
```json
{
  "projectList":[
    {"id":1,"nameOfProject":"Porject 1"},
    {"id":2,"nameOfProject":"Project 2"},
     ...
   ]
}
```
- You should send an HTTP request to this endpoint "https://springexamserver.herokuapp.com/projects/className" and make it as the response of the POST endpoint
- Instead of `"className"` goes the name of your class
- If you got to this point you probably noticed that the project names are encrypted
- Use Base64 to decode the names http://www.rgagnon.com/javadetails/java-0598.html

### Endpoint TESTing
- Create 2 endpoint tests all together or per endpoint.

## Question time!

### In what cases would you choose to use an abstract class over an interface?

Please define it with your own words. We are expecting at least 3 distinct ideas that you write here:
Abstract class and interface are similar concepts, with interface being the more abstract of the two.

A class can inherit only one abstract class (i.e., there is no multiple inheritance), but it can implement multiple interfaces. This makes interfaces less restrictive and more flexible.

A class which implements an interface has to implement everything within the interface. On the other hand an abstract class can have non-abstract methods which does not need to be implemented within the class which extends the abstract class.

An interface is a contract between implementing class ad the outside world. All the fields are static and final.

Abstract class is almost like a regular class except it has abstract methods in it. An abstract class can only be extended. You cannot instantiate an instance of an abstract class.

If you are designing large functional units, use an abstract class. If you want to provide common, implemented functionality among all implementations of your component, use an abstract class. Abstract classes allow you to partially implement your class, whereas interfaces contain no implementation for any members.

Example 1:

// 'framework library' for a person
// a person can enrol and submit
// however, the class that consume this framework library
// need to provide 'where' the paperwork need to be sent
public abstract Person
{
    public abstract SendPaperWork(string paperwork)

    public void Enrol()
    {
        SendPaperWork("enrolment");
    }

    public void Submit()
    {
        SendPaperWork("report");
    }
}

// by inheriting Person abstract class
// we are enabling student to enrol and submit
// however, SendPaperWork need to be implemented
// because we need to tell it explicitly 'where'
// to send the enrolment/ submission
public class Student : Person
{
    public override SendPaperWork(string paperwork)
    {
        School.Send(paperwork);
    }
}

// an employee send the paperwork to a different 'place' than student
public class Employee : Person
{
    public override SendPaperWork(string paperwork)
    {
        Company.Send(paperwork);
    }
}


Example 2:
public interface LoginAuth{
   public String encryptPassword(String pass);
   public void checkDBforUser();
}

public class DBMySQL implements LoginAuth{
          // Needs to implement both methods
}
public class DBOracle implements LoginAuth{
          // Needs to implement both methods
}
public class DBAbc implements LoginAuth{
          // Needs to implement both methods
}

public abstract class LoginAuth{
   public String encryptPassword(String pass){
            // Implement the same default behavior here
            // that is shared by all subclasses.
   }

   // Each subclass needs to provide their own implementation of this only:
   public abstract void checkDBforUser();
}

Example 3:
abstract class GraphicObject {
    int x, y;
    ...
    void moveTo(int newX, int newY) {
        ...
    }
    abstract void draw();
    abstract void resize();
}

Each nonabstract subclass of GraphicObject, such as Circle and Rectangle, must provide implementations for the draw and resize methods:

class Circle extends GraphicObject {
    void draw() {
        ...
    }
    void resize() {
        ...
    }
}
class Rectangle extends GraphicObject {
    void draw() {
        ...
    }
    void resize() {
        ...
    }
}


### Analyzing URL
Please name the parts of the URL below.
[<img src="assets/URLanalysis.png" alt="parts of URL" />](assets/URLanalysis.png?raw=true)

1:  protocol - HyperText Transfer Protocol Secure
2:  subdomain
3:  domain name
4:  port number
5:  path (directory on the server)
6:  query
7:  parameters
