package com.roma.camber;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatMemberCount;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.ArrayList;
import java.util.List;

public class CamberBot extends TelegramLongPollingBot {
    public CamberBot() {
        List<BotCommand> commands = new ArrayList();
        commands.add(new BotCommand("/start", "start learn"));
        commands.add(new BotCommand("/info", "information"));
        commands.add(new BotCommand("/developers", "contact with developers"));
        commands.add(new BotCommand("/site", "our website"));
        commands.add(new BotCommand("/howlearn", "guide how learn any programing language"));
        commands.add(new BotCommand("/qa", "quest & answer"));
        commands.add(new BotCommand("/community","group where we talk"));
        commands.add(new BotCommand("/channel","official channel"));
        commands.add(new BotCommand("/motivation","motivation for your road to greatness"));
        commands.add(new BotCommand("/aboutbotdev","about bot developer"));
        try {
            execute(new SetMyCommands(commands, new BotCommandScopeDefault(), null));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "CamberLearnBot";
    }

    @Override
    public String getBotToken() {
        return "6281806553:AAHQjiuQdB2tscn48l4FiKNKouu4oHpw19k";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {

            String textFromuser = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();
            String userName = update.getMessage().getFrom().getUserName();
            SendMessage thxMessage = new SendMessage();
            thxMessage.setText("Thanks for using this bot");
            thxMessage.setParseMode("Markdown");
            switch (textFromuser) {

                case "/motivation":
                    sendAnswer(chatId, "Okay, read this very closely!" +
                            "\nIf you're struggling with something, it's normal. " +
                            "\nYou've just started your journey, so don't say you're bad or anything like that. " +
                            "\nEverything will be fine with you! " +
                            "\nStop talking negatively about yourself and start learning the material better." +
                            "\nBelieve me, I was like that too, and actually, I still am. " +
                            "\nWhy? you may ask me - because I still can't solve a single problem on LeetCode. " +
                            "\nBut I'm learning and continuing. I also take materials from this bot that you're using." +
                            "\nYou may not believe it, but it's true. I actually use the materials provided by the bot." +
                            "\nBrother or sister, just don't get upset when things don't work out for you sometimes. " +
                            "\nAnd if you've chosen Java as your programming language, " +
                            "\nbe prepared that there will be many things that won't work for you. " +
                            "\nBut most errors are due to the IDE (it's not of good quality), " +
                            "\nso just enjoy the process and grow with us. Maybe in the future, " +
                            "\nyou'll even contribute to improving this bot." +
                            "\nI believe in you! Keep going! " +
                            "\nIf things aren't working out, just take a break, come back, repeat, and move forward. " +
                            "\nDon't sit in front of your laptop 24/7. Keep moving. " +
                            "\nRest is also part of growth.");
                    break;
                case "/community":
                    sendAnswer(chatId, "Click -> https://t.me/+GKjIumpQtTkxYzRi");
                    break;

                case "/start":
                    sendAnswer(chatId, "Hello "+userName+
                            "\nI am a bot developer and I want to say that this bot is not perfect " +
                            "\nIt may not have enough information on other programming languages, their installation, etc." +
                            "\nsince I am a Java developer" +
                            "\nI apologize for the inconvenience and also give advice " +
                            "\nif you have any questions, just google them." +
                            "\nThis bot is designed to give you information on what to study. " +
                            "\nThe bot is written so that programmers who have just started to get interested in IT " +
                            "\ndon`t get lost in the abundance of courses/materials/books on the Internet." +
                            "\nThank you for your attention and have a great learning experience!" +
                            "\n\nI'm Camber-bot " +
                            "\nCreated to help you learn programming. Choose programing language" +
                            "\nClick /info for a better understanding of what is in the bot" +
                            "\n!!!here are courses only on web development!!!");

                    break;
                case "/qa":
                    sendAnswer(chatId, "\nQA:" +
                            "\n\n1)Will this bot be fully paid? - Yes, it will be." +
                            "\n\n2)How high will the price of the bot be? - The price of the bot will be $10/month for all materials." +
                            "\n\n3)What will be the payment style: - Monthly and 6-month subscription: price -> 50$ " +
                            "\n(you can achieve everything in 6 months of full focus on yourself and your goal)" +
                            "\n\n4)What happens when the subscription expires? - Nothing, you just won't have access to the bot's commands, that's all. \n" +
                            "\nEverything else materials, practical resources, etc. will remain." +
                            "\n\n5)If I have any problems with the code, can I contact you? - If you have problems with the Java code, you can contact the bot developer, " +
                            "\nand if you have problems with JavaScript, you can contact the website developer. " +
                            "\nIf there are other questions, we will not be able to help, " +
                            "\nbut if you do not understand the practical task, one of us will be able to explain it to you," +
                            "\nbut in Java and JavaScript + HTML + CSS + React code" +
                            "\n\n6)I studied your bot, what to do next? - Again, if you chose a Java course," +
                            "\n you can write projects that are written at the very bottom of the Java course," +
                            "\n the same applies to JS (JavaScript)" +
                            "\n\n7)Why is this bot free? - There are a lot of courses on the Internet that will only distract you," +
                            "\n so we decided to organize the learning process to make you a better programmer.");
                    break;
                case "/info":
                    sendAnswer(chatId, "Please note that I am still under development " +
                            "\nAnd may not always be available. " +
                            "\nThank you for your understanding " +
                            "\nThe buttons contain only the most popular programming languages"+
                            "\n\nBot commands :" +
                            "\n /contact -> contact with developers" +
                            "\n /site -> our website of course" +
                            "\n /howlearn -> guide how learn programing language" +
                            "\n /qa -> quest and answer" +
                            "\n /community -> our group chat" +
                            "\n /channel -> our channel" +
                            "\n /developers -> we" +
                            "\n /peopple -> count of users" +
                            "\n /motivation -> my motivation for you");
                    break;
                case "/developers":
                    sendAnswer(chatId, "Bot developer (Roma) : https://t.me/RomaEthereal");
                    sendAnswer(chatId, "Website developer (Denys) : https://t.me/o_o1o_o");
                    break;
                case "/site":
                    sendAnswer(chatId, "The site has many malfunctions because it is hosted on the github platform," +
                            "\nbut the main things work." +
                            "\nHope you like it)" +
                            "\n\nhttps://k0nty.github.io/Projects/");
                    break;
                case "/howlearn":
                    sendAnswer(chatId, "Set aside 2-4 hours every day \n" +
                            "Write the code that is displayed in the orders (why is this necessary even if you understand what it says there - so that you can see what code you need to write because at the beginning your code will be very bad and you need to develop writing clean code right away)\n" +
                            "Practice for 2-4 hours but every day \n" +
                            "20% theory 80% practice." +
                            "\n\n" +
                            "Now about Java Spring." +
                            "\nIn the materials about Spring, there is a video course that is very old but useful." +
                            "\nIf you write and something doesn't work, check if you have all the dependencies, " +
                            "\nif so, rebuild Maven or Gradle. If the class is still not imported," +
                            "\nthen this class is removed from the framework. " +
                            "\nTherefore, I recommend that you read the Spring Core documentation in parallel" +
                            "\nand generally go through all the documentation, Spring is a very popular " +
                            "\nframework and it is updated, so you need to read the documentation" +
                            "\nthey are very easy to read.");
                    break;
                case "/channel":
                    sendAnswer(chatId, "https://t.me/+o3IK4B5Vw0kyY2My");
                    break;
                case "Java☕":
                    sendAnswer(chatId,"\n\nIf you dont want read meterial follow this link and learn all -> https://www.youtube.com/playlist?list=PLWKjhJtqVAbnRT_hue-3zyiuIYj0OlpyG" +
                            "\n\n Instal: " +
                            "\nInteliji Idea Community -> https://www.jetbrains.com/idea/ " +
                            "\n/In the beginning, it will be enough for you" +
                            "\nbut then you will have to choose:" +
                            "\nNetBeans -> https://netbeans.apache.org/download/index.html" +
                            "\nvsCode -> https://code.visualstudio.com/download" +
                            "\nEclipse-> https://www.eclipse.org/downloads/" +
                            "\n\nYou must dowload JDK" +
                            "folow link (Windows 10) -> https://www.youtube.com/watch?v=IJ-PJbvJBGs" +
                            "\n\n Windows 11 -> https://www.youtube.com/watch?v=VTzzmqNwGzM" +
                            "\n\n MacOS -> https://www.youtube.com/watch?v=pxi3iIy4F5A&ab_channel=ProgrammingKnowledge" +
                            "\n\n\n ------------------------------------------" +
                            "\nBasics : " +
                            "\n\nProgramiz -> https://www.programiz.com/java-programming" +
                            "\n\nGeeksforGeeks -> https://www.geeksforgeeks.org/java/?ref=shm" +
                            "\n\n\nif you want to watch videos -> https://www.youtube.com/watch?v=GoXwIVyNvX0&list=PLWKjhJtqVAbnRT_hue-3zyiuIYj0OlpyG&ab_channel=freeCodeCamp.org  " +
                            "\n\nYes, the videos are very long, but it`s java, it`s alredy in demand, so you have to work hard" +
                            "\n\n\nBut if you don`t want watch this course folow this -> https://www.youtube.com/watch?v=VHbSopMyc4M&list=PLBlnK6fEyqRjKA_NuK9mHmlk0dZzuP1P5" +
                            "\n\nPractice CodingBat (only!) -> https://codingbat.com/java" +
                            "\n\nStreams-> https://www.geeksforgeeks.org/java-8-stream-tutorial/" +
                            "\n\nLambdas -> https://www.baeldung.com/java-8-lambda-expressions-tips" +
                            "\n\nGenerics -> https://www.geeksforgeeks.org/generics-in-java/" +
                            "\n\nwhen you complate codingbat go learn OOP, Data Structures and Algorithms" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nOkay next step is OOP" +
                            "\n\nRead this -> https://www.studytonight.com/java/object-and-classes.php" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nData Structures -> mygreatlearning.com/blog/data-structures-using-java/" +
                            "\n\nJava Collections -> https://www.youtube.com/watch?v=yQx6gke8Tws&list=PLqq-6Pq4lTTYwNIFaCLE9oS6npVj4RzHy&pp=iAQB" +
                            "\n\nAlgorithms -> https://howtodoinjava.com/java-algorithms-implementations/" +
                            "\n\nPractice CodeWars -> https://www.codewars.com/ " +
                            "\n\nor HackerRank https://www.hackerrank.com/" +
                            "\n\n\n ------------------------------------------" +
                            "\nData Base -> https://www.tutorialspoint.com/postgresql/index.htm " +
                            "\n\n how connect db to your IDE (vscode, netbeans, eclips, ineliji idea Ultimate):" +
                            "\n\n vsCode -> https://ryanhutzley.medium.com/getting-started-with-the-postgresql-extension-for-vscode-d666c281ec72" +
                            "\n\nnetbeans -> https://www.youtube.com/watch?v=Nzxqg8I0tcQ" +
                            "\n\neclipse -> https://www.enterprisedb.com/postgres-tutorials/how-connect-postgres-database-using-eclipse-and-netbeans" +
                            "\n\nInteliji IDE Ultimate(paid) -> https://www.youtube.com/watch?v=D-WoteCPi14" +
                            "\n\n\n ------------------------------------------" +
                            "\nMaven and Gradle" +
                            "\n\n Maven -> https://www.tutorialspoint.com/maven/index.htm" +
                            "\n\n Gradle -> https://www.tutorialspoint.com/gradle/index.htm");
                    sendAnswer(chatId, "\n\n\n ------------------------------------------" +
                            "\n\nFrameworks" +
                            "\n{WATCH} (if you don't want to read, but you will start reading the documentation later yourself ) )" +
                            "\n\nSpring Framework -> https://www.youtube.com/playlist?list=PLC97BDEFDCDD169D7" +
                            "\n\nSpring AOP -> https://www.youtube.com/watch?v=QdyLsX0nG30&list=PLE37064DE302862F8" +
                            "\n\nSpring Boot -> https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x" +
                            "\n\nSpring Security -> https://www.youtube.com/watch?v=sm-8qfMWEV8&list=PLqq-6Pq4lTTYTEooakHchTGglSvkZAjnE" +
                            "\n\nSpring Boot Microservices #1 -> https://www.youtube.com/watch?v=y8IQb4ofjDo&list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas" +
                            "\n\nSpring Boot Microservices #2 -> https://www.youtube.com/watch?v=o8RO38KbWvA&list=PLqq-6Pq4lTTbXZY_elyGv7IkKrfkSrX5e" +
                            "\n\nSpring Boot Microservices #3 -> https://www.youtube.com/watch?v=upoIwn4rWCo&list=PLqq-6Pq4lTTaoaVoQVfRJPqvNTCjcTvJB" +
                            "\n\nHibernate -> https://www.youtube.com/watch?v=Yv2xctJxE-w&list=PL4AFF701184976B25&pp=iAQB"+
                            "\n\n{READ}" +
                            "\n\nSpring Documentation -> https://docs.spring.io/spring-framework/reference/" +
                            "\n\nSpring Framework - Core -> https://docs.spring.io/spring-framework/reference/core.html" +
                            "\n\nSpring Framework - Core#2 -> https://www.geeksforgeeks.org/spring/#core" +
                            "\n\nSpring MVC -> https://docs.spring.io/spring-framework/reference/web/webmvc.html" +
                            "\n\nSpring REST -> https://docs.spring.io/spring-restdocs/docs/current/reference/htmlsingle/#introduction" +
                            "\n\nHTTP -> https://medium.com/@aichali42471/http-methods-and-status-codes-in-spring-rest-api-c20a2487e05a" +
                            "\n\nSpring Secutiry -> https://docs.spring.io/spring-security/reference/index.html" +
                            "\n\nSpring Boot -> https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#legal" +
                            "\n\nHibernate -> https://www.tutorialspoint.com/hibernate/index.htm" +
                            "\n\nRelationships -> https://www.baeldung.com/hibernate-one-to-many" +
                            "\n\nEntity lifecycle -> https://www.baeldung.com/hibernate-entity-lifecycle" +
                            "\n\ndowload PostgreSql and MongoDB (look in SQL (PostgreSql)/ NoSQL MongoDB" +
                            "\n\nSpring DATA JDBC -> https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/" +
                            "\n\nSpring DATA JPA -> https://docs.spring.io/spring-data/jpa/docs/current/reference/html/" +
                            "\n\nSpring DATA MongoDB -> https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/" +
                            "\nTDD (Test-Driven Development) -> https://medium.com/javarevisited/test-driven-development-tdd-for-java-programmers-cb73878afdde\"" +
                            "\n\n\n ------------------------------------------" +
                            "\nCongratulations, you have completed your java training \n" +
                            "Now for the hard part. \n" +
                            "you need to get experience with everything you've learned \n" +
                            "write one of the following projects \n" +
                            "Booking of airplane tickets (or other transport: bus, train, subway)\n" +
                            "Mini bank \n" +
                            "Telegram bot (or add to mine))" +
                            "\n\nProject ideas -> https://blog.jetbrains.com/education/2022/12/06/hour-of-code-top-5-java-projects/" +
                            "\n\nThanks for using this bot");
                    break;
                case "Data Base\uD83D\uDDC3\uFE0F":
                    sendAnswer(chatId, "\n\n\n ------------------------------------------" +
                            "\nhow download postgreSql:" +
                            "windows 10/11 -> https://www.youtube.com/watch?v=0n41UTkOBb0" +
                            "macOS -> https://www.youtube.com/watch?v=QaZrWIvAFsA " +
                            "\n\n\n ------------------------------------------  " +
                            "\n\nread -> https://www.geeksforgeeks.org/postgresql-tutorial/" +
                            "\n or watch -> https://www.youtube.com/watch?v=85pG_pDkITY" +
                            "\n\nMongoDB:" +
                            "how dowload windows 10/11 -> https://www.youtube.com/watch?v=6_NSkDRXPZk" +
                            "macOS -> https://www.youtube.com/watch?v=NLw7Tln6IeM" +
                            "\n\n\n ------------------------------------------  " +
                            "\n\n watch -> https://www.youtube.com/watch?v=ExcRbA7fy_A&list=PL4cUxeGkcC9h77dJ-QJlwGlZlTd4ecZOA&index=1" +
                            "\n\nThanks for using this bot");
                    break;
                case "JavaScript\uD83C\uDF03":
                    sendAnswer(chatId, "\nDowload vsCode for JavaScript -> https://code.visualstudio.com/download" +
                            "\n\n\n ------------------------------------------" +
                            "\nBasics & OOP -> https://www.javascripttutorial.net/" +
                            "\n\nDOM -> https://www.javascripttutorial.net/javascript-dom/" +
                            "\n\nFetch API -> https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch" +
                            "\n\nES6 -> https://www.javascripttutorial.net/es6/" +
                            "\n\nAdvanced (array) -> https://www.javascripttutorial.net/javascript-array-methods/#" +
                            "\n\nAdvanced (string) -> https://www.javascripttutorial.net/javascript-string-methods/" +
                            "\n\nAdvanced (regex) -> https://www.javascripttutorial.net/javascript-regex/" +
                            "\n\nHosting -> https://developer.mozilla.org/en-US/docs/Glossary/Hoisting" +
                            "\n\nHosting -> https://www.geeksforgeeks.org/javascript-hoisting/" +
                            "\n\nEvent Bubling -> https://www.freecodecamp.org/news/event-bubbling-in-javascript/#:~:text=What%20is%20Event%20Bubbling%3F,gets%20to%20the%20root%20element." +
                            "\n\nShadow DOM -> https://developer.mozilla.org/en-US/docs/Web/API/Web_components/Using_shadow_DOM" +
                            "\n\nPractice -> https://www.w3resource.com/javascript-exercises/" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nAlgorithm -> https://www.geeksforgeeks.org/fundamentals-of-algorithms/" +
                            "\n\nDATA STRUCTURES -> https://www.geeksforgeeks.org/learn-data-structures-with-javascript-dsa-tutorial/" +
                            "\n\nPRACTICE -> https://www.codewars.com/" +
                            "\n\n\n ------------------------------------------" +
                            "\nFRAMEWORKS:" +
                            "\n\nREACT -> https://www.tutorialspoint.com/reactjs/index.htm" +
                            "\n\nREACT NATIVE -> https://www.tutorialspoint.com/react_native/index.htm" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nANGULAR -> (video) -> https://www.youtube.com/watch?v=3qBXWUpoPHo&ab_channel=freeCodeCamp.org" +
                            "\n\nor ANGULAR -> (read) -> https://www.javatpoint.com/angular-7-tutorial" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nVUE -> (read) -> https://vuejs.org/tutorial/#step-1" +
                            "\n\nor VUE -> (video course) -> https://www.youtube.com/watch?v=YrxBCBibVo0&list=PL4cUxeGkcC9hYYGbV60Vq3IXYNfDk8At1&ab_channel=TheNetNinja" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nIF you start learn JavaScript but you don`t know HTML+CSS watch this -> https://www.youtube.com/watch?v=G3e-cpL7ofc&ab_channel=SuperSimpleDev" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nPet-project -> https://medium.com/@oleksii.vasylenko/top-10-pet-projects-for-junior-javascript-developers-da45f72c446a" +
                            "\n\nThanks for using this bot");
                    break;
                case "Python\uD83D\uDC0D":
                    sendAnswer(chatId, "\n\nDowload IDE for work with python: PyCharm Community or vsCode" +
                            "\nPyCharm -> https://www.jetbrains.com/pycharm/download/#section=windows" +
                            "\n or vsCode -> https://code.visualstudio.com/download" +
                            "\n\nMust read before work -> https://www.pythontutorial.net/getting-started/" +
                            "\nhow to dowload python -> https://www.youtube.com/watch?v=JJQW3GPnzQ8&pp=ygUlaG93IHRvIGRvd25sb2FkIHB5dGhvbiBpbiB3aW5kb3dzIDExIA%3D%3D" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nSTART:" +
                            "\n\n Basics -> https://www.pythontutorial.net/python-basics/" +
                            "\n\n OOP -> https://www.pythontutorial.net/python-oop/" +
                            "\n\nMore Python -> https://www.pythontutorial.net/python-concurrency/" +
                            "\n\n Algorithm & Data Structures -> https://www.geeksforgeeks.org/python-data-structures-and-algorithms/" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nFRAMEWORK:" +
                            "\n\nDJango -> https://www.geeksforgeeks.org/django-tutorial/" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nAnd now I will explain why there are few useful links to Python and JavaScript. \n" +
                            "\nI'm a Java developer, this bot is written in Java, " +
                            "\nPython is a very easy to understand language (Golang is the same Python only from Google) " +
                            "\nI want you to understand that the bot you are using is free. " +
                            "\nThere will not be all the knowledge of programming is that you google and look for answers, " +
                            "\nthe bot itself gives you information that you can then use for your own purposes." +
                            "\n\n\n ------------------------------------------" +
                            "\n\nPRACTICE :" +
                            "\nCodeWars -> https://www.codewars.com/" +
                            "\n\nCodingBat -> https://codingbat.com/python" +
                            "\n\nPet-project ideas:" +
                            "\n folow -> https://www.dataquest.io/blog/python-projects-for-beginners/" +
                            "\n\nProject ideas -> https://blog.jetbrains.com/education/2022/12/05/hour-of-code-top-5-python-projects/" +
                            "\n\nThanks for using this bot");
                    break;
                case "Golang\uD83C\uDF10":
                    sendAnswer(chatId, "\n\nDowload IDE GoLand -> https://www.jetbrains.com/go/" +
                            "\n\nor vsCode -> https://code.visualstudio.com/download" +
                            "\n\nDowload GoLang -> https://go.dev/doc/install" +
                            "\n video how to dowload Golang -> https://www.youtube.com/watch?v=kxD8p-aPYzM&pp=ygUlaG93IHRvIGRvd25sb2FkIGdvbGFuZyBpbiB3aW5kb3dzIDExIA%3D%3D" +
                            "\n\n\n ------------------------------------------" +
                            "\nStart -> https://go.dev/doc/tutorial/getting-started" +
                            "\n\nBasics -> https://www.tutorialspoint.com/go/index.htm" +
                            "\n\nGo Deeper -> https://www.sohamkamani.com/golang/json/" +
                            "\nModules -> https://go.dev/blog/using-go-modules" +
                            "\n\nCLIs -> https://go.dev/solutions/clis" +
                            "\n\nCobra -> https://pkg.go.dev/github.com/spf13/cobra" +
                            "\nGitHub Cobra -> https://github.com/spf13/cobra" +
                            "\n\nUrfave/cli -> https://zerokspot.com/weblog/2021/01/25/building-a-cli-using-urfave-cli/" +
                            "\nGitHub Urfave -> https://github.com/urfave/cli" +
                            "\n\nGORM -> https://gorm.io/docs/index.html" +
                            "\n\n\n ------------------------------------------" +
                            "\nFRAMEWORKS" +
                            "\n\nGin (REST) -> https://go.dev/doc/tutorial/web-service-gin" +
                            "\nHeimdall -> https://github.com/gojek/heimdall" +
                            "\n\nLogging -> https://www.loggly.com/use-cases/logging-in-golang-how-to-start/" +
                            "\n\n\n ------------------------------------------" +
                            "\nMicroservices" +
                            "\n\nIntroduction to microservices -> https://developer.ibm.com/learningpaths/get-started-application-modernization/intro-microservices/introduction/" +
                            "\n\nWatermil -> https://watermill.io/" +
                            "\n\nRPCS -> https://en.doc.rpcx.io/" +
                            "\n\nMicro -> https://micro.dev/" +
                            "\n\n\n ------------------------------------------" +
                            "\n\nPRACTICE" +
                            "\nCodeWars - https://www.codewars.com/kata/search/go?q=&beta=false&order_by=sort_date%20desc" +
                            "\n\n Pet-project -> https://blog.jetbrains.com/education/2022/12/10/hour-of-code-top-5-go-projects/" +
                            "\n\nThanks for using this bot");
                    break;
                case "/aboutbotdev":
                    sendAnswer(chatId, "Hi, if you've clicked this button, you're probably wondering who I am. " +
                            "\nWell, I'm just a simple person who wants to make this life a little better. " +
                            "\nCamber is my first bot, the idea behind writing this bot" +
                            "\n is to help other people learn one of the given programming languages and its frameworks." +
                            "\n Why? Because now there are so many different courses where beginners get lost, " +
                            "\nand this bot was written by me, and I was a beginner who got lost in the flow of information. " +
                            "\nIn this bot, all links and videos are checked by me (the developer). " +
                            "\nThank you for using this bot, I will continue to develop and improve it, " +
                            "\nand in the future we will have a website with all the information about the bot. " +
                            "\nHappy learning and remember never to rush, never! Give yourself a year or maybe more to study." +
                            "\n (A little motivation for you and a story from my life: " +
                            "\nI started learning programming 4 years ago (I'm 19 now) " +
                            "\nand this is my only project so far and the only programming language I really like is Java. " +
                            "\nI went through a lot of things, I quit studying and continued and tried other things, " +
                            "\nbut until I started writing in Java, I thank my friend who told me about Java, " +
                            "\nso never think that you are doing something wrong or you are failing, believe me, " +
                            "\nI also have a lot of things that do not work out, but the main thing is just to go to your goal" +
                            "\n\nThanks for using this bot");
                    break;
                case"Links\uD83D\uDD17":
                    sendAnswer(chatId,"For Java☕ : " +
                            "\nMaven repository(maven and gradle dependency) -> https://mvnrepository.com/" +
                            "\n\nSpring xml configuration -> https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html" +
                            "\n\nBealdung -> https://www.baeldung.com/" +
                            "\n\nSpring Iniinitializr -> https://start.spring.io/"+
                            "\n\nAbout Spring application.properties -> https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html"+
                            "\n\n\nFor Python\uD83D\uDC0D : " +
                            "\n\nMedium -> https://towardsdatascience.com/top-13-resources-to-learn-python-programming-46f3b0b74b91" +
                            "\n\n\nFor JavaScript\uD83C\uDF03 : " +
                            "\n\nhttps://github.com/yuandongzhong/useful-links-for-javascript" +
                            "\n\n\nFor GoLang\uD83C\uDF10 : " +
                            "\n\nhttps://github.com/nleiva/go-links" +
                            "\n\nThanks for using this bot");
                    break;
                default:
                    sendAnswer(chatId, "I don`t  understand your request. Try again");
            }
        }
    }
    private void sendAnswer(Long chatId, String textToSend) {

        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();

        row.add("Java☕");
        row.add("JavaScript\uD83C\uDF03");
        row.add("Data Base\uD83D\uDDC3\uFE0F");
        keyboardRows.add(row);

        row = new KeyboardRow();

        row.add("Python\uD83D\uDC0D");
        row.add("Golang\uD83C\uDF10");
        row.add("Links\uD83D\uDD17");
        keyboardRows.add(row);

        keyboardMarkup.setKeyboard(keyboardRows);
        message.setReplyMarkup(keyboardMarkup);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}