package nyc.c4q.yuliyakaleda;

/**
 * Yuliya Kaleda
 * C4Q Access Code
 * Average Word Length
 * Created on 03-18-2015
 */

public class ManWomanSubstitution {

    public static String substitution (String text) {
        //split the string into separate words and store them in an array
        String[] wordsList = text.toLowerCase().split(" ");
        String newText = "";

        //check if a word is equal to male-pointing pronouns
        for(int i = 0; i < wordsList.length; i++)
        {
            if((wordsList[i].equals("man") || wordsList[i].equals("men")))
            {
                newText += "wo/" + wordsList[i] + " ";
            }
            else if(wordsList[i].equals("he"))
            {
                newText += "s/" + wordsList[i] + " ";
            }
            else if(wordsList[i].equals("his"))
            {
                newText += wordsList[i] + "/her ";
            }
            else if(wordsList[i].equals("him"))
            {
                newText += "her/" + wordsList[i] + " ";
            }
            else
            {
                newText += wordsList[i] + " ";
            }
        }
        return newText.toUpperCase().substring(0, 1) + newText.substring(1);
    }

    public static void main (String[] args) {
       System.out.print(substitution("All men loved the girl, she loved just him!"));
    }
}
