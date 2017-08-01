# Spring HTML/Thymeleaf Project
Serve up web pages using Spring Boot

For this project you will be showing the properties of a Java object in an HTML page and letting the user update them.

## Getting Started  

Bring up the **[Spring Initializr](https://start.spring.io/)** web page.

- In the Search for dependencies field start to type "Thymeleaf". Once you've typed "Th" you should be able to select it from the list. This is the only dependency you need. You should see it in the Selected Dependencies.
- Do not change any of the other defaults.
- Click the Generate Project button to download it.
- Unzip it

Now import the project in IntelliJ

- Open IntelliJ
- Click File -> New -> Projects from Existing Sources...
- Select the pom.xml and click OK
- On all the subsequent windows the defaults should be fine

## Assignment  

#### Student POJO  

Create a Student JavaBean (empty constructor and getters and setters)

- String firstName
- String lastName
- Grade grade (see Grade enum in starter files)

Generate empty constructor and getter and setters.

##### Starter files  

starter-files.zip (2 KB)

Copy the index.html starter file to `src/main/resources/static` directory.

Copy `view_student.html` and `new_student.html` starter files to the `src/main/resources/templates` directory.

Copy `Grade.java` and `StudentController.java` starter files to the `src/main/java/com/example/demo` directory.

##### Controller class  

Flesh out the `@RequestMapping("/new_student")` route.

##### new_student.html  

Update `new_student.html` to:

Add inputs for the student's first name and last name fields
Use Thymeleaf to access the `grades` that were added to the Model in the controller to show a pulldown list
Reminder: You must close all HTML tags or else Thymeleaf will complain. For example most `<meta>` tags are note closed and the browser will not complain but Thymeleaf won't work.

Note: Thymeleaf files are processed on the server. If you make changes to the file, you have to restart the server to see those changes. It does make development slow (slower than a dynamic language like Javascript, Ruby, Python). There are ways to speed this up but that's beyond the scope of this project.

##### Controller class  

In the controller class flesh out the @RequestMapping("/create_student") route.

### Extras  

Add a boolean enrolled field to `Student` and wire it up from the backend to the front-end.