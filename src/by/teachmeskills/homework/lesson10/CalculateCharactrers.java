package by.teachmeskills.homework.lesson10;

class CalculateCharacters {
    public static void main(String[] args) {
        System.out.println(calculateCharacter("1234"));
        System.out.println(calculateCharacter("ffff"));
        String[] elements = "fffff ab 1234 jkjk".split(" ");
        String minValue = elements[0];
        for (String element : elements) {
            if (calculateCharacter(minValue) > calculateCharacter(element)) {
                minValue = element;
            }
        }
        System.out.println(minValue);
    }


    private static int calculateCharacter(String string) {
        String existentCharacters = "";
        for (char element : string.toCharArray()) {
            if (!existentCharacters.contains(element + "")) {
                existentCharacters += element;
            }
        }
        return existentCharacters.length();
    }
}

