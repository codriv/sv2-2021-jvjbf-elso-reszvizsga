package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        StringBuilder filteredString = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            filteredString.append(s.charAt(i));
        }
        return filteredString.toString();
    }
}
