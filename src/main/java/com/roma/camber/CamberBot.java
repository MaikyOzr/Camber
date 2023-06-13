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
    String botVersion = "0.1.0";

    public CamberBot(){
        List<BotCommand> commands = new ArrayList();
        commands.add(new BotCommand("/start","start learn"));
        commands.add(new BotCommand("/info","information"));
        commands.add(new BotCommand("/contact","contact with developers"));
        commands.add(new BotCommand("/site","our website"));
        commands.add(new BotCommand("/howlearn","guide how learn any programing language"));
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
                            "\nby how the bot sends you a link (and the link is not to 1 article but to the entire course, click /howlearn)");
                    isApdate(chatId);
                    break;
                case "/info":
                    sendAnswer(chatId,"Bot commands :" +
                            "\n /contact -> contact with developers" +
                            "\n /site -> website of course" +
                            "\nadd JavaScript course and add new theme for Java");
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
                            "\n\nBut befor you must dowload JDK" +
                            "folow link (Windows 10) -> https://www.youtube.com/watch?v=IJ-PJbvJBGs" +
                            "\n\n Windows 11 -> https://www.youtube.com/watch?v=VTzzmqNwGzM" +
                            "\n\n MacOS -> https://www.youtube.com/watch?v=pxi3iIy4F5A&ab_channel=ProgrammingKnowledge" +
                            "\n\n and chose your ide for work" +
                            "\n Inteliji ide Ultimate (paid)/ Inteliji ide Community, vsCode(free), netbeans(free), eclipse(free)" +
                            "\n\n\n ------------------------------------------" +
                            "\nBasics : " +
                            "\n\nStudyToNight(I used this site for learn java) -> https://www.studytonight.com/java/overview-of-java.php" +
                            "\n\nGeeksforGeeks -> https://www.geeksforgeeks.org/java/?ref=shm" +
                            "\n\n\nif you want to watch videos -> https://www.youtube.com/watch?v=GoXwIVyNvX0&list=PLWKjhJtqVAbnRT_hue-3zyiuIYj0OlpyG&ab_channel=freeCodeCamp.org  " +
                            "\n\nYes, the videos are very long, but it`s java, it`s alredy in demand, so you have to work hard" +
                            "\n\n\nBut if you don`t want watch this course folow this -> https://www.youtube.com/watch?v=VHbSopMyc4M&list=PLBlnK6fEyqRjKA_NuK9mHmlk0dZzuP1P5" +
                            "\n\nPractice CodingBat (only!) -> https://codingbat.com/java" +
                            "\n\nStreams-> https://www.geeksforgeeks.org/java-8-stream-tutorial/" +
                            "\n\nLambdas -> https://www.baeldung.com/java-8-lambda-expressions-tips" +
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
                            "\n\n Frameworks " +
                            "\n\n Spring Core -> (read) https://www.studytonight.com/spring-framework/spring-introduction" +
                            "\n\n Spring MVC -> (read) https://www.studytonight.com/spring-framework/spring-mvc-introduction " +
                            "\n\n Spring Rest -> (read) https://spring.io/guides/tutorials/rest/" +
                            "\n\n Spring boot -> (read) https://www.studytonight.com/spring-boot/introduction-to-spring-boot" +
                            "\n\n Spring security -> (watch) https://www.youtube.com/watch?v=b9O9NI-RJ3o&ab_channel=Amigoscode" +
                            "\n\n Hibernate -> https://www.tutorialspoint.com/hibernate/index.htm"+
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
                    sendAnswer(chatId,"in development");
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

    private boolean isApdate (Long chatId){
        if(isApdate(chatId)==true){
            sendAnswer(chatId,"click /info");
        }
        else{
            sendAnswer(chatId,"No updates");
        }
        return false;
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
