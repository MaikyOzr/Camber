package com.roma.camber;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
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
    public CamberBot(){
        List<BotCommand> commands = new ArrayList();
        commands.add(new BotCommand("/start","start learn"));
        commands.add(new BotCommand("/info","information"));
        commands.add(new BotCommand("/contact","contact with developers"));
        commands.add(new BotCommand("/site","our website"));
        commands.add(new BotCommand("/howlearn","guide how learn any programing language"));
        commands.add(new BotCommand("/qa","quest & answer"));
        try{
            execute(new SetMyCommands(commands,new BotCommandScopeDefault(), null));
        }catch (TelegramApiException e){
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
        if(update.hasMessage() && update.getMessage().hasText()){

            String textFromuser = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();
            String userName = update.getMessage().getFrom().getUserName();

            switch (textFromuser){
                case"/start":
                    sendAnswer(chatId,"Hello "+userName+", I'm Camber-bot " +
                            "\ncreated to help you learn programming. Choose programing language" +
                            "\nwrite /info if you want to know more bot commands" +
                            "\n(The buttons contain only the most popular programming languages)" +
                            "\nif you want to learn the language well, then just learn " +
                            "\nby how the bot sends you a link (and the link is not to 1 article but to the entire course, click /howlearn)" +
                            "\n!!!here are courses only on web development!!!");

                    break;
                case"/qa":
                    sendAnswer(chatId,"\nQA:" +
                            "\n\n1)Will this bot be fully paid? - Yes, it will be." +
                            "\n\n2)How high will the price of the bot be? - The price of the bot will be $3 for basic materials." +
                            "\n There will be additional materials that no one will tell you about during the courses except" +
                            "\n the developers themselves. The total price of the bot will be $5" +
                            "\n (of course, you will not have to pay for additional materials)." +
                            "\n\n3)What will be the payment style: - Monthly and 6-month subscription " +
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
                    sendAnswer(chatId,"Bot commands :" +
                            "\n /contact -> contact with developers" +
                            "\n /site -> website of course" +
                            "\n /howlearn -> guide how learn programing language" +
                            "\n /qa -> quest and answer");
                    break;
                case"/contact":
                    sendAnswer(chatId,"Bot developer (Roma) : https://t.me/RomaEthereal");
                    sendAnswer(chatId,"Website developer (Denys) : https://t.me/o_o1o_o");
                    break;
                case"/site":
                    sendAnswer(chatId,"in development");
                    break;
                case"/howlearn":
                    sendAnswer(chatId,"set aside 2-4 hours every day \n" +
                            "write the code that is displayed in the orders (why is this necessary even if you understand what it says there - so that you can see what code you need to write because at the beginning your code will be very bad and you need to develop writing clean code right away)\n" +
                            "practice for 2-4 hours but every day \n" +
                            "20% theory 80% practice");
                    break;
                case "Java":
                    sendAnswer(chatId,"First, you need to know the basics about the programing language" +
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
                            "\n\nTDD (Test-Driven Development) -> https://medium.com/javarevisited/test-driven-development-tdd-for-java-programmers-cb73878afdde" +
                            "\n\nwhen you complate codingbat go learn OOP, Data Structures and Algorithms"+
                            "\n\n\n ------------------------------------------" +
                            "\n\nOkay next step is OOP" +
                            "\n\nRead this -> https://www.studytonight.com/java/object-and-classes.php"+
                            "\n\n\n ------------------------------------------" +
                            "\n\nData Structures -> mygreatlearning.com/blog/data-structures-using-java/" +
                            "\n\nAlgorithms -> https://howtodoinjava.com/java-algorithms-implementations/" +
                            "\n\nPractice CodeWars -> https://www.codewars.com/ " +
                            "\n\nor HackerRank https://www.hackerrank.com/"+
                            "\n\n\n ------------------------------------------" +
                            "\nData Base -> https://www.tutorialspoint.com/postgresql/index.htm " +
                            "\n\n how connect db to your IDE (vscode, netbeans, eclips, ineliji idea Ultimate):" +
                            "\n\n vsCode -> https://ryanhutzley.medium.com/getting-started-with-the-postgresql-extension-for-vscode-d666c281ec72" +
                            "\n\nnetbeans -> https://www.youtube.com/watch?v=Nzxqg8I0tcQ" +
                            "\n\neclipse -> https://www.enterprisedb.com/postgres-tutorials/how-connect-postgres-database-using-eclipse-and-netbeans" +
                            "\n\ninteliji ide Ultimate -> https://www.youtube.com/watch?v=D-WoteCPi14"+
                            "\n\n\n ------------------------------------------" +
                            "\nMaven and Gradle" +
                            "\n\n Maven -> https://www.tutorialspoint.com/maven/index.htm" +
                            "\n\n Gradle -> https://www.tutorialspoint.com/gradle/index.htm"+
                            "\n\n\n ------------------------------------------" +
                            "\nSo it`s you last step " +
                            "\n\nFrameworks " +
                            "\n\nSpring Core -> (read) https://www.tutorialspoint.com/spring/index.htm" +
                            "\n\nSpring MVC -> (read) https://www.tutorialspoint.com/spring/spring_web_mvc_framework.htm " +
                            "\n\nSpring Rest -> (read) https://spring.io/guides/tutorials/rest/" +
                            "\n\nSpring boot -> (read) https://www.geeksforgeeks.org/spring-boot-starters/" +
                            "\n\nSpring security -> (watch) https://www.youtube.com/watch?v=b9O9NI-RJ3o&ab_channel=Amigoscode" +
                            "\n\n   or read -> https://www.javadevjournal.com/spring/what-is-spring-security/" +
                            "\n\nHibernate -> https://www.tutorialspoint.com/hibernate/index.htm" +
                            "\n\nJUnit -> https://www.tutorialspoint.com/junit/index.htm"+
                            "\n\n\n ------------------------------------------" +
                            "\nCongratulations, you have completed your java training \n" +
                            "Now for the hard part. \n" +
                            "you need to get experience with everything you've learned \n" +
                            "write one of the following projects \n" +
                            "Booking of airplane tickets (or other transport: bus, train, subway)\n" +
                            "Mini bank \n" +
                            "Telegram bot (or add to mine))");
                    break;
                case "JavaScript":
                    sendAnswer(chatId,"First, you need to know the basics about the programing language" +
                            "\nDowload vsCode for JavaScript -> https://code.visualstudio.com/download" +
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
                            "\n\nPet-project -> https://medium.com/@oleksii.vasylenko/top-10-pet-projects-for-junior-javascript-developers-da45f72c446a");
                    break;
                case "Python":
                    sendAnswer(chatId,"First, you need to know the basics about the programing language" +
                            "\n\nDowload IDE for work with python: PyCharm Community or vsCode" +
                            "\nPyCharm -> https://www.jetbrains.com/pycharm/download/#section=windows" +
                            "\n or vsCode -> https://code.visualstudio.com/download" +
                            "\n\nMust read before work -> https://www.pythontutorial.net/getting-started/" +
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
                            "\n folow -> https://www.dataquest.io/blog/python-projects-for-beginners/");
                    break;
                case "Golang":
                    sendAnswer(chatId,"in development");
                    break;
                case "about dev":
                    sendAnswer(chatId,"Hi, if you've clicked this button, you're probably wondering who I am. " +
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
                            "\nI also have a lot of things that do not work out, but the main thing is just to go to your goal)");
                    break;
                default:
                    sendAnswer(chatId,"I don`t  understand your request. Try again");
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

        row.add("Java");
        row.add("JavaScript");

        keyboardRows.add(row);

        row = new KeyboardRow();

        row.add("Python");
        row.add("Golang");
        row.add("about dev");

        keyboardRows.add(row);

        keyboardMarkup.setKeyboard(keyboardRows);

        message.setReplyMarkup(keyboardMarkup);

        try{
            execute(message);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
}
