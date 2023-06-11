package com.roma.Camber;

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
                            "\ncreated to help you learn programming. Choose programing language");
                    break;
                case "/info":
                    sendAnswer(chatId,"We invite you to our unique telegram bot \"Camber\" - your reliable assistant in learning programming languages!\n" +
                            "\n" +
                            "\"Camber\" is a specially designed Telegram bot that helps you learn programming languages effectively. Regardless of your experience - whether you are new to programming or an experienced developer, CodeWizard always has something interesting for you.\n" +
                            "\n" +
                            "The main advantage of \"Camber\" is that the bot sends you useful links to materials and practical exercises. This allows you to actively work on developing your programming skills.\n" +
                            "\n" +
                            "Materials: Camber sends you links to the best online courses, video tutorials, blogs and articles related to your programming language. You can study at your own pace, focusing on the topics that interest you the most. The bot always supports you with fresh and relevant information.\n" +
                            "\n" +
                            "Practice Tasks: Camber sends you regular practice tasks. These can be real-life problems or exercises aimed at consolidating programming concepts. You get the opportunity to put your knowledge into practice and improve your skills.\n" +
                            "\n" +
                            "Helpful Resources: Camber also sends you helpful resources, such as online programming environments, syntax references, forums, and programming communities. You'll always have the tools you need to learn and develop your skills.\n" +
                            "\n" +
                            "Do not spend a lot of time looking for the necessary materials and practical tasks. Join \"Саmber\" in Telegram today and start an exciting journey into the world of programming!");
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
                            "\nStudyToNight(I used this site for learn java) -> https://www.studytonight.com/java/overview-of-java.php" +
                            "\nGeeksforGeeks -> https://www.geeksforgeeks.org/java/?ref=shm" +
                            "\n\n\nif you want to watch videos -> https://www.youtube.com/watch?v=GoXwIVyNvX0&list=PLWKjhJtqVAbnRT_hue-3zyiuIYj0OlpyG&ab_channel=freeCodeCamp.org  " +
                            "\nYes, the videos are very long, but it`s java, it`s alredy in demand, so you have to work hard" +
                            "\n\n\nBut if you don`t want watch this course folow this -> https://www.youtube.com/watch?v=VHbSopMyc4M&list=PLBlnK6fEyqRjKA_NuK9mHmlk0dZzuP1P5" +
                            "\nPractice CodingBat (only!) -> https://codingbat.com/java" +
                            "\n when you complate codingbat go learn OOP, Data Structures and Algorithms"+
                            "\n\n\n ------------------------------------------" +
                            "\nOkay next step is OOP" +
                            "\nRead this -> https://www.studytonight.com/java/object-and-classes.php"+
                            "\n\n\n ------------------------------------------" +
                            "\nData Structures -> mygreatlearning.com/blog/data-structures-using-java/" +
                            "\n\nAlgorithms -> https://howtodoinjava.com/java-algorithms-implementations/" +
                            "\nPractice CodeWars -> https://www.codewars.com/ " +
                            "\nor" +
                            "\nHackerRank https://www.hackerrank.com/"+
                            "\n\n\n ------------------------------------------" +
                            "\nData Base -> https://www.tutorialspoint.com/postgresql/index.htm " +
                            "\n\n how connect db to your IDE (vscode, netbeans, eclips, ineliji idea Ultimate) ->" +
                            "\n vsCode -> https://ryanhutzley.medium.com/getting-started-with-the-postgresql-extension-for-vscode-d666c281ec72" +
                            "\nnetbeans -> https://www.youtube.com/watch?v=Nzxqg8I0tcQ" +
                            "\neclipse -> https://www.enterprisedb.com/postgres-tutorials/how-connect-postgres-database-using-eclipse-and-netbeans" +
                            "\ninteliji ide Ultimate -> https://www.youtube.com/watch?v=D-WoteCPi14"+
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
                    sendAnswer(chatId,"in development");
                    break;
                case "Python":
                    sendAnswer(chatId,"in development");
                    break;
                case "Golang":
                    sendAnswer(chatId,"in development");
                    break;
                case "dev":
                    sendAnswer(chatId,"Hi, i`m Roma ");
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
        row.add("dev");

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
