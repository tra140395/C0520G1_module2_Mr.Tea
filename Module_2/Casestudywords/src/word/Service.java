package word;

import mainmenu.Controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    List<Word> wordsList;
    List<Word> wordsReadList;
    Scanner scanner = new Scanner(System.in);

    public List<Word> addNewWord() {
        wordsList = new ArrayList<>();
        System.out.println("Enter your word you want to add: ");
        System.out.println("Enter word: ");
        String word = scanner.nextLine();
        System.out.println("Enter word's pronoun: ");
        String pronoun = scanner.nextLine();
        System.out.println("Enter word's noun: ");
        String noun = scanner.nextLine();
        System.out.println("Enter example of noun: ");
        String exampleOfNoun = scanner.nextLine();
        System.out.println("Enter word's adjective: ");
        String adjective = scanner.nextLine();
        System.out.println("Enter example of adjective: ");
        String exampleOfAdjective = scanner.nextLine();
        System.out.println("Enter word's verb: ");
        String verb = scanner.nextLine();
        System.out.println("Enter example of verb: ");
        String exampleOfVerb = scanner.nextLine();
        System.out.println("Enter word's similar: ");
        String similar = scanner.nextLine();
        Word words = new Word(word, pronoun, noun, exampleOfNoun, adjective, exampleOfAdjective,
                verb, exampleOfVerb, similar);

        wordsList.add(words);
        return wordsList;
    }

    public void writeWord(List<Word> list, boolean append) {
        final String FILE_DATA_PATH = "src/data/DataWords.csv";
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_DATA_PATH, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Word words : list) {
                bufferedWriter.append(words.getWordName());
                bufferedWriter.append(",");
                bufferedWriter.append(words.getPronoun());
                bufferedWriter.append(",");
                bufferedWriter.append(words.getNoun());
                bufferedWriter.append(",");
                bufferedWriter.append(words.getExampleOfNoun());
                bufferedWriter.append(",");
                bufferedWriter.append(words.getAdjective());
                bufferedWriter.append(",");
                bufferedWriter.append(words.getExampleOfAdjective());
                bufferedWriter.append(",");
                bufferedWriter.append(words.getVerb());
                bufferedWriter.append(",");
                bufferedWriter.append(words.getExampleOfVerb());
                bufferedWriter.append(",");
                bufferedWriter.append(words.getSimilar());
                bufferedWriter.append("\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.clear();
    }

    public List<Word> readList() {
        wordsReadList = new ArrayList<>();
        File file = new File("src/data/DataWords.csv");
        if (!file.exists()) {
            System.err.println("File not found!");
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arrTemp;
            while ((line = bufferedReader.readLine()) != null) {
                arrTemp = line.split(",");
                Word word = new Word(arrTemp[0], arrTemp[1], arrTemp[2], arrTemp[3],
                        arrTemp[4], arrTemp[5], arrTemp[6], arrTemp[7], arrTemp[8]);
                wordsReadList.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsReadList;
    }

    public void lookUpWord() {
        readList();
        System.out.println("Enter the word you want to check: ");
        String findWord = scanner.nextLine();
        for (Word words : wordsReadList) {
            if (words.getWordName().contains(findWord)) {
                System.out.println(words.toString());
            }
        }
    }

    public void additionalDefinition() {
        System.out.println("Enter the word you want to additional: ");
        String newWord = scanner.nextLine();
        readList();
        boolean check = false;
        for (Word word1 : wordsReadList) {
            if (word1.getWordName().equals(newWord)) {
                check = true;
                System.out.println("1. Addition noun");
                System.out.println("2. Addition example of noun");
                System.out.println("3. Addition adjective");
                System.out.println("4. Addition example of adjective");
                System.out.println("5. Addition verb");
                System.out.println("6. Addition example of verb");
                System.out.println("7. Addition similar");
                System.out.println("8. Back to main menu");
                System.out.println("9. Exit");
                int choice = 0;
                while (choice != 9) {
                    System.out.println("Enter your choice to edit:");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1: {
                            System.out.println("Enter information you want to add: ");
                            String info = scanner.nextLine();
                            word1.setNoun(word1.getNoun()+"-" + info);
                            writeWord(wordsReadList, false);
                            System.out.println("Done!!");
                            break;
                        }
                        case 2: {
                            System.out.println("Enter information you want to add: ");
                            String info = scanner.nextLine();
                            word1.setExampleOfNoun(word1.getExampleOfNoun() +"-" + info);
                            writeWord(wordsReadList, false);
                            System.out.println("Done!!");
                            break;
                        }
                        case 3: {
                            System.out.println("Enter information you want to add: ");
                            String info = scanner.nextLine();
                            word1.setAdjective(word1.getAdjective() +"-"+ info);
                            writeWord(wordsReadList, false);
                            System.out.println("Done!!");
                            break;
                        }
                        case 4: {
                            System.out.println("Enter information you want to add: ");
                            String info = scanner.nextLine();
                            word1.setExampleOfAdjective(word1.getExampleOfAdjective() +"-" + info);
                            writeWord(wordsReadList, false);
                            System.out.println("Done!!");
                            break;
                        }
                        case 5: {
                            System.out.println("Enter information you want to add: ");
                            String info = scanner.nextLine();
                            word1.setVerb(word1.getVerb() +"-" + info);
                            writeWord(wordsReadList, false);
                            System.out.println("Done!!");
                            break;
                        }
                        case 6: {
                            System.out.println("Enter information you want to add: ");
                            String info = scanner.nextLine();
                            word1.setExampleOfVerb(word1.getExampleOfVerb() +"-" + info);
                            writeWord(wordsReadList, false);
                            System.out.println("Done!!");
                            break;
                        }
                        case 7: {
                            System.out.println("Enter information you want to add: ");
                            String info = scanner.nextLine();
                            word1.setSimilar(word1.getSimilar() +"-" + info);
                            writeWord(wordsReadList, false);
                            System.out.println("Done!!");
                            break;
                        }
                        case 8: {
                            Controller.displayMainMenu();
                            break;
                        }
                        case 9: {
                            System.exit(0);
                            break;
                        }
                    }
                }
            }
        }
        if(!check){
            System.out.println("The word does not exist in the dictionary. Create new word in dictionary: ");
            addNewWord();
            writeWord(wordsList, true);
        }
    }

    public void dropWord() {
        readList();
        System.out.println("Enter the word you wanna to delete: ");
        String word = scanner.nextLine();

        for (Word words : wordsReadList) {
            if (words.getWordName().equals(word)) {
                wordsReadList.remove(wordsReadList.indexOf(words));
            }
        }
        writeWord(wordsReadList, false);
        System.out.println(word + " is deleted!!!");
        wordsReadList.clear();
    }

    public void copyAllWordToFileText() {
        try {

            File file = new File("src/data/DataWordsCopy.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,false));
            readList();
            for (Word words : wordsReadList) {
                bufferedWriter.write(String.valueOf(words));
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
            wordsReadList.clear();
            System.out.println("Done!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
